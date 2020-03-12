public class Test {
    public static void main(String[] args) {
        AnnoymousObservable observable = new AnnoymousObservable();
        DemoObserverOne one = new DemoObserverOne();
        DemoObserverTwo two = new DemoObserverTwo();
        DemoObserverThree three = new DemoObserverThree();
        observable.registerObserver(one);
        observable.registerObserver(two);
        observable.registerObserver(three);
        observable.setAttribute(9.0, 8.3, "Male");
        observable.removeObserver(three);
        observable.setAttribute(1, 2.5, "Female");
        observable.registerObserver(three);
        observable.setAttribute(9.9, 9.8, "Tran");
    }
}