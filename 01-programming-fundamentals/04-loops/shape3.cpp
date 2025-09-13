#include <bits/stdc++.h>
using namespace std;

#define endl '\n'
#define int long long

const int MOD = 1e9 + 7;
const int INF = LLONG_MAX >> 1;

signed main() {
    ios::sync_with_stdio(false); cin.tie(NULL);

    int n; cin >> n;

    for(int i=1; i<=n; i++) {
        for(int j=n-i; j>=1; j--) {
            cout << " ";
        }
        for(int j=1; j<=i; j++) {
            cout << "*";
        }
        for(int j=1; j<=i-1; j++) {
            cout << "*";
        }
        cout << endl;
    }

    for(int i=n; i>=1; i--) {
        for(int j=n-i; j>=1; j--) {
            cout << " ";
        }
        for(int j=1; j<=i; j++) {
            cout << "*";
        }
        for(int j=1; j<=i-1; j++) {
            cout << "*";
        }
        cout << endl;
    }
}