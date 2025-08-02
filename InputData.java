package SS10.bai3;

import java.util.Scanner;

public class InputData {
    public static String inputUserName(Scanner scanner){
        System.out.println("Moi ban nhap ten");
        String input="";
        try {input=scanner.nextLine();
            if (input.isEmpty()){
                System.out.println("Vui long khong de trong");
            }
        }catch (Exception e){
            System.out.println("Vui long khong de trong");
        }return input;
    }
    public static String inputEmail(Scanner scanner){
        System.out.println("Moi ban nhap email");
        String input="";
        try {input=scanner.nextLine();
            if (input.isEmpty()){
                System.out.println("Vui long khong de trong");
            }
        }catch (Exception e){
            System.out.println("Vui long khong de trong");
        }return input;
    }
    public static String inputTelephon(Scanner scanner){
        System.out.println("Moi ban nhap so dien thoai");
        String input="";
        try {input=scanner.nextLine();
            if (input.isEmpty()){
                System.out.println("Vui long khong de trong");
            }
        }catch (Exception e){
            System.out.println("Vui long khong de trong");
        }return input;
    }

}
