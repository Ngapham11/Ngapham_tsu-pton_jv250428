package SS11.bai4;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static HashMap<Integer,Product>productHashMap=new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("****Product Management System****");
            System.out.println("1.Add Product\n" +
                    "2.Edit Product\n" +
                    "3.Delete Product\n" +
                    "4.Display Products\n" +
                    "5.Filter Products(Price>100)\n" +
                    "6.Total Value of Products\n" +
                    "7.Thoat\n");
            System.out.println("Moi ban chon 1-7");
            int choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:add(scanner);
                    break;
                case 2:editProduct(scanner);
                    break;
                case 3:deleteProduct(scanner);
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Hay chon 1-7");
            }
        }while (true);

    }public static void add(Scanner scanner){
        System.out.println("Moi ban nhap id");
        int id=Integer.parseInt(scanner.nextLine());
        System.out.println("Moi ban nhap ten :");
        String name=scanner.nextLine();
        System.out.println("Moi ban nhap so tien :");
        double price=Double.parseDouble(scanner.nextLine());
        Product product=new Product(id,name,price);
        productHashMap.put(id,product);
    }
    public static void editProduct(Scanner scanner){
        System.out.println("Nhap vao id cua product muon sua :");
        int id=Integer.parseInt(scanner.nextLine());
        if (productHashMap.containsKey(id)){
            System.out.println("Nhap thong tin muon sua");
            System.out.println("Nhap ten:");
            String name=scanner.nextLine();
            System.out.println("Nhap gia tien :");
            double price=Double.parseDouble(scanner.nextLine());
            productHashMap.put(id,new Product(id,name,price));
            System.out.println("Da them");
        }else {
            System.out.println("Khong tim thay product muon sua");
        }
    }public static void deleteProduct(Scanner scanner){
        System.out.println("Nhap id cua product can xoa :");
        int id=Integer.parseInt(scanner.nextLine());
        productHashMap.remove(id);
    }
}
