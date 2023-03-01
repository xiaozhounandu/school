
// Created by 魏志杰 on 2022/10/19.
 //一个非空顺序表L，其中的元素可能重复出现，设计一个算法，在最大值元素后面插入一个值为x的元素;


#include "stdio.h"
#include "stdlib.h"
#define MaxSize 100
typedef int ElemType;

typedef int element;

typedef struct
{    ElemType data[MaxSize];
    element *elem;
    int length;
} SqList;

int CreateList(SqList &L,int n){
    int i;
    L.elem = (int *)malloc(sizeof(int)*MaxSize);
    if(!L.elem) return -1;
    else
    {
        for(i = 0;i<n;i++)
        {
            scanf("%d", &L.elem[i]);
            L.length++;
        }
    }
    return 0;
} //输入n个元素创建线性表，代码省略

void DispList(SqList L) {
    int i;
    for (i = 0; i < L.length; i++) {
        if (i == L.length - 1) printf("%d\n", L.elem[i]);
        else printf("%d ", L.elem[i]);

    }
}//输出 线性表，代码省略


void InsAfterOfMax(SqList &L, int x) {
    int i, j = 0, k;
    for (i = 0; i <= L.length; i++) {
        if (L.data[i] >= L.data[j])       //依次判断大小
        {

            j = i;     //j刚好为最后一个最大值的位置
        }
    }
    for (k = L.length - 1; k > j; k--)          //倒序
    {
        L.data[k + 1] = L.data[k];      //元素依次后移
    }
    L.data[j + 1] = x;              //插入当前位置
    L.length++;               //记得总长+1
}
int main(){
    SqList L ;
    int n,x;
    scanf("%d",&n);
    CreateList(L,n);
    scanf("%d",&x);
    InsAfterOfMax(L,x);
    DispList(L);

}






/*
#include<stdio.h>
#include<stdlib.h>

//设计一个算法在带头结点的非空单链表L中第一个最大值节点（最大值节点可能有多个）之前插入一个值为x的结点

typedef struct LNode {
    int data;
    struct LNode* next;
}LNode;

void Create(LNode*& L, int n)
{
    L = (LNode*)malloc(sizeof(LNode));
    L->next = NULL;
    LNode* p;
    LNode* q = L;
    for (int i = 0; i < n; i++)
    {
        p = (LNode*)malloc(sizeof(LNode));
        p->next = NULL;
        scanf("%d", &p->data);
        q->next = p;
        q = p;
    }
    return;
}
void ListPrint(LNode*& L)
{
    LNode* p = L->next;
    while (p != NULL)
    {
        printf("%d ", p->data);
        p = p->next;
    }
    return;
}

void insert_list(LNode* &L,int n)
{
    LNode* p,*q;
    int key;
    p=L;
    if(p==NULL){
        exit(0);
    }
    for(int i=0;i<n-1;i++)
    {
        p=p->next;
    }
    q=(LNode*)malloc(sizeof(LNode));
    scanf("%d",&key);
    q->data = key;
    q->next =p->next;
    p->next = q;
}

void Find_first_max(LNode* &L,int &e)
{
    LNode *p,*max;
    int maxpos=0;
    max =L->next;
    p = L->next;
    int n=0;
    while(p)
    {
        n++;
        if(max->data < p->data)
        {
            max = p;
            maxpos = n;
        }
        p=p->next;
    }
    e = maxpos;
    return ;
}

int main()
{
    int e=0;
    LNode *L=(LNode*)malloc(sizeof(LNode));
    Create(L,5);
    Find_first_max(L,e);
    insert_list(L,e);
    ListPrint(L);
    return 0;
}
 */
