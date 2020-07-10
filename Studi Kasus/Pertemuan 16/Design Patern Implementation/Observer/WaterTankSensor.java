package Observer;

//Menjadi 'kontraktor' / observer yang mengawasi Observeable
public class WaterTankSensor implements IObserver {
    @Override
    public void update(double height) {
        System.out.println("Current Water Height : " + height + " Out of 100 Cm" );
    }
}

