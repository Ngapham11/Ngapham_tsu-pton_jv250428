package SS9.bai2;

import java.util.Scanner;
import java.util.regex.Pattern;

public abstract class Pet {
    private String petId;
    private String petName;
    private int age;

    public Pet() {
    }

    public Pet(String petId, String petName, int age) {
        this.petId = petId;
        this.petName = petName;
        this.age = age;
    }

    public String getPetId() {
        return petId;
    }

    public String getPetName() {
        return petName;
    }

    public int getAge() {
        return age;
    }

    public void setPetId(String petId) {
        this.petId = petId;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void inputData(Scanner scanner){
        System.out.println("Nhap ten thu cung :");
        this.petName=scanner.nextLine();
        System.out.println("Nhap ma thu cung :");
        String petIdRegex="[CD]\\d{3}";
        do {
            String petId=scanner.nextLine();
         if (Pattern.matches(petIdRegex,petId)){
             this.petId=petId;
         }else {
             System.err.println("Ma thu cung phai 4 ky tu,bat dau bang C hoac D,3 ky tu sau la so ");
         }
        }while (true);

        System.out.println("Nhap tuoi thu cung :");
        this.age=Integer.parseInt(scanner.nextLine());
    }
    public void displayData(){
        System.out.printf("Ten la : %s- Ma la : %s -Tuoi la : %d",this.petName,this.petId,this.age);
    }
    public speak();
}
