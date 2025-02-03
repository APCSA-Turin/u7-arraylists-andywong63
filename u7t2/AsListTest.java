package u7t2;

import java.util.ArrayList;
import java.util.Arrays;

public class AsListTest {
    public static void main(String[] args) {
        Car[] cars = {new Car("Model 1", 1000), new Car("Model 2", 1500), new Car("Model 3", 2500)};

        ArrayList<Car> carList = new ArrayList<>(Arrays.asList(cars));
        System.out.println(carList);
    }
}
