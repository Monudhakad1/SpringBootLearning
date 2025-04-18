package introLecture10_OOps;

import java.sql.SQLOutput;

public class Constructor {

    private String name;

    Constructor(){
        System.out.println("C called");
    name = "Monudhakad";
    }

    public static void main(String[] args) {
        Constructor obj = new Constructor();
        System.out.println("THE NAME IS " + obj.name);
    }
}
