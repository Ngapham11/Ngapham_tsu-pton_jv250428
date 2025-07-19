import java.util.Scanner;

public class ss2_bai4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int age=0;
        do { System.out.println("Xin moi nhap tuoi ");

            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
                if (age <= 0) {
                    System.out.println(" Vui long nhap vao mot so nguyen va lon hon 0");
                }
            }else {System.out.println(" Vui long nhap vao mot so nguyen va lon hon 0 ");
scanner.next();

            }
        }
        while (age<=0) ;
        System.out.println(" Tuoi cua ban la : " + age);
        scanner.close();
    }
}
