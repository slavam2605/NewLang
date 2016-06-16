parser grammar LangParser;

options {tokenVocab = LangLexer;}
@header {
import structure.*;
}

// Definition of variables
varDef
    :   type (var_name=ID ('=' expr)?)+ ';'
    |   'auto' (var_name=ID '=' expr)+ ';'
    ;

// TODO
type returns [Type t]
    :   primitiveType
    ;

// TODO
primitiveType
    :   'int'
    |   'bool'
    ;

expr returns [Expr e] locals [Object obj, ExprMode mode]
@init{$obj = null; $mode = null;}
    :   primary {$e = $primary.e;}
    |   e1=expr '[' e2=expr ']' {$e = new Expr(ExprMode.ARRAY_ELEMENT, null, $e1.e, $e2.e);}
    |   expr '(' (exprList {$obj = $exprList.list;})? ')' {$e = new Expr(ExprMode.FUNCTION_CALL, $obj, $expr.e);}
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
        (   '<<' {$mode = ExprMode.LSHIFT;}
        |   '>>' {$mode = ExprMode.RSHIFT;}
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

literal returns [Expr e]
    :   INT_LITERAL {$e = new Expr(ExprMode.INT_LITERAL, Integer.valueOf($INT_LITERAL.text));}
    |   FLOAT_LITERAL {$e = new Expr(ExprMode.FLOAT_LITERAL, Double.valueOf($FLOAT_LITERAL.text));}
    |   CHAR_LITERAL {$e = new Expr(ExprMode.CHAR_LITERAL, $CHAR_LITERAL.text.substring(1, $CHAR_LITERAL.text.length() - 1));} //TODO
    |   STRING_LITERAL {$e = new Expr(ExprMode.STRING_LITERAL, $STRING_LITERAL.text.substring(1, $STRING_LITERAL.text.length() - 1));} //TODO
    |   BOOLEAN_LITERAL {$e = new Expr(ExprMode.BOOLEAN_LITERAL, Boolean.valueOf($BOOLEAN_LITERAL.text.equals("true")));}
    |   'null' {$e = new Expr(ExprMode.NULL_LITERAL, null);}
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