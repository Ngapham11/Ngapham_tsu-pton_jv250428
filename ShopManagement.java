package SS9.bai3.presentation;

import SS9.bai3.entity.Category;
import SS9.bai3.entity.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShopManagement {
    private static final List<Category>categories=new ArrayList<>();
    private static final List<Product>products=new ArrayList<>();
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("******************SHOP MENU*******************\n" +
                    "\n" +
                    "1.Quản lý danh mục sản phẩm\n" +
                    "\n" +
                    "2.Quản lý sản phẩm\n" +
                    "\n" +
                    "3.Thoát");
            System.out.println("Moi ban lua chon 1-3");
            int choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:boolean back=true;
                    do {
                        System.out.println(" \n" +
                                "\n" +
                                "********************CATEGORIES MENU***********\n" +
                                "\n" +
                                "1.Nhập thông tin các danh mục\n" +
                                "\n" +
                                "2.Hiển thị thông tin các danh mục\n" +
                                "\n" +
                                "3.Cập nhật thông tin danh mục\n" +
                                "\n" +
                                "4.Xóa danh mục\n" +
                                "\n" +
                                "5.Cập nhật trạng thái danh mục\n" +
                                "\n" +
                                "6.Thoát");
                        System.out.println("Moi ban nhap 1-6");
                        int choiceCategoryMenu=Integer.parseInt(scanner.nextLine());

                        switch (choiceCategoryMenu){
                            case 1:createCategory(scanner);
                                break;
                            case 2:displayCategoryMenu();
                                break;
                            case 3:
                                Category category;
                                updateCategory(scanner);
                                break;
                            case 4:deleteCategory(scanner);
                                break;
                            case 5:updateCatalogStatus(scanner);
                                break;
                            case 6:
                                back=false;
                                break;
                            default:
                                System.err.println("Moi ban nhap tu 1-6");
                        }
                    }while (back);
                      break;
                case 2:
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Hay chon tu 1-3");
            }
        }while (true);
    }
    //them danh muc
    public static void createCategory(Scanner scanner){
        System.out.println("Ban muon nhap bao nhieu danh muc :");
        int numberCategory=Integer.parseInt(scanner.nextLine());
        for (int i=0;i<numberCategory;i++){
            Category category=new Category();
            category.inputData(scanner,categories);
            categories.add(category);
        }
    }
    //hien thi danh sach danh muc
    public static void displayCategoryMenu(){
        System.out.println("Danh sach danh muc :");
        for (Category category : categories) {
            category.displayData();
        }
    }
    //cap nhat thong tin danh muc
    public static void updateCategory(Scanner scanner){
        System.out.println("Nhap id cua danh muc muon cap nhat :");
        int updateCategoryId=Integer.parseInt(scanner.nextLine());
        Category category=getCategoryById(categories,updateCategoryId);
        if (category!=null){
            category.inputData(scanner,categories);
        }else System.out.println("Khong tim thay ");
    }
    //xoa danh muc
    public static void deleteCategory(Scanner scanner){
        System.out.println("Nhap ma danh muc muon xoa :");
        int deleteCategoryId=Integer.parseInt(scanner.nextLine());
        Category category=getCategoryById(categories,deleteCategoryId);
        if (category!=null){
            categories.remove(category);
        }else System.out.println("Khong tim thay");
    }
    //cap nhat trang thai
    public static void updateCatalogStatus(Scanner scanner){
        System.out.println("Nhap ma danh muc muon update trang thai :");
        int id=Integer.parseInt(scanner.nextLine());
        Category category=getCategoryById(categories,id);
        if (category!=null){
            boolean categoryStatus=Boolean.parseBoolean(scanner.nextLine());
            category.setCatalogStatus(categoryStatus);
        }
    }
    //Hien thi danh muc theo ma id
    public static Category getCategoryById(List<Category>categories,int catalogId){
        for (Category category : categories) {
            if (category.getCataLogId()==catalogId){
                return category;
            }
        }return null;
    }
}
