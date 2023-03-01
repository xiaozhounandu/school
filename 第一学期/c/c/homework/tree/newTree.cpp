//
// Created by 魏志杰 on 2022/11/9.
//

#include "stdio.h"
#include "stdlib.h"

typedef  char ElemType;
#define MaxSize 100
typedef struct tnode{
    ElemType data;
    struct tnode *lchild,*rchild;
}BTNode , *Tree;

//create btree
void CreateBTree(BTNode *&bt ,char *str){
    BTNode *St [MaxSize],*p=NULL;
        int top=-1,k,j=0;
        char ch;
        bt=NULL;		//建立的二叉树初始时为空
        ch=str[j];
    while (ch!='\0')			    //str未扫描完时循环
    {	switch(ch)
        {
            case '(':top++;St[top]=p;k=1; break;    //为左孩子结点
            case ')':top--;break;
            case ',':k=2; break;		     //为右孩子结点
            default:p=(BTNode *)malloc(sizeof(BTNode));
                p->data=ch;p->lchild=p->rchild=NULL;
                if (bt==NULL)		     //p为二叉树的根结点
                bt=p;
                else{			     //已建立二叉树根结点
        switch(k)
        {
            case 1:St[top]->lchild=p;break;
            case 2:St[top]->rchild=p;break;
              }
                }
        }
        j++;
        ch=str[j];
    }
}

//Destroy



//high

int BTHeight(BTNode *bt){
    int lchilddep ,rchilddep;
    if(bt==NULL)
        return 0;
    else{
        lchilddep= BTHeight(bt->lchild);
        rchilddep= BTHeight(bt->rchild);
        //三元
        return (lchilddep>rchilddep)?(lchilddep+1):(rchilddep+1);
    }
}

//节点数
int NodeCount(BTNode *bt){
    int num1,num2;
    if(bt==NULL)
        return 0;
    else{
        num1= NodeCount(bt->lchild);
        num2= NodeCount(bt->rchild);
        return (num1+num2+1);
    }

}
//叶子节点数
int LeafCount(BTNode *bt){
    int num1,num2;
    if(bt==NULL)
        return 0;
    else if(bt->lchild !=NULL || bt->rchild != NULL)
            return 1;
    else{
        num1= LeafCount(bt->lchild);
        num2= LeafCount(bt->rchild);
        return (num2+num1);
    }
}
//括号表示
void DispBTree(BTNode *bt){
    if(bt!= NULL){
        printf("%c", bt->data);
        if(bt->lchild !=NULL || bt->rchild != NULL){
            printf("(");
            DispBTree(bt->lchild);
            if(bt->rchild !=NULL)
                printf(",");
            DispBTree(bt->rchild);
            printf(")");
        }
    }
}
//销毁
void DestroyBTree(BTNode *&bt)
{   if (bt!=NULL)
    　　{	DestroyBTree(bt->lchild);
        DestroyBTree(bt->rchild);
        free(bt);
        　　}
}
//先序
void PreOrder(BTNode *bt){
    if (bt!=NULL){
        printf("%c",bt->data);
        PreOrder(bt->lchild);
        PreOrder(bt->rchild);
    }
}
//中序
void InOrder(BTNode *bt){
    if (bt!=NULL){
        InOrder(bt->lchild);
        printf("%c",bt->data);
        InOrder(bt->rchild);
    }
}
//后序
void PostOrder(BTNode *bt){
    if (bt!=NULL){
        PostOrder(bt->lchild);
        PostOrder(bt->rchild);
        printf("%c",bt->data);
    }
}
//层次遍历算法
void LevelOrder(BTNode *bt){
        BTNode *p;
        BTNode *qu[MaxSize];
        int front ,rear;
        front=rear=0;
        rear++;
        qu[rear]=bt;
        while(front!=rear) {
            front = (front + 1) % MaxSize;
            p = qu[front];
            printf("%c", p->data);
            if (p->lchild != NULL) {
                rear = (rear + 1) % MaxSize;
                qu[rear] = p->lchild;
            }
            if (p->rchild != NULL) {
                rear = (rear + 1) % MaxSize;
                qu[rear] = p->rchild;

            }
        }
}

