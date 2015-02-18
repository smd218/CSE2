///////////////////////////////////////////////////////////////////////////////////////
//Sophie Davis
//CSE2 - Spring 2015
//Prof. Brian Chen
//02-17-2015
//hw04 - Banking java program
//This program allows users to process banking transactions and view their account balance

import java.util.Scanner; //imports scanner utility
//start class
public class Banking {
    //start main method
    public static void main (String [ ] args) {
        Scanner myScanner;//declares instance of scanner
        myScanner=new Scanner(System.in);//call scanner constructor
        double accountBalanceX100=1001+(double)(Math.random()*(5000 - 1001)*100);//generates random amount between $1000 and $5000*100
            int accountBalanceTemp=(int)accountBalanceX100;//converts balance to int for rounding
            double accountBalance=((double)accountBalanceTemp)/100.0;//converts balance back to a double rounded to hundredths place
        System.out.print("Would you like to view your account balance? (yes/no):");//asks if user wants to see account balance
        String balance=myScanner.next();//stores user input as string
        switch (balance) {
            //begin switch statement
            case "no"://if no is entered...
                break;//prevents fallthrough
            case "yes"://if yes is entered...
                System.out.println("Your current bank account balance is $"+accountBalance);//prints out account balance
                break;//prevents fallthrough
        }//end switch statement
        System.out.print("Would you like to deposit money? (yes/no): ");//asks user if they wish to deposit money
        String deposit=myScanner.next();//stores user input as string
        switch (deposit) {
            //begin switch statement
            case "no"://if no is entered...
                break;//prevents fallthrough
            case "yes"://if yes is entered...
                System.out.print("How much would you like to deposit? (enter amount as xxxx.xx): ");//prompts user to input deposit amount
                double depositAmount=myScanner.nextDouble();//stores amount as double
                if (depositAmount>0){
                    //start if statement
                    //makes sure number entered is positive
                    System.out.println("Okay. Your account balance is now $"+(accountBalance+depositAmount));//prints out new balance
                }//end if statement
                else {
                    //start else statement
                    System.out.println("That is not a valid amount.");
                }//end else statement
                break;//prevents fallthrough
        }//end switch statement
        System.out.print("Would you like to withdraw money? (yes/no): ");//asks if user would like to withdraw money
        String withdraw=myScanner.next();//stores user input as string
        switch (withdraw) {
            //begin switch statement
            case "no"://if no is entered...
                System.out.println("Okay. Thank you and have a great day!");//prints out goodbye and thank you message
                break;//prevents fallthrough
            case "yes"://if yes is entered...
                System.out.print("How much would you like to withdraw? (enter amount as xxxx.xx): ");//prompts user to input desired withdrawl amount
                double withdrawAmount=myScanner.nextDouble();//stores amount as double
                if (withdrawAmount>0&&withdrawAmount<accountBalance){
                    //begin if statement
                    //makes sure number entered is positive and is no more than the account balance
                    System.out.println("Okay. Your account balance is now $"+(accountBalance-withdrawAmount));//prints out new balance
                }//end if statement
                else {
                    //begin else statement
                    System.out.println("That is not a valid amount or you do not have sufficient funds.");//prints out error message
                }//end else statement
                
                break;//prevents fallthrough
            }//end switch statement
                
        
        
        
        
    }//end main method
}//end class