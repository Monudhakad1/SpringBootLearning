package introlecture4;
import java.util.Scanner;
public class primeNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number For CHECK : ");
        int CheckPrime=input.nextInt();
        boolean isPrime=true;
        for(int i=2 ;i<CheckPrime;i++){
            if(CheckPrime%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println("Prime Number");
        }
        else System.out.println("Not Prime Number");
    }
}
