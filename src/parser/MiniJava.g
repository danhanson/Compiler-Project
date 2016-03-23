lexer grammar MiniJava;

@lexer::header {
    package parser;
}

Program: ClassDecl+;

ClassDecl: 'class' ID ('extends' ID)? ClassBody;

ClassBody: '{' Member* '}';

Member: Method | Field;

Method: 'public' Type ID '(' (Argument (',' Argument)*)? ')' '{' Statement* '}';

Argument: Type ID;

Field: Type ID;

Type: 'int' | 'boolean' | 'void' | ID;

Statement: Type ID '=' Expression | '{' Statement* '}' | 'if' '(' Expression ')' Statement ('else' Statement)?
    |  'while' '(' Expression ')' Statement | 'System.out.println' '(' Expression ')' ';' | ID '=' Expression | 'return' Expression;

Expression: Expression7 ('||' Expression)?;

Expression7: Expression6 ('&&' Expression7)?;

Expression6: Expression5 (('==' | '!=') Expression6)?;

Expression5: Expression4 (('<' | '>' | '<=' | '>=') Expression5)?;

Expression4: Expression3 (('+' | '-') Expression4)?;

Expression3: Expression2 (('*' | '/') Expression3)?;

Expression2: ('!'|'-')? Expression1;

Expression1: Terminal ('.' ID '(' ')')?;

Terminal: 'new' ID '(' ')' | 'this' | 'null' | 'true' | 'false' | '(' Expression ')' | ID | Integer;

Integer : '0' | NonZeroDigit Digit*;

ID : Letter (Letter | Digit)*;

fragment Letter: ([a-z]|[A-Z]);
fragment Digit: [0-9];
fragment NonZeroDigit: [1-9];
