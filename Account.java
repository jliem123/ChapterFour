//*******************************************************
// Account.java
//
// A bank account class with methods to deposit to, withdraw from,
// change the name on, charge a fee to, and print a summary of the account.
//*******************************************************
public class Account
{
  private double balance;
  private String name;
  private long acctNum;
  //----------------------------------------------
  //Constructor -- initializes balance, owner, and account number
  //----------------------------------------------
  public Account(double initBal, String owner, long number)
  {
      this.balance = initBal;
      this.name = owner;
      this.acctNum = number;
  }
  //----------------------------------------------
  // Checks to see if balance is sufficient for withdrawal.
  // If so, decrements balance by amount; if not, prints message.
  //----------------------------------------------
  public void withdraw(double amount)
  {
      this.balance = this.balance - amount;
      }
  //----------------------------------------------
  // Adds deposit amount to balance.
  //----------------------------------------------
  public void deposit(double amount)
  {
      this.balance = this.balance + amount;
  }
  //----------------------------------------------
  // Returns balance.
  //----------------------------------------------
  public String getBalance()
  {
      return this.name + " has $" + this.balance;
  }
  //----------------------------------------------
  // Returns a string containing the name, account number, and balance.
  //----------------------------------------------
  public String toString()
  {
      return this.name + ", " + this.acctNum + ", " + this.balance;
  }
  //----------------------------------------------
  // Deducts $10 service fee
  //----------------------------------------------
  public String chargeFee()
  {
      balance = (balance - 10);
      return "The new balance is " + this.balance;
  }
  //----------------------------------------------
  // Changes the name on the account
  //----------------------------------------------
  public String changeName(String newName)
  {
      this.name = newName;
      return this.name;
  }
}
