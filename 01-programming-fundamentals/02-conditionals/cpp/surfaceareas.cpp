#include <iostream>
#include <iomanip>
#include <cmath>
using namespace std;

int main() {
    string menu = 
        "Select to calculate:\n"
        "1. Curved Surface Area of Cylinder\n"
        "2. Total Surface Area of Cube\n";

    cout << menu;

    int n; cin >> n;

    double result = 0.0;
    cout << fixed << setprecision(9);

    switch (n) {
        case 1:
            double radius_cylinder, height_cylinder; 
            cout << "Enter radius and height: ";
            cin >> radius_cylinder >> height_cylinder;
            result = (2 * 3.141592653 * radius_cylinder * height_cylinder);
            cout << "Result: " << result << endl;
            break;
        case 2:
            double side;
            cout << "Enter side: ";
            cin >> side;
            result = 6 * side * side;
            cout << "Result: " << result << endl;
            break;
        default:
            cout << "Invalid input";
            break;
    }
}