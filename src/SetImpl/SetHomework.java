package SetImpl;

import java.lang.reflect.Array;
import java.util.*;

public class SetHomework {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 5, 7, 3, 5, 6, 34, 67, 43, 43};

        HashSet<Integer> result = new HashSet<>(getUniqueElements(numbers));
        System.out.println(result);

        String[] fruits = {"apple", "orange", "banana", "apple", "grapefruit", "banana"};
        LinkedHashSet<String> result2 = new LinkedHashSet<>(getOrderedUniqueElements(fruits));
        System.out.println(result2);

        int[] numbers2 = {34, 56, 60, 45, 30, 20, 7};
        int target = 24;

        findClosetNumbers(numbers2, target);

        TreeSet<Integer> numAsTree = new TreeSet<>();
        for (Integer numAsTree2 : findClosetNumbers(numbers2, target)) {
            numAsTree.add(numAsTree2);
        }
        System.out.println(numAsTree);

    }

    public static Set<Integer> getUniqueElements(int[] numbs) {
        Set<Integer> numbers = new HashSet<>();
        for (Integer num2 : numbs) {
            numbers.add(num2);
        }
        return numbers;
    }

    public static Set<String> getOrderedUniqueElements(String[] words) {
        Set<String> wordsSet = new LinkedHashSet<>();
        for (String word : words) {
            wordsSet.add(word);
        }
        return wordsSet;
    }

    public static int[] findClosetNumbers(int[] n, int n1) {
        TreeSet<Integer> numTree = new TreeSet<>();
        for (Integer numTree2 : n) {
            numTree.add(numTree2);
        }
        int low = numTree.lower(n1);
        int high = numTree.higher(n1);
        int[] result = {low, high};

        return result;
    }
}
