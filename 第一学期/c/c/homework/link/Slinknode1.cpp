#include "stdio.h"
#include "stdlib.h"
//#define ElemType int
typedef int ElemType;

typedef struct node
{
	ElemType data;
	struct node *next;
}SLinkNode;

void InitList(SLinkNode *&L) //LΪ�����Ͳ���
{  L=(SLinkNode *)malloc(sizeof(SLinkNode)); //����ͷ���L
   L->next=NULL;
}

void DestroyList(SLinkNode *&L)
{  SLinkNode *pre=L,*p=pre->next;
   while (p!=NULL)
   {  free(pre);
      pre=p; p=p->next;	//pre��pͬ������
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
   SLinkNode *p=L;		//pָ��ͷ��㣬������j��Ϊ0
   if (i<=0) return 0;	//����i���󷵻�0
   while (p!=NULL && j<i)
   {  j++;
      p=p->next;
   }
   if (p==NULL) return 0;	//δ�ҵ�����0
   else
   {  e=p->data;
      return 1;		//�ҵ��󷵻�1
   }
}

int Locate(SLinkNode *L,ElemType e)	
{  SLinkNode *p=L->next;
   int j=1;		//pָ���һ�����ݽ�㣬j��Ϊ�����1
   while (p!=NULL && p->data!=e)
   {	p=p->next;
	j++;
   }
   if (p==NULL) return(0);	//δ�ҵ�����0
   else return(j);		//�ҵ��󷵻������
}

int InsElem(SLinkNode *&L,ElemType x,int i)	
{  int j=0;
   SLinkNode *p=L,*s;
   if (i<=0) return 0;	  //����i���󷵻�0
   while (p!=NULL && j<i-1)	  //���ҵ�i-1�����p
   {	j++;
	p=p->next;
   }
   if (p==NULL)
      return 0;		  //δ�ҵ���i-1�����ʱ����0
   else				  //�ҵ���i-1�����p
   {	s=(SLinkNode *)malloc(sizeof(SLinkNode));
	s->data=x;		  //�������Ԫ��x���½��s
	s->next=p->next;	  //��s�����뵽p���֮��
	p->next=s;
	return 1;		  //��������ɹ�,����1
   }
}

int DelElem(SLinkNode *&L,int i)
{  int j=0;
   SLinkNode *p=L,*q;
   if (i<=0) return 0;	  //����i���󷵻�0
   while (p!=NULL && j<i-1)	  //���ҵ�i-1�����
   {	j++;
	p=p->next;
   }
   if (p==NULL) return 0;	  //δ�ҵ���i-1�����ʱ����0
   else				  //�ҵ���i-1�����p
   {	q=p->next;		  //qָ��ɾ���
	if (q==NULL) return 0;  //û�е�i�����ʱ����0
	else
	{   p->next=q->next;	  //�ӵ�������ɾ��q���
		free(q);		  //�ͷ���ռ�
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
   L=(SLinkNode *)malloc(sizeof(SLinkNode));//����ͷ���
   L->next=NULL;	//ͷ����next���ÿգ���ʾһ���յ�����
   for (i=0;i<n;i++)		//����a��������Ԫ��
   {	s=(SLinkNode *)malloc(sizeof(SLinkNode));
	s->data=a[i];		//�������a[i]Ԫ�ص��½��s
	s->next=L->next;	//��s����ͷ���֮��
	L->next=s;
   }
}

void CreateListR(SLinkNode *&L,ElemType a[],int n)
{  SLinkNode *s,*tc;  int i;
   L=(SLinkNode *)malloc(sizeof(SLinkNode));  //����ͷ���
   tc=L;		//tcʼ��ָ��β���,��ʼʱָ��ͷ���
   for (i=0;i<n;i++)
   {	s=(SLinkNode *)malloc(sizeof(SLinkNode));
	s->data=a[i];	//�������a[i]Ԫ�ص��½��s
	tc->next=s;	//��s����tc֮��
	tc=s;
   }
   tc->next=NULL;	//β���next����ΪNULL
}

SLinkNode *Maxnode(SLinkNode *L)
{  SLinkNode *p=L->next,*maxp=p;
   while (p!=NULL)	//�������еĽ��
   {  if (maxp->data<p->data)
         maxp=p;	//��pָ�����Ľ��ʱ�����丳��maxp
      p=p->next;	//p��next������һ�����
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
      pre=p;	//pre��pͬ�����ƣ���֤preʼ��Ϊp��ǰ�����
      p=p->next;
   }
   maxpre->next=maxp->next;	//ɾ��maxp���
   free(maxp);			//�ͷ�maxp���
}

void Reverse(SLinkNode *&L)
{  SLinkNode *p=L->next,*q;
   L->next=NULL;
   while (p!=NULL)		//�����������ݽ��
   {	q=p->next;		//q��ʱ����p���֮��Ľ��
	p->next=L->next;	//�����p���뵽ͷ���֮��
	L->next=p;
	p=q;
   }
}

void Merge(SLinkNode *ha, SLinkNode *hb,SLinkNode *&hc)
{  SLinkNode *pa=ha->next,*pb=hb->next,*tc;
   hc=ha; tc=hc;		  //��ha��ͷ�������hc��ͷ���
   free(hb);			  //�ͷ�hb��ͷ���
   while (pa!=NULL && pb!=NULL)
   {  if (pa->data<pb->data)
      {  tc->next=pa;tc=pa;	  //��pa���ӵ�tc֮��
         pa=pa->next;
      }
      else 			  //pa->data>pb->data
      {  tc->next=pb;tc=pb;	  //��pb���ӵ�tc֮��
         pb=pb->next;
      }
   }
   tc->next=NULL;
   if (pa!=NULL) tc->next=pa;	  //ha�������н��ʱ
   if (pb!=NULL) tc->next=pb;	  //hb�������н��ʱ
}

int main(){
	int j, menuno, elemValue, elemj, elemno;
	SLinkNode *L, *ha, *hb, *hc;
	ElemType a[5] = {2,4,56,43,23},e=0;
	ElemType b[5] = {22,14,56,63,63};
	
	
	do{
		printf("\n       ���˵�                      \n");
		printf("\n    1.��ʼ����������               \n");
		printf("\n    2.ͷ�巨���崴����������       \n");
		printf("\n    3.������������                 \n");
		printf("\n    4.�����������Ȳ���ʾ         \n");
		printf("\n    5.�����������е�i��Ԫ�ز���ʾ  \n");
		printf("\n    6.��ֵ����������������         \n");
		printf("\n    7.�����������Ԫ�������㷨     \n");
		printf("\n    8.��������ɾ��Ԫ�������㷨     \n");
		printf("\n    9.�����������Ԫ��ֵ����       \n");
		printf("\n    10.β�巨���崴����������      \n");
		printf("\n    11.�������������е�һ��ֵ����Ԫ��    \n");
		printf("\n    12.ɾ�����������е�һ��ֵ����Ԫ��    \n");
		printf("\n    13.����������Ԫ������          \n");
		printf("\n    14.�ϲ���������ĵ�����        \n");
		printf("\n    0.������������                 \n");
		printf("\n             \n");
		printf("\n-------------------------------\n");
		printf("\n���������ѡ��1��2��3��4��5��6��7��8��9��10��11��12��13��14��0��\n");
		scanf("%d", &menuno);
		switch(menuno){
			case 1:{
				InitList(L);
				printf("���������ʼ���ɹ���\n");
				break;
			}
			case 2:{
				CreateListF(L,a,5);
				printf("ͷ�巨���崴����������ɹ���\n");
				break;
			}
			case 3:{
				DestroyList(L);
				printf("���Ա������٣�\n");
				break;
			} 
			case 4:{
				printf("���Ա���Ϊ%d\n", GetLength(L));
				break;
			}
			case 5:{
				DispList(L);
				printf("������Ҫ���ҵ�Ԫ���߼���ţ�\n");
				scanf("%d",&elemno);
				GetElem(L,elemno,e);
				printf("���Ա��е�%d��Ԫ����%d\n",elemno,e);
				break;
			}
			case 6:{
				printf("��������Ҫ���ҵ�ֵ: ");
				scanf("%d", &elemj);
				printf("��λ����[%d]", Locate(L, elemj));
				break;
			}
			case 7:{
			printf("��������Ҫ�����Ԫ�ؼ����±꣨�±��1 ��ʼ��");
			scanf("%d %d",&elemj,&elemno);
				printf("���Ա����һ�����ݳɹ���\n",InsElem(L, elemj, elemno));	
				break;
			
			
//			
//				printf("������Ҫ�����Ԫ�ؼ��±꣨�±��1��ʼ�� exp:[1 0]");
//				scanf("%d %d", &elemj, &elemno);
//				printf("�Ƿ�ɹ� : [%d]", InsElem(L, elemj, elemno));
//				DispList(L);
//				break;
			}
			case 8:{
				DispList(L);
				printf("������Ҫɾ��Ԫ�ص��±꣨��1��ʼ��: ");
				scanf("%d", &elemno);
				printf("�Ƿ�ɹ�:[%d]", DelElem(L, elemno));
				break;
			}
			case 9:{
				DispList(L);
				break;
			}
			case 10:{
				printf("������Ҫ�����˳�����: ");
				scanf("%d", &j);
				CreateListR(L, a, j);
				DispList(L);
				break;
			}
			case 11:{
				DispList(L);
				printf("��ȡ������˳�����Ϊ[%d]", Maxnode(L)->data);
				break;
			}
			case 12:{
//				void Delmaxnode(SLinkNode *&L)
				printf("ɾ���������ֵ!");
				Delmaxnode(L);
				break;
			}
			case 13:{
				printf("Ԫ������");
				Reverse(L);
				break;
			}
			
			case 14:{
				InitList(ha); InitList (hb); InitList(hc);
				CreateListR(ha, a,5) ;CreateListR(hb,b,5);
				Merge(ha,hb,hc);
				printf("�ϲ���������ĵ������ɹ���In");
				DispList (hc);
				break;
			}
			case 0:{
					printf("����ִ�н����ˣ�");
					exit(0);
			}
		}
	}while(menuno<=20);
	return 0;
} 

