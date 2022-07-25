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



    public static void main(String[] Args) {
        //System.out.println("Does this work?");
        BankAccount savingsAccount = new BankAccount("John", "Smith", 1000,1);
        savingsAccount.checkBalance();
        savingsAccount.depositMoney(1000.99);
        System.out.println(savingsAccount.withdrawLimit(3000));
    }
}
