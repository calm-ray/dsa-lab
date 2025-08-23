#include <iostream>
#include <iomanip>
#include <cmath>
using namespace std;

int main() {
    string menu = 
        "Select the shape to calculate Volume:\n"
        "1. Volume of Cone\n"
        "2. Volume of Prism\n"
        "3. Volume of Cylinder\n"
        "4. Volume of Sphere\n"
        "5. Volume of Pyramid\n";

    cout << menu;

    int n; cin >> n;

    double result = 0.0;
    cout << fixed << setprecision(9);

    switch (n) {
        case 1:
            double radius_cone, height_cone; 
            cout << "Enter radius and height: ";
            cin >> radius_cone >> height_cone;
            result = (1/3.0) * (3.141592653 * radius_cone * radius_cone * height_cone);
            cout << "Result: " << result << endl;
            break;
        case 2:
            double base_area_prism, height_prism;
            cout << "Enter base area and height: ";
            cin >> base_area_prism >> height_prism;
            result = base_area_prism * height_prism;
            cout << "Result: " << result << endl;
            break;
        case 3:
            double radius_cylinder, height_cylinder; 
            cout << "Enter radius and height: ";
            cin >> radius_cylinder >> height_cylinder;
            result = (3.141592653 * radius_cylinder * radius_cylinder * height_cylinder);
            cout << "Result: " << result << endl;
            break;
        case 4:
            double radius_sphere;
            cout << "Enter radius: ";
            cin >> radius_sphere;
            result = (4 / 3.0) * (3.141592653 * radius_sphere * radius_sphere * radius_sphere);
            cout << "Result: " << result << endl;
            break;
        case 5:
            double base_area_pyramid, height_pyramid;
            cout << "Enter side of square: ";
            cin >> base_area_pyramid >> height_pyramid;
            result = (1 / 3.0) * base_area_pyramid * height_pyramid;
            cout << "Result: " << result << endl;
            break; 
        default:
            cout << "Invalid input";
            break;
    }
}