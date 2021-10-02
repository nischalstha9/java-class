package classInheritance;

public class Box {
    public double len, breadth;

    public Box(int len, int bre) {
        this.len = len;
        this.breadth = bre;
    }

    void getArea() {
        double area = len * breadth;
        System.out.println("The area of box is " + area + " sq. units.");
    }
}
