import java.util.Scanner;

public class Main {
    public static void main(String [] args){
       Scanner scnr = new Scanner(System.in);
       long decimalValue = 0;
       String input;
       String hexadecimal;

       System.out.print("Enter a hexadecimal number: ");

       input = scnr.next();

       // toUpperCase() method will make any letter into uppercase, the number will be the same but with all the letters capital
       input = input.toUpperCase();

       if(input.substring(0,2).equals("0X")){
           hexadecimal = input.substring(2);
       }else{
           hexadecimal = input;
       }

        // Find the value of each character
        // Multiply each value by the the power of 16 starting at 0 and increasing every loop
        // Add all of the values that we multiplied times power of 16

        char tmp;
        int finalValue = 0;
        int power = 0;

        for(int i = hexadecimal.length()-1; i >= 0; i--){
            tmp = hexadecimal.charAt(i);

            // check ASCII value to see if the character is between '0' and '9'
            if( 48 <= tmp && tmp <= 57){
                finalValue = tmp - 48;
            } else if( 65 <= tmp && tmp <= 70){
                finalValue = tmp - 55;
            }

            decimalValue += (long) (finalValue * Math.pow(16,power));

            power++;
        }

        System.out.println("Your number is " + decimalValue + " in decimal");


    }

}
