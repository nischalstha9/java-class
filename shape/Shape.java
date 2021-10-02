package shape;

public class Shape {
    void draw() {
        System.out.println("Drawn");
    }

    void erase() {
        System.out.println("Erased");
    }

}

class Circle extends Shape {
}

class Triangle extends Shape {
}

class Square extends Shape {
}
