# YAJS - Yet Another Json Schema
This project is an attempt to implement JSON schema in a consice form.

Here is the simple self-speaking schema:
```text
person {
    firstName: string,
    lastName: string
}
```
The example declares person type and 2 optional fields firstName and lastName of type string.
If the fields are required then the schema will evolve as following:
```text
person {
    firstName!: string,
    lastName!: string
}
```

The enumeration is could be added as simple as
```text
person {
    firstName!: string,
    lastName!: string,
    sex: "M" | "F"
}
```

The additional array of embedded objects could be added to the schema by simply embeddeding the structure like:
```text
person {
    firstName!: string,
    lastName!: string,
    sex: "M" | "F"
    transactions: [{
    	creditCard!: string,
	ammount!: number
    }]
}
```

The field lifecycle is very important. It is very useful to mark field as deprecated (not to be used), or experimental (not ready for the prime time).

```text
person {
    firstName!: string,
    lastName!: string,
    deprecated sex: "M" | "F"
    experimental transactions: [{
    	creditCard!: string,
	ammount!: number
    }]
}
```
