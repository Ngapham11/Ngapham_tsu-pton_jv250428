package SS12_bai2.main;

import SS12_bai2.bisiness.AppointmentBusiness;
import SS12_bai2.entity.Appointment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
public static List<Appointment>appointments=new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        do {try {
            System.out.println("\n*********************QUẢN LÝ LỊCH HẸN********************\n" +
                    "\n" +
                    "1.Thêm lịch hẹn\n" +
                    "2.Hiển thị danh sách lịch hẹn\n" +
                    "3.Tìm kiếm lịch hẹn theo tên bệnh nhân\n" +
                    "4.Cập nhật lịch hẹn theo mã lịch hẹn\n" +
                    "5.Xóa lịch hẹn theo mã lịch hẹn\n" +
                    "6.Thống kê\n" +
                    "7.Thoát");
            System.out.println("Moi ban chon tu 1-6");
            int choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:AppointmentBusiness.addAppointment(scanner);
                    break;
                case 2:AppointmentBusiness.appointmentsList(scanner);
                    break;
                case 3:AppointmentBusiness.findAppointmentbyPatientName(scanner,appointments);
                    break;
                case 4:AppointmentBusiness.uppdate(scanner);
                    break;
                case 5:AppointmentBusiness.delete(scanner);
                    break;
                case 6:AppointmentBusiness.sataticSumAppointMent();
                    AppointmentBusiness.staticCountAppointmentByDoctor();
                    break;
                case 7:System.exit(0);
                break;
                default:
                    System.err.println("Moi ban nhap tu 1-6");
            }
        }catch (Exception e){
            System.out.println("Moi nhap lai");
        }

        }while (true);
    }
}
