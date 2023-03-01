//
// Created by 魏志杰 on 2022/10/26.
//

#include "stdlib.h"
#include "stdio.h"

typedef  char ElemType;
typedef struct qnode {
    ElemType data;
    struct qnode *next;

}QNode;
typedef struct {
    QNode *front;
    QNode *rear;
}LinkQueue;

//初始化
void InitQueue(LinkQueue *&q){
    q=(LinkQueue *) malloc(sizeof (LinkQueue));
    q->front= q->rear=NULL;

}

void DestroyQueue(LinkQueue *&q){
    QNode *p=q->front,*r;
    if(p!=NULL){
        r=p->next;
        while (r!=NULL){
            free(p);
            p=r;r=p->next;
        }
        free(p);
    }
        free(q);

}




bool QueueEmpty(LinkQueue *q){
    return (q->rear==NULL);
}


void enQueue(LinkQueue *&q,ElemType e){
    QNode  *p;
    p=(QNode *) malloc(sizeof (QNode));
    p->data=e;
    p->next=NULL;
   if(q->rear==NULL)
       q->front=q->rear=p;
   else{
       q->rear->next=p;
       q->rear=p;
   }

}

bool deQueue(LinkQueue *&q,ElemType &e){
    QNode *t;
    if(q->rear==NULL)
        return false;
    t=q->front;
    if(q->front==q->rear) {
        q->front = q->rear = NULL;
    } else q->front=q->front->next;
    e=t->data;
    free(t);
    return true;

}

void dispLinkQueue(LinkQueue *&q){
    QNode *t;
    for(t=q->front;(t!=q->rear && (q->front!=NULL));t=t->next){
        printf("%c,",t->data);
    }
        printf("%c,",t->data);
    }

//（1）初始化链队列q；
//（2）判断链队列q是否非空；
//（3）依次进队元素a,b,c；
//（4）出队一个元素，输出该元素；
//（5）依次进链队列元素d,e,f；
//（6）输出队列序列；
//（7）释放链队列。


int main(){
    ElemType e;
    LinkQueue *q;
    printf("初始化\n");
    InitQueue(q);
    if (QueueEmpty(q)) printf("队列为空\n");
    else printf("队列不为空\n");
    printf("进队 a,b,c\n");
    enQueue(q,'a');
    enQueue(q,'b');
    enQueue(q,'c');
    printf("a,b,c 入队完毕\n");
    printf("出队l一个元素，输出该元素\n");
    if (deQueue(q, e)) printf("第一次出队元素是%c\n", e);
    if (QueueEmpty(q)) printf("队列为空\n");
    else printf("队列不为空\n");
    printf("进队 d,e,f\n");
    enQueue(q,'d');
    enQueue(q,'e');
    enQueue(q,'f');
    printf("d,e,f入队完毕\n");
    printf("队列遍历显示如下：\n");
    dispLinkQueue(q);
    printf("\n");
    printf("开始销毁队列\n");
    DestroyQueue(q);
    printf("销毁链队已完成");


}




