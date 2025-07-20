import java.util.Scanner;

public class SS3_bai1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ten khach hang");
        String name=scanner.nextLine();
        System.out.println("Ten san pham");
        String productName=scanner.nextLine();
        System.out.println("Gia san pham");
        double price= scanner.nextDouble();
        System.out.println("So luong mua ");
        int quantity=scanner.nextInt();
        System.out.println(" khach hang co the thanh vien khong?");
        boolean member=scanner.nextBoolean();
        // chuong trinh thuc hien nhu sau:
        System.out.println(member);
        double totalPrice=price*quantity;
        double vat=totalPrice*0.08;

       //in thong tin
        System.out.println("Ten khach hang la : "+ name);
        System.out.println("Ten san pham la : "+productName);
        System.out.println("Gia san pham la : "+price);
        System.out.println("So luong mua la :"+quantity);
        System.out.println("Thanh tien :"+totalPrice);

        System.out.printf("Tien vat la : %.2f%n",vat);
        if (member){
            System.out.println("Giam gia "+totalPrice*0.1);
            double memberPrice=totalPrice-(totalPrice*0.1)+vat;
            System.out.printf("Tong tien thanh toan la :%.2f",memberPrice);
        }else {
            double notMember=totalPrice+vat;
            System.out.printf("Tong tien thanh toan la :%.2f",notMember);
        }
    }
}
