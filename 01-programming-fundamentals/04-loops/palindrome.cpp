#include <bits/stdc++.h>
using namespace std;

#define endl '\n'
#define int long long

const int MOD = 1e9 + 7;
const int INF = LLONG_MAX >> 1;

signed main() {
    ios::sync_with_stdio(false); cin.tie(NULL);

    int n; cin >> n;
    
    int temp = n;
    int reverse = 0;
    while(temp != 0) {
        int d = temp % 10;
        reverse = reverse * 10 + d;
        temp /= 10; 
    }

    cout << reverse << endl;
    if(reverse == n) {
        cout << "YES" << endl;
    } else {
        cout << "NO" << endl;
    }

}