package Observer;

public class MainClass {
    public static void main(String[] args) {
        IObserver watertankSensor = new WaterTankSensor();

        Electronics electronics = new Electronics();
        electronics.addObserver(watertankSensor);

        // A change in any values in subject leads to observer triggering updateValue method
        // and printing updated values.
        electronics.setHeight(53.5);
    }
}

