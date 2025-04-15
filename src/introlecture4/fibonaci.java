package introlecture4;
import java.util.Scanner;
public class fibonaci {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int NthFibonaci=input.nextInt();
        int f1=0;
        int f2=1;
        int count=1;
        while(count<=NthFibonaci+1){
            System.out.println(f1);
            int sum=f1+f2;
            f1=f2;
            f2=sum;
            count++;
        }
    }
}
