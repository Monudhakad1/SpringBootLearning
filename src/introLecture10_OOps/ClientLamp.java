package introLecture10_OOps;

public class ClientLamp {
    public static void main(String[] args) {
        Lamp led = new Lamp();
        Lamp Halogen = new Lamp();
        led.TurnOnLamp();
        System.out.println(led.isOn);
        Halogen.TurnOnLamp();
        System.out.println(Halogen.isOn);

        led.CheckLamp();
        Halogen.CheckLamp();
    }
}
