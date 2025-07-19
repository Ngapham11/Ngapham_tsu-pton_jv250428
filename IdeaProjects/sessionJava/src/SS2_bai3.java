import java.util.Scanner;

public class SS2_bai3 {
    public static void main(String[] args) {
        // cho nguoi dung nhap vao so ,thuc hien cong tong tat ca
        Scanner scanner=new Scanner(System.in);
        System.out.println("Hay nhap vao so bat ky :");
        int number= scanner.nextInt();
        if(number<=0){
            System.out.println(" Ban nhap so khong hop le ");
        } else {
            int sum=0;
            for (int i=1;i<=number;i++){
                sum+=i;
            }
            System.out.printf(" Tong cac so tu 1 den %d la : %d %n",number,sum );
        }

    }
}