//homework
//163 - 3-4
//215   3简答 2 5 6 7 算法设计
//前序非递归

/*
先遍历根节点及其左子树，输出，对遍历到的每一个父节点压栈，然后访问栈顶节点的右子树
对应于先序遍历的先遍历父节点，再遍历左子树再遍历右子树的顺序
*/
// 非-递归前序遍历二叉树

//先打印根节点的值，由于栈是先进后出，所以先将 右子树放进去，再将左子树放进去
//非递归算法的先序遍历
void LeftShow(BTNode *bt){
    //创建一个用于储存右孩子的栈。因为输出父节点，然后输出左孩子。所以需要将右孩子储存起来。
    BTNode * rchildlist[50];
    BTNode * show=bt;				//将show指针初始化为bt的地址。 show用于遍历时储存正在遍历的节点。从根节点开始遍历。
    int i=0;						//i为rchildlist栈顶。
    while(1){
        if(show==NULL){				//当遍历到的节点是NULL时。进行分情况判定
            if(i==0)						//如果栈此时也为空。则已经遍历完整个树。就可以退出循环。
                break;
            else{				//如果栈此时不为空。则执行退栈操作。将退栈的值赋值为下一个需要遍历的节点。此时是左孩子已经遍历完，需要遍历右孩子。
                show=rchildlist[i--];						//将退栈的值赋值为下一个需要遍历的节点。

            }
        }else {						//当遍历到的节点不为NULL时。
            printf("%c",show->data);		//输出该节点储存的值
            if(show->rchild!=NULL){			//判断该节点有没有右孩子。如果有右孩子则使右孩子进栈。
                i++;									//执行进栈操作
                rchildlist[i]=(BTNode *)show->rchild;	//将右孩子进栈。
            }
            show=(BTNode *)show->lchild;	//将该节点的左孩子赋值为下一个需要遍历的节点。
        }
    }
}

//非递归算法的中序遍历
void MiddleShow(BTNode * bt){
    BTNode * fatherlist[50];		//创建一个用于储存父节点的栈。因为需要先输出左孩子。所以需要将父节点储存起来。同时可以通过父节点找到右孩子。
    BTNode * show =bt;			//将show指针初始化为head的地址。 show用于遍历时储存正在遍历的节点。从根节点开始遍历。
    int i=0;						//i为fatherlist的栈顶。
    while (1) {
        if(show ==NULL){			//当遍历到的节点是NULL时。进行分情况判定。
            if(i==0)						//如果此时栈也为空。则已经遍历完整个树。就可以退出循环。
                break;
            else{							//如果此时栈不为空。进行退栈操作。将退栈的值赋值为当前便利的节点。此时左孩子已经遍历完，需要最后一个输出父节点的值。
                show=fatherlist[i];						//将退栈的值赋值为当前便利的节点。
                printf("%c",show->data);				//输出该节点的data值。
                i--;									//执行退栈操作。
                if(show->rchild!=NULL){		//判断该节点是否存在右孩子。
                    show=(BTNode *)show->rchild;		//如果有右孩子。则将右孩子赋值为下一个需要遍历的节点。
                }else{
                    show=NULL;							//否则继续返回为NULL。此时的目的为继续退栈。用于输出上一个父节点的值。
                }
            }
        }else {						//当遍历到的节点不为NULL时。
            i++;							//执行进栈操作。
            fatherlist[i]=show;				//将该遍历节点进栈。
            show=(BTNode *)show->lchild;	//将该遍历节点的左孩子赋值为下一个需要遍历的节点。
        }
    }
}


