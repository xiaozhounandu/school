//
// Created by 魏志杰 on 2022/10/19.
//
//设计一个相关的算法，判断顺序表中的元素是否是递增有序的



#include "stdlib.h"
#include "stdio.h"

#define Maxsize 10 //定义maxsize以便控制全局数组大小数据
typedef  int Elemtype;
//定义相关的结构体
typedef struct {
    Elemtype a[Maxsize];
    Elemtype lenth;//记录lenth 记录数据存储个数
    Elemtype len;//定变量len记录数组的大小
}Sqllist;


void Initlist(Sqllist *MXY){ //定义Initlist 初始化结构体
    int i;
    for (i=0;i<Maxsize;i++){
        MXY -> a[i]=0;
    }
    MXY->len=Maxsize;
    MXY->lenth=0;
}

int PDlist(Sqllist *XMY , int lens){
    int i;
    for (int i = 0; i < lens-1; i++) {
        if(XMY->a[i] > XMY->a[i+1]){ //循环下标比较，如果不是递增的数字，直接返回0；
            return 0;
        }
    }
    return 1;                       //如果便利之后发现，是递增的数字，则返回1；
}

int main(){
    void Initlist(Sqllist *XMY);
    int PDlist(Sqllist *XMY,int lens);
    Sqllist XMY;
    int i;          //定义变量 i 用于记录for  循环
    int lens;       //定义变量lens记录输入的数据
    Initlist(&XMY);
    printf("顺序表创建成功，请输入所需要的数据（1-10）");
    scanf("%d",&lens);
    printf("请输入数据,自动判断");
    for (int i = 0; i < lens; i++) {
        scanf("%d",&XMY. a[i]);

    if(PDlist(&XMY,lens)){
        printf("有序增长");

    } else{

        printf("无序增长");
    }
    }






}
