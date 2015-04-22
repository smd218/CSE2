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
        int width = randomGenerator.nextInt(1 + 10);
        int height = randomGenerator.nextInt(1 + 10);
        System.out.println("WIDTH: "+width+" HEIGHT: "+height);
        
    }//end main method
    
   public static int [][] increasingMatrix (int width, int height, boolean format){
        int[][] increasingArray = new int[width][height];	//note location of the ‘3’
            for (int x=1; x<=width; x++){
                for (int y=1; y<=height; y++){
                    int z=1;
                    increasingArray[x][y]=z
                    z++;
                }
            }

    }//end method incresingMatrix
    
    public static void printMatrix(int[][] array, boolean format){
         for (int i = 0; i<array.length; i++){
            System.out.print("[ ");
            for (int j = 0; j<array.length; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println("]");
         }
    }//end method printMatix
    
}//end class