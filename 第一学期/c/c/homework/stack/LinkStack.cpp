//链栈

#include <cstdlib>
#include <curses.h>
#include "stdio.h"
//定义相关的链栈
typedef char ElemType;

typedef struct node {
    ElemType data;//存储节点数据，这里假设ElemType为char
    struct node *next;//定义相关的指针域
}LinkStack;


//初始化链栈 归纳起来，初始化时 ls==null,其四个元素要求如下；
//栈空 ls==null
//栈满： 不考虑
//元素X进栈 ：创建存放元素X的节点P,将其插在栈顶上；
//出栈元素x 将x作为栈顶节点的data域，并删除这个节点；
// ok 用栈的链式结构存储数据，用C语言实现栈的初始化、入栈操作、出栈操作 .判断栈空栈满、
//显示栈中所有元素
//统计栈中元素个数、查找某元素是否在栈中等。
void InitStack(LinkStack *&ls) {
    ls=NULL;
}

//销毁相关的栈,链栈的节点都是通过Malloc 函数分配的，在不需要的时候通过free释放所以节点的空间
void DestroyStack(LinkStack *&ls) {
    LinkStack *pre=ls,*p;
    if (pre==NULL)return;           //考虑空栈的情况
        p = pre->next;
    while (p!=NULL) {
        free(pre);              //释放pre节点
        pre = p;
        p = pre->next;      //pre p 同步后移
    }
        free(pre);
}
 //进栈

int Push (LinkStack *&ls,ElemType x) {
    LinkStack *p;
    p=(LinkStack *) malloc(sizeof (LinkStack));
    p->data=x;          //create p -> x
    p->next=ls ;        //插入p作为栈顶
    ls=p;
    return 1;
}

//出栈
int Pop(LinkStack *&ls ,ElemType &x) {        //ls reference   parameter
    LinkStack *p;
    if (ls == NULL) {                              //栈空，返回0
        return 0;
    } else {                                          //栈不为空的时候出栈x返回1
        p = ls;                                   //p的栈顶结点
        x = p->data;                              //取出X
        ls = p->next;                             //删除节点p
        free(p);                                //释放结点
        return 1;
    }
}
    //取栈顶
int  GetTop(LinkStack *ls,ElemType &x) {
        if (ls == NULL) {
            return 0;               //空栈
        } else {
            x = ls->data;           //栈不空，取出相关的元素返回1
            return 1;
        }
}
//判断栈空
int StackEmpty(LinkStack *ls) {
    if (ls == NULL) {
        return 1;
    } else {
        return 0;
    }
}
//用栈的链式结构存储数据,显示栈中所有元素、判断栈空栈满、统计栈中元素个数、查找某元素是否在栈中等。
//显示栈中的所有元素
void DestStack(LinkStack *ls) {
    LinkStack *q = ls;
    while(q->next){
        printf("%c", q->data);
        q = q->next;
    }
    printf(" \n");
}
void printStack(LinkStack *ls) {
    LinkStack *q = ls;
    while(q){
        printf("%c ", q->data);
        q = q->next;
    }
    printf(" \n");
}
//统计元素的个数
int length(LinkStack *ls) {
//    if (ls == NULL) {
//        printf("%c","栈空");
//        return 0;
//    } else {
//        LinkStack *q = ls;
        int l = 0;
        while (ls) {
            //printf("%c", q->data);          //统计相关的数字，循环至结束
            ls = ls->next;
            l++;
        }
        return l;
}

int len (LinkStack *ls){
    int l =0;
    LinkStack *p=ls;
    while (p){
        p=p->next;
        l++;
    }
    return l;
}
//查找某元素是否在栈中等。

int Equel(LinkStack *ls ,ElemType &e){
    LinkStack  *q=ls;
    while (q){
        if(q->data == e) {
            return 1;
        }
        q=q->next;
    }
    return 0;
}

int getLength(LinkStack *ls) {
    int length = 0;
//    LinkStack *q;
//    q = ls;
    while (ls) {
        length++;
        ls = ls->next;
    }
    return length;
}

//主函数

int  main() {
    LinkStack *ls;
    ElemType e;
    int menuno;
    do {
        printf("\n       主菜单                      \n");
        printf("\n    1.初始化顺序栈                  \n");
        printf("\n    2.入栈一个元素                  \n");
        printf("\n    3.出栈一个元素                  \n");
        printf("\n    4.显示栈中所有元素              \n");
        printf("\n    5.判断栈空                     \n");
        printf("\n    6.统计栈中元素个数                \n");
        printf("\n    7.查找某元素是否在栈中           \n");
        printf("\n    0.结束程序运行                  \n");
        printf("\n-------------------------------\n");
        printf("\n请输入你的选择（1，2，3，4，5，6，7,0）\n");

        scanf("%d", &menuno);
        switch (menuno) {

            case 1: {
                InitStack(ls);
                printf("顺序栈初始化成功！\n");
                break;
            }
            case 2: {
                printf("请输入要入栈的元素值：\n");
                scanf("%s", &e);
                //printf("请输入要插入线性表的逻辑序号：\n");
                //scanf("%d",&elemno);
                if (Push(ls, e))
                    printf("一个元素入栈成功！\n");
                break;
            }
            case 3: {
                if (Pop(ls, e))
                    printf("当前出栈的元素是：%c\n", e);
                else
                    printf("当前栈空不能出栈！\n");
                break;
            }
                //显示栈中的所有元素
            case 4: {
                //  printf("%s", "遍历栈\n", DestStack(ls));
                if (!StackEmpty(ls)) printStack(ls);
                else printf("当前栈为空！\n");
                break;

            }

            case 5: {
                if (StackEmpty(ls)) printf("当前栈为空.\n");
                else printf("当前栈不为空.\n");
                break;
            }

            case 6: {
                if (!StackEmpty(ls))
                   // printf(" 栈中元素个数是：%d个。\n", getLength(ls));
                    printf(" 栈中元素个数是：%d个。\n", len(ls));
                else printf("栈空没有元素。\n");
                break;
            }

            case 7: {
                printf("请输入在栈中要查找的元素：\n");
                scanf(" %c",&e);
                if(Equel(ls,e)) {
                    printf("此栈中存在元素%c\n", e);
                }else
                    printf("元素%c在栈中不存在\n",e);

                break;
            }

            case 0: {
                printf("程序执行结束了！");
                exit(0);
            }
        }
    }while (menuno <= 20);
}




