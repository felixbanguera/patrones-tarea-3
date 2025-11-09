// Sujeto (Observable)
import java.util.ArrayList;
import java.util.List;

public class ServiceRequest {
    private String state;
    private List<IRequestSubscriber> observers = new ArrayList<>();

    public void attach(IRequestSubscriber observer) {
        observers.add(observer);
    }

    public void detach(IRequestSubscriber observer) {
        observers.remove(observer);
    }

    public void setState(String newState) {
        this.state = newState;
        System.out.println("\n📦 La solicitud cambió de estado a: " + newState);
        notifyObservers();
    }

    public String getState() {
        return state;
    }

    private void notifyObservers() {
        for (IRequestSubscriber observer : observers) {
            observer.update(this);
        }
    }
}