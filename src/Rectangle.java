public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
         length=1;
        width=1;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return (length+width)*2;
    }
    public void display(){
        System.out.println("Chieu dai la :"+length);
        System.out.println("Chieu rong la :"+width);
        System.out.println("Chu vi la :"+getPerimeter());
        System.out.println("Dien tich la :"+getArea());
    }
}
