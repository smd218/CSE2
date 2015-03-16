<<<<<<< HEAD
import java.util.Scanner;
=======
///////////////////////////////////////////////////////////////
///////
import java.util.Scanner; 

>>>>>>> 45c9794c64d14435af020eaaa7d433927eb47d8f
public class practice{
    public static void main(String[] args){
        Scanner myScanner;
        myScanner = new Scanner(System.in);

        System.out.println("enter an int between 3 and 33: ");
        int nStars = myScanner.nextInt();    
        int pt1 = 0;
        int pt3 = 0;
        int rowLength = (nStars - 2);
        int spacesInRow = 0;
           
            if (nStars>=3 && nStars<=33){
       
<<<<<<< HEAD
               while(pt1<nStars){
                        System.out.print("*");
                        pt1++;
                    }//end while loop
                    System.out.println();
=======
            System.out.println(5%6);
    }
>>>>>>> 45c9794c64d14435af020eaaa7d433927eb47d8f
        
               while (rowLength <= nStars){
                 int spaceCounter = 1;
                 while (spaceCounter < spacesInRow){
                    System.out.print(" ");
                    spaceCounter++;
                 }
                    System.out.println("* ");
                    
                    rowLength++;
                    spacesInRow=spacesInRow+2;    
               }
               
               while(pt3<nStars){
                        System.out.print("*");
                        pt3++;
                    }//end while loop
                    System.out.println();
            }//end if
            else{ //start else
            System.out.println("The number is out of range [3,33]");
        }//end else
    }
}