//非递归算法的后续遍历
void RightShow(BTNode *bt){
    BTNode * fatherlist[50];		//创建一个用于储存父节点的栈。因为需要先输出左、右孩子。所以需要将父节点储存起来。
    BTNode * show=bt;				//将show指针初始化为head的地址。 show用于遍历时储存正在遍历的节点。从根节点开始遍历。
    int taglist[50];				//创建一个与父节点同步的栈。用于判断该父节点是第几次被访问。因为父节点需要退出两次。只有第二次才需要输出值。第一次用于寻找右孩子。
    int i=0;						//i为fatherlist的栈顶。同时也是taglist的栈顶。
    int tag=0;						//tag用于判断父节点被访问的次数。第一次被取出为0，第二次被取出为1。为1时可以输出值。
    while (1) {
        if(show==NULL){				//当遍历到的节点是NULL时。进行分情况判定。
            if(i==0)						//如果此时栈也为空。则已经遍历完整个树。就可以退出循环。
                break;
            else{							//如果此时栈不为空。进行退栈操作。将退栈的值赋值为当前遍历的节点。此时左孩子已经遍历完，需要分情况判断。
                show=fatherlist[i];						//将退栈的值赋值为当前遍历的节点。
                if(taglist[i]==0){						//如果此时该父节点是第一次访问则为其tag值+1。并将该节点的右孩子赋值为下一个需要遍历的节点。
                    taglist[i]++;								//为其tag值+1。
                    show=(BTNode *)show->rchild;				//将该节点的右孩子赋值为下一个需要遍历的节点。
                }else{									//如果此时该父节点是第二次访问。则输出该节点对应的data值，并执行退栈操作。
                    printf("%c",show->data);					//输出该节点对应的data值。
                    i--;										//执行退栈操作。
                    show=NULL;									//继续返回为NULL。此时的目的为继续退栈。用于输出上一个父节点的值。
                }
            }
        }else{						//当遍历到的节点不为NULL时。
            i++;							//执行进栈操作
            fatherlist[i]=show;				//将该遍历到的节点进栈。
            taglist[i]=tag;					//同时将该节点的tag值进栈。初始为0.
            show=(BTNode *)show->lchild;	//将该遍历节点的左孩子赋值为下一个需要遍历的节点。
        }
    }
}


//第二种非递归解决办法
//先序
void PreOrderWithNonRec(BTNode *bt){
    BTNode *nodes[MaxSize];
    int top =0;
    ElemType elems[MaxSize];

    nodes[top++] = bt;
    while(top){
        BTNode *node = nodes[--top];
        printf("%c ", node->data);
        if(node->rchild)
            nodes[top++]=node->rchild;
        if(node->lchild)
            nodes[top++]=node->lchild;
    }
}

//中序遍历
void InOrderWithNonRec(BTNode *bt){
    BTNode *nodes[NodeCount(bt)];
    BTNode *pre =bt;
    int top;
    while (pre || top){
        if(pre){
            nodes[top++]=pre;
            pre=pre->lchild;
        }else{
            BTNode *node=nodes[--top];
            printf("%c ", node->data);
            pre=node->rchild;
        }
    }
}


//后序遍历
void  PostOrderWithNonRec(BTNode *bt){
    BTNode *nodes[NodeCount(bt)];
    int top=0;
    nodes[top++] = bt;
    while(top){
        BTNode *node = nodes[top-1];
        if (!node->lchild&&!node->rchild){
            --top;
            printf("%c ", node->data);
        }
        if(node->rchild){
            nodes[top++]=node->rchild;
            node->rchild=NULL;
        }
        if(node->lchild){
            nodes[top++]=node->lchild;
            node->lchild=NULL;
        }
    }
}





