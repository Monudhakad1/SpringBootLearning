package introlecture4;
import java.util.Scanner;

public class practise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int NoReverse = input.nextInt();
        int Reverse=0;
        while(NoReverse!=0){
            Reverse= ( NoReverse%10 ) + Reverse*10;
            NoReverse=NoReverse/10;
        }
        System.out.println(Reverse);

    }
}
