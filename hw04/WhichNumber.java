///////////////////////////////////////////////////////////////////////////////////////
//Sophie Davis
//CSE2 - Spring 2015
//Prof. Brian Chen
//02-17-2015
//hw04 - WhichNumber java program
//This program prompts the user to think of a number between 1 and 10 (inclusive) and
//attempts to guess the number based on the user's answers to several questions. 

//I only commented on the first 80 or so lines... everything after that is repetition of 
//methods used earlier in the code.

import java.util.Scanner; //imports scanner utility
//start class
public class WhichNumber {
    //start main method
    public static void main (String [ ] args) {
        Scanner myScanner;//declares instance of scanner
        myScanner=new Scanner(System.in);//call scanner constructor
        System.out.println("Think of a number between 1 and 10 inclusive.");//prompts user to think of number
        System.out.print("Is the number even? (y/n): ");//determines if number is odd or even
        String answer1=myScanner.next(); //accepts user input as string
        switch (answer1) {
            //begin switch statement
            case "Y": //if Y is entered...
                System.out.println("Is the number divisible by 3? (y/n): ");//prompts user input
                String answer2=myScanner.next();//stores user input as string
                switch (answer2) {
                    //begin new switch statement
                    case "Y": //if Y is entered...
                        System.out.println("The number is 6.");//prints out guess
                        break;//prevents fallthrough
                    case "y": //if y is entered...
                        System.out.println("The number is 6.");//prints out guess
                        break;//prevents fallthrough
                    case "N"://in N is entered...
                        System.out.print("Is the number divisible by 4? (y/n): ");//prompts user input
                        String answer3=myScanner.next();//stores user input as string
                        switch (answer3) {
                            //begin new switch statement
                            case "Y": //if Y is entered...
                                System.out.print("Is the number divided by 4 greater than 1? (y/n): ");//prompts user input
                                String answer4=myScanner.next();//stores user input as string
                                switch (answer4) {
                                    //begin new switch statement
                                    case "Y": //if Y is entered...
                                        System.out.println("The number is 8.");//prints out guess
                                        break;//prevents fallthrough
                                    case "y"://if y is entered...
                                        System.out.println("The number is 8.");//prints out guess
                                        break;//prevents fallthrough
                                    case "N"://if N is entered...
                                        System.out.println("The number is 4.");//prints out guess
                                        break;//prevents fallthrough
                                    case "n"://if n is entered...
                                        System.out.println("The number is 4.");//prints out guess
                                        break;//prevents fallthrough
                                    default://if not Y, y, N, nor n is entered...
                                        System.out.println("Sorry, that is not a valid input.");//prints out invalid input message
                                        break;//prevents fallthrough
                                }//end switch statement
                                return;//leaves program
                            case "y": //if y is entered...
                                System.out.print("Is the number divided by 4 greater than 1? (y/n): ");//prompts user input
                                String answer5=myScanner.next();//stores user input as string
                                switch (answer5) {
                                    //start new switch statement
                                    case "Y": //if Y is entered...
                                        System.out.println("The number is 8.");//prints out guess
                                        break;//prevents fallthrough
                                    case "y"://if y is entered...
                                        System.out.println("The number is 8.");//prints out guess
                                        break;//prevents fallthrough
                                    case "N"://if N is entered...
                                        System.out.println("The number is 4.");//prints out guess
                                        break;//prevents fallthrough
                                    case "n"://if n is entered...
                                        System.out.println("The number is 4.");//prints out guess
                                        break;//prevents fallthrough
                                    default://if not Y, y, N, nor n is entered...
                                        System.out.println("Sorry, that is not a valid input.");//prints out invalid input message
                                        break;//prevents fallthrough
                                } //end switch statement
                                return;//leaves program
                            case "N":
                                System.out.print("Is the number divisible by 5? (y/n): ");
                                String answer6=myScanner.next();
                                switch (answer6) {
                                    case "Y":
                                        System.out.println("The number is 10.");
                                        break;
                                    case "y":
                                        System.out.println("The number is 10.");
                                        break;
                                    case "N":
                                        System.out.println("The number is 2.");
                                        break;
                                    case "n":
                                        System.out.println("The number is 2.");
                                        break;
                                    default:
                                        System.out.println("Sorry, that is not a valid input.");
                                        break;
                                } return;
                            case "n":
                                System.out.print("Is the number divisible by 5? (y/n): ");
                                String answer7=myScanner.next();
                                switch (answer7) {
                                    case "Y":
                                        System.out.println("The number is 10.");
                                        break;
                                    case "y":
                                        System.out.println("The number is 10.");
                                        break;
                                    case "N":
                                        System.out.println("The number is 2.");
                                        break;
                                    case "n":
                                        System.out.println("The number is 2.");
                                        break;
                                    default:
                                        System.out.println("Sorry, that is not a valid input.");
                                        break;
                                }return;
                            default:
                                System.out.println("Sorry, that is not a valid input.");
                                break;
                        } return;
                    case "n":
                        System.out.print("Is the number divisible by 4? (y/n): ");
                        String answer8=myScanner.next();
                        switch (answer8) {
                            case "Y":
                                System.out.print("Is the number divided by 4 greater than 1? (y/n): ");
                                String answer4=myScanner.next();
                                switch (answer4) {
                                    case "Y":
                                        System.out.println("The number is 8.");
                                        break;
                                    case "y":
                                        System.out.println("The number is 8.");
                                        break;
                                    case "N":
                                        System.out.println("The number is 4.");
                                        break;
                                    case "n":
                                        System.out.println("The number is 4.");
                                        break;
                                    default:
                                        System.out.println("Sorry, that is not a valid input.");
                                        break;
                                } return;
                            case "y":
                                System.out.print("Is the number divided by 4 greater than 1? (y/n): ");
                                String answer5=myScanner.next();
                                switch (answer5) {
                                    case "Y":
                                        System.out.println("The number is 8.");
                                        break;
                                    case "y":
                                        System.out.println("The number is 8.");
                                        break;
                                    case "N":
                                        System.out.println("The number is 4.");
                                        break;
                                    case "n":
                                        System.out.println("The number is 4.");
                                        break;
                                    default:
                                        System.out.println("Sorry, that is not a valid input.");
                                        break;
                                } return;
                            case "N":
                                System.out.print("Is the number divisible by 5? (y/n): ");
                                String answer6=myScanner.next();
                                switch (answer6) {
                                    case "Y":
                                        System.out.println("The number is 10.");
                                        break;
                                    case "y":
                                        System.out.println("The number is 10.");
                                        break;
                                    case "N":
                                        System.out.println("The number is 2.");
                                        break;
                                    case "n":
                                        System.out.println("The number is 2.");
                                        break;
                                    default:
                                        System.out.println("Sorry, that is not a valid input.");
                                        break;
                                } return;
                            case "n":
                                System.out.print("Is the number divisible by 5? (y/n): ");
                                String answer7=myScanner.next();
                                switch (answer7) {
                                    case "Y":
                                        System.out.println("The number is 10.");
                                        break;
                                    case "y":
                                        System.out.println("The number is 10.");
                                        break;
                                    case "N":
                                        System.out.println("The number is 2.");
                                        break;
                                    case "n":
                                        System.out.println("The number is 2.");
                                        break;
                                    default:
                                        System.out.println("Sorry, that is not a valid input.");
                                        break;
                                }return;
                            default:
                                System.out.println("Sorry, that is not a valid input.");
                                break;
                        }   return;
                } return;
            case "y": 
                System.out.println("Is the number divisible by 3? (y/n): ");
                String answer9=myScanner.next();
                switch (answer9) {
                    case "Y":
                        System.out.println("The number is 6.");
                        break;
                    case "y":
                        System.out.println("The number is 6.");
                        break;
                    case "N":
                        System.out.print("Is the number divisible by 4? (y/n): ");
                        String answer3=myScanner.next();
                        switch (answer3) {
                            case "Y":
                                System.out.print("Is the number divided by 4 greater than 1? (y/n): ");
                                String answer4=myScanner.next();
                                switch (answer4) {
                                    case "Y":
                                        System.out.println("The number is 8.");
                                        break;
                                    case "y":
                                        System.out.println("The number is 8.");
                                        break;
                                    case "N":
                                        System.out.println("The number is 4.");
                                        break;
                                    case "n":
                                        System.out.println("The number is 4.");
                                        break;
                                    default:
                                        System.out.println("Sorry, that is not a valid input.");
                                        break;
                                } return;
                            case "y":
                                System.out.print("Is the number divided by 4 greater than 1? (y/n): ");
                                String answer5=myScanner.next();
                                switch (answer5) {
                                    case "Y":
                                        System.out.println("The number is 8.");
                                        break;
                                    case "y":
                                        System.out.println("The number is 8.");
                                        break;
                                    case "N":
                                        System.out.println("The number is 4.");
                                        break;
                                    case "n":
                                        System.out.println("The number is 4.");
                                        break;
                                    default:
                                        System.out.println("Sorry, that is not a valid input.");
                                        break;
                                } return;
                            case "N":
                                System.out.print("Is the number divisible by 5? (y/n): ");
                                String answer6=myScanner.next();
                                switch (answer6) {
                                    case "Y":
                                        System.out.println("The number is 10.");
                                        break;
                                    case "y":
                                        System.out.println("The number is 10.");
                                        break;
                                    case "N":
                                        System.out.println("The number is 2.");
                                        break;
                                    case "n":
                                        System.out.println("The number is 2.");
                                        break;
                                    default:
                                        System.out.println("Sorry, that is not a valid input.");
                                        break;
                                } return;
                            case "n":
                                System.out.print("Is the number divisible by 5? (y/n): ");
                                String answer7=myScanner.next();
                                switch (answer7) {
                                    case "Y":
                                        System.out.println("The number is 10.");
                                        break;
                                    case "y":
                                        System.out.println("The number is 10.");
                                        break;
                                    case "N":
                                        System.out.println("The number is 2.");
                                        break;
                                    case "n":
                                        System.out.println("The number is 2.");
                                        break;
                                    default:
                                        System.out.println("Sorry, that is not a valid input.");
                                        break;
                                }return;
                            default:
                                System.out.println("Sorry, that is not a valid input.");
                                break;
                        }
                    case "n":
                        System.out.print("Is the number divisible by 4? (y/n): ");
                        String answer8=myScanner.next();
                        switch (answer8) {
                            case "Y":
                                System.out.print("Is the number divided by 4 greater than 1? (y/n): ");
                                String answer4=myScanner.next();
                                switch (answer4) {
                                    case "Y":
                                        System.out.println("The number is 8.");
                                        break;
                                    case "y":
                                        System.out.println("The number is 8.");
                                        break;
                                    case "N":
                                        System.out.println("The number is 4.");
                                        break;
                                    case "n":
                                        System.out.println("The number is 4.");
                                        break;
                                    default:
                                        System.out.println("Sorry, that is not a valid input.");
                                        break;
                                } return;
                            case "y":
                                System.out.print("Is the number divided by 4 greater than 1? (y/n): ");
                                String answer5=myScanner.next();
                                switch (answer5) {
                                    case "Y":
                                        System.out.println("The number is 8.");
                                        break;
                                    case "y":
                                        System.out.println("The number is 8.");
                                        break;
                                    case "N":
                                        System.out.println("The number is 4.");
                                        break;
                                    case "n":
                                        System.out.println("The number is 4.");
                                        break;
                                    default:
                                        System.out.println("Sorry, that is not a valid input.");
                                        break;
                                } return;
                            case "N":
                                System.out.print("Is the number divisible by 5? (y/n): ");
                                String answer6=myScanner.next();
                                switch (answer6) {
                                    case "Y":
                                        System.out.println("The number is 10.");
                                        break;
                                    case "y":
                                        System.out.println("The number is 10.");
                                        break;
                                    case "N":
                                        System.out.println("The number is 2.");
                                        break;
                                    case "n":
                                        System.out.println("The number is 2.");
                                        break;
                                    default:
                                        System.out.println("Sorry, that is not a valid input.");
                                        break;
                                } return;
                            case "n":
                                System.out.print("Is the number divisible by 5? (y/n): ");
                                String answer7=myScanner.next();
                                switch (answer7) {
                                    case "Y":
                                        System.out.println("The number is 10.");
                                        break;
                                    case "y":
                                        System.out.println("The number is 10.");
                                        break;
                                    case "N":
                                        System.out.println("The number is 2.");
                                        break;
                                    case "n":
                                        System.out.println("The number is 2.");
                                        break;
                                    default:
                                        System.out.println("Sorry, that is not a valid input.");
                                        break;
                                }return;
                            default:
                                System.out.println("Sorry, that is not a valid input.");
                                break;
                        } return; 
                } return;
                
            case "N":
                System.out.print("Is the number divisible by 3? (y/n): ");
                String answerA=myScanner.next();
                switch (answerA) {
                    case "Y":
                        System.out.print("When divided by 3 is the result greater than 1? (y/n): ");
                        String answerB=myScanner.next();
                        switch (answerB) {
                            case "Y":
                                System.out.println("The number is 9.");
                                break;
                            case "y":
                                System.out.println("The number is 9.");
                                break;
                            case "N":
                                System.out.println("The number is 3.");
                                break;
                            case "n":
                                System.out.println("The number is 3.");
                                break;
                            default:
                                System.out.println("Sorry, that is not a valid input.");
                                break;
                        } return;
                    case "y":
                        System.out.print("When divided by 3 is the result greater than 1? (y/n): ");
                        String answerC=myScanner.next();
                        switch (answerC) {
                            case "Y":
                                System.out.println("The number is 9.");
                                break;
                            case "y":
                                System.out.println("The number is 9.");
                                break;
                            case "N":
                                System.out.println("The number is 3.");
                                break;
                            case "n":
                                System.out.println("The number is 3.");
                                break;
                            default:
                                System.out.println("Sorry, that is not a valid input.");
                                break;
                        } return;
                    case "N":
                        System.out.print("Is the number greater than 6? (y/n): ");
                        String answerD=myScanner.next();
                        switch (answerD) {
                            case "Y":
                                System.out.println("The number is 7.");
                                break;
                            case "y":
                                System.out.println("The number is 7.");
                                break;
                            case "N":
                                System.out.print("Is the number less than 3? (y/n): ");
                                String answerE=myScanner.next();
                                switch (answerE) {
                                    case "Y":
                                        System.out.println("The number is 1.");
                                        break;
                                    case "y":
                                        System.out.println("The number is 1.");
                                        break;
                                    case "N":
                                        System.out.println("The number is 5.");
                                        break;
                                    case "n":
                                        System.out.println("The number is 5.");
                                        break;
                                    default:
                                        System.out.println("Sorry, that is not a valid input.");
                                        break;
                                } return;
                        case "n":
                            System.out.print("Is the number less than 3? (y/n): ");
                            String answerF=myScanner.next();
                            switch (answerF) {
                                case "Y":
                                    System.out.println("The number is 1.");
                                    break;
                                case "y":
                                    System.out.println("The number is 1.");
                                    break;
                                case "N":
                                    System.out.println("The number is 5.");
                                    break;
                                case "n":
                                    System.out.println("The number is 5.");
                                    break;
                                default:
                                    System.out.println("Sorry, that is not a valid input.");
                                    break;
                            } return;
                        default:
                            System.out.println("Sorry, that is not a valid input.");
                            break;
                        } return;
                    case "n":
                        System.out.print("Is the number greater than 6? (y/n): ");
                        String answerS=myScanner.next();
                        switch (answerS) {
                            case "Y":
                                System.out.println("The number is 7.");
                                break;
                            case "y":
                                System.out.println("The number is 7.");
                                break;
                            case "N":
                                System.out.print("Is the number less than 3? (y/n): ");
                                String answerE=myScanner.next();
                                switch (answerE) {
                                    case "Y":
                                        System.out.println("The number is 1.");
                                        break;
                                    case "y":
                                        System.out.println("The number is 1.");
                                        break;
                                    case "N":
                                        System.out.println("The number is 5.");
                                        break;
                                    case "n":
                                        System.out.println("The number is 5.");
                                        break;
                                    default:
                                        System.out.println("Sorry, that is not a valid input.");
                                        break;
                                } return;
                            case "n":
                                System.out.print("Is the number less than 3? (y/n): ");
                                String answerF=myScanner.next();
                                switch (answerF) {
                                    case "Y":
                                        System.out.println("The number is 1.");
                                        break;
                                    case "y":
                                        System.out.println("The number is 1.");
                                        break;
                                    case "N":
                                        System.out.println("The number is 5.");
                                        break;
                                    case "n":
                                        System.out.println("The number is 5.");
                                        break;
                                    default:
                                        System.out.println("Sorry, that is not a valid input.");
                                        break;
                                } return;
                        }return;
                }return;
                    
            case "n":
                System.out.print("Is the number divisible by 3? (y/n): ");
                String answerX=myScanner.next();
                switch (answerX) {
                    case "Y":
                        System.out.print("When divided by 3 is the result greater than 1? (y/n): ");
                        String answerB=myScanner.next();
                        switch (answerB) {
                            case "Y":
                                System.out.println("The number is 9.");
                                break;
                            case "y":
                                System.out.println("The number is 9.");
                                break;
                            case "N":
                                System.out.println("The number is 3.");
                                break;
                            case "n":
                                System.out.println("The number is 3.");
                                break;
                            default:
                                System.out.println("Sorry, that is not a valid input.");
                                break;
                        } return;
                    case "y":
                        System.out.print("When divided by 3 is the result greater than 1? (y/n): ");
                        String answerC=myScanner.next();
                        switch (answerC) {
                            case "Y":
                                System.out.println("The number is 9.");
                                break;
                            case "y":
                                System.out.println("The number is 9.");
                                break;
                            case "N":
                                System.out.println("The number is 3.");
                                break;
                            case "n":
                                System.out.println("The number is 3.");
                                break;
                            default:
                                System.out.println("Sorry, that is not a valid input.");
                                break;
                        } return;
                    case "N":
                        System.out.print("Is the number greater than 6? (y/n): ");
                        String answerD=myScanner.next();
                        switch (answerD) {
                            case "Y":
                                System.out.println("The number is 7.");
                                break;
                            case "y":
                                System.out.println("The number is 7.");
                                break;
                            case "N":
                                System.out.print("Is the number less than 3? (y/n): ");
                                String answerE=myScanner.next();
                                switch (answerE) {
                                    case "Y":
                                        System.out.println("The number is 1.");
                                        break;
                                    case "y":
                                        System.out.println("The number is 1.");
                                        break;
                                    case "N":
                                        System.out.println("The number is 5.");
                                        break;
                                    case "n":
                                        System.out.println("The number is 5.");
                                        break;
                                    default:
                                        System.out.println("Sorry, that is not a valid input.");
                                        break;
                                } return;
                            case "n":
                                System.out.print("Is the number less than 3? (y/n): ");
                                String answerF=myScanner.next();
                                    switch (answerF) {
                                    case "Y":
                                        System.out.println("The number is 1.");
                                        break;
                                    case "y":
                                        System.out.println("The number is 1.");
                                        break;
                                    case "N":
                                        System.out.println("The number is 5.");
                                        break;
                                    case "n":
                                        System.out.println("The number is 5.");
                                        break;
                                    default:
                                        System.out.println("Sorry, that is not a valid input.");
                                        break;
                                } return;
                            default:
                                System.out.println("Sorry, that is not a valid input.");
                                break;
                        } return;
                    case "n":
                        System.out.print("Is the number greater than 6? (y/n): ");
                        String answerY=myScanner.next();
                        switch (answerY) {
                            case "Y":
                                System.out.println("The number is 7.");
                                break;
                            case "y":
                                System.out.println("The number is 7.");
                                break;
                            case "N":
                                System.out.print("Is the number less than 3? (y/n): ");
                                String answerE=myScanner.next();
                                switch (answerE) {
                                    case "Y":
                                        System.out.println("The number is 1.");
                                        break;
                                    case "y":
                                        System.out.println("The number is 1.");
                                        break;
                                    case "N":
                                        System.out.println("The number is 5.");
                                        break;
                                    case "n":
                                        System.out.println("The number is 5.");
                                        break;
                                    default:
                                        System.out.println("Sorry, that is not a valid input.");
                                        break;
                                } return;
                            case "n":
                                System.out.print("Is the number less than 3? (y/n): ");
                                String answerF=myScanner.next();
                                switch (answerF) {
                                    case "Y":
                                        System.out.println("The number is 1.");
                                        break;
                                    case "y":
                                        System.out.println("The number is 1.");
                                        break;
                                    case "N":
                                        System.out.println("The number is 5.");
                                        break;
                                    case "n":
                                        System.out.println("The number is 5.");
                                        break;
                                    default:
                                        System.out.println("Sorry, that is not a valid input.");
                                        break;
                                } return;
                        } return;   
                            default:
                                System.out.println("Sorry, that is not a valid input.");
                            
                }
                
            default:
                System.out.println("Sorry, that is not a valid input.");
                break;
        } return;
      
        
    }//end main method
}//end class