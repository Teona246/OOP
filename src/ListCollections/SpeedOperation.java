package ListCollections;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class SpeedOperation {

    static int countE = 1_000_000;
    static int countN = 100_000;
    static Random rand = new Random();

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("ArrayList - добавление в список: " + addInList(arrayList));
        System.out.println("LinkedList - добавление в список: " + addInList(linkedList));
        System.out.println("***");

        System.out.println("ArrayList - добавление наугад: " + addInRand(arrayList));
        System.out.println("LinkedList - добавление наугад: " + addInRand(linkedList));
        System.out.println("***");

    }

    public static long addInList(List<Integer> list) {
        LocalTime startTime = LocalTime.now();

        for (int i = 0; i < countE; i++) {
            list.add(i);
        }

        LocalTime endTime = LocalTime.now();
        Duration time = Duration.between(startTime, endTime);
        long duration = time.toMillis();
        list.clear();
        return duration;
    }

    public static long addInRand(List<Integer> list) {
        LocalTime startTime = LocalTime.now();

        for (int i = 0; i < countN; i++) {
            i = rand.nextInt();
            list.add(i);
        }

        LocalTime endTime = LocalTime.now();
        Duration time = Duration.between(startTime, endTime);
        long duration = time.toMillis();
        list.clear();
        return duration;
    }

}
