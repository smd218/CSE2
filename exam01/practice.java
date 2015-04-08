import java.util.Scanner;
public class practice{
    public static void main (String[] args){
        String temp = "";
for(int i = 0; i<4; i++){
	temp = temp + i + " ";
	System.out.println(temp);
}

String tempp = "";
for(int i = 0; i<4; i++){
	tempp = tempp + i + " ";
	System.out.println(tempp);
}


String temp1 = "";
for(int j = 0; j<9; j++){
	for(int i = 0; i<j; i++){
		String temp11 = temp1 + i + " ";
			System.out.print(temp11);

	}
	System.out.println(temp1);
}

for (int a=1; a<=6; a++ ){
            String stringX=""; //declare empty string
            for (int b=1; b<=a; b++){
                stringX+=a;//adds a to stringX
                System.out.println(stringX); //prints out string with input values stored
            }//end inner for loop for even numbers
        }//end if (even #s) 
        
        

    }//end method getInput
    
}