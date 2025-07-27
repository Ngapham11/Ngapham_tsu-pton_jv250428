package SS8.bai1;

public class Dog extends Animals {
    private String breed;
    public Dog(String name, int age,String breed) {
        super(name, age);
        this.breed = breed;

    }

    @Override
    public void makeSound() {
        System.out.println("Keu la : Woof Woof");
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Giong cho la "+breed);
    }


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}

