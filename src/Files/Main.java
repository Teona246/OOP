package Files;

public class Main {
    public static void main(String[] args) {
        StudentRepository studentRepository = new StudentRepository("src/Files/students.txt");

        Student student = new Student("Ivan", "Ivanov", 30);
        Student student1 = new Student("Petr", "Petrov", 31);
        Student student2 = new Student("Sergey", "Sergeev", 32);

        studentRepository.save(student);
        studentRepository.save(student1);
        studentRepository.save(student2);


        System.out.println(studentRepository.findAll());
    }
}
