#include <bits/stdc++.h>
using namespace std;

#define endl '\n'
#define int long long

const int MOD = 1e9 + 7;
const int INF = LLONG_MAX >> 1;

signed main() {
    ios::sync_with_stdio(false); cin.tie(NULL);

    char ch; cin >> ch;
    int n; cin >> n;
    
    for(int i=1; i<=n; i++) {
        int num; cin >> num;

        for(int j=1; j<=num; j++) {
            cout << ch;
        }

        cout << endl;
    }
}