//主函数
int main(){
    BTNode *bt;
    char *str ="A(B(D,E(G,H)),C(,F(I))";
    CreateBTree(bt,str);
   // CreateBTree(bt,"A(B(D,E(G,H)),C(,F(I))");
    printf("二叉树Bt: ");
    DispBTree(bt);

    printf("\n");
    printf("数的高度是 %d",BTHeight(bt));

    printf("\n");
    printf("bt 的节点数:%d\n", NodeCount(bt));

    printf("bt 的叶子节点数:%d\n", LeafCount(bt));

    printf("先序 输出如下:");
    PreOrder(bt);
    printf("\n");

    printf("中序 输出如下:");
    InOrder(bt);
    printf("\n");

    printf("后序 输出如下:");
    PostOrder(bt);
    printf("\n");

    printf("层次 输出如下:");
    LevelOrder(bt);



    printf("\n");
    printf("非递归遍历开始了====================================\n");
    printf("非递归前序");
    LeftShow(bt);






    printf("\n");
    printf("非递归中序");
    MiddleShow(bt);





    printf("\n");
    printf("非递归后序");
    RightShow(bt);


    printf("\n");

        int  menuno;
        do{
            printf("\n       主菜单                      \n");
            printf("\n    1. 创建二叉树成功               \n");
            printf("\n    2. 树的高度                    \n");
            printf("\n    3. bt的节点数                  \n");
            printf("\n    4. bt 的叶子节点数:             \n");
            printf("\n    5. 先序 输出如下                \n");
            printf("\n    6. 中序 输出如下                \n");
            printf("\n    7. 后序 输出如下                \n");
            printf("\n    8. 层次遍历 输出如下             \n");
            printf("\n    9. 非递归 先序（代码一） 输出如下          \n");
            printf("\n    10.非递归 中序（代码一） 输出如下           \n");
            printf("\n    11.非递归 后序（代码一） 输出如下           \n");
            printf("\n    12. 非递归 先序（代码二） 输出如下          \n");
            printf("\n    13.非递归 中序（代码二） 输出如下           \n");
            printf("\n    14.非递归 后序（代码二） 输出如下           \n");
            printf("\n    15.销毁            \n");
            printf("\n    0. 退出            \n");
            printf("\n             \n");
            printf("\n-------------------------------\n");
            printf("\n请输入你的选择（1，2，3，4，5，6，7，8，9，10，11，12，13，14，15，0）\n");
            scanf("%d", &menuno);
            switch(menuno){
                case 1:{
                    CreateBTree(bt,str);
                    printf("二叉树Bt创建: ");
                    DispBTree(bt);
                    break;
                }
                case 2:{
                    printf("\n");
                    printf("数的高度是 %d",BTHeight(bt));
                    break;
                }
                case 3:{
                    printf("\n");
                    printf("bt 的节点数:%d\n", NodeCount(bt));
                    break;
                }
                case 4:{
                    printf("bt 的叶子节点数:%d\n", LeafCount(bt));
                    break;
                }
                case 5:{
                    printf("先序 输出如下:");
                    PreOrder(bt);
                    printf("\n");
                    break;
                }
                case 6:{
                    printf("中序 输出如下:");
                    InOrder(bt);
                    printf("\n");
                    break;
                }
                case 7:{
                    printf("后序 输出如下:");
                    PostOrder(bt);
                    printf("\n");
                    break;
                }
                case 8:{
                    printf("层次 输出如下:");
                    LevelOrder(bt);
                    break;
                }
                case 9:{
                    printf("\n");
                    printf("非递归遍历开始了====================================\n");
                    printf("非递归前序");
                    LeftShow(bt);
                    break;
                }
                case 10:{
                    printf("\n");
                    printf("非递归中序");
                    MiddleShow(bt);
                    break;
                }
                case 11:{
                    printf("\n");
                    printf("非递归后序");
                    RightShow(bt);
                    break;
                }
                case 12:{
                    printf("\n");
                    printf("非递归前序（代码二实现）");
                    PreOrderWithNonRec(bt);
                    break;
                }
                case 13:{
                    printf("\n");
                    printf("非递归中序（代码二实现）");
                    InOrderWithNonRec(bt);
                    break;
                }
                case 14:{
                    printf("\n");
                    printf("非递归后序（代码二实现）");
                    PostOrderWithNonRec(bt);
                    break;
                }
                case 15: {
                    printf("销毁");
                    DestroyBTree(bt);
                    break;
                }
                case 0:{
                    printf("程序执行结束了！");
                    exit(0);
                }
            }
        }while(menuno<=20);
        return 0;
    }





