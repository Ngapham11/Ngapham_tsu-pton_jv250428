import java.util.Scanner;

public class SS5_bai3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap ma don hang :");
        String code=scanner.nextLine();
        System.out.println("Nhap so dien thoai :");
        String phone=scanner.nextLine();
        System.out.println("Nhap gia san pham :");
        String price=scanner.nextLine();
        String replacedCode=code.replaceAll("[0-9]","*");
        String replacedPhone=phone.replaceAll("[0-9]","*");
        String replacedPrice=price.replaceAll("[0-9]","*");
        System.out.println(" ma don hang :"+replacedCode);
        System.out.println(" so dien thoai :"+replacedPhone);
        System.out.println(" gia san pham :"+replacedPrice);
    }
}
