lexer grammar LangLexer;

INT_LITERAL: [0-9]+;
FLOAT_LITERAL
    :   '-'? INT '.' INT EXP?   // 1.35, 1.35E-9, 0.3, -4.5
    |   '-'? '.' INT EXP?       // .3, -.15e10
    |   '-'? INT EXP            // 1e10 -3e4
    |   '-'? INT                // -3, 45
    ;
STRING_LITERAL:     '"' (ESC | ~["\\])* '"';
CHAR_LITERAL:       '\'' (ESC_CHAR | ~['\\])* '\'';
BOOLEAN_LITERAL:    'false' | 'true';
NULL_LITERAL:       'null';

fragment INT:       '0' | [1-9] [0-9]*; // no leading zeros
fragment EXP:       [Ee] [+\-]? INT;
fragment ESC:       '\\' (["\\/bfnrt] | UNICODE);
fragment ESC_CHAR:  '\\' (['\\/bfnrt] | UNICODE);
fragment UNICODE:   'u' HEX HEX HEX HEX;
fragment HEX:       [0-9a-fA-F];

KEYWORD:        'auto';
INT_TYPE:       'int';
BOOL_TYPE:      'bool';

// Punctuation
SEMICOLON:      ';';
COMMA:          ',';
LEFTB:          '(';
RIGHTB:         ')';
LEFTSB:         '[';
RIGHTSB:        ']';
INCREMENT:      '++';
DECREMENT:      '--';
PLUS:           '+';
MINUS:          '-';
TIMES:          '*';
DIV:            '/';
MOD:            '%';
TILDE:          '~';
BANG:           '!';
LSHIFT:         '<<';
RSHIFT:         '>>';
LESS:           '<';
GREATER:        '>';
LESS_EQ:        '<=';
GREATER_QE:     '>=';
EQUALS:         '==';
NOT_EQUALS:     '!=';
BITWISE_AND:    '&';
BITWISE_OR:     '|';
BITWISE_XOR:    '^';
LOGICAL_AND:    '&&';
LOGICAL_OR:     '||';
QUESTION:       '?';
COLON:          ':';
ASSIGN:         '=';
PLUS_ASSIGN:    '+=';
MINUS_ASSIGN:   '-=';
TIMES_ASSIGN:   '*=';
DIV_ASSIGN:     '/=';
MOD_ASSIGN:     '%=';
AND_ASSIGN:     '&=';
OR_ASSIGN:      '|=';
XOR_ASSIGN:     '^=';
RSHIFT_ASSIGN:  '>>=';
LSHIFT_ASSIGN:  '<<=';

ID:             [a-zA-Z_]+ [a-zA-Z0-9_]*;

WS:             [ \t\n\r]+ -> skip;
COMMENT:        '/*' .*? '*/' -> skip;
LINE_COMMENT:   '//' ~'\n'* '\n' -> skip;