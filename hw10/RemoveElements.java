//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Sophie Davis
//CSE2 - Spring 2015
//Prof. Brian Chen
//04-07-2015
//hw10 - RemoveElements java program
//This program generates an array of 10 random ints from 0-9, then deletes one int depending on its position
//and the user input, then deletes numerous (or none) values from the array depending on their value and user input


import java.util.Scanner;
import java.util.Random; //import random utility
public class RemoveElements{
    public static void main(String [] arg){
    	Scanner scan=new Scanner(System.in);
        int num[]=new int[10];
        int newArray1[];
        int newArray2[];
        int index,target;
        	String answer="";
        	do{
          	System.out.print("Random input 10 ints [0-9]: ");
          	num = randomInput();
          	String out = "The original array is: ";
          	out += listArray(num);
          	System.out.println(out);
         
          	System.out.print("Enter the index: ");
          	index = scan.nextInt();
          	if (index>=0 && index<10){//checks to see if input is in range
          	    newArray1 = delete(num,index);
          	    String out1="The output array is: ";
          	    out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
          	    System.out.println(out1);
          	}
          	else {
          	    System.out.println("The index is not valid.");
          	}
          	
            System.out.print("Enter the target value: ");
          	target = scan.nextInt();
          	if (target>=0 && target<10){//checks to see if input is in range
              	newArray2 = remove(num,target);
              	System.out.println("Element "+target+" has been found.");
              	String out2="The output array is: ";
              	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
              	System.out.println(out2);
          	}
          	else{
          	    System.out.println("Element "+target+" was not found.");
          	}
          	
          	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
          	answer=scan.next();
        	}while(answer.equals("Y") || answer.equals("y"));
        }//end main method
         
        public static String listArray(int num[]){
        	String out="{";
        	for(int j=0;j<num.length;j++){
              	if(j>0){
                	out+=", ";
              	}//end if
          	out+=num[j];
        	}//end for loop
        	out+="} ";
        	return out;
         }//end method listArray
         
        public static int[] randomInput(){
            int [] randomInts=new int [10];//delcares and allocates new array; sets size to 10
            for (int x=0; x<randomInts.length; x++){
                Random randomGenerator = new Random();//declares new random num generator
                int randomNum = randomGenerator.nextInt(10);//stores random num generated b/t 0-9 into an int 
                randomInts[x]=randomNum;//stores random numbers in array
            }//end for
            for (int i=0; i<randomInts.length; i++){ 
                System.out.print(randomInts[i]+" "); //prints out values stored in array
            }//end for
            System.out.println();
        return randomInts; //returns array to main method
        }//end method randomInput
        
        public static int[] delete(int list[], int pos){
           int p=pos;
           int deletedPos[]=new int [(list.length- 1)];//declare and allocate new array; sets length as 1 less than input
           for(int x=0; x<p; x++){
               deletedPos[x]=list[x];//copies values from list in to deletedPos up to p
           }
           for(int y=p; y<9; y++){
               deletedPos[y]=list[y+ 1];//copies values from list in to deletedPos after position p
           }
           return deletedPos;//returns to the main method
        }//end method delete

        
        public static int[] remove(int list[], int target){
            int t=target;
            int count=0;
            for(int x=0; x<list.length; x++){
               if (list[x]==t){
                   count++; //incriments each time the target number is found in the array
               }//end if
            }//end for loop
            int removedTarget[]=new int[(list.length-count)];//declare and allocate new array
            for(int y=0,z=0; y<list.length && z<removedTarget.length; y++){
                if (list[y]==t){
                    continue; //ignores value if it is equal to t
                }//end if
                else{
                    removedTarget[z]=list[y]; //copies value in to new array if it is not equal to t
                    z++;
                }//end else
            }//end for
            return removedTarget;
        }//end method remove
               
}//end class
