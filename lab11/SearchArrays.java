//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Sophie Davis
//CSE2 - Spring 2015
//Prof. Brian Chen
//04-07-2015
//lab11 - SearchArrays java program
//This program .....


import java.util.Scanner;
import java.util.Random; //import random utility
public class SearchArrays{
    public static void main(String [] args){
        Scanner myScanner=new Scanner(System.in);
        int array1[]=new int [50];
        for (int x=0; x<array1.length; x++){
                Random randomGenerator = new Random();//declares new random num generator
                int randomNum = randomGenerator.nextInt(100);//stores random num generated b/t 0-9 into an int 
                array1[x]=randomNum;//stores random numbers in array
            }//end for
            for (int i=0; i<array1.length; i++){ 
                System.out.print(array1[i]+" "); //prints out values stored in array
            }//end for
            System.out.println();
        
        
        int array2[]=new int [50];
        for (int x=0, y=0; x<array2.length; x++){
                Random randomGenerator = new Random();//declares new random num generator
                int randomNum = randomGenerator.nextInt(100);//stores random num generated b/t 0-9 into an int 
                y+=randomNum;
                array2[x]=y;//stores random numbers in array
            }//end for
            for (int i=0; i<array2.length; i++){ 
                System.out.print(array2[i]+" "); //prints out values stored in array
            }//end for
            System.out.println();
    }//end main method
}//end class