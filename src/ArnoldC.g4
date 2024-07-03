grammar ArnoldC;

main: function_declaration* BEGINMAIN statement* ENDMAIN EOF;

function_declaration
    : FUNCTION IDENTIFIER (PARAMETER IDENTIFIER)* statement* ENDFUNCTION                              #voidfunction
    | FUNCTION IDENTIFIER (PARAMETER IDENTIFIER)* WILLRETURN statement* RETURN expression ENDFUNCTION #nonvoidfunction
    ;

statement
    : DECLAREINT IDENTIFIER SETINITIALVALUE expression                           #declareint
    | ASSIGNVARIABLE IDENTIFIER SETVALUE expression operation+ ENDASSIGNVARIABLE #assignvariable
    | print_stmt                                                                 #printstmt
    | condition_stmt                                                             #conditionstmt
    | WHILE expression statement* ENDWHILE                                       #whilestmt
    | PUTRESULT IDENTIFIER FUNCTIONCALL READINT                                  #readint
    | (PUTRESULT IDENTIFIER)? FUNCTIONCALL IDENTIFIER+                           #functioncall
    ;

print_stmt
    : PRINT IDENTIFIER     #printvariable
    | PRINT STRING_LITERAL #printstring
    ;


condition_stmt
    : IF expression trueIf ELSE falseIf ENDIF #ifelseendif
    | IF expression trueIf ENDIF              #ifendif
    ;

trueIf
    : statement*
    ;

falseIf
    : statement*
    ;

expression
    : IDENTIFIER #varexpr
    | NUMBER     #numberexpr
    | AT TRUE    #trueexpr
    | AT FALSE   #falseexpr
    ;

operation
    : op=(MULTIPLICATIONOPERATOR|DIVISIONOPERATOR) expression   #mulDivOp
    | op=(PLUSOPERATOR|MINUSOPERATOR) expression                #plusMinusOp
    | GREATERTHAN expression                                    #greaterOp
    | EQUALTO expression                                        #equalOp
    | op=(OR|AND) expression                                    #orAndOp
    ;


FUNCTIONCALL: 'DO IT NOW';

PUTRESULT: 'GET YOUR ASS TO MARS';

FUNCTION: 'LISTEN TO ME VERY CAREFULLY';

ENDFUNCTION: 'HASTA LA VISTA, BABY';

PARAMETER: 'I NEED YOUR CLOTHES YOUR BOOTS AND YOUR MOTORCYCLE';

WILLRETURN: 'GIVE THESE PEOPLE AIR';

RETURN: 'I\'LL BE BACK';

BEGINMAIN: 'IT\'S SHOWTIME';

ENDMAIN: 'YOU HAVE BEEN TERMINATED';

AT: '@';

TRUE: 'NO PROBLEMO';

FALSE: 'I LIED';

PLUSOPERATOR: 'GET UP';

MINUSOPERATOR: 'GET DOWN';

MULTIPLICATIONOPERATOR: 'YOU\'RE FIRED';

DIVISIONOPERATOR: 'HE HAD TO SPLIT';

EQUALTO: 'YOU ARE NOT YOU YOU ARE ME';

GREATERTHAN: 'LET OFF SOME STEAM BENNET';

OR: 'CONSIDER THAT A DIVORCE';

AND: 'KNOCK KNOCK';

PRINT: 'TALK TO THE HAND';

DECLAREINT: 'HEY CHRISTMAS TREE';

SETINITIALVALUE: 'YOU SET US UP';

ASSIGNVARIABLE: 'GET TO THE CHOPPER';

SETVALUE: 'HERE IS MY INVITATION';

ENDASSIGNVARIABLE: 'ENOUGH TALK';

IF: 'BECAUSE I\'M GOING TO SAY PLEASE';

ELSE: 'BULLSHIT';

ENDIF: 'YOU HAVE NO RESPECT FOR LOGIC';

WHILE: 'STICK AROUND';

ENDWHILE: 'CHILL';

READINT: 'I WANT TO ASK YOU A BUNCH OF QUESTIONS AND I WANT TO HAVE THEM ANSWERED IMMEDIATELY';

IDENTIFIER: [a-zA-Z0-9]+;

NUMBER: DIGIT+;

STRING_LITERAL: ( SHORT_STRING | LONG_STRING );

fragment DIGIT: ('0'..'9');

fragment SHORT_STRING
    : '\'' ( STRING_ESCAPE_SEQ | ~[\\\r\n'] )* '\''
    | '"' ( STRING_ESCAPE_SEQ | ~[\\\r\n"] )* '"'
    ;

fragment LONG_STRING
    : '\'\'\'' LONG_STRING_ITEM*? '\'\'\''
    | '"""' LONG_STRING_ITEM*? '"""'
    ;

fragment LONG_STRING_ITEM
    : LONG_STRING_CHAR
    | STRING_ESCAPE_SEQ
    ;

fragment LONG_STRING_CHAR: ~'\\';

fragment STRING_ESCAPE_SEQ: '\\' .;

WS: [ \r\n\t]+ -> skip;