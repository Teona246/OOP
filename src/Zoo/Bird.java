package Zoo;

public class Bird extends Animal{
    protected Bird(String name) {
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
}