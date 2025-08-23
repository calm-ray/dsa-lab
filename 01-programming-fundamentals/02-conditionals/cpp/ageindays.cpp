#include <iostream>
using namespace std;

int main() {
    int n; cin >> n;
    int years = n / 365;
    n = n % 365;

    int months = n / 30;
    n %= 30;

    cout << years << " years" << endl;
    cout << months << " months" << endl;
    cout << n << " days" << endl;

    return 0;
}