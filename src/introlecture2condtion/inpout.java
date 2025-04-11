package introlecture2condtion;
import java.util.Scanner;

public class inpout {
    public static void main(String[] args){
        /*
        System.out.println("Monu program");
        int checkValue=10;

        System.out.println(checkValue);
        // concatenation
        System.out.println("Number " + checkValue);
        */


        //create an object of scanner class
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the Number:  ");
        int inputNumber=input.nextInt();

        System.out.println( " Number is : " + inputNumber);

        System.out.print("Enter the FloatNumber:  ");
        float inputFloat=input.nextFloat();
        System.out.println( " Number is : " + inputFloat);

        String inputString=input.nextLine();
        System.out.print("Enter string  :" + inputString);

        // next() -> read a word from user :
        // nextLine() -> read a line for a text :

    }
}
