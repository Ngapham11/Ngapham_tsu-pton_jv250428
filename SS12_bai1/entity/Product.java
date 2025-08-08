package SS12_bai1.entity;

import java.util.List;
import java.util.Scanner;

public class Product {
    private int productId;
    private String productName;
    private double price;
    private String category;
    private int quantity;

    public Product() {
    }

    public Product(int productId, String productName, double price, String category, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void inputData(Scanner scanner,List<Product>products){
        this.productId=products.size()+1;
        System.out.println("Moi ban nhap ten san pham :");

       try {boolean check=false;
           do {
               String productName=scanner.nextLine();
               int lg=productName.length();
               if (lg<10||lg>50){
                   System.err.println("Ten phai chua 10-50 ki tu");
                  check=true;
                  continue;

               }if (checkChar(productName)){
                   System.out.println("Ki tu khong duoc trung lap");
                  check=true;
                  continue;
               }
               this.productName=productName;
               check=false;
           }while (check);
       }catch (Exception e){
           System.err.println("Ban nhap khong hop le!!");
       }
        System.out.println("Moi ban nhap gia san pham :");
       do {
           try {
               double price = Double.parseDouble(scanner.nextLine());
               if (price > 0) {
                   this.price = price;
                   break;
               } else System.err.println("Gia tri ban nhap khong hop le!");

           } catch (Exception e) {
               System.out.println("Ban nhap khong hop le!!");
           }
       }while (true) ;
           System.out.println("Moi ban nhap loai san pham");
           try {
               do {
                   String category = scanner.nextLine();
                   if (category.length() <= 200) {
                       this.category = category;
                       break;
                   } else System.err.println("Gia tri ban nhap khong hop le!");
               } while (true);
           } catch (Exception e) {
               System.out.println("Ban nhap khong hop le!!");
           }
           System.out.println("Nhap so luong ton kho :");
           try {
               do {
                   int quantity = Integer.parseInt(scanner.nextLine());
                   if (quantity >= 0) {
                       this.quantity = quantity;
                       break;
                   } else System.err.println("So ban nhap khong hop le");
               } while (true);

           } catch (Exception e) {
               System.out.println("Ban nhap khong hop le");
           }

       }
    private boolean checkChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return true; // có ký tự trùng
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Ma san pham la :"+productId+"--Ten san pham la:"+productName+"--Gia san pham la:"+price+"--Loai san pham la:"+category;
    }
//
//    public void displayProductId(){
//        System.out.printf("Ma san pham la :%s--Ten san pham la:%s--Gia san pham la:%f--Loai san pham la:%s\n",this.productId,this.productName,this.price,this.quantity);
//    }


}
