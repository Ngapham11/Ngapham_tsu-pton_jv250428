package SS8.bai2;

public class Bike extends Vehicle{
    public Bike(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void displayInfo() {
        System.out.println("Bike name :"+name+", speed :"+speed+" km/h");
    }
}
