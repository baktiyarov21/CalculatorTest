import java.io.*;

public class WriteObject {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("Nissan", 1),
                new Car("Kia", 2)
        };
        Car car = new Car("S",4);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("car.bin"))){
            oos.writeObject(cars);
            oos.writeObject(car);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
