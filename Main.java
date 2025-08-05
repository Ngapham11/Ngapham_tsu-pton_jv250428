package SS10.bai4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
   public static List<Student>studentList=new ArrayList<>();
    public static void main(String[] args) {
        AttendanceManager manager=new AttendanceManager();
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("\n******MENU QUAN LY DIEM DANH*******\n" +
                    "1.Them sinh vien\n" +
                    "2.Sua sinh vien\n" +
                    "3.Xoa sinh vien\n" +
                    "4.Hien thi danh sach sinh vien\n" +
                    "5.Thoat\n");
            System.out.println("Hay chon 1-5");
            int choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Moi ban nhap ten :");
                    String name=scanner.nextLine();
                    System.out.println("Moi ban nhap ID :");
                    int id=Integer.parseInt(scanner.nextLine());
                    Student student=new Student(name,id);
                    manager.add(student);
                    break;
                case 2:
                    int index=-1;
                    System.out.println("Nhap id sinh vien muon sua :");
                    int updateId=Integer.parseInt(scanner.nextLine());
                    for (int i=0;i<studentList.size();i++){
                       if (studentList.get(i).getId()==updateId){
                          index=i;
                       }
                    }if (index==-1){
                    System.out.println("Khong tim thay sv can sua");
                }else {
                    System.out.println("Nhap ten :");
                        String newName =scanner.nextLine();
                    System.out.println("Nhap id :");
                    int newId=Integer.parseInt(scanner.nextLine());
                        manager.update(index,new Student(newName,newId));
                }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:System.exit(0);
                    break;
                default:
                    System.err.println("Hay nhap tu 1-5");
            }
        }while (true);
    }
    //phuong thuc add

}
