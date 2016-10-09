# YAJS - Yet Another Json Schema
This project is an attempt to implement JSON schema in a consice form.

E.g.
```text
import ./Address.jschema

type Age integer;

type Date {
	year!: integer,
	month!: integer(min:1, max:12),
	day!: integer(min:1, max:31)
}

type User {
	firstName!: string,
	lastName!: string,
	age: Age,
	address!: Address,
	dateOfBirth! : Date,
	creditCardTransactions!: [{
		ammount: float,
		creditCard: string(minLength: 12, maxLength:16)
		description: string
	}],
	deprecated(2016-10-09) checkTransactions: {
		ammount: float,
		routingNumber: string(length: 12),
		account: string(minLength: 12, maxLength:16)
		description: string
	},
	experimental paypalTransactions:{
		ammount: float,
		email: string(length: 12),
		description: string
	}
}
```
