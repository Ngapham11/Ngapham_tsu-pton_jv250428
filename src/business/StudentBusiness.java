package business;

import dao.StudentDao;
import dao.StudentDaoimpl;
import entity.Student;

import java.util.Scanner;

public class StudentBusiness {
   public static StudentDao studentDao=new StudentDaoimpl();
    //them sv
    public static void createStudent(Scanner scanner){
        Student student=new Student();
        student.inputData(scanner);
        if (studentDao.save(student)){
            System.out.println("them thanh cong");
        }else System.out.println("Them moi that bai");

    }
    public static void updateStudent(Scanner scanner){
        System.out.println("Moi nhap ma sv muon sua :");
        int id=Integer.parseInt(scanner.nextLine());
        Student student=studentDao.findById(id);
        student.inputData(scanner);
        if (studentDao.update(student)){
            System.out.println("Sua thanh cong");
        }else System.out.println("Sua that bai");
    }
    public static void deleteByAge(Scanner scanner){
        System.out.println("Ban muon xoa hoc sinh duoi bao nhieu tuoi ?");
        int where_age=Integer.parseInt(scanner.nextLine());
        if (studentDao.deleteByAge(where_age)){
            System.out.println("Xoa thanh cong");
        }else System.out.println("Xoa that bai");
    }
}
