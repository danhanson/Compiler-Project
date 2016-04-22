grammar MiniJava;

@header {
    package parser;
}

prog : classDecl* EOF;

classDecl : 'class' ID inherits? classBody;

inherits : 'extends' ID;

classBody : '{' member* '}';

member: method | field;

method : 'public'? returnType ID '(' arguments ')' block                 #normalMethod
       | 'public' 'static' 'void' 'main' '(' 'String[]' ID ')' block #mainMethod ;

block : '{' statement* '}';

returnType : (type | 'void');

arguments: declaration ',' arguments | declaration | ;

field : declaration ('=' expression)? ';' ;

declaration : type ID ;

type : ('int' | 'boolean' | ID);

statement : declaration ('=' expression)? ';'                     #declarationStatement
          | block                                                 #blockStatement
          | ifBody elseBody?                                      #ifStatement
          | 'while' '(' expression ')' statement                  #whileStatement
          | 'System.out.println' '(' expression ')' ';'           #printStatement
          | ID '=' expression ';'                                 #assignmentStatement
          | 'return' expression? ';'                              #returnStatement
          | ';'                                                   #emptyStatement ;

ifBody : 'if' '(' expression ')' statement ;

elseBody : 'else' statement ;

expression : 'new' ID '(' ')'                          #instantiation
           | 'this'                                    #this
           | 'null'                                    #null
           | booleanExp                                #boolean
           | '(' expression ')'                        #parenthExpression
           | ID                                        #identifier
           | INTEGER                                   #integer
           | expression '.' ID '(' params ')'          #invokeMethod
           | ('-' | '!') expression                    #unaryOperation
           | expression ('/'|'*') expression           #binaryOperation
           | expression ('-'|'+') expression           #binaryOperation
           | expression ('<'|'>'|'<='|'>=') expression #binaryOperation
           | expression ('==' | '!=') expression       #binaryOperation
           | expression '&&' expression                #binaryOperation
           | expression '||' expression                #binaryOperation ;

booleanExp : TRUE | FALSE ;

TRUE: 'true';
FALSE: 'false';

params : expression ',' params | expression | ;

fragment LETTER: ([a-z]|[A-Z]);
fragment DIGIT: [0-9];
fragment NON_ZERO_DIGIT: [1-9];

COMMENT: ('//' ~('\n'|'\r')* | '/*' .*? '*/') {skip();};

WHITE_SPACE: ( ' ' | '\t' | '\r' | '\n' )+ {skip();};

INTEGER : '0' | NON_ZERO_DIGIT DIGIT*;

RESERVED_WORD : 'class' | 'public' | 'static' | 'extends' | 'void' | 'int' |
    'boolean' | 'if' | 'else' | 'while' | 'return' | 'null' | 'true' | 'false' |
    'this' | 'new' | 'String' | 'System.out.println';

ID : (LETTER (LETTER | DIGIT)*) ;


OPERATOR : '+' | '-' | '*' | '/' | '<' | '<=' | '>=' | '>' | '==' | '&&' | '||' | '!';
DELIMETER : ';' | '.' | ',' | '=' | '(' | ')' | '{' | '}' | '[' | ']';

