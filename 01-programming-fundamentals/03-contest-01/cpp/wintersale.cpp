#include <iostream>
#include <iomanip>
using namespace std;

int main() {

    int x, p;
    cin >> x >> p;

    float orginal_price;

    orginal_price = p / (1 - (x/100.0));

    cout << fixed << setprecision(2);
    cout << orginal_price << endl;
    return 0;
}