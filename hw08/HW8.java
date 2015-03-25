//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Sophie Davis
//CSE2 - Spring 2015
//Prof. Brian Chen
//03-24-2015
//hw08 - HW8 java program
//This program creates a game by using multiple methods, overloading methods, loops, if/else
//statements, switch statements, print lines, and the scanner utility. The game consists of 
//a journey, running in to a monster, choosing to escape or attack, and if the attack
//is successful, you win a prize!!!

    //i did not comment on some parts of the code that were copied and pasted because they were 
    //mostly printlns and were not written by me. I also didn't continue to comment on repetative
    //concepts (such as multiple println's in a row)

import java.util.Scanner; //import scanner utility
public class HW8{
    //start class
    public static void main(String[] args) {
        char option;
        Scanner scan = new Scanner(System.in); //calls and declares scanner
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!"); //prints out text
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-"); //prints out text
        String input = getInput(scan, "Cc"); //calls method getInput (scan, "Cc") and stores input there
        System.out.println("You are in a dead valley."); //prints out text
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");//prints text
        input = getInput(scan, "Cc"); //calls method and stores input
        System.out.println("You walked and walked and walked and you saw a cave!");//prints out text
        cave();//calls method cave
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10);
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
        box();
        input = getInput(scan);
        System.out.println("Hero! Have a good day!");
    }//end main method
    
    public static void giant() {
        //start method giant
        System.out.println("                                 ---------                    ");//prints out sequence of characters
        System.out.println("                                |  /    \\ |                   ");//that looks like a scary giant
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H    -----------    H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }//end method giant
    
    public static void cave() {
        //start method cave
        System.out.println("                              *****   * * * * * * * *        ");//prints out sequence of characters
        System.out.println("                         ***         ***                      ");//that looks like a man with a
        System.out.println("                      ***               ***                   ");//sword entering a cave
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }//end method cave
    
    public static void box(){
        //start method box
        System.out.println("                     *********************     *********************    *********************              ");//prints out
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");//characters
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");//that look
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");//like 3
        System.out.println("                     *********************     *********************    *********************              ");//boxes
    }//end method box

    public static String getInput(Scanner scan, String Cc){
        //start method getInput (scan, "Cc")
        Cc=scan.next();//stores user input
        switch (Cc){ //start switch statement
            case "c": //if c is entered... (continue program)
                break; //prevents fallthrough
            case "C": //if C is entered... (continue program)
                break; //prevents fallthrough
            default: //if anything other than "c" or "C" is entered....
                System.out.println("Yea right LOSER!");//prints out message
                System.exit(0);//terminates program
        }//end switch
        return Cc; //return statement
    }//end method getInput(scan, "Cc")
    
    public static String getInput(Scanner scan, String AaEe, int trial){
        //start method getInput(scan, AaEe, 10)
        trial=1;//sets value of trial
        while(trial<=10){ //start while loop; continue to run until trial<=10
        AaEe=scan.next();//stores user input
            switch (AaEe){ //begin switch statement
                case "a": //if a is entered...
                    int hitOrMiss = (int)(Math.random()*2);//generates random number 0 or 1
                        if (hitOrMiss==0){ //if 0 is generated...
                            System.out.println("Critical hit!"); //print out "hit" message
                            trial++;//incriment trial by 1
                        }//end if
                        if (hitOrMiss==1){ //if 1 is generated...
                            System.out.println("Gosh! How can you miss it?"); //print out "miss" message
                        }//end if
                        break;//prevents fallthrough
                case "A": //if A is entered...
                    int hitOrMissA = (int)(Math.random()*2);//generates random number 0 or 1
                        if (hitOrMissA==0){ //if 0 is generated...
                            System.out.println("Critical hit!"); //print out "hit" message
                            trial++;//incriment trial by 1
                        }//end if
                        if (hitOrMissA==1){ //if 1 is generated...
                            System.out.println("Gosh! How can you miss it?");//print out "miss" message
                        }//end if
                        break;//prevents fallthrough
                case "e": //if e is entered...
                    int escape = (int)(Math.random()*10) + 1; //generates random number between 1 and 10 inclusive
                        if (escape==10){ //if 10 is generated...
                            System.out.println("You have escaped successfully!!!"); //print out successful escape message
                            System.exit(0);//exit program
                        }//end if
                        else{ //if anything besides 10 is generated...
                            System.out.println("Your attempt to escape was unsuccessful!"); //print out unsuccessful escape message
                            break;//prevents fallthrough
                        }//end else
                case "E": //if E is entered...
                    int Escape = (int)(Math.random()*10) + 1;//generates random number between 1 and 10 inclusive
                        if (Escape==10){ //if 10 is generated...
                            System.out.println("You have escaped successfully!!!");//print out successful escape message
                            System.exit(0);//exit program
                        }//end if
                        else{ //if anything besides 10 is generated...
                            System.out.println("Your attempt to escape was unsuccessful!");//print out unsuccessful escape message
                            break;//prevents fallthrough
                        }//end else
                default: //if anything besides A, a, E, or e is entered...
                    System.out.println("Executed by the GIANT! Game Over! ");//print out death message
                    System.exit(0);//exit program
            }//end switch
            System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to YIELD");//prints out prompt every time loop runs
        }//end while loop
        return AaEe;//return statement
    }//end method getInput(scan, AaEe, 10)
    
    public static String getInput(Scanner scan){
        //start method getInput(scan)
        String box=scan.next();//stores user input
            switch (box){ //begin switch statement
                case "1": //if 1 is entered...
                    System.out.print("You won a 4.00 GPA! "); //prints out prize
                    break;//prevents fallthrough
                case "2": //if 2 is entered...
                    System.out.print("You won an A on your next CSE2 exam! "); //prints out prize
                    break; //prevents fallthrough
                case "3": //if 3 is entered...
                    System.out.print("You won a dinner with Prof. Chen! "); //prints out prize
                    break; //prevents fallthrough
                default: //if anything other than 1, 2, or 3 is entered...
                    System.out.print("A Wrong Number! You get nothing! Better restart the game LOL!!");//prints out invalid input message
                    System.out.println();//prints out line
                    System.exit(0);//exit program
            }//end switch
        return box;//return statement
    }//end method getInput(scan)
    
}//end class