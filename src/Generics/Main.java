package Generics;

public class Main {
    public static void main(String[] args) {
        Box<Integer> numbers = new Box<>(234);
        numbers.get();
        numbers.set(46);
        numbers.isEmpty();
        numbers.clear();

        Box<String> names = new Box<>("Charlie");
        names.get();
        names.set("Nathan");
        names.isEmpty();
        names.clear();

    }
}
