#include <iostream>
using namespace std; 

class Parent {
public:
   
         void display() {
        cout<< "Parent class display()" <<endl;
    }
};


class Child : public Parent {
public:
    
    void display()  {
        cout<< "Child class display()" <<endl;
    }
};

int main() {
    Parent parentObj; 
    Child childObj;   
    
    parentObj.display(); 
    childObj.display();  
    
    return 0;
}
