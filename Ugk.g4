grammar Ugk;

@header{
package parser;
}

ugk : (imports)? programme EOF ;

imports : (singleimport)+ ;

singleimport : 'importer' '<' filename '.ugk' '>' ;

programme : (fonctionoudeclatype)* algorithme (fonctionoudeclatype)*
    | (fonctionoudeclatype)+
    ;

fonctionoudeclatype : fonction
    | declatype
    ;

algorithme : 'algorithme' 'debut' algofoncblock 'fin'
    ;

fonction : 'fonction' type idf '(' (funcdecargs)? ')' 'debut' algofoncblock 'fin'
    ;

declatype : 'nouveau' 'type' TYPE '(' (declatypeargs)? ')' ('herite' type)?
    ;

declatypeargs : type idf (superset)? (',' type idf (superset)? )*
    ;

superset : '=>' 'debut' algofoncblock 'fin'
    ;

funcdecargs : type idf (',' type idf)*
    ;

algofoncblock : (instruction)*
    ;

block : (instruction)*
    ;

instruction : declaration
    | assignation
    | si
    | tantque
    | appelfonc
    | pour
    | retourne
    | selon
    ;

selon : 'selon' expr 'faire' switchblock 'fselon'
    ;

switchblock : (cas)+ (defaut)?
    ;

cas : 'cas' expr 'faire' block
    ;

defaut : 'defaut' 'faire' block
    ;

retourne : 'retourne' (expr)?
    ;

assignation : idfOrTab ':=' expr
    ;

si : siblock  ('sinon' siblock)*  ('sinon' block)? 'fsi'
    ;

siblock : 'si' expr 'alors' block
    ;

tantque : 'tant' 'que' expr 'faire' block 'ftant'
    ;

pour : 'pour' idfOrTab 'allant' 'de' expr 'vers' expr 'faire' block 'fpour'
    ;

appelfonc : idf '(' (foncargs)? ')'
    ;

foncargs : expr (',' expr)*
    ;

declaration : type idf (':=' expr)?
    ;

type : primitive
    | TYPE
    | 'tableau' '[' type ']'
    ;

primitive : 'entier'
    | 'chaine'
    | 'caractere'
    | 'double'
    | 'booleen'
    | 'flottant'
    | 'vide'
    ;

expr : addsousexpr
    ;

addsousexpr : multordivexpr (pmo expr)?
    ;

multordivexpr : boolexpr (mde expr)?
    ;

boolexpr : exprres (boolop expr)?
    ;

exprres : appelfonc
    | 'NIL'
    | '(' expr ')'
    | 'non' expr
    | '-' exprres
    | multipleexprcomp
    | FLOAT
    | DOUBLE
    | INTEGER
    | STRING
    | booleen
    | idfOrTab
    ;

multipleexprcomp : '°' (foncargs)? '°'
    ;

pmo : '-' | '+' | 'ou' ;
mde : '*' | '/' | 'mod' | 'quo' | 'et' ;
boolop : '<=' | '>=' | '!=' | '=' | '>' | '<' ;
booleen : 'true' | 'false' ;

idfOrTab : idf ('[' expr ']')? ;

idf : TYPE | IDF ;
filename : TYPE | IDF | FILENAME ;

STRING : '"' .*? '"' ;
INTEGER : [0-9]+ ;
DOUBLE : (INTEGER)? '.' INTEGER ;
FLOAT : DOUBLE 'f' ;
TYPE : [a-zA-Z][a-zA-Z0-9]* ;
IDF : [a-zA-Z_][a-zA-Z0-9_]* ;
FILENAME : [a-zA-Z0-9_]+ ;
COMMENT : '#' .*? '\n' -> skip ;
WS : ('\n'+ | '\t'+ | ' '+ | '\r'+) -> skip ;