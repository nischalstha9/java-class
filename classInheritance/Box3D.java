package classInheritance;

public class Box3D extends Box {
    public double height;

    public Box3D(int len, int bre, int ht) {
        super(len, bre);
        this.height = ht;
    }

    void getArea() {
        double area = (2 * len * breadth) + (2 * len * height) + (2 * breadth * height);
        System.out.println("The area of box is " + area + " sq. units.");
    }

    void getVolume() {
        double volume = len * breadth * height;
        System.out.println("The volume of box is " + volume + " cu. units.");
    }

    public static void main(String[] args) {
        Box3D box = new Box3D(3, 3, 3);
        box.getArea();
        box.getVolume();
        Box box2 = new Box(3, 3);
        box2.getArea();
    }
}
