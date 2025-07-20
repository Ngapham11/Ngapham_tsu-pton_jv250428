import java.util.Scanner;

public class SS4_bai1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Hay nhap kich thuoc mang");
        int size=sc.nextInt();
        int [] number=new int[size];
        for (int i=0;i<number.length;i++){
            System.out.println("Hay nhap phan tu thu "+ (i+1));
            number[i]=sc.nextInt();
        }

selectionSort(number);
 for (int value : number){
     System.out.println(value);
 }
        System.out.println("Phan tu lon nhat la : "+number[0]);
    }

    public static void selectionSort(int[] number) {
        for (int i=0;i<number.length-1;i++){
            int maxIndex=i;

            for (int j=i+1;j<number.length;j++){
                if (number[j]>number[maxIndex]){
                    maxIndex=j;

                }
            }int temp=number[maxIndex];
            number[maxIndex]=number[i];
            number[i]=temp;

        }

    }
}
