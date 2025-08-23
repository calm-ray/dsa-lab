#include <iostream>
using namespace std;

int main() {
    int a,b,c,d,p;
    cin>>a>>b>>c>>d;
    a=a%100;
    b=b%100;
    c=c%100;
    d=d%100;  

    p=a*b*c*d;
    
    if(p%100<=9) cout<<0;
    cout<<p%100;
    
    return 0;       
}