//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Sophie Davis
//CSE2 - Spring 2015
//Prof. Brian Chen
//04-17-2015
//lab11 - SearchArrays java program
//This program {finished; unchecked}


import java.util.Scanner;
import java.util.Random; //import random utility
public class SearchArrays{
    public static void main(String [] args){
        Scanner myScanner=new Scanner(System.in);
        int array1[]=new int [50];
        int maxValue, minValue, maxValue2, minValue2, inputInt;
        
        for (int x=0; x<array1.length; x++){
                Random randomGenerator = new Random();//declares new random num generator
                int randomNum = randomGenerator.nextInt(100);//stores random num generated b/t 0-9 into an int 
                array1[x]=randomNum;//stores random numbers in array
            }//end for
            for (int i=0; i<array1.length; i++){ 
                System.out.print(array1[i]+" "); //prints out values stored in array
            }//end for
            System.out.println();
            
        maxValue = array1[0];  
        for(int a=1; a < array1.length; a++){  
            if(array1[a] > maxValue){  
                maxValue = array1[a];
            }  
        }
        System.out.println("The maximum of array 1 is: "+maxValue);
        
        minValue = array1[0];  
        for(int a=1; a < array1.length; a++){  
            if(array1[a] < minValue){  
                minValue = array1[a];
            }  
        }
        System.out.println("The minimum of array 1 is: "+minValue);
        
        
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
            
        maxValue2= array2[0];  
        for(int a=1; a < array2.length; a++){  
            if(array2[a] > maxValue2){  
                maxValue2 = array2[a];
            }  
        }
        System.out.println("The maximum of array 2 is: "+maxValue2);
        
        minValue2 = array2[0];  
        for(int a=1; a < array2.length; a++){  
            if(array2[a] < minValue2){  
                minValue2 = array2[a];
            }  
        }
        System.out.println("The minimum of array 2 is: "+minValue2);
        
        
        System.out.println("Enter an int: ");
        if (myScanner.hasNextInt()) { 
            inputInt=myScanner.nextInt();
            if (inputInt>=0){
                int low=0;//initialize
                int x;//number of iterations (incrimented later)
                int high=(array2.length- 1); 
                for (x=0; high>=low; x++) {
                    int mid=(low+high)/2;//initialize/set value
                    if (inputInt<array2[mid]){
                        high = mid- 1; //reset value of high to new search area
                    }//end if
                    else if (inputInt == array2[mid]){
                        System.out.println(inputInt+ " was found with "+x+" iterations");
                        return;
                    }// end else if
                    else{ 
                        low=mid+ 1;//resets value of low
                    }//end else
                    
                
                
                }//end for loop
                System.out.println(inputInt+" was not found in the list");//prints out if key is not found
                for(int a=0; a<array2.length; a++){  
                    if(array2[a]<inputInt && array2[a+ 1]>inputInt){  
                        System.out.println("The number above the key was "+ array2[a+ 1]);
                        System.out.println("The number below the key was "+ array2[a]);
            }  
        }
        
                
            
            }
            else{
                System.out.println("You did not enter a positive integer.");
                return;
            }
        }
        else{
            System.out.println("You did not enter an integer.");
            return;
        }
            
            
    }//end main method
}//end class