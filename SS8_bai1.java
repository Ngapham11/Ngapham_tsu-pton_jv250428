package SS8.bai1;

public class SS8_bai1 {
    public static void main(String[] args) {
        Animals[]arraysAnimals=new Animals[2];
        Cat cat1=new Cat("Whiskers",2,"Ghi");
        Dog dog1=new Dog("Buddy",3,"Golden ");
        arraysAnimals[0]=cat1;
        arraysAnimals[1]=dog1;
        for (Animals animals:arraysAnimals){
            animals.displayInfo();
            animals.makeSound();
        }
    }
}
