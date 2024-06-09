#include<iostream>
using namespace std;
int main(){
    int a[5]={34,45,5,6,98};
    int check,i;
    cout<<"enter the element";
    cin>>check;
    for(i=0;i<5;i=i+1){
        if(check==a[i]){
            cout<<"found at location="<<i+1;
        }
       
        
    }
    return 0;
}