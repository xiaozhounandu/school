// Created by 魏志杰 on 2022/10/15.

/*
 * stack 是一种特殊的线性表，它的特殊性体现在相关的插入和删除中，它的插入个删除只能在
 * 某一端进行，允许插入和删除的一段称为 stack的顶部，另一端称为stack的底部，stack的插入
 * 操作称为入栈，删除操作称为出栈，处于栈顶的数据元素称为栈顶元素，不含任何元素的栈称为空栈
 *
 *
 * 栈的主要操作包括六种
 * 初始化栈、销毁栈，进栈 出栈，取栈顶元素 判断栈空
 *
 *
 */

#include <iostream>
#include "stdlib.h"
#include "stdio.h"
#define MaxSize 100
typedef char ElemType;
typedef struct {
    ElemType data[MaxSize];
    int top;
}SqStack;
//初始化栈运算算法
void InitStack(SqStack &st){
    st.top=-1;
}

//销毁栈的算法 因为顺序栈的内存空间是由系统自动分配的，在不需要的时间里系统自动释放其空间
void DestroyStack(SqStack st){
}

//进栈的算法 主要操作是 栈顶指针+1 ，将进栈元素放在栈顶出处
int Push(SqStack &st ,ElemType x) {
    //保证程序的健壮性，如果栈满抛出0
    if (st.top == MaxSize - 1) {
        return 0;
    } else {
//进栈成功 返回1
        st.top++;
        st.data[st.top] = x;
        return 1;
    }
}
// 出栈的相关算法
// 栈顶元素取出，栈顶元素-1
    int Pop(SqStack &st, ElemType &x) {  //x 为引用型参数
        //考虑 栈是否为空栈，如果栈为空 则返回0
        if (st.top == -1) {
            return 0;
        } else {
            x = st.data[st.top];
            st.top--;
            return 1;
        }
    }
//取栈顶元素
//其主要操作是：将栈顶元素直接取出赋给X，top保持不动；
    int GetTop(SqStack &st, ElemType &x) {
        //取栈顶之前我们要先看看栈是否为空
        if (st.top == -1) {
            return 0;
        } else {
            x = st.data[st.top];
            return 1;
        }
    }
//判断栈空
    int StackEmpty(SqStack st) {
        if (st.top == -1) {
            return 1;
        } else {
            return 0;
        }

    }
//判断栈满运算算法
    int StackFull(SqStack st){
        if(st.top==MaxSize-1)return 1;
        else return 0;
    }

    //统计栈中元素个数运算算法
    int CountElem(SqStack st){
        return st.top+1;
    }

    //显示栈中所有元素运算算法
    void DispStack(SqStack st){
        int i=0;
        printf("栈中所有元素为：");
        while(i<=st.top) {
            printf("%c", st.data[i++]);
        }
    }
    //栈中要查找的元素
    int SearchElem(SqStack st,ElemType x) {
        int i=0;
        while(i<st.top){
            if(st.data[i++]==x) return 1;
        }
        if(i==st.top+1) return 0;
    }


//相关主函数的设计
int main(){
    SqStack st;
    //ElemType a[10]={10,20,30,40,50},e=0;
    ElemType e=0;
    int j,menuno,elemValue,elemj,elemno;
    do{
        printf("\n       主菜单                     \n");
        printf("\n    1.初始化顺序栈                 \n");
        printf("\n    2.入栈一个元素                 \n");
        printf("\n    3.出栈一个元素                 \n");
        printf("\n    4.判断栈空操作                 \n");
        printf("\n    5.判断栈满操作                 \n");
        printf("\n    6.统计栈中元素个数              \n");
        printf("\n    7.查找某元素是否在栈中           \n");
        printf("\n    8.显示栈中所有元素              \n");
        printf("\n    0.结束程序运行                  \n");
        printf("\n             \n");
        printf("\n-------------------------------\n");
        printf("\n请输入你的选择（1，2，3，4，5，6，7，8，0）\n");
        scanf("%d",&menuno);
        switch(menuno){
            case 1:{
                InitStack(st);
                printf("顺序栈初始化成功！\n");
                break;
            }
            case 2:{
                printf("请输入要入栈的元素值：\n");
                scanf("%s",&elemValue);
                //printf("请输入要插入线性表的逻辑序号：\n");
                //scanf("%d",&elemno);
                if(Push(st,elemValue))     //插入线性表函数的调用
                    printf("一个元素入栈成功！\n");
                else printf("当前栈满不能入栈！\n");
                break;
            }
            case 3:{
                if(Pop(st,e)){
                    printf("当前出栈的元素是：%c\n",e);
                }else{
                    printf("当前栈空不能出栈！\n");
                }
                break;
            }
            case 4:{
                if(StackEmpty(st)) printf("当前栈为空.\n");
                else printf("当前栈不为空.\n");
                break;
            }
            case 5:{
                if(StackFull(st)) printf("当前栈为满.\n");
                else printf("当前栈不满.\n");
                break;
            }
            case 6:{
                if(!StackEmpty(st)){
                    printf("栈中元素个数是：%d个。\n",CountElem(st));
                }else printf("栈空没有元素。\n");
                break;
            }

            case 7:{
                printf("请输入在栈中要查找的元素：\n");
                scanf("%d",&elemValue);
                if(SearchElem(st,elemValue)){    //插入线性表函数的调用
                    printf("此栈中存在元素%d\n",elemValue);
                }else printf("元素%d在栈中不存在\n",elemValue);
                break;
            }

            case 8:{
                if(!StackEmpty(st)) DispStack(st);
                else printf("当前栈为空！\n");
                break;
            }

            case 0:{
                printf("程序执行结束了！");
                exit(0);
            }
        }
    }while(menuno<=20);
}

