import java.util.Scanner;

interface Area {
    void displayArea();
}

class Square implements Area {
    private float side;

    Square(float side) {
        this.side = side;
    }

    @Override
    public void displayArea() {
        System.out.println("Area of square: " + (side * side));
    }
}

class Rectangle implements Area {
    private float length;
    private float breadth;

    Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void displayArea() {
        System.out.println("Area of rectangle: " + (length * breadth));
    }
}

class Circle implements Area {
    private float radius;

    Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public void displayArea() {
        System.out.println("Area of circle: " + (Math.PI * radius * radius));
    }
}

public class ParAbsInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float side, length, breadth, radius;

        System.out.print("Enter the side of a square: ");
        side = sc.nextFloat();
        Square square = new Square(side);
        System.out.print("Area of square: ");
        square.displayArea();

        System.out.print("Enter the length and breadth of a rectangle: ");
        length = sc.nextFloat();
        breadth = sc.nextFloat();
        Rectangle rectangle = new Rectangle(length, breadth);
        System.out.print("Area of rectangle: ");
        rectangle.displayArea();

        System.out.print("Enter the radius of a circle: ");
        radius = sc.nextFloat();
        Circle circle = new Circle(radius);
        System.out.print("Area of circle: ");
        circle.displayArea();

        sc.close();
    }
}
