//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Sophie Davis
//CSE2 - Spring 2015
//Prof. Brian Chen
//04-25-2015
//lab12 - RaggedSorts java program
//This program...
//DONE!

import java.util.Random;
public class RaggedSorts{
    public static void main (String[] args){
        Random randomGenerator = new Random();//declares new random num generator
        int [][] ragged = new int [5][];
        for (int i=0; i<5; i++){
            ragged[i]=new int [i*3+ 5];
            for (int j=0; j<ragged[i].length; j++){
                int randomNum = randomGenerator.nextInt(39);
                ragged[i][j]=randomNum;
            }
        }
        System.out.println("Original Array: ");
        for (int i = 0; i<ragged.length; i++){
            System.out.print("row "+(i+ 1)+": "); //print bracket at beginning of each line
            for (int j = 0; j<ragged[i].length; j++){
                System.out.print(ragged[i][j]+" "); //print contents of array
            }//end for
            System.out.println();
        }
        System.out.println();
        
        int [][]sorted=sortArray(ragged);
        System.out.println("Sorted Array: ");
        printArray(sorted);
        int [][] copied=copyArray(sorted);
        System.out.println("Sorted and Copied Array: ");
        printArray(copied);
    }//end main method
    
    public static int[][] sortArray(int[][] list){
        for (int x=0; x<list.length; x++){
            for (int i=0; i<list[x].length- 1; i++){
                int currentMin=list[x][i];
                int currentMinIndex1=x;
                int currentMinIndex2=i;
                for (int j=1+i; j<list[x].length; j++){
                    if (currentMin>list[x][j]){
                        currentMin=list[x][j];
                        currentMinIndex1=x;
                        currentMinIndex2=j;
                    }
                }
                if (currentMinIndex1!= x || currentMinIndex2!=i){
                    list[currentMinIndex1][currentMinIndex2]=list[x][i];
                    list[x][i]=currentMin;
                }
            }
        }
        return list;
    }//end method sortArray
    
    public static void printArray(int [][] ragged){
        if(ragged == null){
            System.out.println("The array was empty!");
        }
        for (int i = 0; i<ragged.length; i++){
            for (int j = 0; j<ragged[i].length; j++){
                System.out.print(ragged[i][j]+" "); //print contents of array
            }//end for
            System.out.println();
        }
        System.out.println();
    }//end method printArray   

    public static int [][] copyArray(int[][] list){
        int [][] copied = new int [5][17];
        for (int i=0; i<list.length; i++){
            for (int j=0; j<17; j++){
                if (j<list[i].length){
                    copied[i][j]=list[i][j];
                }
                else{
                    copied[i][j]=0;
                }
            }
        }
        return copied;
    }//end method copyArray
    
    
}//end class