public class testShape {
    public static void main(String args[]) {
        Shape s1 = new Shape();
        System.out.println(s1);
        
        Shape s2 = new Shape("yellow", false);
        System.out.println(s2);

        Circle c1 = new Circle();
        System.out.println(c1);
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getArea());
        
        
        Rectangle r1 = new Rectangle();
        System.out.println(r1);
        
        Square sq1 = new Square();
        System.out.println(sq1);
    }
}