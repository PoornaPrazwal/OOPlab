#include<iostream>
using namespace std;
int main()
{
    float x,y;
    int choice;
    cout<<"1.Addition 2.Subtraction 3.Multiplication 4.Division :"<<endl;
    cin>>choice; 
    cout<<"Enter two operands :"<<endl;
    cin>>x>>y;
    switch(choice)
    {
        case 1:
            cout<<"Addition "<<x+y<<endl;
            break;
        case 2:
            cout<<"Substraction"<<x-y<<endl;
            break;
        case 3:
            cout<<"Multiplication"<<x*y<<endl;
            break;
        case 4:
            cout<<"Division"<<x/y<<endl;
            break;
        default: 
            cout<<"Enter valid choice "<<endl;
            break;  
    }
}
