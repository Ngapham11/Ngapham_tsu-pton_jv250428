import java.util.Arrays;
import java.util.Scanner;

public class SS4_bai3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("hay nhap kich thuoc mang :");
        int size=sc.nextInt();
        int[] number=new int[size];
        for (int i=0;i<size;i++){
            System.out.println("Hay nhap phan tu thu "+(i+1));
            number[i]=sc.nextInt();
        }

        boolean swapped;
        for (int i = 0; i < number.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < number.length - 1 - i; j++) {
                if (number[j] < number[j + 1]) {

                    int temp = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break;
        }


        System.out.println("Mảng đã sắp xếp theo thứ tự giảm dần:");
        System.out.println(Arrays.toString(number));
    }


}
