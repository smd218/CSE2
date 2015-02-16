///////////////////////////////////////////////////////////////////////////////////////
//Sophie Davis
//CSE2 - Spring 2015
//Prof. Brian Chen
//02-10-2015
//lab04 - Cookies java program

import java.util.Scanner; //imports scanner utility
//start class
public class Cookies {
    //start main method
    public static void main (String [ ] args) {
        int nPeople=0;
        int nCookies=0;
        int nNumber=0;
        Scanner myScanner;//declares instance of scanner
        myScanner=new Scanner(System.in);//call scanner constructor
        System.out.print("Enter the number of people: ");//prompts imput of number of people
        if (myScanner.hasNextInt()) { 
            nPeople=myScanner.nextInt();
            if (nPeople>=0) { }
            else {System.out.println("You did not enter an int > 0");
                return;}}
        else {System.out.println("You did not enter an int");
                return;}
        System.out.print("Enter the number of cookies you are planning to buy: ");//prompts input of cookies
        if (myScanner.hasNextInt()) { 
            nCookies=myScanner.nextInt();
            if (nCookies>=0) { }
            else {System.out.println("You did not enter an int > 0");
                return;}}
        else {System.out.println("You did not enter an int");
                return;}
        System.out.print("How many do you want each person to get? ");
        if (myScanner.hasNextInt()) {
            nNumber=myScanner.nextInt(); 
            if (nNumber>=0) { }
            else {System.out.println("You did not enter an int > 0");
                return;}}
        else {System.out.println("You did not enter an int");
                return;}
        if (nNumber==0) {System.out.println("You will have enough cookies for each person and the amount will divide evenly.");
            return;}
        if (nCookies/nNumber>=nPeople&&(nCookies%nPeople==0)){
            System.out.println("You will have enough cookies for each person and the amount will divide evenly.");}
        else if (nCookies/nNumber>=nPeople&&(nCookies%nPeople>0)){
            System.out.println("You will have enough cookies, but they will not divide evenly.");}
        else {System.out.println("You will not have enough cookies for each person. You need to buy at least "+((nPeople*nNumber)-nCookies)+" more.");
                return;}
    }//end of main method
}//end of class
