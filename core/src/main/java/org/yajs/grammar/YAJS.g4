grammar YAJS;

schema: (importStatement)* (typeDeclaration)*;

importStatement: IMPORT_KEYWORD filename ';';

filename: string;

typeDeclaration: TYPE_KEYWORD typeName type ';';

type: 'integer' | 'float' | 'string' | 'boolean' | 'null' | array | object ;

IMPORT_KEYWORD: 'import';

TYPE_KEYWORD: 'type';

typeName: UNQUOTED_STRING;

object: '{' pair (',' pair)* '}' | '{' '}';

pair : string REQUIRED? COLON type;

COLON: ':';

REQUIRED: '!';

array: '[' type (',' type)* ']'| '[' ']';

string: (QUOTED_STRING|UNQUOTED_STRING);

QUOTED_STRING: '"' (ESC | ~ ["\\])* '"';

UNQUOTED_STRING: [0-9a-zA-Z_]+;

fragment ESC: '\\' (["\\/bfnrt] | UNICODE);

fragment UNICODE: 'u' HEX HEX HEX HEX;

fragment HEX: [0-9a-fA-F];

NUMBER: '-'? INT '.' [0-9] + EXP? | '-'? INT EXP | '-'? INT;

fragment INT: '0' | [1-9] [0-9]*;

fragment EXP: [Ee] [+\-]? INT;

WS: [ \t\n\r] + -> skip ;