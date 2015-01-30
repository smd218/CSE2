///////////////////////////////////////////////////////////////////////
//Sophie Davis
//CSE2 - Spring 2015
//Prof. Brian Chen
//01-30-2015
//lab02 - Cyclometer Java program
    //This program calculates several measurements of two bicycle trips
    //The input is the time elapsed in seconds and number of rotations of the front wheel during the bike trip
    //With the info for two bike trips plugged in to the program, it should be able to output to following:
        //number of minutes for each trip
        //rotation counts for each trip
        //distance of each trip in miles
        //distance of two trips combined
public class Cyclometer {
    //main method required for every Java program
    public static void main (String[ ] args) {
        int secsTrip1=480; // time of first trip in seconds
        int secsTrip2=3220; //time of second trip in seconds
        int countsTrip1=1561; //number of front wheel rotations in first trip
        int countsTrip2=9037; //number of front wheel rotations in second trip
        double wheelDiameter=27.0, //diameter of front wheel
        PI=3.14159, //constant used for calculating number of roatations
            feetPerMile=5280, //constant used for converting between miles and feet
            inchesPerFoot=12, //constant used for converting between feet and inches
            secondsPerMinute=60; //constant used for converting between seconds and minutes
        double distanceTrip1, distanceTrip2,totalDistance; //combining the distances of both trips
        
        System.out.println("Trip one took "+
            (secsTrip1/secondsPerMinute)+" minutes and had "+
            countsTrip1+" counts.");
        System.out.println("Trip two took "+
            (secsTrip2/secondsPerMinute)+" minutes and had "+
            countsTrip2+" counts.");
            //Trip one took 8.0 minutes and had 1561 counts. 
            //Trip two took 53.6666666666666664 minutes and had 9037 counts. 
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        //above gives the distance in inches
        //(for each count, a rotation of the wheel travels the diameter in inches times pi)
        distanceTrip1/=inchesPerFoot*feetPerMile; //gives disance in miles 
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        //print out the output data
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
    }   //end of main method
}   //end of class