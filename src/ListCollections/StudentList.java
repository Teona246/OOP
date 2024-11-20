package ListCollections;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Inna");
        students.add("Aleksey");
        students.add("Oleg");
        students.add("Slava");
        students.add("Sergey");
        System.out.println(students);

        List<String> newStudents = new ArrayList<>();
        newStudents.add("Alik");
        newStudents.add("Andrey");
        newStudents.add("Olga");
        System.out.println(newStudents);

        students.addAll(newStudents);
        System.out.println(students);

        students.remove("Alik");
        students.remove(4);
        System.out.println(students);

        System.out.println("Есть ли Ольга в списке - " + students.contains("Olga"));

        List<String> badStudents = new ArrayList<>();
        badStudents.add("John");
        badStudents.add("Julia");

        System.out.println("Есть ли в списке Джон и Джулия - " + students.containsAll(badStudents));

        System.out.println("Student class size - " + students.size());
        System.out.println("Student class is empty - " + students.isEmpty());

        students.clear();
        System.out.println("Student class is empty - " + students.isEmpty());


    }
}
