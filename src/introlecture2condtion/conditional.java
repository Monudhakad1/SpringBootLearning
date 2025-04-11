package introlecture2condtion;
import java.util.Scanner;

public class conditional {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        boolean primeSub;
        System.out.print("Enter Subscription details:");
        primeSub=input.nextBoolean();
        if(primeSub){
            System.out.println("Logged In : Thank you for login Lets Enjoy") ;
        }
        else {
            System.out.println("Sorry You are not subscribed on Prime TV go and take benefits of offers: ");
        }
    }
}
