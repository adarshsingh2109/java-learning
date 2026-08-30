import java.util.Scanner;

public class ATM{

    private Account account;
    private Scanner sc;

    public ATM (Account account){
        this.account=account;
        sc=new Scanner(System.in);
    }

    public boolean login(){
        System.out.print("Enter PIN: ");
        int enteredPin=sc.nextInt();

        if (account.validatePin(enteredPin)){
            System.out.println("Login Successful!");
            return true;
        }
        System.out.println("Incorect PIN!");
        return false;
    }

    public void showMenu(){
        int choices;
        do {
            System.out.println("\n==== ATM MENU ====");
            System.out.println("1. Check Balance");
            System.out.println("2.Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("Choose Option: ");
            choices = sc.nextInt();

            switch (choices) {
                case 1:
                    account.checkBalance();
                    break;
                case 2:
                    System.out.println("Enter Amount: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 3:
                    System.out.println("Enter Amount: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");


            }
        }while (choices !=4);

    }
}

