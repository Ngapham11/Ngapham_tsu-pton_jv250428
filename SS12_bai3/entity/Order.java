package SS12_bai3.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Order {
    private int orderId;
    private String customerName;
    private String phoneNumber;
    private String address;
    private float orderAmount;
    private String status;

    public Order() {
    }

    public Order(int orderId, String customerName, String phoneNumber, String address, float orderAmount, String status) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.orderAmount = orderAmount;
        this.status = status;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(float orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void inputData(Scanner scanner, List<Order> orders) {
        this.orderId = orders.size() + 1;
        while (true) {

                System.out.println("Moi nhap ten khach hang(tu 6-100 ky tu) :");
                String customerName = scanner.nextLine();
                if (customerName.length() < 6 || customerName.length() > 100) {
                    System.out.println("Nhap tu 6-100 ky tu");
                    continue;
                } else {
                    this.customerName = customerName;
                    break;
                }


        }
        while (true) {

                String regex = "^0\\d{9}$";
                System.out.println("Moi ban nhap so dien thoai (0***-***-***)");
                String phoneNumber = scanner.nextLine();
                if (!phoneNumber.matches(regex)) {
                    System.out.println("So dien thoai khong dung dinh dang");
                    continue;
                } else {
                    this.phoneNumber = phoneNumber;
                    break;
                }

        }
        while (true) {

                System.out.println("Moi ban nhap dia chi giao hang :");
                String address = scanner.nextLine();
                if (address.isEmpty()) {
                    System.err.println("Moi ban nhap dia chi giao hang");
                    continue;
                } else {
                    this.address = address;
                    break;
                }

        }
        while (true) {
            try {
                System.out.println("Moi ban nhap gia tri don hang :");
                float orderAmount = Float.parseFloat(scanner.nextLine());
                if (orderAmount < 0) {
                    System.out.println("Nhap lai gia tri");
                    continue;
                } else {
                    this.orderAmount = orderAmount;
                    break;
                }
            } catch (Exception e) {
                System.err.println("Moi ban nhap lai ");
            }
        }

        while (true) {
            List<String> listStatus =Arrays.asList("Pending", "Shipper", "Delivered");
                System.out.println("Moi ban nhap trang thai don hang :");
                String status = scanner.nextLine();
               boolean isValid= listStatus.stream().anyMatch(a->a.equalsIgnoreCase(status));
               if (isValid){
                   this.status=status;
                   break;
               }else {
                   System.out.println("Moi ban nhap lai");
                   continue;
               }
        }
    }

    @Override
    public String toString() {
        return "**Ma don hang la : "+orderId+" Ten khach hang la :"+customerName+
                " So dien thoai la :"+phoneNumber+" Dia chi giao hang la :"+address+
                " Gia tri don hang la :"+orderAmount+" Trang thai don hang la :"+status+"\n";
    }
}
