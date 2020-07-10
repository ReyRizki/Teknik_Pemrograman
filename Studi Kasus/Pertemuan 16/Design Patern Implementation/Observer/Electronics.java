package Observer;

import java.util.ArrayList;

public class Electronics implements IObserveable {
    private ArrayList<IObserver> observers;

    private double height;

    public Electronics() {
        observers = new ArrayList<>();
    }

    public void setHeight(double height) {
        this.height = height;
        notifyObservers();
    }

    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        int index = observers.indexOf(observer);
        if(index >= 0) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(this.height);
        }
    }
}
