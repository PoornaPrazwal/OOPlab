#include<iostream>
using namespace std;

class parent {
public:
    void displayp1() {
        cout << "parent class" << endl;
    }
};

class child0 : virtual public parent {
public:
    void display0() {
        cout << "subclass child0 inherits parent" << endl;
    }
};

class child1 : virtual public parent {
public:
    void display1() {
        cout << "subclass child1 inherits parent" << endl;
    }
};

class child2 : public child0, public child1 {
public:
    void display2() {
        cout << "subclass child2 inherits subclasses child0 and child1" << endl;
    }
};

int main() {
    child2 a;
    a.display0(); // Accessing the display0 function from child0
    a.display1(); // Accessing the display1 function from child1

    a.displayp1(); // Resolves ambiguity by using virtual inheritance

    a.display2(); // Accessing the display2 function from child2
    return 0;
}
