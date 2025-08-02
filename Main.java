package SS10.bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static  List<Student> studentList=new ArrayList<>();
    public  static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String choice;
       do {
           String name=InputData.inputName(scanner);
           int age=InputData.inputAge(scanner);
           double score=InputData.inputScore(scanner);
           Student student=new Student(name,age,score);
           studentList.add(student);
           System.out.print("Bạn có muốn nhập thêm sinh viên không? (Y/N): ");
           choice = scanner.nextLine();


       }while (choice.equalsIgnoreCase("Y"));
        displayStudentList();
    }

    public static void displayStudentList(){
        if (studentList.isEmpty()){
            System.out.println("Danh sach rong");
        }else {
            for (Student student : studentList) {
                student.displayStudent();
            }
        }
    }
}
