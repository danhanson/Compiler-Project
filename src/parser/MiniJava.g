grammar MiniJava;

@header {
    package parser;
}

prog : classDecl+;

classDecl : 'class' ID ('extends' ID)? classBody;

classBody : '{' member* '}';

member: method | field;

method : 'public' type ID '(' (argument (',' argument)*)? ')' '{' statement* '}';

argument : type ID;

field : type ID;

type : 'int' | 'boolean' | 'void' | ID;

statement : type ID '=' expression | '{' statement* '}' | 'if' '(' expression ')' statement ('else' statement)?
    |  'while' '(' expression ')' statement | 'System.out.println' '(' expression ')' ';' | ID '=' expression
    | 'return' expression;

expression : expression7 ('||' expression)?;

expression7 : expression6 ('&&' expression7)?;

expression6 : expression5 (('==' | '!=') expression6)?;

expression5 : expression4 (('<' | '>' | '<=' | '>=') expression5)?;

expression4 : expression3 (('+' | '-') expression4)?;

expression3 : expression2 (('*' | '/') expression3)?;

expression2 : ('!'|'-')? expression1;

expression1 : terminal ('.' ID '(' ')')?;

terminal : 'new' ID '(' ')' | 'this' | 'null' | 'true' | 'false' | '(' expression ')' | ID | INTEGER;

fragment LETTER: ([a-z]|[A-Z]);
fragment DIGIT: [0-9];
fragment NON_ZERO_DIGIT: [1-9];

COMMENT: ('//' ~('\n'|'\r')* | '/*' .*? '*/') {skip();};

WHITE_SPACE: ( ' ' | '\t' | '\r' | '\n' )+ {skip();};

INTEGER : '0' | NON_ZERO_DIGIT DIGIT*;

RESERVED_WORD : 'class' | 'public' | 'static' | 'extends' | 'void' | 'int' |
    'boolean' | 'if' | 'else' | 'while' | 'return' | 'null' | 'true' | 'false' |
    'this' | 'new' | 'String' | 'main' | 'System.out.println';

ID : LETTER (LETTER | DIGIT)*;


OPERATOR : '+' | '-' | '*' | '/' | '<' | '<=' | '>=' | '>' | '==' | '&&' | '||' | '!';
DELIMETER : ';' | '.' | ',' | '=' | '(' | ')' | '{' | '}' | '[' | ']';
