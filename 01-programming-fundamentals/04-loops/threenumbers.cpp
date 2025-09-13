#include <bits/stdc++.h>
using namespace std;

#define endl '\n'
#define int long long

const int MOD = 1e9 + 7;
const int INF = LLONG_MAX >> 1;

signed main() {
    ios::sync_with_stdio(false); cin.tie(NULL);

    int k, s; cin >> k >> s;

    int c = 0;
    for(int i=0; i<=k; i++) {
        for(int j=0; j<=k; j++) {
            if(s-i-j>=0 && s-i-j<=k) 
                c++;
        }
    }

    cout << c << endl;
}