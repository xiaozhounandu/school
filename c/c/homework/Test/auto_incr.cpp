//
// Created by 魏志杰 on 2022/10/19.
// 链表递增
//
#include<stdio.h>
#include<stdlib.h>
struct Lnode
{
    int data;
    Lnode *next;

};

int Init(struct Lnode *L, int i)
{
    struct Lnode *p;
    struct Lnode *q=L;
    int j=0;
    while(j<i)
    {
        p = (struct Lnode *)malloc(sizeof(struct Lnode));
        scanf("%d\n",&((*p).data));
        (*q).next = p;
        q= p;
        j++;
    }
    (*p).next =NULL;

    return 0;
}
int judge(struct Lnode *L)
{
    int k =1;
    struct Lnode *q=L;
    q= (*q).next;//q指向第一个结点
    struct Lnode *p = (*q).next;//p指向q的下一个结点

    while ((*p).next!=NULL)
    {
        if(((*q).data)<=((*p).data))
        {
            q=p;
            p=(*p).next;
        }
        else
        {
            k = 0;
            break;
        }

    }
    return k;
}
int main()
{
    struct Lnode Head;
    struct Lnode *L=&Head;
    int i = 5;
    Init(L,i);
    int p = judge(L);
    if(p==1)
    {
        printf("YES");
    }
    if(p==0)
    {
        printf("NO");
    }
    return 0;
}

