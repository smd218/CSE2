///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Sophie Davis
//CSE2 - Spring 2015
//Prof. Brian Chen
//04-21-2015
//hw12 - Multiply java program
//This program prompts the user to imput dimensions for 2 matrices which are stored in 2D arrays.
//The program then checks to see if the input is valid (ints >0) and if the two matrices are compatible 
//dimentions to be multiplied. If they are not, it prompts the user to input a different dimention. 
//It then multiplies the two patrices and prints out their product. 



import java.util.Random; //import utilities
import java.util.Scanner;
public class Multiply{
    public static void main (String[] args){
        Random randomGenerator = new Random();//declares new random num generator
        Scanner myScanner = new Scanner (System.in);
        int widthA=0;//initialize
        int heightA=0;
        int widthB=0;
        int heightB=0;
        while (true){ //reprompts user entry if input is invalid
        System.out.println("Please enter an integer for the width of matrix A: ");
            if (!myScanner.hasNextInt()){ //checks if input is an integer
                System.out.println("You did not enter an integer.");
                myScanner.next(); //discards input if not an int
            }//end if
            else{
                widthA=myScanner.nextInt(); //stores input if valid
                if (widthA<0){ //checks if input is positive
                    System.out.println("You did not enter a positive integer.");
                }//end if
                else{
                    break; //if input is valid, accepts it, stores it, and exits while loop
                }//end else
            }//end else
        }//end while
        
        while (true){ //reprompts user entry if input is invalid
        System.out.println("Please enter an integer for the height of matrix A: ");
            if (!myScanner.hasNextInt()){ //checks if input is an integer
                System.out.println("You did not enter an integer.");
                myScanner.next(); //discards input if not an int
            }//end if
            else{
                heightA=myScanner.nextInt(); //stores input if valid
                if (heightA<0){//checks if input is positive
                    System.out.println("You did not enter a positive integer.");
                }//end if
                else{
                    break;//if input is valid, accepts it, stores it, and exits while loop
                }//end else
            }//end else
        }//end while
        
        while (true){ //reprompts user entry if input is invalid
        System.out.println("Please enter an integer for the width of matrix B: ");
            if (!myScanner.hasNextInt()){ //checks if input is an integer
                System.out.println("You did not enter an integer.");
                myScanner.next(); //discards input if not an int
            }//end if
            else{
                widthB=myScanner.nextInt(); //stores input if valid
                if (widthB<0){//checks if input is positive
                    System.out.println("You did not enter a positive integer.");
                }//end if
                else{
                    break;//if input is valid, accepts it, stores it, and exits while loop
                }//end else
            }//end else
        }//end while loop
        
        while (true){ //reprompts user entry if input is invalid
        System.out.println("Please enter an integer for the height of matrix B: ");
            if (!myScanner.hasNextInt()){ //checks if input is an integer
                System.out.println("You did not enter an integer.");
                myScanner.next(); //discards input if not an int
            }//end if
            else{
                heightB=myScanner.nextInt(); //stores input if valid
                if (heightB<0){//checks if input is positive
                    System.out.println("You did not enter a positive integer.");
                }//end if
                else if (widthA!=heightB){//checks if dimensions are compatable for multiplication
                    System.out.println("The matrices are of incompatible dimensions and cannot be multiplied. ");
                }//end else if
                else{
                    break;//if input is valid, accepts it, stores it, and exits while loop
                }//end else
            }//end else
        }//end while
        
        
        int[][] matrixA = randomMatrix(widthA, heightA);//call method randomMatrix
        System.out.println("MATRIX A: ");
        printMatrix(matrixA);//call method printMatrix 
        
        int[][] matrixB = randomMatrix(widthB, heightB); //call method randomMatrix
        System.out.println("MATRIX B: ");
        printMatrix(matrixB);//call method printMatrix
        
        int [][] multMatrix = matrixMultiply(matrixA,matrixB); //call method matrixMultiply
        printMatrix(multMatrix);// call method printMatrix
        
    }//end main method
    
    
    public static int [][] randomMatrix(int width, int height){
        int[][] matrix= new int[height][width];//new array with inputted dimensions
        for (int x=0; x<matrix.length; x++){
            for (int y=0; y<matrix[0].length; y++){
                Random randomGenerator = new Random();//declares new random num generator
                int randomNum = randomGenerator.nextInt(21)- 10;//stores random num generated 
                   matrix[x][y]=randomNum;//stores random number in array
            }//end for
        }
        
    return matrix;//returns matrix array
    }//end method randomMatrix
    
    public static void printMatrix(int matrix[][]){
        for (int i = 0; i<matrix.length; i++){
            System.out.print("[ "); //print bracket at beginning of each line
            for (int j = 0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+" "); //print contents of array
            }
            System.out.println("]"); //print closing bracket
        }
    }//end method printMatrix
    
    public static int[][] matrixMultiply(int matrixA[][], int matrixB[][]){
        int [][] mult = new int [matrixA.length][matrixB[0].length];//declare new array with new dimensions
        if (matrixA[0].length==matrixB.length) { //checks multiplication compatibility
            for (int i=0; i<matrixA.length; i++){
                for (int j=0; j<matrixB[0].length; j++){
                    for (int k=0; k<matrixA[0].length; k++){
                        mult[i][j]+=(matrixA[i][k]*matrixB[k][j]); //adds and multiplies contents of matricies A and B 
                                                                    //to get their product, then stores in new 2D array
                    }//end for
                }//end for
            }//end for
            System.out.println("the matrices multiplied equal: ");
        return mult;//return mult array
        
        }//end if
        
        else{
            System.out.println("The matrices are of incompatible dimensions and cannot be multiplied. ");
            System.exit(0);//exit program if dimensions are incompatable
        }//end else
        return mult;//return mult array
    }//end method matrixMultiply
    
}//end class