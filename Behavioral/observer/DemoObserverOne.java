public class DemoObserverOne implements IObserver{

    @Override
    public void update(IObservable observable) {
        if (observable instanceof AnnoymousObservable) {
            AnnoymousObservable annoymousObservable = (AnnoymousObservable)observable;
            System.out.println("the height is : " + annoymousObservable.getHeight());
        }
    }
}