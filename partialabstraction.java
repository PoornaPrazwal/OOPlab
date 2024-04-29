import java.util.Scanner;

abstract class Shape {
    abstract void area();
    void display() {}
}     

class Square extends Shape {
    float side;

    Square(float side) {
        this.side = side;
    }

    void area() {
        System.out.println("Area of square: " + (side * side));
    }
}

class Rectangle extends Shape {
    float length, breadth;

    Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void area() {
        System.out.println("Area of rectangle: " + (length * breadth));
    }
}

class Circle extends Shape {
    float radius;

    Circle(float radius) {
        this.radius = radius;
    }

    void area() {
        System.out.println("Area of circle: " + (Math.PI * radius * radius));
    }
}

public class Partial_Abstraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length and breadth of a rectangle: ");
        float length = sc.nextFloat();
        float breadth = sc.nextFloat();
        Rectangle rect = new Rectangle(length, breadth);
        System.out.print("Area of rectangle: ");
        rect.area();

        System.out.print("Enter the side of a square: ");
        float side = sc.nextFloat();
        Square square = new Square(side);
        System.out.print("Area of square: ");
        square.area();

        System.out.print("Enter the radius of a circle: ");
        float radius = sc.nextFloat();
        Circle circle = new Circle(radius);
        System.out.print("Area of circle: ");
        circle.area();

        sc.close();
    }
}
