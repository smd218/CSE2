///////////////////////////////////////////////////////////////////////////////////////
//Sophie Davis
//CSE2 - Spring 2015
//Prof. Brian Chen
//02-27-2015
//lab06 - SmileGenerator java program
//This program.............

//start class
public class SmileGenerator {
    //start main method
    public static void main (String [ ] args) {
        System.out.println("Step 1:");
        for(int a=0; a<5; a++){
            System.out.print(":) ");
        }//end for loop
        System.out.println();
        
        int b=0;
        while(b<5){
            System.out.print(":) ");
            b++;
        }//end while loop
        System.out.println();
        
        int c=0;
        do{
            System.out.print(":) ");
            c++;
        }while (c<5);
        System.out.println();
        
        System.out.println("Step 2:");
        
        int r=(int)(1+Math.random()*100);
        
        int smiley=0;
        if (r<30){
            while(smiley<r){
                System.out.print(":) ");
                smiley++;
            }//end loop
            System.out.println();
            
        }//end if
        else if (r<60){
            int smileyA=(r%30);
            int smileyB=(r-smileyA);
                int x=0;
                while (x<30){
                    System.out.print (":) ");
                    x++;
                }
                System.out.println();
                int y=0;
                while (y<smileyA){
                    System.out.print(":) ");
                    y++;
                }
                System.out.println();
        }//end if
        else if (r<90){
            int smileyX=(r%30);
            int smileyY=(r-smileyX);
                int s=0;
                while (s<30){
                    System.out.print (":) ");
                    s++;
                }
                System.out.println();
                int d=0;
                while (d<30){
                    System.out.print(":) ");
                    d++;
                }
                System.out.println();
                int m=0;
                while (m<smileyX){
                    System.out.print(":) ");
                    m++;
                }
                System.out.println();
        }//end if
        else if (r>=90){
            int smileyZ=(r%30);
            int smileyZZ=(r-smileyZ);
                int l=0;
                while (l<30){
                    System.out.print (":) ");
                    l++;
                }
                System.out.println();
                int q=0;
                while (q<30){
                    System.out.print(":) ");
                    q++;
                }
                System.out.println();
                int p=0;
                while (p<30){
                    System.out.print(":) ");
                    p++;
                }
                System.out.println();
                int n=0;
                while (n<smileyZ){
                    System.out.print(":) ");
                    n++;
                }
                System.out.println();
        }//end if
        
        System.out.println("Step 3:");
        
        for(int u=1; u<=7; u++){
            switch (u){
                case 1:
                    System.out.println(":) ");
                    break;
                case 2:
                    System.out.println(":) :)");
                    break;
                case 3:
                    System.out.println(":) :) :)");
                    break;
                case 4:
                    System.out.println(":) :) :) :)");
                    break;
                case 5:
                    System.out.println(":) :) :) :) :)");
                    break;
                case 6:
                    System.out.println(":) :) :) :) :) :)");
                    break;
                case 7:
                    System.out.println(":) :) :) :) :) :) :)");
                    break;
            }
        }//end for loop
        System.out.println();
        

    }//end main method
}//end class