package SS8.bai2;

public class SS8_bai2 {
    public static void main(String[] args) {
     Car car=new Car("Toyota",120);
     Bike bike=new Bike("Yamaha",80);
     car.displayInfo();
     car.start();
     bike.displayInfo();
     bike.start();
    }
}
