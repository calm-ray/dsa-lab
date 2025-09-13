#include <bits/stdc++.h>
using namespace std;

#define endl '\n'
#define int long long

const int MOD = 1e9 + 7;
const int INF = LLONG_MAX >> 1;

signed main() {
    ios::sync_with_stdio(false); cin.tie(NULL);

    int a, b; cin >> a >> b;
    
    bool hasLuckyNum = false;
    for(int i=a; i<=b; i++) {
        int temp = i;
        while(temp != 0) {
            int d = temp % 10;
            if(!(d==4 || d==7)) {
                break;
            }
            temp /= 10; 
        }
        if(temp == 0) {
            cout << i << " ";
            hasLuckyNum = true;
        }
    }

    if(!hasLuckyNum)
        cout << -1 << endl;
}