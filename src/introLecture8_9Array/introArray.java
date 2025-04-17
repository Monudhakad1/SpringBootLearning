package introLecture8_9Array;

import java.util.Scanner;

public class introArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Array is a size of similar type of DataTypes
        // which is Continues
        int[] ArrayDeclaration = new int[20];  // int[no_of_element_hold]
        // first declaration : int[20] -> 20 is memory allocation
        //initialization an array -> int [] age ={12,12,23,4,31,34,45, 22};

        System.out.println( ArrayDeclaration[0] );
        System.out.println(ArrayDeclaration);
        // IMPLEMENTATIONS
        int[] studentAge = {12, 13, 11, 14, 10, 9, 15, 11, 12, 16, 15, 17, 8, 9};

        // in java if i copy the array like int [] arr1= arr; then both are same but new name got referncing same addresses



        int[] studentAgeInitial = new int[8];
        studentAgeInitial[0] = 12;
        studentAgeInitial[1] = 13;
        studentAgeInitial[2] = 11;
        studentAgeInitial[3] = 14;
        studentAgeInitial[4] = 10;
        studentAgeInitial[5] = 9;
        studentAgeInitial[6] = 15;
        studentAgeInitial[7] = 8;
    }
}
