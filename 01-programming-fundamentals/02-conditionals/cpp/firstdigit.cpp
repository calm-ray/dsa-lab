#include <iostream>
using namespace std;

int main() {
    int x; cin >> x;

    cout << (((x / 1000) % 2 == 0) ? "EVEN" : "ODD") << endl;
}