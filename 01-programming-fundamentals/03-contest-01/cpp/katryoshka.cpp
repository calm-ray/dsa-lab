#include<bits/stdc++.h>
using namespace std;

int main() {
    long long e, m, b;
    cin >> e >> m >> b;
    long long res=0;
    if(e!=0 || b!=0) {
        if(m<e && m<b) {
            res = m;
            e = e - m;
            b = b - m;
            res += min(e/2, b);
        } else {
            res = min(e, b);
        }
    }

    cout << res << endl;
    return 0;
}