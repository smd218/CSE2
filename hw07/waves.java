///////////////////////////////////////////////////////////////////////////////////////
//Sophie Davis
//CSE2 - Spring 2015
//Prof. Brian Chen
//03-17-2015
//hw07 - waves java program
//This program prompts the user to input a number b/t 1 and 30, then prints out a
//wave-like pattern using all the numbers lesser than or equal to the number that 
//was entered. It does so by using for loops, while loops, and do-while loops.

        
import java.util.Scanner;//imports scanner utility
//start class
public class waves {
    //start main method
    public static void main (String [ ] args) {
        Scanner myScanner;//declares instance of scanner
        myScanner=new Scanner(System.in);//call scanner constructor
        System.out.print("Enter a number between 1 and 30: ");//prompts user input
        myScanner.hasNextInt();//accepts user input
        int userInput=myScanner.nextInt();//stores user input
        System.out.println();//line break
        
        if (!(userInput>=1 && userInput<=30)) {
            //start if
            //checks to see if userInput is between 1 and 30 inclusive
            return; //if user input is not within range, skips to end of program
        }//end if    
        
        System.out.println("FOR LOOP:"); //prints out title
        for (int a=1; a<=userInput; a++ ){
            //start outermost for loop
            //sets the value of int a to 1; loop runs as long as a<=userInput;
            //each time loop runs, a is incrimented by 1
            if (a%2==0){
                //if a is an even #...
                String stringX=""; //declare empty string
                for (int b=1; b<=a; b++){
                    //start inner for loop
                    //sets the value of int b to 1; loop runs as long as b<=a;
                    //each time loop runs, b is incrimented by 1
                    stringX+=a;//adds a to stringX
                    System.out.println(stringX); //prints out string with input values stored
                }//end inner for loop for even numbers
            }//end if (even #s) 
            else {
                //if number is not even...
                for(int b=a; b>0; b--){
                    //start outer for loop
                    //sets the value of b equal to a; loop runs as long as b>0;
                    //each time loop runs, b is decrimented by 1
                    for(int c=b; c>0; c--){
                        //start inner for loop
                        //sets the value of c equal to b; loop runs as long as c>0;
                        //each time loop runs, c is decrimented by 1
                        System.out.print(a); //prints out new value of a
                    }//end inner for loop for odd numbers
                    System.out.println(); //line break
                }//end outer for loop for odd numbers
            }//end else (odd #s)
        }//end outermost for loop
        
        System.out.println();//line break
        
        System.out.println("WHILE LOOP:"); //prints out section title
        int d=1; //declares variable
        while (d<=userInput){
            //start outermost while loop
            //loop runs while d<=userInput
            if (d%2==0){
                //start if; if d is even...
                String stringY=""; //declare new string
                int e=1; //declare variable
                while (e<=d){
                    //start inner while loop
                    //looop runs while e<=d
                    stringY+=d; //adds d to stringY
                    System.out.println(stringY);//prints out string 
                    e++;//incriments e by 1 each time loop is run
                }//end inner while loop
            }//end if statement
            
            else {
                //if d is not even...
                int f=d; //declare variable
                while(f>0){
                    //start outer while loop
                    //loop runs while f>0
                    int g=f;//declares varible
                    while (g>0){
                        //start inner while loop
                        //loop runs while g>0
                        System.out.print(d); //prints out d
                        g--;//decrements g by 1 each time loop is run
                    }//end inner while loop
                    f--;//decremments f by 1 each time loop is run
                    System.out.println();//line break
                }//end outer while loop
            }//end else
            d++;//increments d by 1 each time loop runs
        }//end outermost while loop
        System.out.println();//line break
        
        System.out.println("DO-WHILE LOOP:"); //prints out title
        d=1;//declares variable
        do {
            //start outermost dowhile loop
            if (d%2==0){
                //start if; if d is even...
                String stringZ="";//declare new string
                int e=1;//declare variable
                do{
                    //start inner dowhile loop
                    stringZ+=d;//add d to stringZ
                    System.out.println(stringZ);//prints out stringZ
                    e++;//incriments e each time loop runs
                }while (e<=d);//loop will continue to run while (e<=d)
                //end inner dowhile loop
            }//end if statement
        
            else {
                //if d is not even...
                int f=d;//declare variable
                do{
                    //start outer dowhile loop
                    int g=f;//declare variable
                    do{
                        //start inner dowhile loop
                        System.out.print(d);//print out d
                        g--;//decrements g each time loop is run
                    }while (g>0);//loop continues to run while g>0
                    //end inner dowhile loop
                    f--;//decrements f by 1 each time loop runs
                    System.out.println();//line break
                }while(f>0);//loop will continue to run while f>0
                //end outer dowhile loop
            }//end else
            d++;//incriment d each time loop is run
        }while (d<=userInput); //loop continues to run while d<=userInput
        //end outermost dowhile loop
        System.out.println();
        
    }//end main method
}//end class
