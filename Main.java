import ss16_bai1.dao.StudentDao;
import ss16_bai1.dao.StudentDaoimpl;
import ss16_bai1.entity.Student;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("Tạo chương trình Java với menu như sau:\n" +
                    "1.Hiển thị danh sách sinh viên.\n" +
                    "2.Thêm mới sinh viên.\n" +
                    "3.Sửa sinh viên.\n" +
                    "4.Xóa sinh viên.\n" +
                    "5.Tìm kiếm sinh viên.\n" +
                    "6.Thoát .");
            System.out.println("Moi ban chon 1-6");
            int choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:displayData();
                    break;
                case 2:createStudent(scanner);
                    break;
                case 3:updateStudent(scanner);
                    break;
                case 4:deleteStudent(scanner);
                    break;
                case 5:finfById(scanner);
                    break;
                case 6:System.exit(0);
                break;
                default:
                    System.out.println("Moi ban chon 1-6");
            }
        }while (true);
    }
    public static final StudentDao studentDao=new StudentDaoimpl();
    public static void displayData(){
       List<Student>students= studentDao.findAll();
       students.forEach(System.out::println);
    }
    public static void createStudent(Scanner scanner){
        Student student=new Student();
        student.inputData(scanner);
       if (studentDao.addStudent(student)){
           System.out.println("Them thanh cong");
       }else System.out.println("Them that bai");
    }
    public static void updateStudent(Scanner scanner){

        System.out.println("Moi ban nhap studentId muon sua");
        int id=Integer.parseInt(scanner.nextLine());
      Student student =studentDao.findById(id);
      if (student!=null){
          student.inputData(scanner);
          if (studentDao.updateStudent(student)){
              System.out.println("Sua thanh cong");
          }else System.out.println("Cap nhat that bai");
      }else System.out.println("Khong tim thay");
    }
    public static void deleteStudent(Scanner scanner){
        System.out.println("Moi ban nhap studentId muon sua");
        int id=Integer.parseInt(scanner.nextLine());
        Student student=studentDao.findById(id);
        if (student!=null){
           if (studentDao.deleteStudent(student)){
               System.out.println("Xoa thanh cong");
           }else System.out.println("Xoa that bai");;
        }else System.out.println("Khong tim thay");
    }public static void finfById(Scanner scanner){
        System.out.println("Moi ban nhap vao id muon tim :");
        int id=Integer.parseInt(scanner.nextLine());
        Student student=studentDao.findById(id);
        if (student==null){
            System.out.println("Khong tim thay");
        }else System.out.println(student);
    }
}