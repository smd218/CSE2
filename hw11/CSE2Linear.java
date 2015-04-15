//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Sophie Davis
//CSE2 - Spring 2015
//Prof. Brian Chen
//04-14-2015
//hw11 - CSE2Linear java program
//This program propts the user for 15 ints between 0-100 in increasing order, then stores them in an array. It then calls
//on another method to perform a binary search on the array, returns to the main method, then calls another method to 
//perform a linear search on the array.

import java.util.Scanner; //import scanner
import java.util.Random; //import random
public class CSE2Linear{
    public static void main(String [] args){
        Scanner myScanner=new Scanner(System.in);//constructs and declares scanner
        int cseGrades[]=new int[15]; //declare and allocate new array
        System.out.println("Enter 15 ints for final grades in CSE2: "); //prompt user input
            for (int x=0; x<cseGrades.length; x++){
                if (myScanner.hasNextInt()){//checks to see if input is an integer
                    int a=myScanner.nextInt();//stores input
                        if (a>=0 && a<=100){//checks to see if input is b/t 0-100
                                if ( (x>0 && a>cseGrades[x- 1]) || x==0){//checks to see if input is greater than the last input
                                    cseGrades[x]=a;//if all conditions apply, input is stored in array
                                }//end if
                                else {
                                    System.out.println("The int you entered was less than or equal to the last int. Enter again: ");
                                    x--; //decrement x b/c value was not included in array
                                }//end else
                        }//end if
                        else{
                            System.out.println("You did not enter an integer between 0-100. Enter again: ");//error msg
                            x--;
                        }//end else
                    }//end if
                    else{
                        System.out.println("You did not enter an integer.");//error msg
                        return;//quits program
                    }//end else
                
            }//end for loop
            
            System.out.print("The grades, sorted, are: ");
            for (int i=0; i<cseGrades.length; i++){ 
                System.out.print(cseGrades[i]+" "); //prints out values stored in array
            }//end for
            System.out.println();//line break
            
            binarySearch(cseGrades); //calls method binarySearch w/ cseGrades as input
            linearSearch(cseGrades); //calls method linearSearch w/ cseGrades as input
            
    }//end main method
    
    public static int[] binarySearch(int list[]){
        Scanner myScanner=new Scanner(System.in);//construct/declare scanner
        System.out.print("Enter a grade to search for: ");//prompy input
        myScanner.hasNextInt();//accepts user input
        int key=myScanner.nextInt();//stores user input
        int low=0;//initialize
        int x;//number of iterations (incrimented later)
        int high=(list.length- 1); 
        for (x=0; high>=low; x++) {
            int mid=(low+high)/2;//initialize/set value
            if (key<list[mid]){
                high = mid- 1; //reset value of high to new search area
            }//end if
            else if (key == list[mid]){
                System.out.println(key+ " was found with "+x+" iterations.");
                return list; //key found; return to main method
            }// end else if
            else{
                low=mid+ 1;//resets value of low
            }//end else
            
        }//end for loop
        System.out.println(key+" was not found after "+x+" iterations.");//prints out if key is not found
        return list;//return to main method
    }//end method binarySearch
    
    
    public static int[] linearSearch(int list[]){
        Scanner myScanner=new Scanner(System.in); //construct and declare scanner
        int x=0;//iteration counter
        System.out.print("Scrambled: ");
        Random randomInt = new Random();//generates random number for scrambling
        for (int i=list.length- 1; i>0; i--) {
            int index = randomInt.nextInt(i+ 1);//looks at all indexes
            int a = list[index];//set value to a random index
            list[index] = list[i];//set equal
            list[i] = a;//swap
        }// end for loop
        
        for (int s=0; s<list.length; s++){ 
            System.out.print(list[s]+" "); //prints out values stored in array
        }//end for      
        System.out.println();
        System.out.print("Enter a grade to search for: ");//prompts user input
        myScanner.hasNextInt();//accepts user input
        int key=myScanner.nextInt();//stores user input
        for (x=0; x<list.length; x++){
            if (key==list[x]){//if key is found
                System.out.println(key+" was found with "+(x+ 1)+" iterations. "); //prints out success msg
                return list;//return to main method
            }//end if
            
        }//end for
        System.out.println(key+" was not found after "+x+" iterations."); //prints out if key is not found
        return list;//return to main method
    }//end method linearSearch
    
}//end class