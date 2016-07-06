parser grammar LangParser;

options {tokenVocab = LangLexer;}
@header {
import structure.*;
import structure.statement.*;
import structure.type.*;
import util.Pair;
}

// Definition of variables
varDef returns [List<VarDef> vdList] locals [Type t, Expr e]
@init {
    $vdList = new ArrayList<>();
    $t = null;
    $e = null;
}
    :   type {$t = $type.t;} var_name1=ID ('=' e1=expr {$e = $e1.e;})? {$vdList.add(new VarDef($t, $var_name1.text, $e));}
        (',' {$e = null;} var_namec=ID ('=' ec=expr {$e = $ec.e;})? {$vdList.add(new VarDef($t, $var_namec.text, $e));})*
    |   'auto' var_name1=ID '=' e1=expr (',' var_namec=ID '=' ec=expr)*
    ;

// primitive: int, bool, ...
// arrays: T[]
// generics: T<U, V>
// templates: T<template U, V>
// arrow types: T -> V

// TODO
type returns [Type t]
    :   classType
    |   classType '<' typeList '>'
    |   type '[' ']'
    |   <assoc=right> t1=type '->' t2=type
    ;

typeList returns [Object[] arr] locals [List<Pair<Boolean, Type>> list, Boolean isTemplate]
@init{$list = new ArrayList<>(); $isTemplate = false;}
    :   ('template' {$isTemplate = true;})? t1=type {$list.add(new Pair<>($isTemplate, $t1.t));}
        (',' {$isTemplate = false;} ('template' {$isTemplate = true;})? tc=type {$list.add(new Pair<>($isTemplate, $tc.t));})*
        {
            $arr = new Object[$list.size() * 2];
            int i = 0;
            for (Pair<Boolean, Type> pair: $list) {
                $arr[2 * i] = pair.a;
                $arr[2 * i + 1] = pair.b;
                i++;
            }
        }
    ;

classType returns [Type t]
    :   ID
    ;

expr returns [Expr e] locals [Object obj, ExprMode mode]
@init{$obj = null; $mode = null;}
    :   primary {$e = $primary.e;}
    |   e1=expr '[' e2=expr ']' {$e = new Expr(ExprMode.ARRAY_ELEMENT, null, $e1.e, $e2.e);}
    |   e1=expr '(' (exprList {$obj = $exprList.list;})? ')' {$e = new Expr(ExprMode.FUNCTION_CALL, $obj, $e1.e);}
    |   '(' type ')' expr {$e = new Expr(ExprMode.TYPE_CAST, $type.t, $expr.e);}
    |   expr
            (   '++' {$mode = ExprMode.POST_INCREMENT;}
            |   '--' {$mode = ExprMode.POST_DECREMENT;}
            ) {$e = new Expr($mode, null, $expr.e);}
    |   (   '+' {$mode = ExprMode.UNARY_PLUS;}
        |   '-' {$mode = ExprMode.UNARY_MINUS;}
        |   '++' {$mode = ExprMode.PRE_INCREMENT;}
        |   '--' {$mode = ExprMode.PRE_DECREMENT;}
        ) expr {$e = new Expr($mode, null, $expr.e);}
    |   (   '~' {$mode = ExprMode.BITWISE_NOT;}
        |   '!' {$mode = ExprMode.LOGICAL_NOT;}
        ) expr {$e = new Expr($mode, null, $expr.e);}
    |   e1=expr
        (   '*' {$mode = ExprMode.TIMES;}
        |   '/' {$mode = ExprMode.DIV;}
        |   '%' {$mode = ExprMode.MOD;}
        ) e2=expr {$e = new Expr($mode, null, $e1.e, $e2.e);}
    |   e1=expr
        (   '+' {$mode = ExprMode.PLUS;}
        |   '-' {$mode = ExprMode.MINUS;}
        ) e2=expr {$e = new Expr($mode, null, $e1.e, $e2.e);}
    |   e1=expr
        (   '<' '<' {$mode = ExprMode.LSHIFT;}
        |   '>' '>' {$mode = ExprMode.RSHIFT;}
        ) e2=expr {$e = new Expr($mode, null, $e1.e, $e2.e);}
    |   e1=expr
        (   '<=' {$mode = ExprMode.LESS_EQ;}
        |   '>=' {$mode = ExprMode.GREATER_EQ;}
        |   '>' {$mode = ExprMode.GREATER;}
        |   '<' {$mode = ExprMode.LESS;}
        ) e2=expr {$e = new Expr($mode, null, $e1.e, $e2.e);}
    |   e1=expr
        (   '==' {$mode = ExprMode.EQUALS;}
        |   '!=' {$mode = ExprMode.NOT_EQUALS;}
        ) e2=expr {$e = new Expr($mode, null, $e1.e, $e2.e);}
    |   e1=expr '&' e2=expr {$e = new Expr(ExprMode.BITWISE_AND, null, $e1.e, $e2.e);}
    |   e1=expr '^' e2=expr {$e = new Expr(ExprMode.BITWISE_XOR, null, $e1.e, $e2.e);}
    |   e1=expr '|' e2=expr {$e = new Expr(ExprMode.BITWISE_OR, null, $e1.e, $e2.e);}
    |   e1=expr '&&' e2=expr {$e = new Expr(ExprMode.LOGICAL_AND, null, $e1.e, $e2.e);}
    |   e1=expr '||' e2=expr {$e = new Expr(ExprMode.LOGICAL_OR, null, $e1.e, $e2.e);}
    |   <assoc=right> e1=expr '?' e2=expr ':' e3=expr {$e = new Expr(ExprMode.TERNARY, null, $e1.e, $e2.e, $e3.e);}
    |   <assoc=right> e1=expr
        (   '=' {$mode = ExprMode.ASSIGN;}
        |   '+=' {$mode = ExprMode.PLUS_ASSIGN;}
        |   '-=' {$mode = ExprMode.MINUS_ASSIGN;}
        |   '*=' {$mode = ExprMode.TIMES_ASSIGN;}
        |   '/=' {$mode = ExprMode.DIV_ASSIGN;}
        |   '%=' {$mode = ExprMode.MOD_ASSIGN;}
        |   '&=' {$mode = ExprMode.AND_ASSIGN;}
        |   '|=' {$mode = ExprMode.OR_ASSIGN;}
        |   '^=' {$mode = ExprMode.XOR_ASSIGN;}
        |   '>>=' {$mode = ExprMode.RSHIFT_ASSIGN;}
        |   '<<=' {$mode = ExprMode.LSHIFT_ASSIGN;}
        )
        e2=expr {$e = new Expr($mode, null, $e1.e, $e2.e);}
    ;

