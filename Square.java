package SS8.bai3;

public class Square implements Colorable{
    protected double width;
    protected double height;
    protected String color;
    public Square(String color) {
        this.color = color;
    }


    @Override
    public void setColor() {
        System.out.println("Square color :"+color);
    }
}
