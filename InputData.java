package SS10.bai2;

import java.util.Scanner;

public class InputData {
    public static String inputBookName(Scanner scanner){
        String input="";
        do {
            System.out.println("Moi ban nhap ten sach");
            input=scanner.nextLine();
            if (input.isEmpty()){
                System.out.println("Vui long khong de trong");
            }
        }while (input.isEmpty());
        return input;
    }
    public static String inputAuthor(Scanner scanner){
        String input="";
        do {
            System.out.println("Moi ban nhap ten tac gia");
            input=scanner.nextLine();
            if (input.isEmpty()){
                System.out.println("Vui long khong de trong");
            }
        }while (input.isEmpty());
        return input;
    }
    public static int inputPublishYear(Scanner scanner){
       String input;
       do {
           System.out.println("Moi ban nhap nam san xuat :");
           input=scanner.nextLine();
           try {
               if (input.isEmpty()){
                   System.out.println("Vui long khong duoc de trong");
               } else if (Integer.parseInt(input)<=0) {
                   System.out.println("vui long nhap dung so nam");
               }else break;
           }catch (Exception e){
               System.out.println("Vui long nhap dung so nam");
           }
       }while (true);
       return Integer.parseInt(input);
    }
}
