import java.util.Arrays;
import java.util.Scanner;

public class SS4_bai2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Hay nhap kich thuoc mang :");
        int size=sc.nextInt();
        int[] number=new int[size];
        for (int i=0;i<size;i++){
            System.out.println("hay nhap phan tu thu "+(i+1));
            number[i]=sc.nextInt();
        }
        int sum=0;
   for (int i=0;i<number.length;i++){
      sum+=number[i];
   }
        System.out.println(Arrays.toString(number));
        System.out.println("Tong cua mang la :"+sum);
    }
}
