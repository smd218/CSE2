///////////////////////////////////////////////////////////////////////////////////////
//Sophie Davis
//CSE2 - Spring 2015
//Prof. Brian Chen
//03-06-2015
//lab07 - zigzag java program
//This program takes input from the user, then prints out that number of stars in a line,
//then in a decending triangle shape using nested loops, then in another line


import java.util.Scanner; //imports scanner
//start class
public class zigzag {
    //start main method
    public static void main (String [ ] args) {
        Scanner myScanner;//declare scanner
        myScanner=new Scanner(System.in);//call scanner constructor
            
        while (true){   
            System.out.println("Enter an int between 3 and 33: ");
            int nStars=myScanner.nextInt();
        
            if (!(nStars>=3 && nStars<=33)) {
                System.out.println("The number is out of range [3,33].");
                return;
            }//end if
            
                for (int x=1; x<=nStars; x++){
                    System.out.print("*");
                }//end for
                System.out.println();
                
                for(int y=1; y<=(nStars - 2); y++){
                    for(int z=1; z<=y; z++){
                        System.out.print(" "); 
                    }//end inner for loop
                    System.out.println("*"); 
                }
                
                for (int x=1; x<=nStars; x++){
                    System.out.print("*");
                }//end for
                System.out.println();
            System.out.println("Enter y or Y to go again: ");
            String goAgain=myScanner.next();
            switch (goAgain){
                case "y":
                    break;
                case "Y":
                    break;
                default:
                    return;
            }
        }
        
        
    }//end main method
}//end class