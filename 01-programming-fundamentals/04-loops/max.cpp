#include <bits/stdc++.h>
using namespace std;

#define endl '\n'
#define int long long

const int MOD = 1e9 + 7;
const int INF = LLONG_MAX >> 1;

signed main() {
    ios::sync_with_stdio(false); cin.tie(NULL);

    int tc; cin >> tc;
    int max = LLONG_MIN;
    for(int i=1; i<=tc; i++) {
        
        int n; cin >> n;
        if(n > max) 
            max = n;
    }

    cout << max << endl;
}