import java.util.Scanner;

public class SS5_bai1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Hay nhap vao mot doan van bat ky :");
        String str1=sc.nextLine();
        System.out.println("Nhap vao tu can tim :");
        String str2=sc.nextLine();
        int index=str1.indexOf(str2);
        if (index==-1){
            System.out.println(" khong ton tai doan van can tim ");
        }else {
            System.out.println("Vi tri doan van can tim la :"+index);
        }

    }
}
