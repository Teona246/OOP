package Zoo;

public class Cat extends Animal {
    protected Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(super.toString() + " издает звук: Мяу");
    }

    @Override
    public void eatSomething() {
        System.out.println(super.toString() + " ест рыбку");
    }
}
