#include <iostream>
using namespace std;
#pragma pack(1)

class Demo
{
    int i ;
    char ch;
    float f;

};


int main()
{
    Demo dobj;
    dobj.i = 11;        //Error
    dobj.ch = 'A';      //Error
    dobj.f = 3.14;      //Error

    return 0;
}