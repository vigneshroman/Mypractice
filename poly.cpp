#include "iostream"
using namespace std;
class shape
{
public:
 virtual void draw()
   {
       cout<<"drawing"<<endl;
   }
    
};
class rect : public shape
{
    public:
    void draw()
    {
cout<<"rect";
    }
};
class square:public shape
{
  public:
   void draw()
   {
       cout<<"square";
   }
};
int main(void)
{
   shape *s;
   shape ss;
   rect r;
   square sq;
   s=&ss;
   s->draw();
   s=&r;
   s->draw();
   s=&sq;
   s->draw();

    return 0;
}