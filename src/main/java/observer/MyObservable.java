package observer;

public interface MyObservable {
    void subscribe(MyObserver observer);
    void unsubscribe(MyObserver observer);
    void broadcast();
}
