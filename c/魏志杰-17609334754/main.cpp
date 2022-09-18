#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include <stdlib.h>
#define MaxSize 100

typedef int ElemType;		//假设顺序表中所有元素为int类型
typedef struct
{  ElemType data[MaxSize];	//存放顺序表的元素
   int length;			//顺序表的实际长度
} SqList;

//初始化 
void InitList(SqList &L) {
		//由于L要回传给实参，所以用引用类型
       L.length=0;
}
//创建 
void CreateList(SqList &L,ElemType a[],int n)
{  int i,k=0;			//k累计顺序表L中的元素个数
   for (i=0;i<n;i++)
   {  L.data[k]=a[i];		//向L中添加一个元素
      k++;			//L中元素个数增1
   }
   L.length=k;			//设置L的长度
}
//销毁 
void DestroyList(SqList L)
{    }
 
//长度 
int GetLength(SqList L)
{
 return L.length;
}

//元素 
int GetElem(SqList L,int i,ElemType &e)
{  if (i<1 || i>L.length)	//无效的i值返回0
      return 0;
   else{ 
        e=L.data[i-1];		//取元素值并返回1
      return 1;
   }
}
//查找 
int Locate(SqList L,ElemType x)	
{  int i=0;
   while (i<L.length && L.data[i]!=x)
     i++; 	//查找值为x的第1个元素,查找范围为0～L.length-1
   if (i>=L.length) return(0);  //未找到返回0
   else return(i+1);		   //找到后返回其逻辑序号
}
//插入 
int InsElem(SqList &L,ElemType x,int i)
{  int j;
   if (i<1 || i>L.length+1)	//无效的参数i
      return 0;
   for (j=L.length;j>i;j--)	//将位置为i的结点及之后的结点后移
      L.data[j]=L.data[j-1];
   L.data[i-1]=x;		//在位置i处放入x
   L.length++;			//线性表长度增1
   return 1;
}
    int DelElem(SqList &L,int i)
{  int j;
   if (i<1 || i>L.length)	//无效的参数i
      return 0;
   for (j=i;j<L.length;j++)	//将位置为i的结点之后的结点前移
      L.data[j-1]=L.data[j];
   L.length--;			//线性表长度减1
   return 1;
}
//删除 
void DispList(SqList L)
{  int i;
   for (i=0;i<L.length;i++)
	printf("%d ",L.data[i]);
   printf("\n");
}
//交换最大值与最小值 
void swap(ElemType &x,ElemType &y)	//交换x和y
{  ElemType tmp=x;
   x=y;  y=tmp;
}

void Swapmaxmin(SqList &L)	//交换L中最大值元素与最小值元素
{  int i,maxi,mini;
   maxi=mini=0;
   for (i=1;i<L.length;i++)
     if (L.data[i]>L.data[maxi])
         maxi=i;
     else if (L.data[i]<L.data[mini])
         mini=i;
   swap(L.data[maxi],L.data[mini]);
}
//元素迁移 
int Deletek(SqList &L,int i,int k){ 
	 int j;
   if (i<1 || k<1 || i+k-1>L.length)
      return 0;			//判断i和k是否合法
   for (j=i+k-1;j<L.length;j++)   	//将元素前移k个位置
      L.data[j-k]=L.data[j];
   L.length-=k;			//L的长度减k
   return 1;
}
//线性表奇前偶后 
void Move(SqList &L)
{  int i=0,j=L.length-1;
   while (i<j)
   {  while (L.data[i]%2==1) i++;	//从前向后找偶数
      while (L.data[j]%2==0) j--;	//从后向前找奇数
      if (i<j)
         swap(L.data[i],L.data[j]);	//交换这两元素
   }
}




int main(){
    SqList L;
    ElemType a[10]={10,20,30,40,50} ,e=0;
    int j ,menuno,elemValue,elemno,elemj;
do{
		printf("\n       主菜单               \n");
		printf("\n    1.初始化线性表          \n");
		printf("\n    2.整体创建顺序表        \n");
		printf("\n    3.销毁线性表            \n");
		printf("\n    4.求线性表长度并显示    \n");
		printf("\n    5.求线性表中第i个元素并显示   \n");
		printf("\n    6.按值查找运算          \n");
		printf("\n    7.插入元素运算算法      \n");
		printf("\n    8.删除元素运算算法      \n");
		printf("\n    9.输出元素值运算        \n");
		printf("\n    10.最大值元素与最小值元素交换          \n");
		printf("\n    11.线性表奇前偶后重新排列          \n");
		printf("\n    0.结束程序运行          \n");
		printf("\n             \n");
		printf("\n-------------------------------\n");
		printf("\n请输入你的选择（1，2，3，4，5，6，7，8，9，10，11，0）\n");
		scanf("%d",&menuno);
		switch(menuno){
			case 1:{
				InitList(L);
				printf("线性表初始化成功！\n");
				break;
			}
			case 2:{
				CreateList(L,a,5);
				printf("整体创建顺序表成功！\n");
				break;
			}
			case 3:{
				DestroyList(L);
				printf("线性表已销毁！\n");
				break;
			}
			case 4:{
				printf("线性表长度为%d\n",GetLength(L));
				break;
			}
			case 5:{
				printf("请输入要查找的元素逻辑序号：\n");
				scanf("%d",&elemno);
				GetElem(L,elemno,e);
				printf("线性表中第%d个元素是%d\n",elemno,e);
				break;
			}
			case 6:{
				printf("请输入要查找的元素：\n");
				scanf("%d",&e);
				if(Locate(L,e)){
					printf("值为%d的元素是线性表中的第%d个。\n",e,Locate(L,e));
				}else printf("线性表中没有值为%d的元素。\n",e); 
				break;
			}

			case 7:{
				printf("请输入要插入线性表的元素值：\n");
				scanf("%d",&elemValue);
				printf("请输入要插入线性表的逻辑序号：\n");
				scanf("%d",&elemno);
				if(InsElem(L,elemValue,elemno))     //插入线性表函数的调用 
					printf("线性表插入一个数据成功！\n");
				else printf("插入元素位置错误！\n");;        
				
				break;
			}
			case 8:{
				printf("请输入要删除的元素序号：");
				scanf("%d",&elemno);
				DelElem(L,elemno);
				printf("线性表删除一个元素成功！\n");
				break;
			}
			case 9:{
				DispList(L);
				break;
				
			}
			case 10:{
				Swapmaxmin(L);
				printf("最大值元素与最小值元素交换成功！\n");
				break;
			}
			case 11:{
				Move(L);
				printf("线性表奇前偶后重新排列成功！\n");
				break;
			}
			case 0:{
				printf("程序执行结束了！");
				exit(0);
			}
		}
	}while(menuno<=12);

}
