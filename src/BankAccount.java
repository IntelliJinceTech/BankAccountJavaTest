import com.sun.jdi.connect.Connector;

public class BankAccount {
    //instance fields
    String firstName;
    String lastName;
    double balance;
    int yearsOpen;

    //constructor method
    public BankAccount(String firstNameOwner, String lastNameOwner, double accountBalance, int accountYears ) {
        firstName = firstNameOwner;
        lastName = lastNameOwner;
        balance = accountBalance;
        yearsOpen = accountYears;
    }
    public void checkBalance() {

    }
    // Show balance
    // Deposit Money
    // Withdraw Money



    public static void main(String[] Args) {
        System.out.println("Does this work?");
        BankAccount PNC = new BankAccount("Christopher","Jin", 200000.00, 10);
        System.out.println("The owner of the PNC Bank account is named: " + PNC.firstName + " " + PNC.lastName);
    }
}
