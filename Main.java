package SS11.bai2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student>students= Arrays.asList(
                new Student("Alice",20,8.5),
                new Student("Bob",22,6.0),
                new Student("Charlie",21,7.5),
                new Student("David",23,9.0),
                new Student("Eve",20,5.5),
                new Student("Frank",22,8.0),
                new Student("Grace",21,7.0)
        );
        List<Student>filteredStudents=students.stream()
                .filter(student -> student.getGrade()>7)
                .sorted(Comparator.comparing(Student::getName))
                .toList();
        filteredStudents.forEach(Student::displayStudent);
    }
}
