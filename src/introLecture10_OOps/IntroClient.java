package introLecture10_OOps;

public class IntroClient {
    public static void main(String[] args) {
        //created object
        introBicycle MountainBicycle = new introBicycle();

        System.out.println(MountainBicycle.gear);
        MountainBicycle.Braking();  // Behaviour

        introBicycle RideBicycle = new introBicycle();

        System.out.println(RideBicycle.gear);
        RideBicycle.Braking();  // Behaviour
    }
}
