#include <stdio.h>
#include <stdlib.h>


typedef char ElemType;

#define MaxSize 100 //顺序栈初始大小
typedef struct {
    ElemType data[MaxSize];
    int top;
}SqStack;

//初始化
void InitStack(SqStack& st) {
    st.top = -1;
}
//销毁
void DestoryStack(SqStack st) {}
//进栈
int Push(SqStack &st,ElemType c){
    //判断栈是否满了
    if(st.top==MaxSize-1) return 0;
    else{
        st.top++;
        st.data[st.top] = c;
        return 1;
    }
}
//出栈
int OutStack(SqStack &st,ElemType &c){
    //判断栈是否为空
    if(st.top==-1)return 0;
    else{
        c=st.data[st.top];
        st.top--;
        return 1;
    }
}
//显示栈中所有的元素
void DisplayStack(SqStack &st){
    int i;
    if(st.top==-1) printf("栈为空\n");
    else{
        for(i=0;i<=st.top;i++){
            printf("%c",st.data[i]);
        }
        printf("\n");
    }
}
//判断栈空栈满
int EmptyAndFullStack(SqStack &st){
    if(st.top==-1)return 0;
    else if(st.top==99)return 1;
    else return 2;
}
//统计栈中元素个数
int CountStack(SqStack &st){
    if(st.top!=-1)return st.top+=1;
    else return 0;
}
//查找某元素是否在栈中
bool isExistStack(SqStack &st,ElemType &c){
    int i;
    if(st.top==-1)return false;
    else{
        for(i=0;i<st.top;i++){
            if(st.data[i]==c)return true;
        }
        return false;
    }
}

int main(){
    int flag;
    ElemType e;
    SqStack st;
    do{
        printf("    主菜单    \n");
        printf("1.初始化顺序栈\n");
        printf("2.入栈一个元素\n");
        printf("3.出栈一个元素\n");
        printf("4.显示栈中所有的元素\n");
        printf("5.判断栈空栈满\n");
        printf("6.统计栈中元素个数\n");
        printf("7.查找某元素是否在栈中\n");
        printf("0.退出\n");
        scanf("%d",&flag);
        switch(flag){
            case 1:
                InitStack(st);
                printf("初始化成功\n");
                break;
            case 2:
                printf("请输入要入栈的元素值：\n");
                scanf(" %c",&e);
                printf(Push(st,e)==0?"栈满了\n":"进栈完成\n");
                break;
            case 3:
                if(OutStack(st,e)){
                    printf("当前出栈的元素是：%c\n",e);
                }else{
                    printf("当前栈空不能出栈！\n");
                }
                break;
            case 4:
                DisplayStack(st);
                break;
            case 5:
                printf("%s",EmptyAndFullStack(st)==0?"栈为空栈":EmptyAndFullStack(st)==1?"栈满了":"栈未满");
                break;
            case 6:
                printf("%d",CountStack(st));
                break;
            case 7:
                printf("请输入要要查询的元素值：\n");
                scanf("%s",&e);
                printf(isExistStack(st,e)== true?"该值在栈中\n":"该值不在栈中\n");
                break;
            case 0:
                printf("程序结束了");
                DestoryStack(st);
                exit(0);
                break;
        }
        printf("%d\n",flag);
    }while(flag<=20);
}



