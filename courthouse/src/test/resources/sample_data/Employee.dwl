%dw 1.0
%output application/java
---
{
	ID: 1,
	active: "????",
	email: "????",
	name: "????",
	password: "????"
} as :object {
	class : "courthouse.test.Employee"
}