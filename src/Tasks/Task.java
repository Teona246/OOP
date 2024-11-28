package Tasks;

import java.util.Objects;

public class Task implements Comparable<Task> {
    private String task;
    private Integer priority;
    private String category;

    public Task(String task, Integer priority, String category) {
        this.task = task;
        this.priority = priority;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Task: " + task + ", priority: " + priority + ", category: " + category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task1 = (Task) o;
        return Objects.equals(task, task1.task) && Objects.equals(priority, task1.priority) && Objects.equals(category, task1.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(task, priority, category);
    }

    @Override
    public int compareTo(Task otherTask) {
        if (this.priority.compareTo(otherTask.priority) == 0) {
            return this.category.compareTo(otherTask.category);
        } else {
            return Integer.compare(this.priority, otherTask.priority);

        }

    }
}
