public class Context {
    private Strategy arriveMethod;
    public Context(){}

    public void SetArriveMethod(Strategy cur) {
        this.arriveMethod = cur;
    }

    public void start() {
        arriveMethod.execute();
    }
}