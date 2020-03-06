public class Main{
    public static void main(String[] args) {
        Context visitor = new Context();
        visitor.SetArriveMethod(new BikeStrategy());
        visitor.start();
        visitor.SetArriveMethod(new FlyingStrategy());
        visitor.start();
        visitor.SetArriveMethod(new WalkStrategy());
        visitor.start();
    }
}