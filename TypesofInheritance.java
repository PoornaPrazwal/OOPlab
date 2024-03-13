// Superclass: Shape
class Shape {
    public void draw() {
        System.out.println("Drawing a shape.");
    }
}

// Subclass A: Circle (Single Inheritance)
class Circle extends Shape {
    public void drawCircle() {
        System.out.println("Drawing a circle.");
    }
}

// Interface B: Drawable (for Multiple Inheritance)
interface Drawable {
    void draw();
}

// Subclass C: Rectangle (Multiple Inheritance through interface Drawable)
class Rectangle implements Drawable {
    public void drawRectangle() {
        System.out.println("Drawing a rectangle.");
    }

    @Override
    public void draw() {
        System.out.println("Drawing using the Drawable interface.");
    }
}

// Subclass D: Square (Hierarchical Inheritance)
class Square extends Shape {
    public void drawSquare() {
        System.out.println("Drawing a square.");
    }
}

// Subclass E: Cube (Hybrid Inheritance - Multiple + Single)
class Cube extends Shape implements Drawable {
    public void drawCube() {
        System.out.println("Drawing a cube.");
    }

    @Override
    public void draw() {
        System.out.println("Drawing using the Drawable interface for a cube.");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        // Single Inheritance
        Circle circle = new Circle();
        circle.draw();
        circle.drawCircle();

        System.out.println();

        // Multiple Inheritance (through interface)
        Rectangle rectangle = new Rectangle();
        rectangle.draw();
        rectangle.drawRectangle();

        System.out.println();

        // Hierarchical Inheritance
        Square square = new Square();
        square.draw();
        square.drawSquare();

        System.out.println();

        // Hybrid Inheritance (Multiple + Single)
        Cube cube = new Cube();
        cube.draw();
        cube.drawCube();
    }
}
