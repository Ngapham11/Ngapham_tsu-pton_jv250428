import java.util.Arrays;
import java.util.Scanner;

public class SS4_bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hay nhap kich thuoc mang :");
        int size = sc.nextInt();
        int[] number = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Hay nhap phan tu thu " + (i + 1));
            number[i] = sc.nextInt();
        }
        for (int i=0,j=number.length-1;i<j;i++,j--){
            int temp=number[i];
            number[i]=number[j];
            number[j]=temp;
        }
        System.out.println("Mang sau khi dao la :");
        System.out.println(Arrays.toString(number));
    }
}
