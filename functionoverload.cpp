#include<iostream>
using namespace std;
void add(int a,int b){
cout<<"Addition is "<<(a+b)<<endl;
}
void add(int a,int b,int c){
cout<<"Addition is "<<(a+b+c)<<endl;
}
void add(float a,float b,float c,float d){
cout<<"Addition is "<<(a+b+c+d)<<endl;
}
int main()
{
add(5,6);
add(7,18,45);
add(7.7,18.8,45.5,10.1);
}
