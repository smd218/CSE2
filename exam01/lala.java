import java.util.Random;
public class lala{
    public static void main( String args[] ){
        int num[]=new int[10];
        System.out.println(x);
    }
    public static int[] x(){
        
        int [] randomInts = new int[10];
            Random randomGenerator = new Random();
            int randomNum = randomGenerator.nextInt(10);
                randomInts [0] = randomNum;
            int randomNum1 = randomGenerator.nextInt(10);
                randomInts [1] = randomNum1;
            int randomNum2 = randomGenerator.nextInt(10);
                randomInts [2] = randomNum2;
            int randomNum3 = randomGenerator.nextInt(10);
                randomInts [3] = randomNum3;
            int randomNum4 = randomGenerator.nextInt(10);
                randomInts [4] = randomNum4;
            int randomNum5 = randomGenerator.nextInt(10);
                randomInts [5] = randomNum5;
            int randomNum6 = randomGenerator.nextInt(10);
                randomInts [6] = randomNum6;
            int randomNum7 = randomGenerator.nextInt(10);
                randomInts [7] = randomNum7;
            int randomNum8 = randomGenerator.nextInt(10);
                randomInts [8] = randomNum8;
            int randomNum9 = randomGenerator.nextInt(10);
                randomInts [9] = randomNum9;

            for (int i=0; i<randomInts.length; i++){
                System.out.print(randomInts[i]+" ");
            } System.out.println();
            
        return randomInts;
    }
}