#include <bits/stdc++.h>
using namespace std;

#define endl '\n'
#define int long long

const int MOD = 1e9 + 7;
const int INF = LLONG_MAX >> 1;

signed main() {
    ios::sync_with_stdio(false); cin.tie(NULL);

    int n; cin >> n;

    int a = 0, b = 1;
    cout << a << " ";

    for(int i=2; i<=n; i++) {
        int c = a + b;
        cout << c << " ";
        b = a;
        a = c; 
    }
}