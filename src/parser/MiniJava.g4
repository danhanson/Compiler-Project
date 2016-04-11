grammar MiniJava;

@header {
    package parser;
}

prog : classDecl* EOF;

classDecl : 'class' ID ('extends' ID)? classBody;

classBody : '{' member* '}';

member: method | field;

method : 'public'? 'static'? (type | 'void') ID '(' arguments ')' '{' statement* '}';

arguments: argument ',' arguments | argument | ;

argument : type ID;

field : type ID ('=' expression)? ';' ;

type : ('int' | 'boolean' | 'String' | ID) ('[' ']')*;

statement : type ID ('=' expression)? ';'                         #declaration
          | '{' statement* '}'                                    #block
          | 'if' '(' expression ')' statement ('else' statement)? #if
          | 'while' '(' expression ')' statement                  #while
          | 'System.out.println' '(' expression ')' ';'           #print
          | ID '=' expression ';'                                 #assignment
          | 'return' expression ';'                               #return
          | ';'                                                   #emptyStatement ;

expression : 'new' ID '(' ')'                          #instantiation
           | 'this'                                    #this
           | 'null'                                    #null
           | 'true'                                    #boolean
           | 'false'                                   #boolean
           | '(' expression ')'                        #parenthExpression
           | ID                                        #identifier
           | INTEGER                                   #integer
           | expression '.' ID                         #objectAccess
           | ('-' | '!') expression                    #unaryOperation
           | expression ('/'|'*') expression           #binaryOperation
           | expression ('-'|'+') expression           #binaryOperation
           | expression ('<'|'>'|'<='|'>=') expression #binaryOperation
           | expression ('==' | '!=') expression       #binaryOperation
           | expression '&&' expression                #binaryOperation
           | expression '||' expression                #binaryOperation ;

fragment LETTER: ([a-z]|[A-Z]);
fragment DIGIT: [0-9];
fragment NON_ZERO_DIGIT: [1-9];

COMMENT: ('//' ~('\n'|'\r')* | '/*' .*? '*/') {skip();};

WHITE_SPACE: ( ' ' | '\t' | '\r' | '\n' )+ {skip();};

INTEGER : '0' | NON_ZERO_DIGIT DIGIT*;

RESERVED_WORD : 'class' | 'public' | 'static' | 'extends' | 'void' | 'int' |
    'boolean' | 'if' | 'else' | 'while' | 'return' | 'null' | 'true' | 'false' |
    'this' | 'new' | 'String' | 'System.out.println';

ID : LETTER (LETTER | DIGIT)*;


OPERATOR : '+' | '-' | '*' | '/' | '<' | '<=' | '>=' | '>' | '==' | '&&' | '||' | '!';
DELIMETER : ';' | '.' | ',' | '=' | '(' | ')' | '{' | '}' | '[' | ']';