primary returns [Expr e]
    :   '(' expr ')' {$e = new Expr(ExprMode.BRACKETS, null, $expr.e);}
    |   literal {$e = $literal.e;}
    |   ID {$e = new Expr(ExprMode.ID, $ID.text);}
    ;

literal returns [Expr e] locals [Object temp]
@init{$temp = null;}
    :   INT_LITERAL {$e = new Expr(ExprMode.INT_LITERAL, Integer.valueOf($INT_LITERAL.text));}
    |   FLOAT_LITERAL {$e = new Expr(ExprMode.FLOAT_LITERAL, Double.valueOf($FLOAT_LITERAL.text));}
    |   CHAR_LITERAL {$e = new Expr(ExprMode.CHAR_LITERAL, $CHAR_LITERAL.text.substring(1, $CHAR_LITERAL.text.length() - 1));} //TODO
    |   STRING_LITERAL {$e = new Expr(ExprMode.STRING_LITERAL, $STRING_LITERAL.text.substring(1, $STRING_LITERAL.text.length() - 1));} //TODO
    |   BOOLEAN_LITERAL {$e = new Expr(ExprMode.BOOLEAN_LITERAL, Boolean.valueOf($BOOLEAN_LITERAL.text.equals("true")));}
    |   'null' {$e = new Expr(ExprMode.NULL_LITERAL, null);}
    |   '(' (typedParamList {$temp = $typedParamList.list;})? ')' '->' codeStatement
        {$e = new Expr(ExprMode.FUNCTIONAL_LITERAL, new Pair($temp, $codeStatement.s));}
    ;

typedParamList returns [List<Pair<Type, String>> list] locals [Type t]
@init{$list = new ArrayList<>(); $t = null;}
    :   (t1=type {$t = $t1.t;})? id1=ID {$list.add(new Pair<>($t, $id1.text));}
        (',' {$t = null;} (tc=type {$t = $tc.t;})? idc=ID {$list.add(new Pair<>($t, $idc.text));})*
    ;

// TODO
codeStatement returns [CodeStatement s]
    :   codeBlock {$s = new CodeBlockStatement($codeBlock.list);}
    |   varDef {$s = new VarDefStatement($varDef.vdList);}
    |   expr {$s = new ExprStatement($expr.e);}
    |   'while' '(' expr ')' cs=codeStatement {$s = new WhileStatement($expr.e, $cs.s);}
    |   'return' expr {$s = new ReturnStatement($expr.e);}
    ;

codeBlock returns [List<CodeStatement> list]
@init {$list = new ArrayList<>();}
    :   '{' (codeStatement ';' {$list.add($codeStatement.s);})* '}'
    ;

exprList returns [List<Expr> list]
@init{$list = new ArrayList<>();}
    :   e1=expr {$list.add($e1.e);} (',' ec=expr {$list.add($ec.e);})*
    ;

// Grammar
// =======

// 1. Definition of variables
// type (var_name (= expr)?)+;
// auto (var_name = expr)+;

// 2. Types
// primitive: int, bool, ...
// arrays: T[]
// generics: T<U, V>
// templates: T<template U, V>
// arrow types: T -> V

// 3. Expressions
// Java-like expressions without "instanceof" and ">>>"
// Functional literals: (a, b, c) -> {}
//                      {int a, String b) -> {}

// 4. Code structure
// var definition
// { code block }
// while (cond) statement
// TODO