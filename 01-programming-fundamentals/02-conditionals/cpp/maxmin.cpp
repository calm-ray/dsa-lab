#include <iostream>
using namespace std;

int main() {
    long a, b, c;
    cin >> a >> b >> c;
    
    long min, max;

    if(a > b) {
        if(a > c) {
            max = a;
        } else {
            max = c;
        }
    } else {
        if(b > c) {
            max = b;
        } else {
            max = c;
        }
    }

    if(a < b) {
        if(a < c) {
            min = a;
        } else {
            min = c;
        }
    } else {
        if(b < c) {
            min = b;
        } else {
            min = c;
        }
    }

    cout << min << " " << max;
}