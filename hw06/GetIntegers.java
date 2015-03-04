///////////////////////////////////////////////////////////////////////////////////////
//Sophie Davis
//CSE2 - Spring 2015
//Prof. Brian Chen
//03-03-2015
//hw06 - GetIntegers java program
//This program propts the user to enter 5 positive integers, and then
//prints out their sum

import java.util.Scanner; //imports scanner utility
//start class
public class GetIntegers {
    //start main method
    public static void main (String [ ] args) {
        int sum=0; //declares "sum" as an int
        int a=0; //declares "a" as an int
        int b=0; //declares "b" as an int
        Scanner myScanner;//declares instance of scanner
        myScanner=new Scanner(System.in);//call scanner constructor
        System.out.println("Please enter 5 non-negative integers: ");//prompts user input
        for (a=0; a<5; a++){
            //Starts the for loop at a=0. As long as a<5, it continues to run the loop. 
            //Each time the loop runs, the value of a is incrimented by one.
            if (myScanner.hasNextInt()){ //if input is an integer...
                //begin if statement
                b=myScanner.nextInt();//stores user input
                if (b>=0){ //if b>=0....
                    sum=sum+b;//incriments the value of sum by b
                }//end if
                else { //if b<0...
                    System.out.println("Invalid input! ");//print error message
                    return;//skip to end of program
                }//end else
            }//end if
            else{ //if input is not an integer...
                System.out.println("Invalid input! "); //print error message
                return;//end program
            }//end else
        }//end for loop
        System.out.println("The sum is "+sum+".");//if 5 valid inputs are accepted, the loop ends, 
                                                  //and the sum of the 5 integers prints here.
    }//end main method
}//end class