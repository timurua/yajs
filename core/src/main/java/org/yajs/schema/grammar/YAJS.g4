grammar YAJS;

schema: (importStatement)* (typeDeclaration)*;

importStatement: IMPORT_KEYWORD filename;

filename: QUOTED_STRING;

typeDeclaration: typeName types;

types: type ( '|' type )*;

type: 'integer' | 'number' | 'string' | 'boolean' | 'null' | array | object | string | regex | typeReference;

IMPORT_KEYWORD: 'import';

typeName: UNQUOTED_STRING;

typeReference: UNQUOTED_STRING;

object: '{' pair (',' pair)* '}' | '{' '}';

pair : (experimental | deprecated)? string REQUIRED? COLON types;

experimental: EXPERIMENTAL_KEYWORD;

deprecated: DEPRECATED_KEYWORD ('(' deprecated_date ')')? ;

EXPERIMENTAL_KEYWORD: 'experimental';

DEPRECATED_KEYWORD: 'deprecated';

deprecated_date: YEAR '-' MONTH '-' DAY;

YEAR:[2-9] [0-9] [0-9] [0-9];

MONTH:[0-9] [0-9];

DAY:[0-9] [0-9];

COLON: ':';

REQUIRED: '!';

array: '[' types ']'| '[' ']';

regex: '/' + UNQUOTED_STRING + '/';

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