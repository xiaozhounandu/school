#include "stdio.h"
#include "stdlib.h"
//#define ElemType int
typedef int ElemType;

typedef struct node
{
	ElemType data;
	struct node *next;
}SLinkNode;

void InitList(SLinkNode *&L) //L为引用型参数
{  L=(SLinkNode *)malloc(sizeof(SLinkNode)); //创建头结点L
   L->next=NULL;
}

void DestroyList(SLinkNode *&L)
{  SLinkNode *pre=L,*p=pre->next;
   while (p!=NULL)
   {  free(pre);
      pre=p; p=p->next;	//pre、p同步后移
   }
   free(pre);
}

int GetLength(SLinkNode *L)
{  int i=0;
   SLinkNode *p=L->next;
   while (p!=NULL)
   {  i++;
      p=p->next;
   }
   return i;
}

int GetElem(SLinkNode *L,int i,ElemType &e)
{  int j=0;
   SLinkNode *p=L;		//p指向头结点，计数器j置为0
   if (i<=0) return 0;	//参数i错误返回0
   while (p!=NULL && j<i)
   {  j++;
      p=p->next;
   }
   if (p==NULL) return 0;	//未找到返回0
   else
   {  e=p->data;
      return 1;		//找到后返回1
   }
}

int Locate(SLinkNode *L,ElemType e)	
{  SLinkNode *p=L->next;
   int j=1;		//p指向第一个数据结点，j置为其序号1
   while (p!=NULL && p->data!=e)
   {	p=p->next;
	j++;
   }
   if (p==NULL) return(0);	//未找到返回0
   else return(j);		//找到后返回其序号
}

int InsElem(SLinkNode *&L,ElemType x,int i)	
{  int j=0;
   SLinkNode *p=L,*s;
   if (i<=0) return 0;	  //参数i错误返回0
   while (p!=NULL && j<i-1)	  //查找第i-1个结点p
   {	j++;
	p=p->next;
   }
   if (p==NULL)
      return 0;		  //未找到第i-1个结点时返回0
   else				  //找到第i-1个结点p
   {	s=(SLinkNode *)malloc(sizeof(SLinkNode));
	s->data=x;		  //创建存放元素x的新结点s
	s->next=p->next;	  //将s结点插入到p结点之后
	p->next=s;
	return 1;		  //插入运算成功,返回1
   }
}

int DelElem(SLinkNode *&L,int i)
{  int j=0;
   SLinkNode *p=L,*q;
   if (i<=0) return 0;	  //参数i错误返回0
   while (p!=NULL && j<i-1)	  //查找第i-1个结点
   {	j++;
	p=p->next;
   }
   if (p==NULL) return 0;	  //未找到第i-1个结点时返回0
   else				  //找到第i-1个结点p
   {	q=p->next;		  //q指向被删结点
	if (q==NULL) return 0;  //没有第i个结点时返回0
	else
	{   p->next=q->next;	  //从单链表中删除q结点
		free(q);		  //释放其空间
		return 1;
	}
   }
}

void DispList(SLinkNode *L)
{  SLinkNode *p=L->next;
   printf("--->[");
   while (p!=NULL)
   {	printf("%d, ",p->data);
	p=p->next;
   }
   printf("]\n");
}

void CreateListF(SLinkNode *&L,ElemType a[],int n)
{  SLinkNode *s;  int i;
   L=(SLinkNode *)malloc(sizeof(SLinkNode));//创建头结点
   L->next=NULL;	//头结点的next域置空，表示一个空单链表
   for (i=0;i<n;i++)		//遍历a数组所有元素
   {	s=(SLinkNode *)malloc(sizeof(SLinkNode));
	s->data=a[i];		//创建存放a[i]元素的新结点s
	s->next=L->next;	//将s插在头结点之后
	L->next=s;
   }
}

void CreateListR(SLinkNode *&L,ElemType a[],int n)
{  SLinkNode *s,*tc;  int i;
   L=(SLinkNode *)malloc(sizeof(SLinkNode));  //创建头结点
   tc=L;		//tc始终指向尾结点,初始时指向头结点
   for (i=0;i<n;i++)
   {	s=(SLinkNode *)malloc(sizeof(SLinkNode));
	s->data=a[i];	//创建存放a[i]元素的新结点s
	tc->next=s;	//将s插入tc之后
	tc=s;
   }
   tc->next=NULL;	//尾结点next域置为NULL
}

SLinkNode *Maxnode(SLinkNode *L)
{  SLinkNode *p=L->next,*maxp=p;
   while (p!=NULL)	//遍历所有的结点
   {  if (maxp->data<p->data)
         maxp=p;	//当p指向更大的结点时，将其赋给maxp
      p=p->next;	//p沿next域下移一个结点
   }
   return maxp;
}

void Delmaxnode(SLinkNode *&L)
{  SLinkNode *p=L->next,*pre=L,*maxp=p,*maxpre=pre;
   while (p!=NULL)
   {  if (maxp->data<p->data)
      {
	  	maxp=p;
	  	maxpre=pre;
      }
      pre=p;	//pre、p同步后移，保证pre始终为p的前驱结点
      p=p->next;
   }
   maxpre->next=maxp->next;	//删除maxp结点
   free(maxp);			//释放maxp结点
}

