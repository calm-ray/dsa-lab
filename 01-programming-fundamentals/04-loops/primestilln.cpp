#include <bits/stdc++.h>
using namespace std;

#define endl '\n'
#define int long long

const int MOD = 1e9 + 7;
const int INF = LLONG_MAX >> 1;

signed main() {
    ios::sync_with_stdio(false); cin.tie(NULL);

    int n; cin >> n;
    
    for(int j=1; j<=n; j++) {
        if(j == 1 || j == 0) continue;
        int count = 1;
        for(int i=2; i*i<=j; i++) {
            if(j%i == 0) {
                count++;
                break;
            }
        }

        if(count == 1) 
            cout << j << " ";
    }
}