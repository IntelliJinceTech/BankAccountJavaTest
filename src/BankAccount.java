import com.sun.jdi.connect.Connector;

public class BankAccount {
    //instance fields
    String name;
    double balance;
    int yearsOpen;

    //constructor method
    public BankAccount(String accountOwner, double accountBalance, int accountYears ) {
        name = accountOwner;
        balance = accountBalance;
        yearsOpen = accountYears;
    }

    // Show balance
    // Deposit Money
    // Withdraw Money



    public static void main(String[] Args) {
        System.out.println("Does this work?");
        BankAccount PNC = new BankAccount("Christopher Jin", 200000.00, 10);
        System.out.println(PNC.name);
    }
}