void Reverse(SLinkNode *&L)
{  SLinkNode *p=L->next,*q;
   L->next=NULL;
   while (p!=NULL)		//遍历所有数据结点
   {	q=p->next;		//q临时保存p结点之后的结点
	p->next=L->next;	//将结点p插入到头结点之后
	L->next=p;
	p=q;
   }
}

void Merge(SLinkNode *ha, SLinkNode *hb,SLinkNode *&hc)
{  SLinkNode *pa=ha->next,*pb=hb->next,*tc;
   hc=ha; tc=hc;		  //将ha的头结点用作hc的头结点
   free(hb);			  //释放hb的头结点
   while (pa!=NULL && pb!=NULL)
   {  if (pa->data<pb->data)
      {  tc->next=pa;tc=pa;	  //将pa链接到tc之后
         pa=pa->next;
      }
      else 			  //pa->data>pb->data
      {  tc->next=pb;tc=pb;	  //将pb链接到tc之后
         pb=pb->next;
      }
   }
   tc->next=NULL;
   if (pa!=NULL) tc->next=pa;	  //ha单链表还有结点时
   if (pb!=NULL) tc->next=pb;	  //hb单链表还有结点时
}

int main(){
	int j, menuno, elemValue, elemj, elemno;
	SLinkNode *L, *ha, *hb, *hc;
	ElemType a[5] = {2,4,56,43,23},e=0;
	ElemType b[5] = {22,14,56,63,63};
	
	
	do{
		printf("\n       主菜单                      \n");
		printf("\n    1.初始化线性链表               \n");
		printf("\n    2.头插法整体创建线性链表       \n");
		printf("\n    3.销毁线性链表                 \n");
		printf("\n    4.求线性链表长度并显示         \n");
		printf("\n    5.求线性链表中第i个元素并显示  \n");
		printf("\n    6.按值查找线性链表运算         \n");
		printf("\n    7.线性链表插入元素运算算法     \n");
		printf("\n    8.线性链表删除元素运算算法     \n");
		printf("\n    9.输出线性链表元素值运算       \n");
		printf("\n    10.尾插法整体创建线性链表      \n");
		printf("\n    11.查找线性链表中第一个值最大的元素    \n");
		printf("\n    12.删除线性链表中第一个值最大的元素    \n");
		printf("\n    13.线性链表中元素逆置          \n");
		printf("\n    14.合并两个有序的单链表        \n");
		printf("\n    0.结束程序运行                 \n");
		printf("\n             \n");
		printf("\n-------------------------------\n");
		printf("\n请输入你的选择（1，2，3，4，5，6，7，8，9，10，11，12，13，14，0）\n");
		scanf("%d", &menuno);
		switch(menuno){
			case 1:{
				InitList(L);
				printf("线性链表初始化成功！\n");
				break;
			}
			case 2:{
				CreateListF(L,a,5);
				printf("头插法整体创建线性链表成功！\n");
				break;
			}
			case 3:{
				DestroyList(L);
				printf("线性表已销毁！\n");
				break;
			} 
			case 4:{
				printf("线性表长度为%d\n", GetLength(L));
				break;
			}
			case 5:{
				DispList(L);
				printf("请输入要查找的元素逻辑序号：\n");
				scanf("%d",&elemno);
				GetElem(L,elemno,e);
				printf("线性表中第%d个元素是%d\n",elemno,e);
				break;
			}
			case 6:{
				printf("请输入想要查找的值: ");
				scanf("%d", &elemj);
				printf("其位置在[%d]", Locate(L, elemj));
				break;
			}
			case 7:{
			printf("请输入想要插入的元素及其下标（下标从1 开始）");
			scanf("%d %d",&elemj,&elemno);
				printf("线性表插入一个数据成功！\n",InsElem(L, elemj, elemno));	
				break;
			
			
//			
//				printf("请输入要插入的元素及下标（下标从1开始） exp:[1 0]");
//				scanf("%d %d", &elemj, &elemno);
//				printf("是否成功 : [%d]", InsElem(L, elemj, elemno));
//				DispList(L);
//				break;
			}
			case 8:{
				DispList(L);
				printf("请输入要删除元素的下标（从1开始）: ");
				scanf("%d", &elemno);
				printf("是否成功:[%d]", DelElem(L, elemno));
				break;
			}
			case 9:{
				DispList(L);
				break;
			}
			case 10:{
				printf("输入需要插入的顺序表长度: ");
				scanf("%d", &j);
				CreateListR(L, a, j);
				DispList(L);
				break;
			}
			case 11:{
				DispList(L);
				printf("获取到最大的顺序表结点为[%d]", Maxnode(L)->data);
				break;
			}
			case 12:{
//				void Delmaxnode(SLinkNode *&L)
				printf("删除链表最大值!");
				Delmaxnode(L);
				break;
			}
			case 13:{
				printf("元素逆置");
				Reverse(L);
				break;
			}
			
			case 14:{
				InitList(ha); InitList (hb); InitList(hc);
				CreateListR(ha, a,5) ;CreateListR(hb,b,5);
				Merge(ha,hb,hc);
				printf("合并两个有序的单链表己成功！In");
				DispList (hc);
				break;
			}
			case 0:{
					printf("程序执行结束了！");
					exit(0);
			}
		}
	}while(menuno<=20);
	return 0;
} 

