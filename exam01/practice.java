import java.util.Scanner;

public class practice {
    public static void main(String[] args) {

        int sum=0;
        int b=0;
        System.out.println("Please enter 5 non-negative integers: ");
        for(int a=0 ; a<5 ; a++){
            Scanner myScanner;
            myScanner=new Scanner(System.in);
            if (myScanner.hasNextInt());{
                b=myScanner.nextInt();
                if (b>=0){
                    sum=sum+b;
                }//end if
                if (b<0){
                    System.out.println("That is an invalid input. Please enter again.");
                    
                    
                    }//end if
                else {
                    System.out.println("That is an invalid input. Please enter again.");
                    }//end else
                }//end if
            }//end for
        System.out.println("The sum is: "+sum);
    }//end main method
}//end class