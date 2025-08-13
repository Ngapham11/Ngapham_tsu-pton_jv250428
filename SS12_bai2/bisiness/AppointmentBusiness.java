package SS12_bai2.bisiness;

import SS12_bai2.entity.Appointment;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class AppointmentBusiness {
    public AppointmentBusiness() {
    }

    public static List<Appointment>appointments=new ArrayList<>();
    //them lich hen moi
    public static void addAppointment (Scanner scanner){
        Appointment appointment=new Appointment();
        appointment.inputData(scanner);
        appointments.add(appointment);
    }
    //Hien thi danh sach lich hen kham
    public static void appointmentsList(Scanner scanner){
        Appointment appointment=new Appointment();
        System.out.println("Danh sach lich hen la :");
        appointments.stream().sorted(Comparator.comparing(Appointment::getAppointmentDate)).
       forEach(System.out::println);
    }
    //tim kiem theo ten benh nhan
    public static void findAppointmentbyPatientName(Scanner scanner,List<Appointment>appointments){

           System.out.println("Moi nhap ten benh nhan :");
           String patientName=scanner.nextLine().trim();
         List<Appointment>patientNameList=appointments.stream()
                         .filter(a->a.getPatientName().toLowerCase().contains(patientName.toLowerCase()))
                       .toList();
         if (patientNameList.isEmpty()){
             System.out.println("Khong tim thay");
         }else {
            System.out.println("Lich kham cua benh nhan :"+patientName);
            patientNameList.forEach(System.out::println);
        }
    }
    //cap nhat theo ma lich hen
    public static void uppdate(Scanner scanner){
        System.out.printf("Moi ban nhap ma lich hen can cap nhat :");
        String id=scanner.nextLine();
       appointments.stream()
                .filter(appointment->appointment.getAppointmentId().equals(id)).findFirst()
               .ifPresentOrElse(appointment ->{
                           System.out.println("Moi nhap ten :");
                           String name=scanner.nextLine();
                   appointment.setPatientName(name);
                           System.out.println("Moi nhap so dien thoai :");
                           String phone=scanner.nextLine();
                           appointment.setPhoneNumber(phone);
                           System.out.println("Moi nhap ngay hen :");
                           LocalDate date=LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                           appointment.setAppointmentDate(date);
                           System.out.println("Moi nhap bac sy :");
                           String doctor=scanner.nextLine();
                           appointment.setDoctor(doctor);
                       },()->{
                           System.out.println("Khong tim thay");
                       }
                       );
    }
    //xoa theo ma lich hen
    public static void delete(Scanner scanner){
        System.out.println("Moi ban nhap id can xoa");
        String appointmentId=scanner.nextLine();
        appointments.stream().filter(appointment -> appointment.getAppointmentId().equals(appointmentId)).findFirst()
                .ifPresentOrElse(appointment ->{
                    appointments.remove(appointment);
                },()->{
                    System.out.println("Khong tim thay");
                } );
    }
    //thong ke,tong so lich hen,so lich hen theo tung bs
    public static void sataticSumAppointMent(){
        System.out.println("Tong so lich hen la :"+appointments.size());
    }
    public static void staticCountAppointmentByDoctor(){
        Map<String,Long>mapStatic=appointments.stream()
                .collect(Collectors.groupingBy(Appointment::getDoctor,Collectors.counting()));
        for (Map.Entry<String,Long>entry:mapStatic.entrySet()){
            System.out.printf("Bac sy :%s,So luot kham la :%d\n",entry.getKey(),entry.getValue());
        }
    }
}
