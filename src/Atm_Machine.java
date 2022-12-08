import java.util.Scanner;

public class Atm_Machine {

    //main method starts
    public static void main(String args[]) {
        //declare and initialize balance, withdraw, and deposits
        int balance = 0, withdraw, deposit;
        //create scanner class object to get choice of user
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("ATM Machine\n");
            System.out.println("Choose 1 for withdraw");
            System.out.println("choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT\n");
            System.out.print("Choose the operation:");

            //get choice from user
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter money to be withdrawn:");


                    //get the withdrawl money from user
                    withdraw = sc.nextInt();

                    //check weather the balance is greater than or equal to the withdrawl amount
                    if (balance >= withdraw) {
                        // remove the withdrawl amount from the total balance
                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                    } else {
                        // show custom error message
                        System.out.println("Insufficient Balance");

                    }
                    System.out.println("");
                    break;

                case 2:
                    System.out.print("Enter money to be deposited:");

                    //get deposit amount from the user
                    deposit = sc.nextInt();

                    //add the deposit amount to the total balance
                    balance = balance + deposit;
                    System.out.println("Your Money has been successfully deposited");
                    System.out.println("");
                    break;

                case 3:
                    //display total balance of the user
                    System.out.println("Balance :" + balance);
                    System.out.println("");
                    break;

                case 4:
                    //exit from the menu
                    System.exit(0);
            }

        }
    }
}
