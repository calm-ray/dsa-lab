#include <iostream>
#include <cmath>
#include <iomanip>
using namespace std;

int main() {
    cout << "Enter x1, x2, y1, y2: " << endl;
    double x1, x2, y1, y2;

    cin >> x1 >> x2 >> y1 >> y2;

    cout << fixed << setprecision(9);
    double result = sqrt(pow((x2 -x1),2) + pow((y2 - y1),2));
    cout << result << endl;
}