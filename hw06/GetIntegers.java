///////////////////////////////////////////////////////////////////////////////////////
//Sophie Davis
//CSE2 - Spring 2015
//Prof. Brian Chen
//03-03-2015
//hw06 - GetIntegers java program
//This program.......

import java.util.Scanner; //imports scanner utility
//start class
public class GetIntegers {
    //start main method
    public static void main (String [ ] args) {
        int sum=0;
        int a=0;
        int b=0;
        Scanner myScanner;//declares instance of scanner
        myScanner=new Scanner(System.in);//call scanner constructor
        System.out.println("Please enter 5 non-negative integers: ");
        for (a=0; a<5; a++){
            if (myScanner.hasNextInt()){
                b=myScanner.nextInt();
                if (b>=0){
                    sum=sum+b;
                }//end if
                else{
                    System.out.println("Invalid input. Please enter again.");
                    break;
                }//end else
            }//end if
            else{
                System.out.println("Invalid input. Please enter again.");
                break;
            }//end else
        }//end for loop
        System.out.println("The sum is "+sum+".");
    }//end main method
}//end class
