lexer grammar MiniJava;

@lexer::header {
	package lexerIO;
}

fragment Letter: ([a-z]|[A-Z]);
fragment Digit: [0-9];
fragment NonZeroDigit: [1-9];

Comment: ('//' ~('\n'|'\r')* | '/*' .*? '*/') {skip();};

WhiteSpace : ( ' ' | '\t' | '\r' | '\n' )+ {skip();};

Integer : '0' | NonZeroDigit Digit*;

ReservedWord : 'class' | 'public' | 'static' | 'extends' | 'void' | 'int' |
	'boolean' | 'if' | 'else' | 'while' | 'return' | 'null' | 'true' | 'false' |
	'this' | 'new' | 'String' | 'main' | 'System.out.println';

ID : Letter (Letter | Digit)*;


Operator : '+' | '-' | '*' | '/' | '<' | '<=' | '>=' | '>' | '==' | '&&' | '||' | '!';
Delimiter : ';' | '.' | ',' | '=' | '(' | ')' | '{' | '}' | '[' | ']';
