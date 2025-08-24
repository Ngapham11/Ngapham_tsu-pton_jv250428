package business;

import dao.ProductDao;
import dao.ProductDaoImpl;
import entity.Product;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProductBusiness {
    public static final ProductDao productDao=new ProductDaoImpl();
    //lay danh sach
    public static void displayListProduct(){
       List<Product>products= productDao.findAll();
       products.forEach(System.out::println);
    }
    //them moi san pham
    public static void createProduct(Scanner scanner){
        Product product=new Product();
        product.inputData(scanner);
       if (productDao.addProduct(product)){
           System.out.println("Them thanh cong");
       }else System.out.println("Them that bai");;
    }
    //Cap nhat san pham
    public static void updateProduct(Scanner scanner){
        System.out.println("NHap ma san pham can sua");
        int id=Integer.parseInt(scanner.nextLine());
        Product product=productDao.findById(id);
        product.inputData(scanner);
        if (product!=null){
            if (productDao.updateProduct(product)){
                System.out.println("Sua thanh cong");
            }else System.out.println("Sua that bai");
        }else System.out.println("Khong tim thay");

    }
    //Xoa san pham
    public static void deleteProduct(Scanner scanner){
        System.out.println("Moi ban nhap vao ma san pham muon xoa :");
        int id=Integer.parseInt(scanner.nextLine());
        if (productDao.deleteProduct(id)){
            System.out.println("Xoa thanh cong");
        }else System.out.println("Xoa that bai");
    }
    //tim kiem theo ten
    public static void findByName(Scanner scanner){
        System.out.println("Nhap vao ten san pham muon tim :");
        String name=scanner.nextLine();
        List<Product>products=productDao.findByName(name);
        products.forEach(System.out::println);
    }
    public static void sortByPrice(){
        List<Product>products=productDao.findAll();
        products.stream().sorted(Comparator.comparing(Product::getProductPrice)).forEach(System.out::println);
    }

}
