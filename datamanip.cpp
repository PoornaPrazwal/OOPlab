#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
    cout<<"example of endl\n";
    cout<<"enter any string : "<<endl;
    string s,b,k;
    //getline(cin,s);
    cin>>s;
    cout<<"entered string is "<<s<<endl;
    cout<<"example of ends\n";
    cout<<"enter a name : "<<ends;
    cin>>b;
    cout<<b<<" is placed next to the above line !"<<endl;
    cout<<"example of ws\n";
    cout<<"enter a name : "<<ends;
    cin>>k;
    //getline(cin>>ws,k);
    cout<<"the white space removed string is : "<<k<<endl;

    cout<<"example on flush\n";
    cout<<"the line without flush\n";
    cout<<"the line with flush"<<flush<<endl;

    cout<<"example on setw\n";
    cout<<setw(10)<<"balu"<<setw(10)<<"bobby"<<endl;
    cout<<setw(10)<<"vishal"<<setw(10)<<""<<endl;

    cout<<"example on setfill\n";
    cout<<setw(10)<<setfill('-')<<"balu"<<setw(10)<<setfill('-')<<"bobby"<<endl;
    cout<<setw(10)<<setfill('^')<<"vishal"<<setw(10)<<setfill('^')<<"vishal"<<endl;

    cout<<"example on precision\n";
    float a=3.14254;
    cout<<"precison upto 3 : "<<setprecision(3)<<a<<endl;
}

