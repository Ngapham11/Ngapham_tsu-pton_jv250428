package SS8.bai2;

public class Car extends Vehicle{

    public Car(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void displayInfo() {
        System.out.println("Car name :"+name+", speed :"+speed+" km/h");
    }
}
