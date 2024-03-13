#include <iostream>

class AccessSpecifierDemo {
private:
    int priVar;
protected:
    int proVar;
public:
    int pubVar;

    // Method to set values for member variables by reading from the user
    void setVar() {
        std::cout << "Enter a value for private variable (priVar): ";
        std::cin >> priVar;

        std::cout << "Enter a value for protected variable (proVar): ";
        std::cin >> proVar;

        std::cout << "Enter a value for public variable (pubVar): ";
        std::cin >> pubVar;
    }

    // Method to display values of member variables
    void getVar() {
        std::cout << "Private Variable (priVar): " << priVar << std::endl;
        std::cout << "Protected Variable (proVar): " << proVar << std::endl;
        std::cout << "Public Variable (pubVar): " << pubVar << std::endl;
    }
};

int main() {
    // Create an object of AccessSpecifierDemo
    AccessSpecifierDemo demoObject;

    // Set values for member variables by reading from the user using setVar method
    demoObject.setVar();

    // Display values of member variables using the getVar method
    demoObject.getVar();

    return 0;
}
