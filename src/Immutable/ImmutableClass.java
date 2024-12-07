package Immutable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class ImmutableClass {
    private final String name;
    private final List<Integer> numbers;
    private MutableClass mutableClass;

    public ImmutableClass(String name, List<Integer> numbersList, MutableClass mutableClass) {
        this.name = name;
        numbers = Collections.unmodifiableList(numbersList);
        this.mutableClass = new MutableClass(mutableClass);
    }

    public String getName() {
        return name;
    }

    public List<Integer> getNumbers() {
        return new ArrayList<>(numbers);
    }

    public MutableClass getMutableClass() {
        return mutableClass;
    }

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "name='" + name + '\'' +
                ", numbers=" + numbers +
                ", " + mutableClass +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImmutableClass that = (ImmutableClass) o;
        return Objects.equals(name, that.name) && Objects.equals(numbers, that.numbers) && Objects.equals(mutableClass, that.mutableClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numbers, mutableClass);
    }
}
