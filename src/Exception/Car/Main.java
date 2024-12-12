package Exception.Car;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Lada", 2020, "Black");
        Car car2 = new Car("BMW", 2021, "Black");
        Car car3 = new Car("Mercedes", 2022, "Silver");
        Car car4 = new Car("Toyota", 2023, "Blue");

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        System.out.println(cars.contains(car1));
        System.out.println(getCar(cars, "Lada"));
        System.out.println(getCar(cars, "Mercedes"));
        System.out.println(getCar(cars, "Honda"));


    }

    public static Car getCar(List<Car> cars, String name) {
        try {
            for (Car car : cars) {
                if (car.getName().equalsIgnoreCase(name)) {
                    return car;
                }
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ошибка");
        }
        throw new CarNotFoundException("Машина не найдена");
    }

}

