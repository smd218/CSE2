//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Sophie Davis
//CSE2 - Spring 2015
//Prof. Brian Chen
//04-21-2015
//lab12 - Matrix java program
//This program...

import java.util.Random; 
public class Matrix{
    public static void main (String[] args){
        Random randomGenerator = new Random();//declares new random num generator
        boolean formatA=true;
        boolean formatB=true;
        int width1 = randomGenerator.nextInt(5)+ 1;
        int height1 = randomGenerator.nextInt(5)+ 1;
        
        int width2 = randomGenerator.nextInt(5)+ 1;
        int height2 = randomGenerator.nextInt(5)+ 1;
        
        System.out.println("Generating a matrix with width "+ width1 +" and height "+height1+": ");
        int[][] matrixA = increasingMatrix(width1, height1, formatA);
        printMatrix(matrixA, formatA);//call method printMatrix 
        
        System.out.println("Generating a matrix with width "+ width1 +" and height "+height1+": ");
        int[][] matrixB = increasingMatrix(width1, height1, formatA);
        printMatrix(matrixB, formatA);//call method printMatrix 
        
        System.out.println("Generating a matrix with width "+ width2 +" and height "+height2+": ");
        int[][] matrixC = increasingMatrix(width2, height2, formatA);
        printMatrix(matrixC, formatA);//call method printMatrix 
        
        System.out.println("Adding two matrices: ");
        printMatrix(matrixA, formatA);
        System.out.println("+");
        printMatrix(matrixB, formatA);
        System.out.println("Translating column major to row major input.");
        System.out.println("Output: ");
        int[][] sum = addMatrix(matrixA, formatA, matrixB, formatB);
        
        
        System.out.println("Adding two matrices: ");
        printMatrix(matrixA, formatA);
        System.out.println("+");
        printMatrix(matrixC, formatA);
        System.out.println("Translating column major to row major input.");
        System.out.println("Output: ");
        int[][] sum2 = addMatrix(matrixA, formatA, matrixC, formatB);
        
    
    }//end main method 
    
    public static int [][] increasingMatrix(int width, int height, boolean format){
        int [][] matrix = new int [width][height];
        int z=1;
        for (int x=0; x<width; x++){
            for (int y=0; y<height; y++){
                matrix[x][y]=z;
                z++;
            }
        }
       return matrix; 
    }//end method increasingMatrix
    
    public static void printMatrix(int [][] matrix, boolean format){
        if(matrix == null){
            System.out.println("The array was empty!");
        }
        for (int i = 0; i<matrix.length; i++){
            System.out.print("[ "); //print bracket at beginning of each line
            for (int j = 0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+" "); //print contents of array
            }//end for
            System.out.println("]"); //print closing bracket
        }//end for
    }//end method printMatrix    
    
    public static int [][] addMatrix(int[][]a, boolean formatA, int[][]b, boolean formatB){
        int [][] sum = new int [a.length][a[0].length];
        if (a.length==b.length && a[0].length==b[0].length){
            for (int x=0;x<sum.length; x++){
                for (int y=0; y<sum[0].length; y++){
                    sum[x][y]=(a[x][y]+b[x][y]);
                }
                
            }
            printMatrix(sum, formatA);
        }
        
        else{
            System.out.println("The arrays cannot be added!");
            return null;
        }//end else
        return sum;
    }
    
}//end class