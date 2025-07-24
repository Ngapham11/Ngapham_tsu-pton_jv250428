import java.util.Scanner;
import java.util.regex.Pattern;

public class SS6_bai3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int currentElement = 0;
        String [] arrayCar=new String[50];
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

            String regexNumberCar="^[\\d]{2}[A-Z]{1}-[\\d]{3}.[\\d]{2}$";
            switch (choice){

                case 1:
                    System.out.println("**Them bien so xe**");
                    System.out.println("Ban muon them bao nhieu xe :");
                    int total=Integer.parseInt(scanner.nextLine());

                      for (int i=0;i<total;i++){
                          String numberCar=scanner.nextLine();
                          if (Pattern.matches(regexNumberCar,numberCar))
                          {arrayCar[i]=numberCar;
                          currentElement++;
                      }else {
                              System.err.println("Bien so xe khong dung dinh dang");
                          }
                    }
                    System.out.println(arrayCar[1]);
                    System.out.println(arrayCar[0]);
                    break;
                case 2:

                    System.out.println("Danh sach bien so xe :");
                    for (int i=0; i<currentElement ;i++){
                        System.out.println(arrayCar[i]);
                    }
                    break;
                case 3:
                    int identify=0;
                    System.out.println("Nhap bien so xe can tim :");
                    String searchCar= scanner.nextLine();
                  for (int i=0;i<currentElement;i++){
                      if (arrayCar[i].equals(searchCar)){
                          identify++;
                      }
                  }if (identify==0){
                    System.err.println("khong tim thay");
                }else System.out.println("tim thay xe co bien la :"+searchCar);
                    break;
                case 4:
                    System.out.println("Hay nhap ma tinh ma ban muon tim");
                    String citySearch= scanner.nextLine();
                    for (int i=0;i<currentElement;i++){
                        String cityNumber= arrayCar[i].substring(0,2);
                        if (cityNumber.equals(citySearch)){
                            System.out.println("Bien so xe co ma tinh "+citySearch +"la :"+arrayCar[i]);
                        }
                    }break;
                    case 5:

                        for (int i=0;i<currentElement-1;i++){
                            for (int j=i+1;j<currentElement;j++){
                                if (arrayCar[i].compareTo(arrayCar[j])>0){
                                  String temp=arrayCar[i];
                                  arrayCar[i]=arrayCar[j];
                                  arrayCar[j]=temp;
                                }
                            }
                        }
                       for (int i=0;i<currentElement;i++){
                           System.out.println(arrayCar[i]);
                       }
                        break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.exit(0);
            }
        }while (true);
    }
}
