#include<stdio.h>
#include<stdlib.h>
struct Node
{ int data;
struct Node* next;
}Node;

struct Node* head;
void Insert(int data,int n);
void print();

void main()
{
    head = NULL;
    Insert(1,1);
    Insert(2,2);
    print();
}

void Insert(int data,int n)//To insert element at nth position in the  list/'
{
    struct Node* temp1 = (struct Node*)malloc(sizeof(struct Node));
    temp1->data = data;
    temp1->next = NULL;
    if (n==1)
    { 
    temp1->next =head;
    head = temp1;
    return;
    }
    struct Node* temp2=head;
    //int i;
    for ( int i = 0; i < n-2; i++)
    {
      temp2=temp2->next;
    } 
    temp1->next=temp2->next;
    temp2->next =temp1;
}

void print(void) //Traversing through the list printing the values.
{
struct Node* temp = head;
printf("List is:");
while(temp !=NULL)
{
    printf("%d ",temp->data);
    temp=temp->next;
}
printf("\n");
}

