import java.util.Scanner;

public class BankingApplication {
        public static void main(String[] args) {
        BankAccount pnb = new BankAccount();
        pnb.showMenu();
    }
}
 
class BankAccount{
    int balance;
    int previousTransaction;
    String customerName;
    int customerNumber;
    int savings = 0;

    void deposit(int amount)
    {
        if(amount != 0){
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    void withdraw(int amount2){
        if(amount2 != 0){
            balance = balance - amount2;
            previousTransaction = -amount2;
        }

    }
    void getPreviousTransaction() {
        if(previousTransaction > 0){
            System.out.println("Deposited: " + previousTransaction );
        }
        else if(previousTransaction < 0){
            System.out.println("Withdrawn: " +Math.abs(previousTransaction));
        }
            else{
                System.out.println("No Transaction Occured");
            }
    }

       void savingsacc(int savamount){
          savings = savings + savamount;
    }

       void showMenu(){

           char option = '\0';
           try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter your Customer Name:  ");
            customerName = scanner.nextLine();
            System.out.println("Enter your Customer Number: ");
            customerNumber = scanner.nextInt();
            if((customerName == "Ayushi") || (customerNumber == 4457)){

           System.out.println("\nWelcome " + customerName +"!");
           System.out.println(" ");
           System.out.println("Your ID is " + customerNumber);
           System.out.println("\n");
           System.out.println("A. Check Balance");
           System.out.println("B. Deposit");
           System.out.println("C. Withdraw");
           System.out.println("D. Previous Transaction");
           System.out.println("E. Savings account");
           System.out.println("F. Exit");

           do
           {
            System.out.println("====================================================================");
            System.out.println("Enter an Option");
            System.out.println("====================================================================");
            option = scanner.next().charAt(0);
            System.out.println("\n");

            switch(option)
            {
                case 'A':
                System.out.println("-----------------------------------------------------------------");
                System.out.println("Balance = " + balance);
                System.out.println("-----------------------------------------------------------------");
                System.out.println("\n");
                break;

                case 'B':
                System.out.println("-----------------------------------------------------------------");
                System.out.println("Enter an Amount to Deposit: ");
                System.out.println("-----------------------------------------------------------------");
                int amount = scanner.nextInt();
                deposit(amount);
                System.out.println("\n");
                break;
                
                case 'C':
                System.out.println("-----------------------------------------------------------------");
                System.out.println("Enter an Amount to Withdraw: ");
                System.out.println("-----------------------------------------------------------------");
                int amount2 = scanner.nextInt();
                withdraw(amount2);
                System.out.println("\n");
                break;

                case 'D':
                System.out.println("-----------------------------------------------------------------");
                getPreviousTransaction();
                System.out.println("-----------------------------------------------------------------");
                System.out.println("\n");
                break;

                case 'E':
                System.out.println("-----------------------------------------------------------------");
                System.out.println("Enter the amount to put in savings account: ");
                System.out.println("-----------------------------------------------------------------");
                int savamount = scanner.nextInt();
                savingsacc(savamount);
                System.out.println("\nYou have successfully deposited " + savamount + " in your savings account" + "\n");
                System.out.println("|Your total savings is: " + savings + "|");
                break;

                case 'F':
                System.out.println("******************************************************************");
                break;

                default:
                System.out.println("Invalid Option, Please Try Again!");
                break;
             }
           }
            while(option != 'F');
            System.out.println("Thank you for using the sevice :)");
       }
       else{
           System.out.println("!!!!!!....Invalid Customer ID or Number....!!!!!!");
       }
    }
   
    }

       }   
