package Zoo;
public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    public void makeSound() {
        System.out.println(toString() + " Sound: ");
    }
    public void eatSomething() {
        System.out.println(toString() + " eats something");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
