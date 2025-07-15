import java.util.Scanner;

public class ss1_bai3 {
    public static void main(String[] args) {

        Scanner input=new  Scanner (System.in);
        System.out.println(" Hay nhap ban kinh");
        double r=input.nextDouble();
        double dt= Math.PI*r*r;
        System.out.printf("Dien tich cua hinh tron co ban kinh %.2f la : %.2f ",r,dt);
    }
}
