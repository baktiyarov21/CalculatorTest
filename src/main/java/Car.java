import java.io.Serializable;
import java.util.Objects;

public class Car implements Serializable, Comparable<Car> {

    private static final long serialVersionUID = -1549752235000541590L;
    private String brand;
    private int number;

    public Car(String brand, int number) {
        this.brand = brand;
        this.number = number;
    }

    public String getBrand() {
        return brand;
    }

    public int getNumber() {
        return number;
    }

    public void name() {
        System.out.println("Бренд: " + getBrand());
    }

    @Override
    public String toString() {
        return getNumber() + getBrand();
    }

    @Override
    public int compareTo(Car t) {
        if (this.number == t.number)
            return 0;
        if (this.number < t.number)
            return -1;
        else
            return 1;
    }
}
