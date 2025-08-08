package SS12_bai1.business;

import SS12_bai1.entity.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProductBusiness {
    public List<Product>products=new ArrayList<>();
    public void createProduct(Scanner scanner){
        Product product=new Product();
        product.inputData(scanner,products);
        products.add(product);
    }
    public void displayProduct(){
        for (Product product : products) {
            System.out.println("*"+product+"\n");
        }
    }
//cap nhat san pham theo ma
    public   void updateProduct(Scanner scanner,List<Product>products){
        System.out.println("Moi ban nhap id cua product muon cap nhat :");
       Product product=findProductByProductId(scanner,products);
       if (product!=null) {
           product.inputData(scanner, products);
       }
    }
  //xoa theo ma
    public void deleteProduct(Scanner scanner,List<Product>products){
        System.out.println("Moi ban nhap id cua product muon xoa :");
        Product product=findProductByProductId(scanner,products);
        products.remove(product);
    }
  //tim kiem theo ten
    public void findProducByProductName(Scanner scanner,List<Product>products){
        String productName=scanner.nextLine();
        boolean check=false;
        for (Product product : products) {
            if (product.getProductName() .equals(productName)){
                System.out.println(product);
                check=true;
            }
        } if (!check)System.out.println("Khong tim thay");

    }
  //sap xep theo gia tang dan
    public void sortProductUp(List<Product>products){
        products.sort(Comparator.comparing(Product::getPrice));
    }
  //sap xep theo gia tang dan
public void sortProductDown(List<Product>products){
    products.sort(Comparator.comparing(Product::getPrice).reversed());
}
 //lay ra san pham theo ma
 public  Product findProductByProductId(Scanner scanner,List<Product>products){
     int productId=Integer.parseInt(scanner.nextLine());
     for (Product product : products) {
        if (product.getProductId()==productId){
            return product;
        }
     }return null;
 }
    public ProductBusiness() {
    }
}
