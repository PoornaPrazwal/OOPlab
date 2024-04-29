#include <iostream>

// Abstract base class Shape
class Shape {
public:
    // Pure virtual function for calculating area
    virtual void area() const = 0;
};

// Concrete class Circle derived from Shape
class Circle : public Shape {
private:
    double radius;
public:
    Circle(double r) : radius(r) {}

    // Implementation of the area() function for Circle
    void area() const override {
        std::cout << "Area of circle: " << 3.14159 * radius * radius << std::endl;
    }
};

// Concrete class Rectangle derived from Shape
class Rectangle : public Shape {
private:
    double length;
    double breadth;
public:
    Rectangle(double l, double b) : length(l), breadth(b) {}

    // Implementation of the area() function for Rectangle
    void area() const override {
        std::cout << "Area of rectangle: " << length * breadth << std::endl;
    }
};

int main() {
    double radius, length, breadth;

    std::cout << "Enter the radius of a circle: ";
    std::cin >> radius;
    Circle circle(radius);

    std::cout << "Enter the length and breadth of a rectangle: ";
    std::cin >> length >> breadth;
    Rectangle rectangle(length, breadth);

    // Using the pure abstract class to call area function
    const Shape* shapes[2] = {&circle, &rectangle};

    // Calling the area function for each shape
    for (const Shape* shape : shapes) {
        shape->area();
    }

    return 0;
}
