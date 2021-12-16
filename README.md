code-smell
==========

1.src/main/java/com/danix/code/smell/example001/Company.java
 Long Method and Comments.: In the class company.java the method withdraw is too long and it also needs comments to make it clear, meaning that this class has Long Method and Comments. For fixing that I extracted the withdraw method to 2 other methods : withdrawWithPremium, withdrawWithoutPremium that contains the if statements that were in the withdraw method. 

2. Lazy Class: AccountType.java  / Account.java. 
In AccountType.java, it says if the account type is premium or not, which makes it a vague class since this behaviour can easily be performed in the Account.java class. 
Refactoring Technique to solve the lazy class: Inline Class. As already mentioned, what will be preceded to do is eliminate this class and place its content in the Account class, in this way we avoid having a class that only performs too basic functionality.
Next, In the AccountType we pass all the functionality of the class to Account, where a String attribute called type was created in which it fulfils the same functionality as the class AccountType.

