import com.sun.jdi.connect.Connector;

public class BankAccount extends FinancialInstitution{
    //instance fields
    String firstName;
    String lastName;
    private double balance;
    int yearsOpen;
    private String name;
    private String id;


    //constructor method
    public BankAccount(String firstNameOwner, String lastNameOwner, double accountBalance, int accountYears, String properName, String inputID) {
        super()
        firstName = firstNameOwner;
        lastName = lastNameOwner;
        balance = accountBalance;
        yearsOpen = accountYears;
        name = properName;
        id = inputID;


    }
    // withdraw limit
    public int withdrawLimit (int withdrawAmount) {
        return withdrawAmount;
    }
    public void checkBalance() {
        // Show balance
        System.out.println("There is currently $" + balance + " in your PNC Bank Account");
    }
    // Deposit Money
    public void depositMoney( double depositAmount) {
        //double updatedBalance = balance + depositAmount;
        //balance = updatedBalance;
        balance += depositAmount;
        System.out.println("Your updated balance is now $" + balance + ".");
    }
    // Withdraw Money
    public void withdrawMoney(double withdrawAmount) {
        balance -= withdrawAmount;
        System.out.println("Your updated balance is now $" + balance + ".");
    }



}

