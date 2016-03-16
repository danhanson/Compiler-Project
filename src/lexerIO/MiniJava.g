lexer grammar MiniJava;

@lexer::header {
	package lexerIO;
}

fragment Letter: ([a-z]|[A-Z]);
fragment Digit: [0-9];
fragment NonZeroDigit: [1-9];

Program : (Token | WhiteSpace)+;

Token : Operator | Delimiter | ReservedWord | Integer | ID;

Integer : '0' | NonZeroDigit Digit*;

ID : Letter (Letter | Digit)*;

ReservedWord : 'class' | 'public' | 'static' | 'extends' | 'void' | 'int' |
	'boolean' | 'if' | 'else' | 'while' | 'return' | 'null' | 'true' | 'false' |
	'this' | 'new' | 'String' | 'main' | 'System.out.println';

Operator : '+' | '-' | '*' | '/' | '<' | '<=' | '>=' | '>' | '==' | '&&' | '||' | '!';
Delimiter : ';' | '.' | ',' | '=' | '(' | ')' | '{' | '}' | '[' | ']';

WhiteSpace : ( ' ' | '\t' | '\r' | '\n' )+ {skip();};