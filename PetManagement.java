package SS9.bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PetManagement {
    public static List<Pet> petList=new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("*********************QUẢN LÝ THÚ CƯNG********************\n" +
                    "\n" +
                    "1.Hiển thị danh sách thú cưng\n" +
                    "\n" +
                    "2.Thêm thú cưng\n" +
                    "\n" +
                    "3.Gọi tiếng kêu\n" +
                    "\n" +
                    "4.Xóa thú cưng\n" +
                    "\n" +
                    "5.Tìm thú cưng theo tên\n" +
                    "\n" +
                    "6.Thoát");
            System.out.println("Hay chon tu 1-6");
            int choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:displayListPet();
                    break;
                case 2:updatePet(scanner);
                    break;
                case 3:speakPet();
                    break;
                case 4:deletePet(scanner);
                    break;
                case 5:findPetByPetName(scanner);
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Hay nhap tu 1-6");
            }
        }while (true);
    }
   //Hien thi danh sach
    public static void displayListPet(){
       if (petList.size()==0){
           System.err.println("Chua co Pet nao ca");
       };
        for (Pet pet : petList) {
            pet.displayData();
        }
    }
    //Them thu cung
    public static void updatePet(Scanner scanner){
        System.out.println("Ban muon nhap loai thu nao? chon 1-Dog,chon 2-Cat");
        int choice=Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:Pet newDog=new Dog();
            newDog.inputData(scanner);
            petList.add(newDog);
                break;
            case 2:Pet newCat=new Cat();
            newCat.inputData(scanner);
            petList.add(newCat);
                break;
            default:
                System.err.println("Hay chon 1 hoac 2");
        }
    }
    //goi tieng keu
    public static void speakPet(){
        for (Pet pet : petList) {
            pet.speak();
        }
    }
    //tim theo ma Id
public static Pet findPetByPetId(String deletePetId){

    for (Pet pet : petList) {
        if (pet.getPetId().equals(deletePetId)){
            return pet;
        }
    }
    System.err.println("Khong tim thay");
    return null;
}
    //xoa thu cung
    public static void deletePet(Scanner scanner) {
        System.out.println("Nhap ma thu cung can xoa :");
        String deletePetId = scanner.nextLine();
       Pet deletePet=findPetByPetId(deletePetId);
       if (deletePet!=null)petList.remove(deletePet);


    }
    //tim thu cung theo ten

    public static void findPetByPetName(Scanner scanner){
        System.out.println("Nhap ten thu cung muon tim ");
        String searchPetName=scanner.nextLine();
        boolean check=false;
        for (Pet pet : petList) {
            if (pet.getPetName().equals(searchPetName)){
                pet.displayData();
                check=true;
            }
        }if (!check){
            System.err.println("Khong tim thay");
        }
    }

}
