import java.util.Scanner;

public class ss2_bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap mot so bat ky : ");
        int number = scanner.nextInt();
        if (number == 0) {
            System.out.println(" khong phai so chan cung khong phai so le ");
        } else if (number%2==0) {
            System.out.println( number+ "  la so chan ");
        } else if (number%2 !=0) {
            System.out.println(number+ " la so le");
        }
    }
}
