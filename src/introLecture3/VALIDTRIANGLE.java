package introLecture3;
import java.util.Scanner;
public class VALIDTRIANGLE {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the 3 angles of triangle: ");
        int angle1=input.nextInt();;
        int angle2=input.nextInt();
        int angle3=input.nextInt();

        if((angle1+angle2+angle3)==180 && angle1>0 && angle2>0 && angle3>0){
            System.out.println("The triangle is valid");
        }
        else {
            System.out.println("The triangle is not valid");
        }
    }
}
