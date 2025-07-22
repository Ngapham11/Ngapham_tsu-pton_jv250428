import java.util.Scanner;
import java.util.regex.Pattern;

public class SS6_bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fullName = "";
        String email = "";
        String phone = "";
        String passwork = "";
        do {
            System.out.println("****QUAN LY NGUOI DUNG****");
            System.out.println("1.Nhập thông tin người dùng\n" +
                    "2.Chuẩn hóa họ tên\n" +
                    "3.Kiểm tra email hợp lệ\n" +
                    "4.Kiểm tra số điện thoại hợp lệ\n" +
                    "5.Kiểm tra mật khẩu hợp lệ\n" +
                    "6.Thoát");
            System.out.println("Moi ban chon tu 1-6");
            int choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Moi ban nhap ho va ten :");
                    fullName=scanner.nextLine();
                    System.out.println("Moi ban nhap email :");
                    email=scanner.nextLine();
                    System.out.println("Moi ban nhap password :");
                    passwork=scanner.nextLine();
                    System.out.println("Moi ban nhap vao so dien thoai :");
                    phone=scanner.nextLine();

                    break;
                case 2:
                    String fullNameShort=fullName.strip().replaceAll("\\s+"," ");//thay tat ca khoang trang,bao gom ca dau tap
                    // chuyen chuoi thanh mang
                    String [] arrayFullName=fullNameShort.split(" ");
                    StringBuilder stStandard=new StringBuilder();
                    for (int i=0;i<arrayFullName.length;i++){
                         stStandard.append(Character.toUpperCase(arrayFullName[i].charAt(0))).append(arrayFullName[i].substring(1).toLowerCase()).append(" ");

                    }   System.out.println("Ho ten sau khi format "+stStandard.toString());
                    break;
                case 3:
                    String regexEmail="^[a-zA-Z\\d.-]{3,}@[a-zA-Z\\d]{3,}.[a-zA-Z]{2,3}$";
                    if (Pattern.matches(regexEmail,email)){
                        System.out.println("email hop le");
                    }else System.out.println("email khong hop le");
                    break;
                case 4:
                    String regexPhone="/(84|0[3|5|7|8|9])+([0-9]{8})\\b/g";
                    if (Pattern.matches(regexPhone,phone)){
                        System.out.println("So dien thoai hop le");
                    }else System.out.println("So dien thoai khong hop le");
                    break;
                case 5:
                    String regexPassword="/^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$/";
                    if (Pattern.matches(regexPassword,passwork))
                    {System.out.println("Mat khau hop le");
                    } else{
                        System.out.println("Mat khau khong hop le");

                    }
                    break;
                case 6:
                    System.exit(0);
            }
        }while (true);

    }
}
