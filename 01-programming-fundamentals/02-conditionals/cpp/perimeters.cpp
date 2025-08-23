#include <iostream>
#include <iomanip>
#include <cmath>
using namespace std;

int main() {
    string menu = 
        "Select the shape to calculate Perimeter:\n"
        "1. Perimeter of Circle\n"
        "2. Perimeter of Equilateral Triangle\n"
        "3. Perimeter of Parallelogram\n"
        "4. Perimeter of Rectangle\n"
        "5. Perimeter of Square\n"
        "6. Perimeter of Rhombus\n";

    cout << menu;

    int n; cin >> n;

    double result = 0.0;
    cout << fixed << setprecision(9);

    switch (n) {
        case 1:
            double radius; 
            cout << "Enter radius: ";
            cin >> radius;
            result = (3.141592653 * 2 * radius);
            cout << "Result: " << result << endl;
            break;
        case 2:
            double side;
            cout << "Enter a side: ";
            cin >> side;
            result = 3 * side;
            cout << "Result: " << result << endl;
            break;
        case 3:
            double side1, side2;
            cout << "Enter side1 and side2: ";
            cin >> side1 >> side2;
            result = 2 * (side1 + side2);
            cout << "Result: " << result << endl;
            break;
        case 4:
            double length, breadth;
            cout << "Enter length and breadth: ";
            cin >> length >> breadth;
            result = 2 * (length + breadth);
            cout << "Result: " << result << endl;
            break;
        case 5:
            double side_sq;
            cout << "Enter side of square: ";
            cin >> side_sq;
            result = 4 * side_sq;
            cout << "Result: " << result << endl;
            break; 
        case 6:
            double side_rb;
            cout << "Enter side of rombhus: ";
            cin >> side_rb;
            result = 4 *side_rb;
            cout << "Result: " << result << endl;
            break;
        default:
            cout << "Invalid input";
            break;
    }
}