package introLecture6_function;
import java.util.Scanner;

public class ArmStrong {

    public static int FindNoOfDigit(int n){
        int a=0;
        while(n!=0){
            a++;
            n=n/10;
        }
        return a;
    }

    public static boolean CheckArmStrong(int number){
        boolean flag=false;
        int Digit=FindNoOfDigit(number);
        int original=number;
        int sum=0;
        while(original!=0){
            int rem=original%10;
            sum+=Math.pow(rem,Digit);
            original=original/10;
        }
        if(sum==number){ flag=true;}
        return flag;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int CheckNumber=input.nextInt();
        boolean isArmStrong=CheckArmStrong(CheckNumber);
        if(isArmStrong){
            System.out.println("Arm Strong  ");
        }
        else{
            System.out.println("Not Arm Strong ");
        }
    }
}
