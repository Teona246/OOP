package MapsComporators.Comporator;

public class ForComp {
    private String name;
    private Integer number;

    public ForComp(String name, Integer number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return name + ", number: " + number;
    }

    public String getName() {
        return name;
    }

    public Integer getNumber() {
        return number;
    }
}
