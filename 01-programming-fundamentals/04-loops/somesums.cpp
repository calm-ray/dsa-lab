#include <bits/stdc++.h>
using namespace std;

#define endl '\n'
#define int long long

const int MOD = 1e9 + 7;
const int INF = LLONG_MAX >> 1;

signed main() {
    ios::sync_with_stdio(false); cin.tie(NULL);

    int n, a, b; cin >> n >> a >> b;

    int sum = 0;
    for(int i=1; i<=n; i++) {
        int temp = i;
        int sod = 0;
        while(temp!=0) {
            int d = temp % 10;
            sod += d;
            temp /= 10;
        }
        if(sod >= a && sod <= b) {
            sum += i;
        }
    }

    cout << sum;
}