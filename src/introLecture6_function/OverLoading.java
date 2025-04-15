package introLecture6_function;

public class OverLoading {
    // in Java , two or more methods may have same name if they differ in parameters  :
    // these methods are called overloaded methods // Method overloading
//    void func(){...};
//    void func(int n){...};
//    float func(double a){...};
//    float func(int a , int b){...};

    public static String formatNumber(int value){
        return String.format("%d",value);
    }

    public static void main(String[] args) {
        int value=18;
        System.out.println( formatNumber(18));
    }

}
