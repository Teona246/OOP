package Car;

import java.util.Objects;

public class Car implements Comparable<Car> {

    public String model;
    public Integer year;
    public String color;

    public Car(String model, Integer year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car - " + model + ", " + year + ", " + color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model) && Objects.equals(year, car.year) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year, color);
    }


    @Override
    public int compareTo(Car otherCar) {
        if (this.model.compareTo(otherCar.model) == 0) {
            return Integer.compare(otherCar.year, this.year);
        } else {
            return otherCar.color.compareTo(this.color);
        }
    }
}
