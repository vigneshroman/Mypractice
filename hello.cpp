#include<iostream>
using namespace std;
class sample
{
public:
int id;
string name;
//static int count;
sample(int i ,string n)
{
  this-> id = i; //this ptrcurrent class instance
  this-> name =n;
 // count++;
}
void display()
{
    cout<<id<<" "<<name<<endl;
}
~sample()
{
    cout<<"I can free the memory  to you!!";
}
};
//int sample::count=0;
int main()
{ sample s1 = sample(1,"shinchan");
sample s2 = sample(2,"kazama");
s1.display();
s2.display();
//cout<<sample::count;

//s.id = 2;
/*s.name ="viki";
cout<<s.id<< endl;
cout<<s.name<<endl;*/

    return 0; 
}
