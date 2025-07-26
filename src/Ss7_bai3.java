import java.util.Scanner;

public class Ss7_bai3 {

    public static void main(String[] args) {Scanner scanner=new Scanner(System.in);
        System.out.println("****Thong tin doi tuong 1*****");
        System.out.println("Name:");
        String name1=scanner.nextLine();
        System.out.println("Tuoi:");
        int age1=Integer.parseInt(scanner.nextLine());
        System.out.println("******Thong in doi tuong 2*****");
        System.out.println("Name:");
        String name2=scanner.nextLine();
        System.out.println("Tuoi:");
        int age2=Integer.parseInt(scanner.nextLine());
        Person person1=new Person();
        Person person2=new Person();
        person1.setName(name1);
        person1.setAge(age1);
        person2.setName(name2);
        person2.setAge(age2);
        if (person1.getAge()>person2.getAge()){
            System.out.printf("Tuoi cua %s lon hon tuoi cua %s",person1.getName(),person2.getName());
        }else System.out.printf("Tuoi cua %s be hon tuoi cua %s",person1.getName(),person2.getName());
    }

}
