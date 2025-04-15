package introlecture4;
import java.sql.SQLOutput;
import java.util.Scanner;
public class itterative {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int number=input.nextInt();
//        for(int i=0; i<=isEvenNtoG;i++){
//            if(i%2==0){
//                System.out.println("Even number is: " + i);
//            }
//        }
        int sum=0;
        for(int i=1 ;i<=number;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
