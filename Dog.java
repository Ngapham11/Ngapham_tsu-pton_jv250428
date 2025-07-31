package SS9.bai2;

public class Dog extends Pet{
    public Dog() {
    }

    public Dog(String petId, String petName, int age) {
        super(petId, petName, age);
    }

    @Override
    public void speak() {
        System.out.println("Gau gau");
    }
}
