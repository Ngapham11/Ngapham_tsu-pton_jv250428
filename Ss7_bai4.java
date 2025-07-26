import java.util.Scanner;

public class Ss7_bai4 {
    public static void main(String[] args) {
        Student[]arrayStudent=new Student[4];
        arrayStudent[0]=new Student("Trang",21,"A1",5);
        arrayStudent[1]=new Student("Minh",23,"A1",7);
        arrayStudent[2]=new Student("Anh",19,"A1",9);
        arrayStudent[3]=new Student("Tu",22,"A1",6);

        Scanner scanner=new Scanner(System.in);
        System.out.println("Hay nhap diem thap nhat :");
        double min=scanner.nextDouble();
        System.out.println("Hay nhap diem lon nhat :");
        double max=scanner.nextDouble();
        for (Student student:arrayStudent){
           if (student.getAvgScore()>=min && student.getAvgScore()<=max){
               System.out.println(student);

           }
        }
  scanner.close();
    }
}
