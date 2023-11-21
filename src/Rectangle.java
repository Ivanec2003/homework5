public class Rectangle extends Shape {
    private double a;//first side of rectangle
    private double b;//second side of rectangle

    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of rectangle: " + a * b);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter of rectangle: " + (2 * a + 2 * b));
    }
}
