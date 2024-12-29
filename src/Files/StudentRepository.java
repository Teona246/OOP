package Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class StudentRepository {
    private final Path filePath; // путь к файлу
    // ОТДЕЛЬНО СОХРАНЯТЬ ПРИСВОЕННЫЙ ПОСЛЕДНИЙ АЙДИ
    private final Path filePathId;
    private Long id;

    public StudentRepository(String file) {
        this.filePath = Path.of(file);
        this.filePathId = Path.of(file + "_id");
        id = 0L;

        try {
            if (!Files.exists(filePath)) {
                Files.createFile(filePath);
            }
            if (!Files.exists(filePathId)) {
                String field = Files.readString(filePathId);
                id = Long.parseLong(field);
            } else {
                Files.createFile(filePathId);
                Files.write(filePathId, id.toString().getBytes());
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void save(Student student) {
        student.setId(++id);
        try {
            Files.write(filePath, (student + "\n").getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println(e);
        }
        try {
            Files.write(filePathId, id.toString().getBytes());
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    public List<Student> findAll() {
        try {
            return Files.readAllLines(filePath).stream()
                    .map(Student::new)
                    .toList();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public Student findById (Long id) {
        return findAll().stream()
                .filter(student -> student.getId() == id)
                .findFirst().orElse(null);

    }
}
