package introLecture3;
import java.util.Scanner;

public class IsLeafYear {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the year : " );
        boolean check;
        int YearCheck=input.nextInt();
        if(YearCheck%4==0 && YearCheck%100!=0) {
            if((YearCheck%100==0 && YearCheck%400==0 ) || YearCheck%400==0){
                check=false;
            }
            else {
                check=true;
            }
        }
        else check=false;

        if(check) System.out.println("Is Leaf");
        else System.out.println("Is Not Leaf");
    }
}
