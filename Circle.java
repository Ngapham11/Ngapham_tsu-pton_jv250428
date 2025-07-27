package SS8.bai3;

public class Circle implements Colorable{
    protected double radius;
    protected  String color;
    public Circle(String color) {
        this.color = color;
    }


    @Override
    public void setColor() {
        System.out.println("Circle color :"+color);
    }
}
