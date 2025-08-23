#include <iostream>
using namespace std;

int main() {
    int a, b, c, x, y, z;
    cin >> a >> b >> c;
    x = a;
    y = b;
    z = c;
    if(x > y) {
        int temp = x;
        x = y;
        y = temp;
    } 

    if(x > z) {
        int temp = x;
        x = z;
        z = temp;        
    }

    if(y > z) {
        int temp = y;
        y = z;
        z = temp;
    }

    
    cout << x << '\n' << y << '\n' << z << '\n' << endl;
    cout << a << '\n' << b << '\n' << c << '\n';
}