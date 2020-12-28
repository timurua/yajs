# YAJS - Yet Another Json Schema
This project is an attempt to implement JSON schema in a consice form.

Here is the simple self-speaking schema:
```text
object person {
    firstName: string = 1,
    lastName: string = 2
}
```
The example declares person type and 2 optional fields firstName and lastName of type string.
If the fields are required then the schema will evolve as following:
```text
object person {
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

object person {
    firstName: string! = 1,
    lastName: string! = 2,
    sex: gender = 3,
}
```

Arrays are as simple as
```
object person {
    legalNames: string[] = 1,
}
```

Loose typing is also possible with type any
```
object person {
    freeForm: any = 1,
}
```

Comments
Loose typing is also possible with type any
```
object person {
    // This is a free form field
    freeForm: any = 1,
}
```

Annotations
Loose typing is also possible with type any
```
@AllowExtra
object person {
    // This is a free form field
    @Deprecated
    freeForm: any = 1,
}
```

