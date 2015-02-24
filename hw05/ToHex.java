////////////////////////////////////////////////////////////////////////////////////////
//Sophie Davis
//CSE2 - Spring 2015
//Prof. Brian Chen
//02-24-2015
//hw05 - ToHex java program
//This program allows users to enter three numbers representing RGB pixels from 8-bits between 0-255.
//It then converts these numbers in to hexadecimal values (1,2,3,4,5,6,7,8,9,A,B,C,D,E,F).

    //I used System.out.print(...) instead of System.out.println(...) for the statement 
    //"The decimal numbers R:__ G:__ B:__ are represented in hexadecimal as..."
    //and for the values of wholeR, remainderR, wholeG, remainderG, and wholeB so that 
    //they would all print out in a single line. I used System.out.println(...) for 
    //remainderB so that nothing else would be printed on that line after remainderB.


import java.util.Scanner; //imports scanner utility
//start class
public class ToHex {
    //start main method
    public static void main (String [ ] args) {
        int R;
        int G;
        int B;
        Scanner myScanner;//declares instance of scanner
        myScanner=new Scanner(System.in);//call scanner constructor
        System.out.println("Please enter three numbers representing RGB values. ");//prompts imput of numbers
        
        System.out.print(" ");//prompts input of first number
        if (myScanner.hasNextInt()) { 
            R=myScanner.nextInt();//stores input as "R"
            if (R>=0) { }//accept if R>=0
            else {System.out.println("Sorry, you must enter values between 0-255.");//print out error msg if R<0
                return;}//skip to end of program
            if (R<=255) { }//accept if R<=255
            else {System.out.println("Sorry, you must enter values between 0-255.");//print out error msg if R>255
                return;}}//skip to end of program
        else {System.out.println("Sorry, your input must consist of integers.");//if an int is not entered, print our error msg
                return;}//skip to end of program
        
        System.out.print(" ");//prompts input of second number
        if (myScanner.hasNextInt()) { 
            G=myScanner.nextInt();//stores input as "G"
            if (G>=0) { }//accept if G>=0
            else {System.out.println("Sorry, you must enter values between 0-255.");//print out error msg if G<0
                return;}//skip to end of program
            if (G<=255) { }//accept if G<=255
            else {System.out.println("Sorry, you must enter values between 0-255.");//print out error msg if G>255
                return;}}//skip to end of program
        else {System.out.println("Sorry, your input must consist of integers.");//if an int is not entered, print our error msg
                return;}//skip to end of program
                
        System.out.print(" ");//prompts input of third number
        if (myScanner.hasNextInt()) { 
            B=myScanner.nextInt();//stores input as "B"
            if (B>=0) { }//accept if B>=0
            else {System.out.println("Sorry, you must enter values between 0-255.");//print out error msg if B<0
                return;}//skip to end of program
            if (B<=255) { }//accept if B<=255
            else {System.out.println("Sorry, you must enter values between 0-255.");//print out error msg if B>255
                return;}}//skip to end of program
        else {System.out.println("Sorry, your input must consist of integers.");//if an int is not entered, print our error msg
                return;}//skip to end of program
                
        System.out.print("The decimal numbers R: "+R+" G: "+G+" B: "+B+" are represented in hexadecimal as: ");
                
        int wholeR=(R/16);//number of times 16 goes in to R
        int remainderR=(R%16);//remainder when R is divided by 16
        
        int wholeG=(G/16);//number of times 16 goes in to G
        int remainderG=(G%16);//remainder when G is divided by 16
        
        int wholeB=(B/16);//number of times 16 goes in to B
        int remainderB=(B%16);//remainder when B is divided by 16
        
        switch (wholeR) {
            //begin new switch statement
            case 0: //if wholeR=0...
                System.out.print("0");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 1: //if wholeR=1...
                System.out.print("1");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 2: //if wholeR=2...
                System.out.print("2");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 3: //if wholeR=3...
                System.out.print("3");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 4: //if wholeR=4...
                System.out.print("4");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 5: //if wholeR=5...
                System.out.print("5");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 6: //if wholeR=6...
                System.out.print("6");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 7: //if wholeR=7...
                System.out.print("7");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 8: //if wholeR=8...
                System.out.print("8");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 9: //if wholeR=9...
                System.out.print("9");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 10: //if wholeR=10...
                System.out.print("A");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 11: //if wholeR=11...
                System.out.print("B");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 12: //if wholeR=12...
                System.out.print("C");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 13: //if wholeR=13...
                System.out.print("D");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 14: //if wholeR=14...
                System.out.print("E");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 15: //if wholeR=15...
                System.out.print("F");//prints out number in hexadecimal
                break;//prevents fallthrough
        }//end switch statement 
        
        switch (remainderR) {
            //begin new switch statement
            case 0: //if remainderR=0...
                System.out.print("0");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 1: //if remainderR=1...
                System.out.print("1");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 2: //if remainderR=2...
                System.out.print("2");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 3: //if remainderR=3...
                System.out.print("3");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 4: //if remainderR=4...
                System.out.print("4");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 5: //if remainderR=5...
                System.out.print("5");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 6: //if remainderR=6...
                System.out.print("6");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 7: //if remainderR=7...
                System.out.print("7");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 8: //if remainderR=8...
                System.out.print("8");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 9: //if remainderR=9...
                System.out.print("9");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 10: //if remainderR=10...
                System.out.print("A");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 11: //if remainderR=11...
                System.out.print("B");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 12: //if remainderR=12...
                System.out.print("C");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 13: //if remainderR=13...
                System.out.print("D");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 14: //if remainderR=14...
                System.out.print("E");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 15: //if remainderR=15...
                System.out.print("F");//prints out number in hexadecimal
                break;//prevents fallthrough
        }//end switch statement 
        
        switch (wholeG) {
            //begin new switch statement
            case 0: //if wholeG=0...
                System.out.print("0");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 1: //if wholeG=1...
                System.out.print("1");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 2: //if wholeG=2...
                System.out.print("2");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 3: //if wholeG=3...
                System.out.print("3");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 4: //if wholeG=4...
                System.out.print("4");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 5: //if wholeG=5...
                System.out.print("5");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 6: //if wholeG=6...
                System.out.print("6");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 7: //if wholeG=7...
                System.out.print("7");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 8: //if wholeG=8...
                System.out.print("8");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 9: //if wholeG=9...
                System.out.print("9");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 10: //if wholeG=10...
                System.out.print("A");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 11: //if wholeG=11...
                System.out.print("B");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 12: //if wholeG=12...
                System.out.print("C");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 13: //if wholeG=13...
                System.out.print("D");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 14: //if wholeG=14...
                System.out.print("E");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 15: //if wholeG=15...
                System.out.print("F");//prints out number in hexadecimal
                break;//prevents fallthrough
        }//end switch statement 
        
        switch (remainderG) {
            //begin new switch statement
            case 0: //if remainderG=0...
                System.out.print("0");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 1: //if remainderG=1...
                System.out.print("1");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 2: //if remainderG=2...
                System.out.print("2");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 3: //if remainderG=3...
                System.out.print("3");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 4: //if remainderG=4...
                System.out.print("4");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 5: //if remainderG=5...
                System.out.print("5");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 6: //if remainderG=6...
                System.out.print("6");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 7: //if remainderG=7...
                System.out.print("7");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 8: //if remainderG=8...
                System.out.print("8");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 9: //if remainderG=9...
                System.out.print("9");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 10: //if remainderG=10...
                System.out.print("A");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 11: //if remainderG=11...
                System.out.print("B");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 12: //if remainderG=12...
                System.out.print("C");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 13: //if remainderG=13...
                System.out.print("D");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 14: //if remainderG=14...
                System.out.print("E");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 15: //if remainderG=15...
                System.out.print("F");//prints out number in hexadecimal
                break;//prevents fallthrough
        }//end switch statement 
        
        switch (wholeB) {
            //begin new switch statement
            case 0: //if wholeB=0...
                System.out.print("0");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 1: //if wholeB=1...
                System.out.print("1");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 2: //if wholeB=2...
                System.out.print("2");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 3: //if wholeB=3...
                System.out.print("3");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 4: //if wholeB=4...
                System.out.print("4");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 5: //if wholeB=5...
                System.out.print("5");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 6: //if wholeB=6...
                System.out.print("6");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 7: //if wholeB=7...
                System.out.print("7");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 8: //if wholeB=8...
                System.out.print("8");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 9: //if wholeB=9...
                System.out.print("9");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 10: //if wholeB=10...
                System.out.print("A");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 11: //if wholeB=11...
                System.out.print("B");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 12: //if wholeB=12...
                System.out.print("C");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 13: //if wholeB=13...
                System.out.print("D");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 14: //if wholeB=14...
                System.out.print("E");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 15: //if wholeB=15...
                System.out.print("F");//prints out number in hexadecimal
                break;//prevents fallthrough
        }//end switch statement 
        
        switch (remainderB) {
            //begin new switch statement
            case 0: //if remainderB=0...
                System.out.println("0");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 1: //if remainderB=1...
                System.out.println("1");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 2: //if remainderB=2...
                System.out.println("2");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 3: //if remainderB=3...
                System.out.println("3");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 4: //if remainderB=4...
                System.out.println("4");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 5: //if remainderB=5...
                System.out.println("5");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 6: //if remainderB=6...
                System.out.println("6");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 7: //if remainderB=7...
                System.out.println("7");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 8: //if remainderB=8...
                System.out.println("8");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 9: //if remainderB=9...
                System.out.println("9");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 10: //if remainderB=10...
                System.out.println("A");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 11: //if remainderB=11...
                System.out.println("B");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 12: //if remainderB=12...
                System.out.println("C");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 13: //if remainderB=13...
                System.out.println("D");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 14: //if remainderB=14...
                System.out.println("E");//prints out number in hexadecimal
                break;//prevents fallthrough
            case 15: //if remainderB=15...
                System.out.println("F");//prints out number in hexadecimal
                break;//prevents fallthrough
        }//end switch statement 

    }//end main method
}//end class
