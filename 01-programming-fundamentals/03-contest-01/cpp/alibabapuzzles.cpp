#include <iostream>
using namespace std;

int main() {
    long long a, b, c, d;
    bool flag = false;
    cin >> a >> b >> c >> d;

    ((a+b-c) == d || (a+b*c) == d || (a-b*c) == d || (a-b+c) == d || (a*b+c) == d || (a*b-c) == d) ? cout << "YES" : cout << "NO";

    return 0;
}