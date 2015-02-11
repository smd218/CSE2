///////////////////////////////////////////////////////////////////////////////////////
//Sophie Davis
//CSE2 - Spring 2015
//Prof. Brian Chen
//02-10-2015
//hw03 - Bicycle java program
//This program computes the distance traveled and avg MPH of a bicycle with a wheel diameter
//of 27 inches when the number of counts on a cyclometer and the number of seconds in which 
//the counts occured are entered. This program computes outputs by using the scanner utility. 

import java.util.Scanner; //imports scanner utility
//start class
public class Bicycle {
    //start main method
    public static void main (String [ ] args) {
        Scanner myScanner; //declares instance of the Scanner
        myScanner=new Scanner(System.in); //call Scanner constructor
        System.out.print("Enter the number of seconds: "); //prompts input of seconds
        int nSeconds=myScanner.nextInt(); //accepts user input
        System.out.print("Enter the number of counts: "); //prompts input of counts
        int nCounts=myScanner.nextInt(); //accepts user input
        double wheelDiameter=27.0, //diameter of wheel in inches
        PI=3.14159, //constant used for calculating number of roatations
            feetPerMile=5280, //constant used for converting between miles and feet
            inchesPerFoot=12, //constant used for converting between feet and inches
            secondsPerMinute=60, //constant used for converting between seconds and minutes
            minutesPerHour=60; //constant used for converting between hours and minutes
        double distance=nCounts*wheelDiameter*PI/inchesPerFoot/feetPerMile; //gives distance in miles
           int distanceX=(int)(distance*100.0); //miltiplies distance by 100 and changes it to an int
           double roundedDistance=(double)(distanceX/100.0); //converts distance back to a double and divides by 100
        double time=nSeconds/secondsPerMinute; //gives time in minutes
        double avgMPH=distance/(time/minutesPerHour); //gives avg MPH
            int avgMPHX=(int)(avgMPH*100.0); //multiplies MPH by 100 and converts it to an int for rounding
            double roundedAvgMPH=(double)(avgMPHX/100.0); //divides by 100 and converts back to a double
        System.out.println("The distance was " +roundedDistance+ " miles and took " +time+ " minutes."); //prints out distance and time
        System.out.println("The average MPH was " +roundedAvgMPH+ "."); //prints out average MPH
    } //end main method
} //end class