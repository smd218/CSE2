///////////////////////////////////////////////////////////////////
//Sophie Davis
//CSE2 - Spring 2015
//Prof. Brian Chen
//02-06-2015
//lab03 - BigMac java program
//This program computes the cost of buying a specific number of Big Macs when given the  
//number of Big Macs, price of a Big Mac, and sales tax. It does so by using the Scanner utility.

import java.util.Scanner; //imports scanner
//start class
public class BigMac {
    //start main method
    public static void main (String[ ] args) {
        Scanner myScanner;
        myScanner=new Scanner(System.in);
        System.out.print("Enter the number of Big Macs (an integer > 0): ");
        int nBigMacs=myScanner.nextInt();
        System.out.print("Enter the cost per Big Mac as"+" a double (in the form xx.xx): ");
        double bigMac$=myScanner.nextDouble();
        System.out.print("Enter the percent tax as a whole number (xx): ");
        double taxRate=myScanner.nextDouble();
        taxRate/=100; //user enters percent, but we want output to be a proportion
        double cost$;
        int dollars, //whole dollar amount of cost
            dimes, pennies; //for storing digits to the right of the decimal point
        cost$=nBigMacs*bigMac$*(1+taxRate); //get the whole amount, dropping decimal fraction
        dollars=(int)cost$; //get dimes amount
        dimes=(int)(cost$*10)%10;
        pennies=(int)(cost$*100)%10;
        System.out.println("The total cost of " +nBigMacs +" Big Macs, at $"+bigMac$ +" per Big Mac, with a " 
            + " sales tax of " + (int)(taxRate*100) + "%, is $"+dollars+'.'+dimes+pennies); 
        
        
    }//end main method
}//end class