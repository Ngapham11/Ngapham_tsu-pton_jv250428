package ss16_bai1.entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Student {
    private int studentId;
    private String studentName;
    private LocalDate date;
    private String email;

    public Student() {
    }

    public Student(int studentId, String studentName, LocalDate date, String email) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.date = date;
        this.email = email;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void inputData(Scanner scanner){
        System.out.print("Moi ban nhap ten ");
        this.studentName=scanner.nextLine();
        System.out.println("Moi ban nhap ngay :");
        this.date=LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println("Moi ban nhap email :");
        this.email=scanner.nextLine();
    }

    @Override
    public String toString() {
        return String.format("Ma sinh vien :%d--Ten sinh vien :%s--Ngay sinh :%s--Email :%s ",
                this.studentId,this.studentName,this.date,this.email);
    }
}
