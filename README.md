# YAJS - Yet Another Json Schema
This project is an attempt to implement JSON schema in a consice form.

Here is the simple self-speaking schema:
```text
class person {
    firstName: string = 1,
    lastName: string = 2
}
```
The example declares person type and 2 optional fields firstName and lastName of type string.
If the fields are required then the schema will evolve as following:
```text
class person {
    firstName: string! = 1,
    lastName: string! = 2
}
```

The enumeration could be added as simple as
```text
enum gender {
    M: string = 1,
    F: string = 2,
    NA: string = 3,    
}

class person {
    firstName: string!,
    lastName: string!,
    sex: gender
}
```

Arrays are as simple as
```
class person {
    legalNames: string[] = 1
}
```

Loose typing is also possible with type any
```
class person {
    freeForm: any = 1
}
```


