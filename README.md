# YaJS
This project is Yet Another Json Schema

The aim of the project is to implement json validator which works off the text based schema definition language which is very consise.

E.g.
```text
import ../Address.jschema

type Age integer;

type DateOfBirth {
	year!: integer,
	month!: integer(min:1, max:12),
	date!: integer(min:1, max:30)
}

type Person {
	firstName!: string,
	lastName!: string,
	age?: Age,
	address!: Address,
	dateOfBirth! : DateOfBirth,
	transactions!: [{
		creditCard: string(minLength: 12, maxLength:16)
		company: string
	}]
}
```
