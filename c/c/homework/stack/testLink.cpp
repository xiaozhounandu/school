//
// Created by 魏志杰 on 2022/10/20.
//链栈

#include <stdlib.h>
#include <stdio.h>

//定义相关的链栈
typedef char ElemType;

typedef struct node {
    ElemType data;//存储节点数据，这里假设ElemType为char
    struct node *next;//定义相关的指针域
} LinkStack;

void InitStack(LinkStack *&ls) {
    ls = NULL;
}

//销毁相关的栈,链栈的节点都是通过Malloc 函数分配的，在不需要的时候通过free释放所以节点的空间
void DestroyStack(LinkStack *&ls) {
    LinkStack *pre = ls, *p;
    if (pre == NULL)return;           //考虑空栈的情况
    p = pre->next;
    while (p != NULL) {
        free(pre);              //释放pre节点
        pre = p;
        p = pre->next;      //pre p 同步后移
    }
    free(pre);
}
//进栈

int Push(LinkStack *&ls, ElemType x) {
    LinkStack *p;
    p = (LinkStack *) malloc(sizeof(LinkStack));
    p->data = x;          //create p -> x
    p->next = ls;        //插入p作为栈顶
    ls = p;
    return 1;
}


int Pop(LinkStack *&ls, ElemType &x) {        //ls reference   parameter
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
int GetTop(LinkStack *ls, ElemType &x) {
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

//遍历输出链栈
void printStack(LinkStack *ls) {
    LinkStack *q = ls;
    while(q->next){
        printf("%c ", q->data);
        q = q->next;
    }
    printf("\n");
}
int Equel(LinkStack *ls ,ElemType &e){
    LinkStack  *q=ls;
    while (q->next){
        if(q->data == e){ //查找，如果等于相关的数字，输出1。否则输出0；
            return 1;
        }
        q=q->next;
    }
    return 0;
}

//主函数
int main() {
    ElemType e;
    LinkStack * st;
    printf("初始化栈st\n");
    InitStack(st);
    Push(st, 'a');
    printf("栈%s\n", (StackEmpty(st) == 1 ? "空" : "非空"));
    printf("a进栈\n");
    Push(st, 'a');
    printf("b进栈\n");
    Push(st, 'b');
    printf("c进栈\n");
    Push(st, 'c');
    printf("d进栈\n");
    Push(st, 'd');

    printf("栈%s\n", (StackEmpty(st) == 1 ? "空" : "非空"));

    printf("%s","遍历栈\n");
    printStack(st);

    GetTop(st, e);
    printf("栈顶元素：%c\n", e);
    printf("出栈次序：");
    while (!StackEmpty(st)) {
        Pop(st, e);
        printf("%c", e);
    }
    printf("\n");
    DestroyStack(st);
}






