///////////////////////////////////////////////////////////////////////////////////////
//Sophie Davis
//CSE2 - Spring 2015
//Prof. Brian Chen
//03-20-2015
//lab08 - Factorials java program
//This program prompts the user for imput, then prints out the super factorial of 
//the int that was inputted in to the system using mutiple mothods and calling them.
//a super factorial is n! + (n-1)! + (n-2)! +.... 1!

import java.util.Scanner;//import scanner utility
public class Factorials {
    public static void main (String [] args){
        Scanner myScanner=new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter a positive int: ");
        int input=myScanner.nextInt();
        
        if (input>=0){
            for (int i=1; i<=input; i++ ){
                sum += factorial (i);
            }//end for
            print (input, sum); //calls method print
        }//end if
        
        else {
            System.out.println("That is not a valid input.");
        }
    }//end main method
        
        public static int factorial(int input){
            int mul = 1;
            for (int i=1; i<=input; i++){
                mul *=i;
            }//end for loop
            System.out.println(mul);
            return mul;
        }//end method factorial
        
        public static void print (int input, int sum){
            System.out.println("The super factorial of "+ input + " is equal to " + sum);
        }//end method print
}//end class