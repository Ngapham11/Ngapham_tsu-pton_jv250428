package SS12_bai3.main;

import SS12_bai3.business.OrderBusiness;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        do {
           try {
               System.out.println("*********************QUẢN LÝ ĐƠN HÀNG********************\n" +
                       "\n" +
                       "1.Thêm đơn hàng\n" +
                       "2.Hiển thị danh sách đơn hàng\n" +
                       "3.Cập nhật trạng thái đơn hàng theo mã đơn hàng\n" +
                       "4.Xóa đơn hàng theo mã đơn hàng\n" +
                       "5.Tìm kiếm đơn hàng theo tên khách hàng\n" +
                       "6.Thống kê tổng số đơn hàng\n" +
                       "7.Thống kê tổng doanh thu các đơn hàng có trạng thái Delivered\n" +
                       "8.Thống kê số lượng đơn hàng theo từng trạng thái\n" +
                       "9.Tìm kiếm đơn hàng có giá trị lớn nhất\n" +
                       "10.Thoát");
               System.out.println("Moi ban chon 1-10");
               int choice=Integer.parseInt(scanner.nextLine());
               switch (choice){
                   case 1:
                       OrderBusiness.addData(scanner);
                       break;
                   case 2:
                       OrderBusiness.sortOrderByValueDescending();
                       break;
                   case 3:OrderBusiness.updateOrderStatus(scanner);
                       break;
                   case 4:OrderBusiness.deleteOrder(scanner);
                       break;
                   case 5:OrderBusiness.findOrdersByCustomerName(scanner);
                       break;
                   case 6:OrderBusiness.sumOrder();
                       break;
                   case 7:OrderBusiness.sumOrderByDelivered();
                       break;
                   case 8:OrderBusiness.staticCountOrderByStatus();
                       break;
                   case 9:OrderBusiness.findMaxOrder();
                       break;
                   case 10:System.exit(0);
                   break;
                   default:
                       System.out.println("Moi ban chon 1-10");
               }
           }catch (Exception e){
               System.out.println("Nhap 1-10");
           }
        }while (true);
    }
}
