package SS9.bai1;

import java.util.Scanner;

public class Student {
    private String studentCode;
    private String studentName;
    private int age;
    private String major;

    public Student() {
    };

    public Student(String studentCode, String studentName, int age, String major) {
        this.studentCode = studentCode;
        this.studentName = studentName;
        this.age = age;
        this.major = major;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    //phuong thuc nhap thong tin
    public void inputData(Scanner scanner){
        System.out.println("Nhap vao ma sinh vien :");
        this.studentCode=scanner.nextLine();
        System.out.println("Nhap vao ten sinh vien :");
        this.studentName=scanner.nextLine();
        System.out.println("Nhap vao tuoi sinh vien :");
        this.age=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vao chuyen nghanh :");
        this.major=scanner.nextLine();
    }
    public void displayData(){
        System.out.printf("Ma sinh vien : %s,Ten sinh vien : %s,Tuoi sinh vien la : %d,Chuyen nghanh la :%s\n"
                ,this.studentCode,this.studentName,this.age,this.major);
    }
}
