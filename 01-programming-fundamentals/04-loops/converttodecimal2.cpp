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
        int n; cin >> n;

        int c=0;
        while(n!=0) {
            c += n%2==1?1:0;
            n /= 2;
        }

        int result = 0;
        for(int i=0; i<c; i++) {
            result += (int) pow(2, i); 
        }

        cout << result << endl;
    }
}