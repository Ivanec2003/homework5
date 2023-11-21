public class Triangle extends Shape {
    private double a; //base side of Triangle
    private double b; //edge of a triangle
    private double c; //edge of a triangle
    private double height; //height of Triangle

    public Triangle(double a, double b, double c, double height){
        this.a = a;
        this.b = b;
        this.c = c;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of triangle: " + a * height / 2);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter of triangle " + (a + b + c));
    }
}
