import java.util.Scanner;
import java.util.regex.Pattern;

public class SS6_bai3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int currentElement = 0;
        do {
            System.out.println("******************QUẢN LÝ BIỂN SỐ XE****************\n" +
                    "\n" +
                    "1.Thêm các biển số xe\n" +
                    "2.Hiển thị danh sách biển số xe\n" +
                    "3.Tìm kiếm biển số xe\n" +
                    "4.Tìm biển số xe theo mã tỉnh\n" +
                    "5.Sắp xếp biển số xe tăng dần\n" +
                    "6.Thoát");
            System.out.println("Moi ban chon tu 1-6");
            int choice= Integer.parseInt(scanner.nextLine());
            String [] arrayCar=new String[50];
            switch (choice){

                case 1:
                    System.out.println("**Them bien so xe**");
                    System.out.println("Ban muon them bao nhieu xe :");


                    int total=Integer.parseInt(scanner.nextLine());

                      for (int i=0;i<total;i++){
                          String numberCar=scanner.nextLine();
                          String regexNumberCar="^[\\d]{2}[A-Z]{1}-[\\d]{3}.[\\d]{2}$";
                          if (Pattern.matches(regexNumberCar,numberCar))
                          {arrayCar[i]=numberCar;
                          currentElement++;
                      }else {
                              System.out.println("Bien so xe khong dung dinh dang");
                          }

                    }
                    break;
                case 2:
                    System.out.println("Danh sach bien so xe :");
                    for (int i=0;i<currentElement;i++){
                        System.out.print(arrayCar[i]);
                    }
                    break;
                case 3:
                    System.out.println("Nhap bien so xe can tim :");
                    String searchCar= scanner.nextLine();

                    break;
                default:
                    System.exit(0);
            }
        }while (true);
    }
}
