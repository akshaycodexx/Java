#include<iostream>
#include<vector>
using namespace std;
int main(){
    vector<vector<int>>arr={{1,3},{2,4},{3,5},{6,7}};
    for(int i=0;i<arr.size();i++){
        cout<<arr[i][0]<<endl;
    }
    return 0;
}