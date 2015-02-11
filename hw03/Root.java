///////////////////////////////////////////////////////////////////////////////
//Sophie Davis
//CSE2 - Spring 2015
//Prof. Brian Chen
//02-10-2015
//hw03 - Root java program
//This program propts the user to entera double and prints out an estimate of the
//cube root of the number and the value of this estimate when cubed. 

import java.util.Scanner; //imports scanner utility
//start class
public class Root {
    //start main method
    public static void main (String [ ] args) {
        Scanner myScanner; //declares instance of the Scanner
        myScanner=new Scanner(System.in); //call Scanner constructor
        System.out.print("Enter a double, and the cube root will be printed: "); //prompts input of double
        double x=myScanner.nextDouble(); //defines variable and javaaccepts user input
        double guess=(x/3); //original guess
        double guessA=(2*guess*guess*guess+x)/(3*guess*guess); //improves guess
        double guessB=(2*guessA*guessA*guessA+x)/(3*guessA*guessA); //further improves guess
        double guessC=(2*guessB*guessB*guessB+x)/(3*guessB*guessB); //further improves guess
        double guessD=(2*guessC*guessC*guessC+x)/(3*guessC*guessC); //further improves guess
        double guessE=(2*guessD*guessD*guessD+x)/(3*guessD*guessD); //further improves guess
        System.out.println("The cube root is "+guessE+":"); //prints out estimated cube root
        System.out.println(guessE+"*"+guessE+"*"+guessE+"="+(guessE*guessE*guessE)); //prints out result of when the estimated cube root is cubed
    } //end main method
} //end class