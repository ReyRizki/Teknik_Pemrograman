public class Circle extends Shape{
    private double radius;

    public Circle() {
        super();
        this.radius = 1.0;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI *getRadius() * getRadius();
    }

    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    public String toString() {
        return "A Circle with radius " + this.getRadius() + ", which is a subclass of " + super.toString();
    }
}