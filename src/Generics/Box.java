package Generics;

public class Box<T> {
    private T information;

    public Box(T information) {
        this.information = information;
    }

    public T getInformation() {
        return information;
    }

    public void setInformation(T information) {
        this.information = information;
    }

    public void get() {
        System.out.println("The information - " + information);
    }

    public void set(T newData) {
        System.out.println("Added information - " + newData);
    }

    public void isEmpty() {
        if (information != null) {
            System.out.println("The box isn't empty");
        } else {
            System.out.println("The box is empty");
        }
    }

    public void clear() {
        information = null;
        System.out.println("The box is cleared");
    }
}
