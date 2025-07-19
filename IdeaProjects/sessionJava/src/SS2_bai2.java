import java.util.Scanner;

public class SS2_bai2 {
    public static void main(String[] args) {
        Scanner number= new Scanner(System.in);
        System.out.println("Hay nhap vao so bat ky : ");
        int day = number.nextInt();
        switch (day){
            case 1:
                System.out.println("Chu nhat");
                break;
                case 2:
                System.out.println("Thu hai");
                break;
                case 3:
                System.out.println("Thu ba");
                break;
                case 4:
                System.out.println("Thu tu");
                break;
                case 5:
                System.out.println("Thu nam");
                break;
                case 6:
                System.out.println("Thu sau");
                break;
                case 7:
                System.out.println("Thu bay");
                break;
            default:
                System.out.println(" So nhap vao khong hop le");

        }

    }
}
