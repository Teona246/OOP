package Immutable;

public class MutableClass {
    private int value;

    public MutableClass(int value) {
        this.value = value;
    }

    public MutableClass(MutableClass other) {
        this.value = other.value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "MutableClass - " + value;
    }
}
