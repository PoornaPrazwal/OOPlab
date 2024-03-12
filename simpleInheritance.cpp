#include <iostream>

class Shape {
protected:
    double width;
    double height;
public:
    Shape(double w, double h) : width(w), height(h) {}
    virtual double area() const = 0; // Pure virtual function
};

class Rectangle : public Shape {
public:
    Rectangle(double w, double h) : Shape(w, h) {}
    double area() const override {
        return width * height;
    }
};

class Circle : public Shape {
private:
    double radius;
public:
    Circle(double r) : Shape(0, 0), radius(r) {}
    double area() const override {
        return 3.14 * radius * radius;
    }
};

int main() {
    Rectangle rect(5, 6);
    Circle circle(3);

    std::cout << "Area of rectangle: " << rect.area() << std::endl;
    std::cout << "Area of circle: " << circle.area() << std::endl;

    return 0;
}
