public class Counter {
    private int value;
    private Object object = new Object();

    public void inc() {
        value++;
    }

    public void dec() {
        value--;
    }

    public int getValue() {
        return value;
    }
}
