#include <bits/stdc++.h>
using namespace std;

#define endl '\n'
#define int long long

const int MOD = 1e9 + 7;
const int INF = LLONG_MAX >> 1;

signed main() {
    ios::sync_with_stdio(false); cin.tie(NULL);

    int n;
    cin >> n;

    int even = 0, odd = 0, positive = 0, negative = 0;

    for (int i = 1; i <= n; i++)
    {
        int num; cin >> num;
        if(num % 2 == 0) {
            even += 1;
            if (num < 0) {
                negative += 1;
            } else if (num > 0) {
                positive += 1;
            }
        } else {
            odd += 1;
            if (num < 0) {
                negative += 1;
            } else if (num > 0) {
                positive += 1;
            }
        }
    }

    cout << "Even: " << even << endl;
    cout << "Odd: " << odd << endl;
    cout << "Positive: " << positive << endl;
    cout << "Negative: " << negative << endl;
}