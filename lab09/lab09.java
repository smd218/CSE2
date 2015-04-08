///////////////////////////////////////////////////////////////////////////////////////
//Sophie Davis
//CSE2 - Spring 2015
//Prof. Brian Chen
//03-27-2015
//lab09 
//This program .........

import java.util.Random;

public class lab09{
    
    public static String adjectives (String a){
        String adj="";
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10);
        switch (randomInt){
                case 0:
                    adj="fast";
                    break;
                case 1:
                    adj="small";
                    break;
                case 2:
                    adj="big";
                    break;
                case 3:
                    adj="red";
                    break;
                case 4:
                    adj="slow";
                    break;
                case 5:
                    adj="lazy";
                    break;
                case 6:
                    adj="playful";
                    break;
                case 7:
                    adj="silly";
                    break;
                case 8:
                    adj="sleepy";
                    break;
                case 9:
                    adj="hyper";
                    break;
            }return adj;
        
    }
    
    public static String subject (String b){
        String subj="";
        Random randomGenerator=new Random();
        int randomInt = randomGenerator.nextInt(10);
            switch (randomInt){
                case 0:
                    subj="cat";
                    break;
                case 1:
                    subj="dog";
                    break;
                case 2:
                    subj="goat";
                    break;
                case 3:
                    subj="bear";
                    break;
                case 4:
                    subj="fox";
                    break;
                case 5:
                    subj="squirrel";
                    break;
                case 6:
                    subj="bunny";
                    break;
                case 7:
                    subj="pig";
                    break;
                case 8:
                    subj="cow";
                    break;
                case 9:
                    subj="elephant";
                    break;
            }return subj;
    }
    
    public static String verbs (String c){
        Random randomGenerator=new Random();
        String verb="";
        int randomInt = randomGenerator.nextInt(10);
            switch (randomInt){
                case 0:
                    verb="jumped";
                    break;
                case 1:
                    verb="hopped";
                    break;
                case 2:
                    verb="skipped";
                    break;
                case 3:
                    verb="flew";
                    break;
                case 4:
                    verb="ran";
                    break;
                case 5:
                    verb="walked";
                    break;
                case 6:
                    verb="crawled";
                    break;
                case 7:
                    verb="cartwheeled";
                    break;
                case 8:
                    verb="soared";
                    break;
                case 9:
                    verb="jolted";
                    break;
            }return verb;
    }
    
    public static String adverbs (String d){
        String averb="";
        Random randomGenerator=new Random();
        int randomInt = randomGenerator.nextInt(10);
            switch (randomInt){
                case 0:
                    averb="over";
                    break;
                case 1:
                    averb="under";
                    break;
                case 2:
                    averb="around";
                    break;
                case 3:
                    averb="through";
                    break;
                case 4:
                    averb="across";
                    break;
                case 5:
                    averb="above";
                    break;
                case 6:
                    averb="below";
                    break;
                case 7:
                    averb="over";
                    break;
                case 8:
                    averb="into";
                    break;
                case 9:
                    averb="around";
                    break;
                
                
            }return averb;
    }
    
    public static String objects (String x){
        String obj="";
        Random randomGenerator=new Random();
        int randomInt = randomGenerator.nextInt(10);
            switch (randomInt){
                case 0:
                    obj="fence";
                    break;
                case 1:
                    obj="wall";
                    break;
                case 2:
                    obj="hole";
                    break;
                case 3:
                    obj="ditch";
                    break;
                case 4:
                    obj="railing";
                    break;
                case 5:
                    obj="table";
                    break;
                case 6:
                    obj="chair";
                    break;
                case 7:
                    obj="desk";
                    break;
                case 8:
                    obj="bed";
                    break;
                case 9:
                    obj="couch";
                    break;
                    
            }return obj;
    }
            
            
            
    
    public static void main (String [] args){
        String x="";
        System.out.println("The "+adjectives(x)+" "+subject(x)+" "+verbs(x)+" "+adverbs(x)+" the "+objects(x)+".");
    }
    
}