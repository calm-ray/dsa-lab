#include<bits/stdc++.h>
using namespace std;
int main()
{
	int a;
	cin>>a;
   
    int q = a / 10;
    int r = a % 10;

    if(r == 0 || q%r == 0 || r%q == 0) {
        cout << "YES";
    } else {
        cout << "NO";
    }
}