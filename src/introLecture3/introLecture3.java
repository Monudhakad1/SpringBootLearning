package introLecture3;
import java.util.Scanner;

public class introLecture3 {
    //Switch statements
    public static void main(String[] args) {
        //allows special block of code
        Scanner input =new Scanner(System.in);
        int SizeNumber;
        System.out.print("Enter the SizeNumber: ");
        SizeNumber=input.nextInt();
        String CheckSizeName;
        switch(SizeNumber){
            case  29:
                CheckSizeName="Small";
                break;
            case 42:
                CheckSizeName="Medium";
                break;
            case 48:
                CheckSizeName="Large";
                break;
            default:
                CheckSizeName="Unknown";
                break;
        }

        System.out.println(CheckSizeName);

    }

}
