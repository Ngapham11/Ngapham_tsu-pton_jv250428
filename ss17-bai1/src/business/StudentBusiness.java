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
}
