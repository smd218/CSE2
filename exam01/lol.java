
import java.util.Random;
public class lol{
    public static void main(String [] args){
        
       int i = 0, j = 20;
            while (i < 30) {
                while (j > 0) {
                    System.out.println(i + j);
                    j -= 4;
                }
                i += 4; 
                System.out.println("j: "+j);
                System.out.println("i: "+i);
            }

       }
    }
    

