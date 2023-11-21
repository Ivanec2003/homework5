public class Circle extends Shape {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of circle is: " + Constatnts.Pi * radius * radius);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter of circle is: " + 2 * radius * Constatnts.Pi);
    }
}
