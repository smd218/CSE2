///////////////////////////////////////////////////////////////////////////////////////
//Sophie Davis
//CSE2 - Spring 2015
//Prof. Brian Chen
//03-03-2015
//hw06 - RunFactorial java program
//This program accepts an input value between 9 and 16 inclusive,
//then prints out the factoial of the value

import java.util.Scanner;//imports scanner utility
//start class
public class RunFactorial {
    //start main method
    public static void main (String [ ] args) {
        int x=0; //declares "x" as int
        int product=1; //declares "product" as int and sets equal to 1
        Scanner myScanner;//declares instance of scanner
        myScanner=new Scanner(System.in);//call scanner constructor
        System.out.println("Please enter an integer between 9 and 16: ");//prompts user input
        myScanner.hasNextInt();//accepts user input
        x=myScanner.nextInt();//stores user input
        if (x>=9 && x<=16){ //if x is between 9 and 16 inclusive...
            System.out.print(x);//prints original value of x out
            while (x>=1){
                //begin while loop
                //while x>=1, run loop
               product=(product*x);//multiplies current value of product by x
               x--;//decrements value of x by 1
            }//end while loop
            System.out.print("!= "+product); //prints out factorial symbol next to original 
                                             //value of x and prints out the final product
                                             //all in the same line 
            System.out.println();//breaks in to a new line
        }//end if
        else { //if x is NOT between 9-16...
            System.out.println("Invalid input!");//prints error message
        }//end else
    }//end main method
}//end class