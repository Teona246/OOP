package StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("fig");
        words.add("date");
        words.add("kiwi");
        words.add("grape");

        words = words.stream()
                .sorted(Comparator.comparingInt(String::length))
                .filter(w -> w.length() > 4)
                .map(String::toUpperCase)
                .toList();
        System.out.println(words);
    }
}
