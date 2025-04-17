package introLecture8_9Array;
import java.util.Scanner;
public class reverseAnArray {
    public static void main(String[] args) {
        int [] ReverseArray={1,2,3,4,5,6,7,8,9};
        int[] newReverse=reverseArray(ReverseArray);

        SwapReverse(ReverseArray);

        for(int i=0;i<ReverseArray.length;i++){
            System.out.print(ReverseArray[i]+" ");
        }
    }
    public static int[]  reverseArray(int[] GivenArray){
        int [] reversedArray= new int[GivenArray.length];
        for(int i=0;i<GivenArray.length;i++){
            reversedArray[i]=GivenArray[GivenArray.length-i-1];
        }
        return reversedArray;
    }

    public static void SwapReverse ( int [ ] GivenArray){
        int i=0;
        int j=GivenArray.length-1;
        while(i<=j){
            int temp=GivenArray[i];
            GivenArray[i]=GivenArray[j];
            GivenArray[j]=temp;
            i++;
            j--;
        }
//        return GivenArray;
    }
}
