package Zoo;

public class Cat extends Animal implements Pet {
    public Cat(String name) {
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

    @Override
    public void move() {
        System.out.println("Кошка крадется к птичке");
    }

    @Override
    public void play() {
        System.out.println("Играет с рыбкой в аквариуме");
    }

    @Override
    public void beFreindly() {
        System.out.println("Лежит на хозяине");
    }
}
