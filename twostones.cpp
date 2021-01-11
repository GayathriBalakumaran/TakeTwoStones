# include <iostream>
using namespace std;
int main(){
        int i;
        cin>>i;
        if(i>=1 && i<=10000000){
            i=i%2;
            if(i==0){
                cout<<"Bob";
            }
            else{
                cout<<"Alice";
            }
        }
}