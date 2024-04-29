#include <iostream>
#include <string>

// Define a namespace for the template functions and classes
namespace MyNamespace {

    // Template function to find the maximum of two values
    template <typename T>
    T maximum(T a, T b) {
        return (a > b) ? a : b;
    }

    // Template class for a Pair
    template <typename T1, typename T2>
    class Pair {
    private:
        T1 first;
        T2 second;
    public:
        Pair(T1 f, T2 s) : first(f), second(s) {}

        void display() const {
            std::cout << "(" << first << ", " << second << ")" << std::endl;
        }
    };

} // End of namespace MyNamespace

int main() {
    using namespace std;
    using namespace MyNamespace;

    int int1, int2;
    double double1, double2;
    string str1, str2;

    cout << "Enter two integers: ";
    cin >> int1 >> int2;
    cout << "Maximum of integers: " << MyNamespace::maximum(int1, int2) << endl;

    cout << "Enter two floating-point numbers: ";
    cin >> double1 >> double2;
    cout << "Maximum of floating-point numbers: " << MyNamespace::maximum(double1, double2) << endl;

    

    Pair<int, double> p1(int1, double1);
    Pair<double, double> p2(double1, double2);

    cout << "Pair 1: ";
    p1.display();
    cout << "Pair 2: ";
    p2.display();

    return 0;
}
