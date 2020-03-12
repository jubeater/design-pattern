import java.util.ArrayList;
import java.util.List;

public class AnnoymousObservable implements IObservable {
    private double height;
    private double weight;
    private String gender;
    private List<IObserver> observers;
    public AnnoymousObservable(){
        this.observers = new ArrayList<>();

    }

    @Override
    public void registerObserver(IObserver observer){
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer){
        int idx = observers.indexOf(observer);
        if (idx >= 0) {
            observers.remove(idx);
        }
    }

    @Override
    public void notifyAllObserver() {
        for (IObserver observer : observers) {
            observer.update(this);
        }
    }

    public void setAttribute(double height, double weight, String gender) {
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        notifyAllObserver();
    }

    public double getHeight() {
        return this.height;
    }

    public double getWeight() {
        return this.weight;
    }

    public String getGender() {
        return this.gender;
    }

}