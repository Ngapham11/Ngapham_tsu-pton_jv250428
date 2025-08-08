package SS12_bai1.Main;

import SS12_bai1.business.ProductBusiness;
import SS12_bai1.entity.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
public static List<Product>products=new ArrayList<>();
    public static void main(String[] args) {
        Product product=new Product();
        ProductBusiness productBusiness=new ProductBusiness();

        Scanner scanner=new Scanner(System.in);
       try {
           do {
               System.out.println("\n*********************QUẢN LÝ SẢN PHẨM********************\n" +
                       "\n" +
                       "1.Thêm sản phẩm\n" +
                       "2.Danh sách sản phẩm\n" +
                       "3.Cập nhật sản phẩm theo mã sản phẩm\n" +
                       "4.Xóa sản phẩm theo mã sản phẩm\n" +
                       "5.Tìm kiếm sản phẩm theo tên\n" +
                       "6.Sắp xếp sản phẩm theo giá tăng dần\n" +
                       "7.Sắp xếp sản phẩm theo số lượng giảm dần\n" +
                       "8.Thoát");
               System.out.println("Moi ban chon tu 1-8");
               int choice=Integer.parseInt(scanner.nextLine());
               switch (choice){
                   case 1:productBusiness.createProduct(scanner);
                       break;
                   case 2:productBusiness.displayProduct();
                       break;
                   case 3:productBusiness.updateProduct(scanner,products);
                       break;
                   case 4:productBusiness.deleteProduct(scanner,products);
                       break;
                   case 5:productBusiness.findProducByProductName(scanner,products);
                       break;
                   case 6:productBusiness.sortProductUp(products);
                       break;
                   case 7:productBusiness.sortProductDown(products);
                       break;
                   case 8:System.exit(0);
                       break;
                   default:
                       System.err.println("Hay nhap tu 1-8");
               }
           }while (true);
       }catch (Exception e) {System.err.println("Ban nhap khong hop le");}
}
    }