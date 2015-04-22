///////////////////////////////////////////////////////////////////////////////////////
//Sophie Davis
//CSE2 - Spring 2015
//Prof. Brian Chen
//04-15-2015
//lab10 - ArrayInputs java program
//This program .........

import java.util.Scanner;
public class ArrayInputs{
    public static void main (String[] args){
        Scanner myScanner=new Scanner (System.in);
        System.out.println("Please enter an integer for the size of an array: ");
        int size=myScanner.nextInt();
        int inputArray[]=new int[size];
        
        System.out.println("Please enter "+size+ " positive integer(s): ");
        for (int x=0; x<inputArray.length; x++){
            if (myScanner.hasNextInt()){//checks to see if input is an integer
                int posInt=myScanner.nextInt();//stores input
                    if (posInt>=0){//checks to see if input is pos
                        inputArray[x]=posInt;//if all conditions apply, input is stored in array
                    }//end if
                    else{
                        System.out.println("You did not enter a positive integer.");
                        System.out.println("Please enter "+(size-x)+" positive integer(s): ");
                        x--;
                    }//end else
                }//end if
            else{
                System.out.println("You did not enter an integer.");//error msg
                return;//quits program
                
            }//end else                
                
        }//end for
        
        System.out.println("The array is: ");    
        for (int i=0; i<inputArray.length; i++){ 
            System.out.print(inputArray[i]+" "); //prints out values stored in array
        }//end for
        System.out.println();
        
        
    }//end main method
}//end class