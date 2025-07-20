import java.util.Scanner;

public class SS3_bai3 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int countStaff = 0;
        double totalSalary = 0;
        double totalBonus=0;
        float maxSalary= Float.MIN_VALUE;
        float minSalary = Float.MAX_VALUE;
        double bonus=0;
        do {System.out.println("*******MENU NHAP LUONG********");
            System.out.println("1.Nhap luong nhan vien");
            System.out.println("2.Hien thi thong ke");
            System.out.println("3.Tinh tong so tien thuong cho nhan vien");
            System.out.println("4.Thoat");
            int choice=scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("**Nhap luong nhan vien**");
                    float salary=scanner.nextFloat();
                    if(salary==-1)break;
                    else if (salary>0 && salary<=500) {
                        countStaff++;
                        totalSalary+=salary;

                        if (salary>maxSalary){
                            maxSalary=salary;
                        };
                        if (salary<minSalary){
                           minSalary=salary;
                        }
                       if (salary<=5){
                           System.out.println("Thu nhap thap");
                           bonus=salary*0.05;
                       } else if (salary<=15) {
                           System.out.println("Thu nhap trung binh");
                           bonus=salary*0.1;
                       } else if (salary<=50) {
                           System.out.println("Thu nhap kha");
                           bonus=salary*0.15;
                       }else {
                           System.out.println("Thu nhap cao");
                          if (salary<100){bonus=salary*0.2;}
                          if (salary>100){bonus=salary*0.25;}

                       }
                    }else {
                        System.err.println("Ban nhap khong hop le");
                    } totalBonus+=bonus;
                    break;
                    case 2:
                    System.out.println("**Hien thi thong ke**");
                    if (countStaff==0){
                        System.err.println("Chua co du lieu");
                    }else {
                        System.out.println("So nhan vien da nhap la :"+countStaff);
                        System.out.println("Luong trung binh la :"+totalSalary/countStaff);
                        System.out.println("Luong cao nhat la :"+maxSalary);
                        System.out.println("Luong thap nhat la :"+minSalary);
                        System.out.println("Tong tien luong la :"+totalSalary);
                    }
                    break;
                    case 3:
                        System.out.println("**Hien thi tong tien thuong**");

                    System.out.println(" Tong tien thuong la :"+totalBonus);
                    break;
                case 4:   System.exit(0);

            }

        }while (true);
    }
}
