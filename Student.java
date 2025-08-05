package SS10.bai4;

import java.util.Scanner;

public class Student{
    private String studentName;
private int id;

    public Student() {
    }

    public Student(String studentName, int id) {
        this.studentName = studentName;
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ID :"+id+"--Ten sinh vien :"+studentName;
    }

}
