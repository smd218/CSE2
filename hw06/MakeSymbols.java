///////////////////////////////////////////////////////////////////////////////////////
//Sophie Davis
//CSE2 - Spring 2015
//Prof. Brian Chen
//03-03-2015
//hw06 - MakeSymbols java program
//This program generates a random number between 0-100. If the number is even, that number of
//"*" will be printed out. If the number is odd, that number of "&" will be frinted out. The
//symbols are created using do-while loops.

public class MakeSymbols {
    //start class
    public static void main (String [ ] args) {
        //start main method
        int num2=0;//declare variable num2
        int num=(int)(Math.random()*100);//generates random number b/t 0-100
        System.out.println("The random number generated is: "+num);//prints out randomly generated number between 0-100
        num2=(num%2);//stores remainder of the random number when divided by two as "num2"
        
        if (num2==0){ //if num2=0...
            System.out.print("The output pattern: ");//prints out text before output pattern
            int x=0;//declares variable x
           do{ //start do-while loop
               System.out.print("*"); //prints out one "*" each time loop is run
               x++;//incriments x by 1 each time loop is run
           } while (x<num); //loop will run again as long as the incrimented x is less than the randomly generated number
        }//end if
            
        if (num2==1){ //if num2=1...
            System.out.print("The output pattern: ");//prints out text before output pattern
            int y=0;//declares variable y
           do{ //start do-while loop
               System.out.print("&"); //prints out one "&" each time loop is run
               y++;//incriments y by 1 each time loop is run
           } while (y<num); //loop will run again as long as the incrimented y is less than the randomly generated number
        }//end if
        System.out.println();//breaks line
        
    }//end main method
}//end class