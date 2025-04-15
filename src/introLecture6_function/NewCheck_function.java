package introLecture6_function;
import java.util.Scanner;
import java.lang.Math;
public class NewCheck_function {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        GreetingCustomer(8);
        int i = addTwo(8, 12);
        System.out.println(i);
        System.out.println(Math.sqrt(144));
        Math.sqrt(12);
    }

    public static void GreetingCustomer(int noOfGreetings) {
        for(int i=1 ;i<=noOfGreetings;i++){
            System.out.println("Good Evening everyone ");
        }
    }

    public static int  addTwo(int no1 , int no2) {
        return no1 +no2;
    }
}
