package oops;

// Create a class BankAccount with fields accountNumber, accountHolder, and balance. Implement
// methods to deposit and withdraw money.

class BankAccount{
    int accountNumber;
    String accountHolder;
    int balance;
    void depodraw(){
        int deposit = 200;
        System.out.println(deposit+balance);

        int withdraw = 100;
        System.out.println(balance-withdraw);
    }

}

public class program3 {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.accountNumber=297854;
        b1.accountHolder="Azit";
        b1.balance=1000;

        b1.depodraw();

        
    }
    
}
