#include <bits/stdc++.h>
using namespace std;

#define endl '\n'
#define int long long

const int MOD = 1e9 + 7;
const int INF = LLONG_MAX >> 1;

signed main() {
    ios::sync_with_stdio(false); cin.tie(NULL);

    int tc; cin >> tc;

    while(tc--) {
        int n, m; cin >> n >> m;
        if(n < 0 || m < 0) {
            break;
        }

        int max = 0, min = 0;
        if(n > m) {
            max = n;
            min = m;
        } else {
            max = m;
            min = n;            
        }

        int sum = 0;
        for(int i=min+1; i<max; i++) {
            sum += i%2!=0?i:0;
        }
        cout << sum << endl;
    }
}