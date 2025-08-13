package SS12_bai2.entity;

import java.time.LocalDate;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Appointment {
    private String appointmentId;
    private String patientName;
    private String phoneNumber;
    private LocalDate appointmentDate;
    private String doctor;

    public Appointment() {
    }

    public Appointment(String appointmentId, String patientName, String phoneNumber, LocalDate appointmentDate, String doctor) {
        this.appointmentId = appointmentId;
        this.patientName = patientName;
        this.phoneNumber = phoneNumber;
        this.appointmentDate = appointmentDate;
        this.doctor = doctor;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDate appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public void inputData(Scanner scanner) {
        //xu li ma lich hen

        while (true) {
            System.out.println("Moi ban nhap ma lich hen(chuoi gom 6 ky tu khong trung lap)");
            String appointmentId = scanner.nextLine();
            if (appointmentId.length() != 6) {
                System.out.println("Nhap chuoi co 6 ky tu");
                continue;
            }
            if (hasDuplicateChar(appointmentId)) {
                System.out.println("Khong duoc co ky tu trung");
                continue;
            }
            this.appointmentId = appointmentId;
            break;
        }
        // nhap so dien thoai
        String regex="^0\\d{9}$";
        while (true){
            System.out.println("Moi ban nhap so dien thoai :");
            String phone=scanner.nextLine();
            if (!phone.matches(regex)){
                System.out.println("So dien thoai khong hop le");
                continue;
            }else {
                this.phoneNumber=phone;
                break;
            }
        }



        //xu li ten benh nhan

        while (true) {
            System.out.println("Moi ban nhap ten benh nhan");
            String patientName = scanner.nextLine();
            if (patientName.length() < 10 || patientName.length() > 50) {
                System.out.println("Nhap chuoi co tu 10-50 ky tu");
                continue;
            }
            this.patientName = patientName;
            break;
        }
        //xu li nhap lich kham
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        while (true) {
//            LocalDateTime appointmentDate= LocalDateTime.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            try {
                System.out.println("Moi ban hen lich kham(dd/MM/yyyy)");
                String input = scanner.nextLine();
                this.appointmentDate = LocalDate.parse(input, formatter);
                break;
            } catch (Exception e) {
                System.out.println("Ban nhap sai dinh dang");
            }
        }
        // nhap bac sy phu trach
        while (true) {
            System.out.println("Nhap bac sy phu trach");
            String doctor = scanner.nextLine();
            if (doctor.length() > 200) {
                System.out.println("Toi da 200 ky tu");
                continue;
            }
            this.doctor = doctor;
            break;
        }
    }

    //kiem tra ky tu trung
    public boolean hasDuplicateChar(String str) {
        Set<Character> idSet = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (!idSet.add(c)) {
                return true;
            }
        }
        return false;
    }


    @Override
    public String toString() {
        return "Lich kham :" +
                " Ma :" + appointmentId +
                " , Ten benh nhan :" + patientName +
                " , So dien thoai :" + phoneNumber +
                " , Ngay kham :" + appointmentDate +
                " , Bac sy :" + doctor;

    }
}