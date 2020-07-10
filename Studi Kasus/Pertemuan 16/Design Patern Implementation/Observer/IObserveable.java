package Observer;

// All the classes that can be observed have to implement this interface
public interface IObserveable {
    void addObserver(IObserver observer);
    void removeObserver(IObserver observer);
    void notifyObservers();
}

