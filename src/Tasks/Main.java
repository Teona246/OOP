package Tasks;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<Task> task = new PriorityQueue<>();

        task.offer(new Task("Task1", 3, "Bug"));
        task.offer(new Task("Task2", 2, "Feature"));
        task.offer(new Task("Task3", 3, "Documentation"));
        task.offer(new Task("Task4", 1, "Documentation"));
        task.offer(new Task("Task5", 3, "Bug"));
        task.offer(new Task("Task6", 2, "Bug"));
        task.offer(new Task("Task7", 1, "Feature"));

        System.out.println(task);

        System.out.println(task.poll());
        System.out.println(task.poll());
        System.out.println(task.poll());
        System.out.println(task.poll());
        System.out.println(task.poll());
        System.out.println(task.poll());
        System.out.println(task.poll());
    }
}
