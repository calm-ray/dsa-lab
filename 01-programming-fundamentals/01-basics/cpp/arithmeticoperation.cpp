#include <iostream>
using namespace std;

int main() {
    cout << "Enter two numbers: " << endl;
    int a, b; cin >> a >> b;
    cout << "Enter an operator (+, -, *, /, %): " << endl;
    char c; cin >> c;

    int result = 0;
    if(c == '+') 
        result = a+b;
    else if(c == '-')
        result = a-b;
    else if(c == '*')
        result = a*c;
    else if(c == '/')
        result = a/b;
    else if(c == '%')
        result = a%b;

    cout << "Result: " << result << endl;
}