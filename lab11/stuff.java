//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Sophie Davis
//CSE2 - Spring 2015
//Prof. Brian Chen
//04-14-2015
//hw11 - CSE2Linear java program
//This program.....

import java.util.Scanner;
import java.util.Random;
public class stuff{
    public static void main(String [] args){
        Scanner myScanner=new Scanner(System.in);//constructs and declares scanner
        int cseGrades[]=new int[15];
        System.out.println("Enter 15 ints for final grades in CSE2: ");
            for (int x=1; x<16; x++){
            if (myScanner.hasNextInt()){
                int a=myScanner.nextInt();
                    if (a<0 || a>100){
                        System.out.println("You did not enter an integer between 0-100. ");
                        break;
                    }
                    if (a<=cseGrades[x- 1]){
                        System.out.println("The int you entered was less than or equal to the last int.");
                        break;
                    }
                cseGrades[x]=a;
                            
                        
            }//end if
            else{
                System.out.println("You did not enter an integer.");
                return;
            }//end else
            
            }
       
        
        
    }//end main method
}//end class