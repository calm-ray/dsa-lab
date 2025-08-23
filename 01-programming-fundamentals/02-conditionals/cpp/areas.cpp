#include <iostream>
#include <iomanip>
#include <cmath>
using namespace std;

int main() {
    string menu = 
        "Select the shape to calculate Area:\n"
        "1. Area of Circle\n"
        "2. Area of Triangle\n"
        "3. Area of Rectangle\n"
        "4. Area of Isosceles Triangle\n"
        "5. Area of Parallelogram\n"
        "6. Area of Rhombus\n"
        "7. Area of Equilateral Triangle\n";

    cout << menu;

    int n; cin >> n;

    double result = 0.0;
    cout << fixed << setprecision(9);

    switch (n) {
        case 1:
            double radius; 
            cout << "Enter radius: ";
            cin >> radius;
            result = (3.141592653 * radius * radius);
            cout << "Result: " << result << endl;
            break;
        case 2:
            double base, height;
            cout << "Enter base and height: ";
            cin >> base >> height;
            result = (base * height * 0.5);
            cout << "Result: " << result << endl;
            break;
        case 3:
            double length, breadth;
            cout << "Enter length and breadth: ";
            cin >> length >> breadth;
            result = (length * breadth);
            cout << "Result: " << result << endl;
            break;
        case 4:
            double equal_sides, base_it;
            cout << "Enter equal sides and base: ";
            cin >> equal_sides >> base_it;
            result = (base_it/4.0) * (sqrt((4.0*equal_sides*equal_sides) - (base_it*base_it)));
            cout << "Result: " << result << endl;
            break;
        case 5:
            double base_p, height_p;
            cout << "Enter base and height: ";
            cin >> base_p >> height_p;
            result = (base_p * height_p);
            cout << "Result: " << result << endl;
            break; 
        case 6:
            double d1, d2;
            cout << "Enter diagonal 1 and 2: ";
            cin >> d1 >> d2;
            result = d1*d2*0.5;
            cout << "Result: " << result << endl;
            break;
        case 7:
            double side_et;
            cout << "Enter side: ";
            cin >> side_et;
            result = (sqrt(3) / 4) * side_et * side_et;
            cout << "Result: " << result << endl;
            break;
        default:
            cout << "Invalid input";
            break;
    }
}