package Comparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Aleksey");
        names.add("Teona");
        names.add("Alexander");
        names.add("Maksim");
        System.out.println(names);

        Collections.sort(names, Comparator.reverseOrder());
        System.out.println(names);
        Collections.sort(names, (n1, n2) -> {
            if (Integer.compare(n1.length(), n2.length()) != 0) {
                return Integer.compare(n1.length(), n2.length());
            } else {
                return n2.compareTo(n1);
            }
        });
        System.out.println(names);
    }
}
