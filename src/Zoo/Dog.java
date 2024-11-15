package Zoo;

public final class Dog extends Animal implements Pet {
    public Dog(String name) {
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

    @Override
    public void move() {
        System.out.println("Собака бегает вокруг хозяина");
    }

    @Override
    public void play() {
        System.out.println("Играет с мячиком");
    }

    @Override
    public void beFreindly() {
        System.out.println("Виляет хвостом");
    }
}
