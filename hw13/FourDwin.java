///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Sophie Davis
//CSE2 - Spring 2015
//Prof. Brian Chen
//04-28-2015
//hw13 - FourDwin java program
//This program creates a ragged array, prints out its statistics, then sorts it

import java.util.Scanner;
public class FourDwin{
    public static void main (String[] args){
        Scanner myScanner=new Scanner (System.in);
        double [][][][] ragged4D;
        int x;
        int y;
            while (true){ //reprompts user entry if input is invalid
            System.out.println("Please enter an integer X: ");
                if (!myScanner.hasNextInt()){ //checks if input is an integer
                    System.out.println("You did not enter an integer.");
                    myScanner.next(); //discards input if not an int
                }//end if
                else{
                    x=myScanner.nextInt(); //stores input if valid
                    if (x<0){ //checks if input is positive
                        System.out.println("You did not enter a positive integer.");
                    }//end if
                    else{
                        break; //if input is valid, accepts it, stores it, and exits while loop
                    }//end else
                }//end else
            }//end while
            
            while (true){ //reprompts user entry if input is invalid
            System.out.println("Please enter an integer Y where Y > X: ");
                if (!myScanner.hasNextInt()){ //checks if input is an integer
                    System.out.println("You did not enter an integer.");
                    myScanner.next(); //discards input if not an int
                }//end if
                else{
                    y=myScanner.nextInt(); //stores input if valid
                    if (y<0){ //checks if input is positive
                        System.out.println("You did not enter a positive integer.");
                    }//end if
                    else if (y<=x){//checks if x>y
                        System.out.println("Y <= X. Invalid input.");
                    }
                    else{
                        break; //if input is valid, accepts it, stores it, and exits while loop
                    }//end else
                }//end else
            }//end while   
            

        ragged4D= new double [3][y][y][y];//declares new 4d array
        
        for (int i=0; i<3; i++){
            ragged4D[i]= new double [(x) + (int)(Math.random()*(y-x))][(x) + (int)(Math.random()*(y-x))][(x) + (int)(Math.random()*(y-x))];//creates unique ragged lengths
            for (int j=0; j<ragged4D[i].length; j++){
                ragged4D[i][j]= new double [(x) + (int)(Math.random()*(y-x))][(x) + (int)(Math.random()*(y-x))];
                for (int k=0; k<ragged4D[i][j].length; k++){
                    ragged4D[i][j][k]=new double [(x) + (int)(Math.random()*(y-x))];//creates ragged lengths
                    for (int l=0; l<ragged4D[i][j][k].length; l++){
                        double randomNum = (double) (Math.random()*30.1)*10; //stores random num generated 
                        int temp = (int)randomNum;
                        double roundedNum=((double)temp)/10.0;
                        ragged4D[i][j][k][l]=roundedNum;//fills ragged array with doubles
                    }
                }
            }
        }
        
        
        System.out.println("Original Array:");
        printArray(ragged4D);//prints original array
        statArray(ragged4D);//prints original array stats
        System.out.println("Sorted 3D: ");
        for (int t=0; t<ragged4D.length; t++){
            double sorted3D[][][]=sort3DArray(ragged4D[t]);//creates new 3d array
                 System.out.println(" { ");
                for (int i = 0; i<sorted3D.length; i++){
                    System.out.print("   { ");
                    for  (int j = 0; j<sorted3D[i].length; j++){
                        System.out.print("{ "); //print bracket at beginning of each line
                        for (int k = 0; k<sorted3D[i][j].length; k++){
                            System.out.print(sorted3D[i][j][k]+", "); //print contents of array
                        }//end for
                    System.out.print(" } "); //print closing bracket
                    }
                     System.out.println(" } ");
                }//end for
                System.out.println(" } ");
            }//end for
        
        
        
    }//end main method
    
    public static void statArray (double ragged4D[][][][]){
        int count=0;
        double sum=0;
        for (int i=0; i<ragged4D.length; i++){
            for (int j=0; j<ragged4D[i].length; j++){
                for (int k=0; k<ragged4D[i][j].length; k++){
                    for (int l=0; l<ragged4D[i][j][k].length; l++){
                        sum+=ragged4D[i][j][k][l];//adds all entries
                        count++;//goes through all arrays and counts number of elements
                    }
                }
            }//end for
        }//end for
        double mean = sum/count;//creates mean
        int temp1 = (int) (sum*10);
        double roundedSum=((double)temp1)/10.0;//rounds sum
        int temp2 = (int) (mean*1000);
        double roundedMean=((double)temp2)/1000.0;//rounds mean
        System.out.println("Members: "+count);//prints
        System.out.println("Sum: "+roundedSum);
        System.out.println("Mean: "+roundedMean);
    }//end method statArray
    
    public static void printArray (double ragged4D[][][][]){
        System.out.println("{ ");
        for (int i=0; i<ragged4D.length; i++){
            System.out.println("   { "); //print bracket at beginning of each line
            for (int j=0; j<ragged4D[i].length; j++){
                 System.out.print("      { "); //print bracket
                for (int k=0; k<ragged4D[i][j].length; k++){
                     System.out.print("{ "); //print bracket
                    for (int l=0; l<ragged4D[i][j][k].length; l++){
                        System.out.print(ragged4D[i][j][k][l]+", "); //print contents of array
                    }
                    System.out.print("} "); //print closing bracket
                }
                System.out.println("} "); //print closing bracket
            }//end for
            System.out.println("   } "); //print closing bracket
        }//end for
        System.out.println("} ");
    }//end method printArray
    
    public static double[][][][] sort4DArray(double sorted4D[][][][], int y){
    int length=0;
         for (int x=0; x<sorted4D.length; x++){
            for (int i=0; i<sorted4D[x].length- 1; i++){
                for (int j=0; j<sorted4D[x][i].length; j++){
                      length+=sorted4D[x][i][j].length;
                }
            }
        }

        return sorted4D;
    }
    
    public static double[][][] sort3DArray(double sorted[][][]){
         for (int x=0; x<sorted.length; x++){
            for (int i=0; i<sorted[x].length; i++){
                for (int j=0; j<sorted[x][i].length- 1; j++){
                    double currentMin=sorted[x][i][j];
                    int currentMinIndex=j;
                    for (int k=1+j; k<sorted[x][i].length; k++){//sort members of array
                        if (currentMin>sorted[x][i][k]){
                            currentMin=sorted[x][i][k];
                            currentMinIndex=k;
                        }
                    
                        
                    }
                    
                    if (currentMinIndex!=j){
                            sorted[x][i][currentMinIndex]=sorted[x][i][j];//swap members of array
                            sorted[x][i][j]=currentMin;
                        }
                }
            }
         }
        return sorted;
    }//end method sort3Darray

    
}//end class