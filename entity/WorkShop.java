package entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class WorkShop {
    private int workShopId;
    private String workShopName;
    private LocalDate dateImplement;
    private String speakerName;
    private String speakerPhone;
    private int status;

    public WorkShop() {
    }

    public WorkShop(int workShopId, String workShopName, LocalDate dateImplement, String speakerName, String speakerPhone, int status) {
        this.workShopId = workShopId;
        this.workShopName = workShopName;
        this.dateImplement = dateImplement;
        this.speakerName = speakerName;
        this.speakerPhone = speakerPhone;
        this.status = status;
    }

    public int getWorkShopId() {
        return workShopId;
    }

    public void setWorkShopId(int workShopId) {
        this.workShopId = workShopId;
    }

    public String getWorkShopName() {
        return workShopName;
    }

    public void setWorkShopName(String workShopName) {
        this.workShopName = workShopName;
    }

    public LocalDate getDateImplement() {
        return dateImplement;
    }

    public void setDateImplement(LocalDate dateImplement) {
        this.dateImplement = dateImplement;
    }

    public String getSpeakerName() {
        return speakerName;
    }

    public void setSpeakerName(String speakerName) {
        this.speakerName = speakerName;
    }

    public String getSpeakerPhone() {
        return speakerPhone;
    }

    public void setSpeakerPhone(String speakerPhone) {
        this.speakerPhone = speakerPhone;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    public void inputData(Scanner scanner){
        System.out.println("Moi ban nhap vao ten workshop :");
        this.workShopName=scanner.nextLine();
        System.out.println("Moi ban nhap vao ngay thuc hien :");
        this.dateImplement=LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println("Moi ban nhap vao ten dien gia :");
        this.speakerName=scanner.nextLine();
        System.out.println("Moi ban nhap vao so dien thoai dien gia :");
        this.speakerPhone=scanner.nextLine();
        System.out.println("Moi ban nhap vao trang thai(1:Dang thuc hien,0:Da huy,2:Da hoan thanh) :");
        this.status=Integer.parseInt(scanner.nextLine());

    }

    @Override
    public String toString() {
        return String.format("Ma workshop %d--ten :%s--Ngay %s--Ten dien gia:%s--So dien thoai :%s--Trang thai:%d",
                this.workShopId,this.workShopName,this.dateImplement,this.speakerName,this.speakerPhone,this.status);
    }
}
