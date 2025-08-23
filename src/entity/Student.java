package entity;

import java.util.Scanner;

public class Student {
    private int id;
    private String studentName;
    private int age;

    public Student() {
    }

    public Student(int id, String studentName, int age) {
        this.id = id;
        this.studentName = studentName;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void inputData(Scanner scanner){
        System.out.println("Moi ban nhap ten :");
        this.studentName=scanner.nextLine();
        System.out.println("Moi ban nhap tuoi :");
        this.age=Integer.parseInt(scanner.nextLine());
    }
}
