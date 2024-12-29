package Files;

public class Student {
    private Long id;
    private String name;
    private String surname;
    private int age;

    public Student(String name, String surname, int age) {
        this.id = null;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return  id + ", " + name + ", " + surname + ", " + age;
    }
    public Student (String studentFromFile) {
        String[] parts = studentFromFile.split(",");
        this.id = Long.parseLong(parts[0]);
        this.name = parts[1];
        this.surname = parts[2];
        this.age = Integer.parseInt(parts[3]);

    }
}
