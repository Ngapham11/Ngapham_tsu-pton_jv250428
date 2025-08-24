package entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Product {
    private int productId;
    private String productName;
    private float productPrice;
    private String productTitle;
    private LocalDate productCreated;
    private String productCatalog;
    private boolean productStatus;

    public Product() {
    }

    public Product(int productId, String productName, float productPrice, String productTitle, LocalDate productCreated, String productCatalog, boolean productStatus) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productTitle = productTitle;
        this.productCreated = productCreated;
        this.productCatalog = productCatalog;
        this.productStatus = productStatus;
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

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public LocalDate getProductCreated() {
        return productCreated;
    }

    public void setProductCreated(LocalDate productCreated) {
        this.productCreated = productCreated;
    }

    public String getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(String productCatalog) {
        this.productCatalog = productCatalog;
    }

    public boolean isProductStatus() {
        return productStatus;
    }

    public void setProductStatus(boolean productStatus) {
        this.productStatus = productStatus;
    }
    public void inputData(Scanner scanner){
        System.out.println("Moi ban nhap ten san pham :");
        this.productName=scanner.nextLine();
        System.out.println("Moi ban nhap gia san pham :");
        this.productPrice=Float.parseFloat(scanner.nextLine());
        System.out.println("Moi ban nhap tieu de san pham :");
        this.productTitle=scanner.nextLine();
        System.out.println("Moi ban nhap ngay tao san pham :");
        this.productCreated=LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println("Moi ban nhap danh muc san pham :");
        this.productCatalog=scanner.nextLine();
        System.out.println("Moi ban nhap trang thai san pham :");
        this.productStatus=Boolean.parseBoolean(scanner.nextLine());
    }

    @Override
    public String toString() {
        return String.format("Ma san pham :%d --Ten sp:%s --Gia sp:%f --Tieu de san pham :%s --Ngay tao sp:%s --Danh muc sp:%s --Trang thai sp:%s",
                this.productId,this.productName,this.productPrice,this.productTitle,this.productCreated,this.productCatalog,
                this.productStatus);
    }
}
