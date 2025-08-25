#include <iostream>
using namespace std;

int main() {
    char c;
    cin>>c;
    cout << (char)('a' + ((c-'a'+1) % 26)) << endl;
}

