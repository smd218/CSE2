///////////////////////////////////////////////////////////////////////////////////////
//Sophie Davis
//CSE2 - Spring 2015
//Prof. Brian Chen
//03-03-2015
//hw06 - GetIntegers java program
//This program prompts the user to input 5 positive integers, then prints out their sum

import java.util.Scanner; //imports scanner utility
//start class
public class GetIntegers {
    //start main method
    public static void main (String [ ] args) {
        int sum=0;//declares variable
        int a=0;//decalres variable
        int b=0;//declares variable
        Scanner myScanner;//declares instance of scanner
        myScanner=new Scanner(System.in);//call scanner constructor
        System.out.println("Please enter 5 non-negative integers: ");//prompts user input
        for (a=0; a<5; a++){ 
            //start for loop
            //start with a=0. as long as a,5, run the code. incriment a by 1 each time the code is run.
            if (myScanner.hasNextInt()){ //if input is an int
                b=myScanner.nextInt();//store input
                if (b>=0){//if b is positive...
                    sum=sum+b; //add b to the current value of sum
                }//end if
                else{//if b is negative...
                    System.out.println("Invalid input. Please enter again.");//prints error message
                    break;//exits program
                }//end else
            }//end if
            else{//if b is not an integer...
                System.out.println("Invalid input. Please enter again.");//prints out error message
                break;//exists program
            }//end else
        }//end for loop
        System.out.println("The sum is "+sum+".");//if 5 valid inputs are given, their sum is printed here
    }//end main method
}//end class
