import java.util.Arrays;
import java.util.ArrayList;
public class BankAccount2 {
    String firstName;
    String lastName;
    int balance;
    int age;

    public BankAccount2 (String firstNameOwner, String lastNameOwner, int accountBalance, int accountAge ) {
         firstName = firstNameOwner;
         lastName = lastNameOwner;
         balance = accountBalance;
         age = accountAge;
    }

    public void checkBalance() {
        System.out.println("You have $" + balance + " left on your balance");
    }

    public void checkAccountAge() {
        System.out.println("Your account is " + age + " years old.");
    }
    public int[] accountDetails() {
        int[] accountIDs = {500,200};
//        return accountIDs;
        return accountIDs;
    }

    public static void main(String[] args) {
        BankAccount2 capitalOneAccount = new BankAccount2("Chris", "Jin", 100000, 5);
        capitalOneAccount.checkBalance();
        capitalOneAccount.checkAccountAge();
        System.out.println(Arrays.toString(capitalOneAccount.accountDetails()));
        // banks array

    }
}
