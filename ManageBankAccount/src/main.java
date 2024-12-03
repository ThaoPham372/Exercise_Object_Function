import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();
        System.out.print("Enter account number: ");
        account.setAccountNumber(sc.nextLine());
        System.out.print("Enter account name: ");
        account.setAccountHolderName(sc.nextLine());
        int choice;

        do {
            System.out.println("-----Bank Account Management-----");
            System.out.println("1. Deposit money.");
            System.out.println("2. Withdraw money.");
            System.out.println("3. Display account information.");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter money to deposit: ");
                    double amount = sc.nextDouble();
                    depositMoney(account, amount);
                    break;
                case 2:
                    System.out.print("Enter money to withdraw: ");
                    amount = sc.nextDouble();
                    withdrawMoney(account, amount);
                    break;
                case 3:
                    System.out.println("Information");
                    System.out.println("--------------------");
                    displayInfor(account);
                    break;
                case 4:
                    System.out.println("Exit!");
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 4);
    }

// Function deposit
public static void depositMoney (BankAccount account, double amount){
    if (amount > 0){
        account.balance += amount;
        System.out.println("Deposited " + amount + " money.");
    }else{
        System.out.println("Invalid deposit amount.");
    }
}
public static void withdrawMoney (BankAccount account, double amount){
    if (amount > 0 && amount <= account.balance){
        account.balance -= amount;
        System.out.println("Withdrawn " + amount + " money.");
    }else {
        System.out.println("Invalid withdraw amount.");
    }
}
public static void displayInfor(BankAccount account) {
    System.out.println("Account number: " + account.accountNumber);
    System.out.println("Account holder name: " + account.accountHolderName);
    System.out.println("Balance: " + account.balance);
}
}