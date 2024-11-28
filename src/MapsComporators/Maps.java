package MapsComporators;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        String sentence = "java is fun and java is powerful";
        Map<Character, Integer> string = new HashMap<>();
        for (int i = 0; i < sentence.length(); i++) {
            char char1 = sentence.charAt(i);
            if (char1 == ' ') {
                continue;
            }
            string.put(char1, string.getOrDefault(char1, 0) + 1);

        }
        System.out.println(string);

        Map<String, Integer> map2 = new HashMap<>();

        map2.put("A", 1);
        map2.put("B", 2);
        map2.put("C", 3);
        map2.put("D", 4);
        System.out.println(map2);

        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            System.out.println(entry.getValue() + " - " + entry.getKey());
        }

    }
}
