Encapsulation
-

the data encapsulate ( private access )
private access - members can be acess only within a class

Bussiness logic in methods

Inheritance
-

Syntax:
-
<<modifier>> class SubClassName extends SupperClassName {
	<<field>>*
	<<constructor>>*
	<<method>>*
}

Note : constructor's are not inherited in subclass

---

Method Overriding
-
Method Signature
Access Modifier
Return Type

Polymorphism
-
customer.setAccount(checkingAccount);

// account is a polymorphic parameter
public void setAccount(Account account) {
		this.account = account;
	}
