package Machine;

public class Car extends Machine implements Cashier {
    private String mark;

    public Car() {
    }

    public Car(String mark) {
        this.mark = mark;
    }
}
