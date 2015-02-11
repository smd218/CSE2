///////////////////////////////////////////////////////////////////////////////
//Sophie Davis
//CSE2 - Spring 2015
//Prof. Brian Chen
//02-10-2015
//hw03 - FourDigits java program
//This program prompts the user to enter a double, then prints 
//out the first four digits to the right of the decimal point.

import java.util.Scanner; //imports scanner utility
//start class
public class FourDigits {
    //start main method
    public static void main (String [ ] args) {
        Scanner myScanner; //declares instance of the Scanner
        myScanner=new Scanner(System.in); //call Scanner constructor
        System.out.print("Enter a double, and the first four digits after the decimal point will be printed: "); 
            //prompts input of double
        double myDouble=myScanner.nextDouble(); //defines variable and accepts user input
        double doubleDecimal=myDouble%1; //gets rid of numbers to the left of the decimal
            int myDoubleX=(int)((doubleDecimal)*10000.0); //multiplies decimal portion of input by 10000 to make it positive
                //also casts double to an int
            String myDoubleFinal = String.format("%04d", myDoubleX); //converts final number to a string and specifies the number of digits to print out
                //specifies that the space fillers preceeding the number (if the number is < 1000) should be '0'.
        System.out.println("The four digits are "+myDoubleFinal); //prints out the four digits
    }//end main method
}//end class