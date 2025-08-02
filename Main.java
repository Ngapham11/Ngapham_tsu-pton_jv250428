package SS10.bai3;

import javax.xml.namespace.QName;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static LinkedList<Users>usersLinkedList=new LinkedList<>();
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        do {try {
            System.out.println("\n****MENU QUAN LY NGUOI DUNG****\n" +
                    "1.Them nguoi dung\n" +
                    "2.Xoa nguoi dung\n" +
                    "3.Hien thi danh sach nguoi dung\n" +
                    "4.Thoat\n");
            System.out.println("Lua chon cua ban la:");
            int choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1://them nguoi dung
                    System.out.println("Them nguoi dung");
                    String name=InputData.inputUserName(scanner);
                    String email=InputData.inputEmail(scanner);
                    String telephon=InputData.inputTelephon(scanner);
                    Users newUsers=new Users(name,email,telephon);
                    usersLinkedList.add(newUsers);
                    break;
                case 2:
                    System.out.println("Xoa nguoi dung");
                    System.out.println("Nhap ten nguoi dung muon xoa :");
                    String deleteName=InputData.inputUserName(scanner);
                    usersLinkedList.removeIf(users->users.getUserName().equals(deleteName));
                    System.out.println("Da xoa nguoi dung "+deleteName);

                    break;
                case 3:
                    System.out.println("Hien thi danh sach nguoi dung");
                    if (usersLinkedList.isEmpty()){
                        System.out.println("Danh sach rong");
                    }else {
                        for (Users users : usersLinkedList) {
                            users.displayUserData();
                        }
                    }
                    break;
                case 4:
                    System.exit(0);

                    break;
                default:
                    System.err.println("Hay nhap 1-4");
                    break;
            }
        }catch (Exception e){
            System.out.println("Hay nhap 1-4");
        }

        }while (true);
    }

}
