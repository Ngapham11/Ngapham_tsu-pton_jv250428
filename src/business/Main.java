package business;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("\n*****************WORKSHOP MANAGEMENT*****************\n" +
                    "1. Danh sách workshop\n" +
                    "2. Thêm mới workshop\n" +
                    "3. Cập nhật workshop\n" +
                    "4. Xóa workshop\n" +
                    "5. Tìm kiếm workshop theo tên diễn giả\n" +
                    "6. Sắp xếp workshop theo ngày thực hiện\n" +
                    "7.Thoat\n");
            System.out.println("Moi ban nhap tu 1-7");
            int choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:workShopBusiness.displayWorkShop();
                    break;
                case 2:workShopBusiness.createWorkShop(scanner);
                    break;
                case 3:workShopBusiness.updateWorkShop(scanner);
                    break;
                case 4:workShopBusiness.deleteWorkShop(scanner);
                    break;
                case 5:workShopBusiness.findByName(scanner);
                    break;
                case 6:workShopBusiness.sortWorkShopByDate();
                    break;
                case 7:System.exit(0);
                    break;
                default:
                    System.out.println("Ban hay chon 1-7");
            }
        }while (true);
    }
}