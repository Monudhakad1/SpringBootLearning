package introLecture10_OOps;
import java.util.Scanner;

public class Lamp {
    public boolean isOn;

    void TurnOnLamp(){
        isOn = true;
    }
    void turnOffLamp(){
        isOn = false;
    }
    void CheckLamp(){
        System.out.println(isOn);
    }
}
