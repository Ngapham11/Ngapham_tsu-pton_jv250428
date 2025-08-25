package business;

import dao.WorkShopDao;
import dao.WorkShopDaoimpl;
import entity.WorkShop;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class workShopBusiness {
    private static final WorkShopDao workShopDao=new WorkShopDaoimpl();
    public static void displayWorkShop(){
        List<WorkShop> workShopList=workShopDao.findAll();
        workShopList.forEach(System.out::println);
    }
    public static void createWorkShop(Scanner scanner){
        WorkShop workShop=new WorkShop();
        workShop.inputData(scanner);
        if (workShopDao.save(workShop)){
            System.out.println("Them thanh cong");
        }else System.out.println("Them that bai");
    }
    public static void updateWorkShop(Scanner scanner){
        System.out.println("Nhap vao ma workshop can sua");
        int id=Integer.parseInt(scanner.nextLine());
        WorkShop workShop=workShopDao.findById(id);
        if (workShop!=null){
            workShop.inputData(scanner);
            if (workShopDao.update(workShop)){
                System.out.println("Sua thanh cong");
            }else System.out.println("Sua that bai");
        }else System.out.println("Khong tim thay");

    }public static void deleteWorkShop(Scanner scanner){
        System.out.println("Moi ban nhap ma workshop muon xoa");
        int id=Integer.parseInt(scanner.nextLine());
        WorkShop workShop=workShopDao.findById(id);
        if (workShop!=null){
            workShop.inputData(scanner);
            if (workShopDao.delete(id)){
                System.out.println("Xoa thanh cong");
            }else System.out.println("Xoa that bai");
        }else System.out.println("Khong tim thay");

    }
    public static void findByName(Scanner scanner){
        System.out.println("Moi ban nhap ten muon tim");
        String name=scanner.nextLine();
        List<WorkShop>workShopList=workShopDao.findByName(name);
        workShopList.forEach(System.out::println);
    }
    public static void sortWorkShopByDate(){
        List<WorkShop>workShopList=workShopDao.findAll();
        workShopList.stream().sorted(Comparator.comparing(WorkShop::getDateImplement)).forEach(System.out::println);
    }
}
