package Zoo;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Собака");
        Cat cat = new Cat("Кошка");
        Bird bird = new Bird("Птица");

        Animal[] animals = {
                dog,
                cat,
                bird
        };
        for (Animal animal : animals) {
            animal.makeSound();
            animal.eatSomething();
            animal.move();

            if (animal instanceof Pet) {
                System.out.println("Домашнее животное");
                ((Pet) animal).play();
                ((Pet) animal).beFreindly();
            } else {
                System.out.println("Не является домашним животным");
            }

        }
    }
}
