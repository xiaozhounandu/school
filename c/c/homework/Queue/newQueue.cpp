#include <stdio.h>
#include <cstdlib>

#define MaxSize 100    //顺序队的初始分配空间大小
typedef char ElemType;   //假设顺序队中所有元素为char类型
typedef struct
{ ElemType data[MaxSize];  //保存队中元素
    int front,rear;    //队头和队尾指针
} SqQueue;
//初始化队列 
void InitQueue(SqQueue *&sq)  //sq为引用型参数
{
    sq=(SqQueue *)malloc(sizeof(SqQueue));
    sq->rear=sq->front=0;   //指针初始化
}
//销毁队列 
void DestroyQueue(SqQueue *sq) //销毁队列 
{
    free(sq);
}
//进队运算 
bool EnQueue(SqQueue *&sq,ElemType e)
{ if ((sq->rear+1) % MaxSize==sq->front) //队满上溢出
        return false;
    sq->rear=(sq->rear+1) % MaxSize;   //队尾循环进1
    sq->data[sq->rear]=e;
    return true;
}
//队头指针进1：font=(font+1) MOD MaxSize
//队尾指针进1：rear=(rear+1) MOD MaxSize
//出队运算 
bool DeQueue(SqQueue *&sq,ElemType &e)  //x为引用型参数
{ if (sq->rear==sq->front)     //队空下溢出
        return false;
    sq->front=(sq->front+1) % MaxSize;  //队头循环进1
    e=sq->data[sq->front];
    return true;
}
//取队头运算 
int GetHead(SqQueue *sq,ElemType &x)  //x为引用型参数
{ if (sq->rear==sq->front)  //队空下溢出
        return 0;
    x=sq->data[(sq->front+1) % MaxSize];
    return 1;
}
//判断队空运算 
bool QueueEmpty(SqQueue *sq)
{ if (sq->rear==sq->front) return true;
    else return false;
}
//队列遍历
void DispQueue(SqQueue *sq){
    printf("从对头到队尾显示如下：\n");
    int i;
    for(i=sq->front+1;i!=sq->rear;i=(i+1)%MaxSize)
        printf("%c,",sq->data[i]);
    printf("%c,",sq->data[i]);
}
//输出队列序列
//void printQueue(Squeue sq)
//{ if(sq->font==sq->rear) return 0;
// for()
// }
//（1）初始化队列q；
//（2）判断队列q是否非空；
//（3）依次进队元素a,b,c；
//（4）出队一个元素，输出该元素；
//（5）依次进队列元素d,e,f；
//（6）输出队列序列；
//（7）释放队列。


int main() {
    ElemType e;
    SqQueue *sq;
    printf("环形队列基本运算如下：\n");
    printf("(1)初始化队列sq\n");
    InitQueue(sq);
    printf("环形队列判空操作:\n");
    if (QueueEmpty(sq)) printf("队列为空\n");
    else printf("队列不为空\n");
    printf("(2)依次进队元素a,b,c\n");
    EnQueue(sq, 'a');
    EnQueue(sq, 'b');
    EnQueue(sq, 'c');
    if (QueueEmpty(sq)) printf("队列为空\n");
    else printf("队列不为空\n");
    printf("(3)出队一个元素，输出该元素\n");
    if (DeQueue(sq, e)) printf("第一次出队元素是%c\n", e);
    printf("(2)依次进队元素d,e,f\n");
    EnQueue(sq, 'd');
    EnQueue(sq, 'e');
    EnQueue(sq, 'f');
    printf("队列遍历显示如下：\n");
    DispQueue(sq);
    printf("开始销毁队列");
    DestroyQueue(sq);
    printf("销毁队列已完成");
}