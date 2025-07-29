package SS9.bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//phuong thuc in sv
public class StudentManagenment {
    static List<Student> studentsList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("*********************QUẢN LÝ SINH VIÊN********************\n" +
                    "\n" +
                    "1.Hiển thị danh sách sinh viên\n" +
                    "\n" +
                    "2.Thêm sinh viên\n" +
                    "\n" +
                    "3.Cập nhật thông tin sinh viên theo mã sinh viên\n" +
                    "\n" +
                    "4.Xóa sinh viên theo mã sinh viên\n" +
                    "\n" +
                    "5.Tìm sinh viên theo tên sinh viên\n" +
                    "\n" +
                    "6.Thoát");
            System.out.println("Hay chon tu 1-6");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    displayListStudent();
                    break;
                case 2:
                    createStudent(scanner);
                    break;
                case 3:
                    updateStudent(scanner);
                    break;
                case 4:
                    deleteStudent(scanner);
                    break;
                case 5:
                  findStudentByStudentName(scanner);
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Chon tu 1-6");
            }
        } while (true);

    }

    public static void displayListStudent() {
        for (Student student : studentsList) {
            student.displayData();
        }
    }

    //phuong thuc them sv
    public static void createStudent(Scanner scanner) {
        System.out.println("Ban muon nhap bao nhieu sv?");
        int studentNumber = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < studentNumber; i++) {
            Student student = new Student();
            System.out.println("Nhap thong tin nhan vien thu " + (i + 1));
            student.inputData(scanner);
            studentsList.add(student);
        }

    }

    //tim doi tuong sv theo ma
    public static Student findStudentByStudentCode(String studentCode) {
        for (Student student : studentsList) {
            if (student.getStudentCode().equals(studentCode)) {
                return student;
            }
        }return null;
    }

    //cap nhat htong thin theo ma sv
    public static void updateStudent(Scanner scanner) {
        System.out.println("Hay nhap ma sv muon tim :");
        String studentCode = scanner.nextLine();
        Student student = findStudentByStudentCode(studentCode);
       if (student!=null)student.inputData(scanner);
       else System.out.println("Khong tim thay sv");
    }


    //xoa sv theo ma
    public static void deleteStudent(Scanner scanner) {
        System.out.println("Hay nhap vao ma sv muon xoa");
        String studentCode = scanner.nextLine();
        Student student = findStudentByStudentCode(studentCode);
        if (student!=null)studentsList.remove(student);
        else System.out.println("Khong tim thay sv muon xoa");

    }
    //tim sv theo ten
    public static void findStudentByStudentName(Scanner scanner){
        System.out.println("Hay nhap ten sv muon tim ");
        String studentName=scanner.nextLine();
        for (Student student : studentsList) {
            if (student.getStudentName().equals(studentName)){
                student.displayData();
            }
        }
    }
}

