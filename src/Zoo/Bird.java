package Zoo;

public final class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    private boolean canFly;

    public boolean isCanFly() {
        return canFly;
    }

    @Override
    public void makeSound() {
        System.out.println(super.toString() + " издает звук: Чирик-чирик");
    }

    @Override
    public void eatSomething() {
        System.out.println(super.toString() + " ест семена");
    }

    @Override
    public void move() {
        if (canFly == isCanFly()) {
            System.out.println("Птица летает");
        } else {
            System.out.println("Птица не может летать");
        }
    }
}