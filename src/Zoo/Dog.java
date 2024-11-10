package Zoo;

public class Dog extends Animal {
    protected Dog(String name) {
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println(super.toString() + " издает звук: Гав-гав");
    }

    @Override
    public void eatSomething() {
        System.out.println(super.toString() + " ест кость");
    }
}
