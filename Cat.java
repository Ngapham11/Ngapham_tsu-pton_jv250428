package SS8.bai1;

public class Cat extends Animals {
    private String furColor;
    public Cat(String name, int age,String furColor) {
        super(name, age);
        this.furColor=furColor;
    }

    @Override
    public void makeSound() {
        System.out.println("Keu la : Meo meo");
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Mau long la : "+furColor);
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }
}
