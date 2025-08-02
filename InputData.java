package SS10.bai1;

import java.util.Scanner;

public class InputData {
    public static String inputName(Scanner scanner){
        String input="";
        do {
            System.out.println("Moi nhap ten :");
            input=scanner.nextLine();
            if (input.isEmpty()){
                System.out.println("Vui long khong duoc de trong");
            }

        }while (input.isEmpty());
        return input;
    }
    public static int inputAge(Scanner scanner){
        String input="";
        do {
            System.out.println("Moi ban nhap tuoi :");
            input=scanner.nextLine();
            try {
                if (input.isEmpty()){
                    System.out.println("Vui long khong duoc de trong");
                } else if (Integer.parseInt(input)<=0) {
                    System.out.println("Nhap tuoi lon hon 0");
                }else break;
            }catch (Exception e){
                System.out.println("Hay nhap so thuc hop le");
            }

        }while (true);
        return Integer.parseInt(input);
    }
    public static double inputScore(Scanner scanner){
        String input="";
        do {
            System.out.println("Moi nhap diem trung binh :");
            input=scanner.nextLine();
            try {
                if (input.isEmpty()){
                    System.out.println("Khong duoc de trong");
                }
                 else if(Double.parseDouble(input)<0){
                    System.out.println("Diem ban nhap khong hop le!!");
                }else break;
            }catch (Exception e){
                System.out.println("Vui long nhap so thuc");
            }

        }while (true);
        return Integer.parseInt(input);
    }
}
