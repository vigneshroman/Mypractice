#include<stdio.h>
#include<stdlib.h>

struct Node
{ int data;
struct Node* next;
    
}Node;
struct Node* head;
void Insert(int x);
void print();
void main()
{
    head = NULL;
    printf("How many numbers?\n");
    int n,i,x;
    scanf("%d",&n);
    for (i=0;i<n;i++)
    {
        printf("Enter number");
        scanf("%d",&x);
        Insert(x);
        print();
    }
    
}

void Insert(int x)//To insert element at the beginning of the list/'
{
    struct Node* temp = (struct Node*)malloc(sizeof(struct Node));
    temp->data = x;
    temp->next = NULL;
    if (head!=NULL)temp->next =head;
    head = temp;
   
}
void print(void)
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

