#include "iostream"
#include "list"
using namespace std;
int main()
{    
    list<int> li ={1,2,3,4};
    
    // Iterator to traverse the list.
    list<int> :: iterator itr = li.end(); 
    li.insert(itr,1,5);
    for(itr=li.begin();itr!=li.end();++itr)
    {
        cout<<*itr<<",";
        
    }
    
    return 0;
}