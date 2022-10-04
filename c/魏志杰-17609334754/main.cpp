#include "stdio.h"
#include "stdlib.h"
#include "malloc.h"


/* run this program using the console pauser or add your own getch, system("pause") or input loop 

function : init,insert ,print-
 ,length,is not empty
*/

typedef char ElemType;
typedef struct LNode {  
	ElemType data;	
   	struct LNode *next;			
} LinkList;
 //初始化 
void InitList(LinkList *&L) {
		//申请相关的空间 
       L=(LinkList *)malloc(sizeof(LinkList));
       //头结点地址域 null 
       L->next=NULL;
}
//插入 
bool ListInsert(LinkList *&L,int i ,ElemType e){
	//	
  int j=0;
  LinkList *p =L,*s;
  
  //循环 
    while (j<i-1&&p!=NULL) {
  	j++;
  	//指针后移 
	  p=p->next ;
  }
  	
	if(p==NULL)	
	return false;
	
else {
	s=(LinkList *)malloc(sizeof(LinkList));
	s->data=e;
	// !
	s->next=p->next;
	p->next=s;
	return true;
}			
} 


//输出 
void DispList(LinkList *L){
	//首节点给指针 
LinkList *p	=L->next;
while(p!=NULL){
	printf("%c",p->data);
	p=p->next; 
}
printf("\n");
}


//
int ListLength(LinkList *L)
{  int i=0;
//LinkList *p =l->next;
//while(p !=null); 
   LinkList *p=L;
   while (p->next!=NULL)
   {  i++;
      p=p->next;
   }
   return i;
} 


bool ListEmpty (LinkList *L){
	return (L->next==NULL);
}
bool ListDelete (LinkList *&L,int i ,ElemType e){
int j=0;
  LinkList *p =L,*q;
  
  //循环 
    while (j<i-1&&p!=NULL) {
  	j++;
  	//指针后移 
	  p=p->next ;
  }
  	
	if(p==NULL)	{
	
	return false;
	}else {
	q=p->next;
	if(q==NULL){
	
	return false;
	e=q->data;
	p->next=q->next;
	free(q);
	return true;
	
	}
}
}

int main(){
 LinkList *h;
 ElemType e;
 printf("单链表的基本运算如下：\n");
 printf(" (1)初始化单链表h\n");
 InitList(h);
 printf(" (2)依次采用尾插法插入a,b,c,d,e元素\n");
 ListInsert(h,1,'a');
 ListInsert(h,2,'b');
 ListInsert(h,3,'c');
 ListInsert(h,4,'d');
 ListInsert(h,5,'e');
 printf(" (3)输出单链表h\n"); 
 DispList(h);
 printf(" (3)删除单链表中第3个元素\n"); 
 ListDelete(h,3,e);
 printf(" (5)再次输出单链表h\n"); 
 DispList(h);
 printf("\nc%",e);
}







