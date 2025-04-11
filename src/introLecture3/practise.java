package introLecture3;
import java.util.Scanner;
public class practise {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Number which you need to check: ") ;
        int number = input.nextInt();
        if(4%2==0) {
            System.out.println(number + " is Even");
        }
        else {
            System.out.println(number + "  is Odd");
        }
    }
}
