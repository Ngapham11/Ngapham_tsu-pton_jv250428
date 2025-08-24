package business;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        do {
            try {
                System.out.println("********************PRODUCT MANAGEMENT****************\n" +
                        "\n" +
                        "1.Danh sách sản phẩm\n" +
                        "2.Thêm mới sản phẩm\n" +
                        "3.Cập nhật sản phẩm\n" +
                        "4.Xóa sản phẩm\n" +
                        "5.Tìm kiếm sản phẩm theo tên sản phẩm\n" +
                        "6.Sắp xếp sản phẩm theo giá tăng dần\n" +
                        "7.Thoát");
                System.out.println("Moi ban nhap 1-7");
                int choice=Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1:
                      ProductBusiness.displayListProduct();
                        break;
                    case 2:ProductBusiness.createProduct(scanner);
                        break;
                    case 3:ProductBusiness.updateProduct(scanner);
                        break;
                    case 4:ProductBusiness.deleteProduct(scanner);
                        break;
                    case 5:ProductBusiness.findByName(scanner);
                        break;
                    case 6:ProductBusiness.sortByPrice();
                        break;
                    case 7:System.exit(0);
                    default:
                        System.out.println("Moi ban chon 1-7");
                }
            }catch (Exception e){
                System.out.println("Ban hay nhap lai");
            }

        }while (true);
    }
}