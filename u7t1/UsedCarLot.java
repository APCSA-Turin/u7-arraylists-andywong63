package u7t1;

import java.util.ArrayList;

public class UsedCarLot {
    private ArrayList<Car> inventory;

    public UsedCarLot() {
        inventory = new ArrayList<Car>();
    }

    public ArrayList<Car> getInventory() {
        return inventory;
    }

    public void addCar(Car car) {
        inventory.add(car);
    }

    public boolean swap(int index1, int index2) {
        if (index1 < 0 || index1 >= inventory.size() || index2 < 0 || index2 >= inventory.size()) {
            return false;
        }
        Car temp = inventory.get(index2);
        inventory.set(index2, inventory.get(index1));
        inventory.set(index1, temp);
        return true;
    }
}