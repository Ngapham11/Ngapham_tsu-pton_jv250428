package SS12_bai3.business;

import SS12_bai3.entity.Order;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class OrderBusiness {
    public static List<Order>orders=new ArrayList<>();

    Scanner scanner=new Scanner(System.in);
    //Them don hang
    public static void addData(Scanner scanner){
        Order order=new Order();
        order.inputData(scanner,orders);
        orders.add(order);
    }
    //Hien thi danh sach don hang ,theo gia tri don hang giam dan
    public static void sortOrderByValueDescending(){
        orders.stream().sorted(Comparator.comparing(Order::getOrderAmount).reversed())
                .forEach(System.out::println);
    }
    //Cap nhat trang thai don hang
    public static void updateOrderStatus(Scanner scanner){
        List<String> listStatus =Arrays.asList("Pending", "Shipper", "Delivered");
        System.out.println("Moi ban nhap ma don hang muon cap nhat :");
        try {
            int orderId=Integer.parseInt(scanner.nextLine());
            orders.stream().filter(o -> o.getOrderId()==orderId  ).findFirst()
                    .ifPresentOrElse(order -> {
                        System.out.println("Moi ban nhap status moi :");
                        String newStatus=scanner.nextLine();
                        int currentIndex=listStatus.indexOf(order.getStatus());
                        int newIndex=listStatus.indexOf(newStatus);
                        if (newIndex==currentIndex+1){
                            order.setStatus(newStatus);
                        }else System.out.println("Hay nhap lai status");
                    },()->{
                        System.out.println("Khong tim thay");
                    });
        }catch (Exception e){
            System.out.println("Moi ban nhap lai ma id");
        }



    }
    //xoa don hang
    public static void deleteOrder(Scanner scanner){

       while (true){
           try {
               System.out.println("Moi nhap ma hang can xoa :");
              int  orderId=Integer.parseInt(scanner.nextLine());
              Optional<Order>orderOpt= orders.stream().filter(o -> o.getOrderId()==orderId).findFirst();
              orderOpt.ifPresentOrElse(order -> {
                   if (!order.getStatus().equals("Pending")){
                       System.err.println("chi duoc xoa khi o trang thai 'Pending'");
                   }
               else {orders.remove(order);
                   System.out.println("Da xoa thanh cong ma"+orderId);}
               },()->{
                   System.out.println("Khong tim thay");
               });
               break;
           }catch (Exception e){
               System.out.println("Nhap lai ma hang can xoa");

           }

       }
    }
    //tim kiem don hang theo ten
    public static Order findOrdersByCustomerName(Scanner scanner){
        System.out.println("Moi ban nhap ten :");
        String customerName=scanner.nextLine();
        Optional<Order>orderOpt=orders.stream().filter(o->o.getCustomerName().equals(customerName)).findFirst();
        return orderOpt.orElse(null);
    }
    //thong ke ,tong don hang, tong doanh thu,so luong don theo tung trang thai
    //thong ke theo tong don hang
    public static void sumOrder(){
        System.out.println("Tong don hang la :"+orders.size());
    }
    //theo tong doanh thu tu cac don 'Delivered'
    public static void sumOrderByDelivered(){
        List<Order>orderList=orders.stream().filter(o->o.getStatus().equals("Delivered")).toList();
       float sum=0;
        for (Order order : orderList) {
            sum+=order.getOrderAmount();
        }
        System.out.println("Tong doanh thu la :"+sum);
    }
    //so luong don theo tung trang thai
    public static void staticCountOrderByStatus(){
        Map<String,Long>mapStatic=orders.stream().collect(Collectors.groupingBy(Order::getStatus,Collectors.counting()));
        for (Map.Entry<String,Long>entry:mapStatic.entrySet()){
            System.out.printf("Trang thai :%s--co so don la :%d\n",entry.getKey(),entry.getValue());
        }
    }
    //tim don hang co gia tri lon nhat
    public static Order findMaxOrder(){
        Order maxOrder=orders.get(0);
        for (Order order : orders) {
            if (maxOrder.getOrderAmount()<order.getOrderAmount()){
                maxOrder=order;
            }
        }return maxOrder;
    }
}
