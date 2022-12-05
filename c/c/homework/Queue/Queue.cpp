//
// Created by 魏志杰 on 2022/10/20.
/*
 * 队列是一种运行受限的线性表，插入限定在表的某一段
*/

#include "stdlib.h"
#include "stdio.h"
#define Maxsize 20
typedef char ElemType;
typedef struct {
    ElemType data[Maxsize];
    int front ,rear;
}SqQueue;

void Initqueue(SqQueue &sq){    //&sq为引用型参数


    sq.rear=sq.front=0;         //指针初始化
}


void Destroy(SqQueue sq){    //销毁
}


//进队运算
int EnQueue(SqQueue &sq ,ElemType x){
    if((sq.rear+1) % Maxsize == sq.front) //full
        return 0;
    sq.rear=(sq.rear+1)%Maxsize;
    sq.data[sq.front]=x;
    return 1;
}

//出队运算

int DeQueue(SqQueue &sq ,ElemType &x){
    if(sq.rear == sq.front )//full
        return 0;
    sq.front=(sq.front+1) % Maxsize;
    x=sq.data[sq.front];
    return 1;
}

//取对头元素
int GetHand(SqQueue sq,ElemType &x){

    if(sq.rear==sq.front)
        return 0;
    x=sq.data[(sq.front+1)%Maxsize];
    return 1;
}

//判断队空
int QueueEmpty(SqQueue sq){

    if (sq.front==sq.rear)
        return 1;
    else
        return 0;
}





//输出队列
void Desp(SqQueue sq){
  int i=sq.front+1;
    for (int i = 0; i != sq.rear; i=(i+1)%Maxsize) {
        printf("%c",sq.data[i]);
        printf("%c",sq.data[i]);

    }

}


//主函数
int main(){


    SqQueue sq;
    ElemType e;
    int menuno;
    do {
        printf("\n       主菜单                      \n");
        printf("\n    1.初始化顺序队                  \n");
        printf("\n    2.入队一个元素                  \n");
        printf("\n    3.出队一个元素                  \n");
        printf("\n    4.销毁队                       \n");
        printf("\n    5.判断队空                     \n");
//        printf("\n    6.统计栈中元素个数                \n");
//        printf("\n    7.查找某元素是否在栈中           \n");
//        printf("\n    0.结束程序运行                  \n");
//        printf("\n-------------------------------\n");
        printf("\n请输入你的选择（1，2，3，4，0）\n");

        scanf("%d", &menuno);
        switch (menuno) {

            case 1: {
                Initqueue(sq);
                printf("顺序队初始化成功！\n");
                break;
            }
            case 2: {
                printf("请输入要入队的元素值：\n");
                scanf("%s", &e);
                //printf("请输入要插入线性表的逻辑序号：\n");
                //scanf("%d",&elemno);
                if (EnQueue(sq, e))
                    printf("一个元素入队成功！\n");
                printf("%c",e);
                break;
            }
            case 3: {
                if (DeQueue(sq, e))
                    printf("%c", &e);
                else
                    printf("当3前不能出栈！\n");

                break;
            }
                //显示队中的所有元素
            case 4: {
                printf("销毁队" );
                Destroy(sq);
                break;
            }

            case 5: {
                printf("队%s\n",QueueEmpty(sq)==1?"列为空":"列非空");
                break;
            }
//
//            case 6: {
//                if (!StackEmpty(ls))
//                    // printf(" 栈中元素个数是：%d个。\n", getLength(ls));
//                    printf(" 栈中元素个数是：%d个。\n", len(ls));
//                else printf("栈空没有元素。\n");
//                break;
//            }
//
//            case 7: {
//                printf("请输入在栈中要查找的元素：\n");
//                scanf(" %c",&e);
//                if(EnQueue(sq,e)) {
//                    printf("此栈中存在元素%c\n", e);
//                }else
//                    printf("元素%c在栈中不存在\n",e);
//
//                break;
//            }

            case 0: {
                printf("程序执行结束了！");
                exit(0);
            }
        }
    }while (menuno <= 20);
}



