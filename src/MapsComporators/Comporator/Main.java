package MapsComporators.Comporator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ForComp st1 = new ForComp("John", 7);
        ForComp st2 = new ForComp("Nathan", 4);
        ForComp st3 = new ForComp("Alex", 3);
        ForComp st4 = new ForComp("Steve", 9);
        ForComp st5 = new ForComp("Mark", 6);

        List<ForComp> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        students.sort(new PersName());
        System.out.println(students);

        students.sort(new PersNum());
        System.out.println(students);
    }
}
