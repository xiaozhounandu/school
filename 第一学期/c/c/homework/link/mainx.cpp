#include <stdio.h>
#include <stdlib.h>


typedef char ElemType;

#define MaxSize 100 //˳��ջ��ʼ��С
typedef struct {
    ElemType data[MaxSize];
    int top;
}SqStack;

//��ʼ��
void InitStack(SqStack& st) {
    st.top = -1;
}
//����
void DestoryStack(SqStack st) {}
//��ջ
int Push(SqStack &st,ElemType c){
    //�ж�ջ�Ƿ�����
    if(st.top==MaxSize-1) return 0;
    else{
        st.top++;
        st.data[st.top] = c;
        return 1;
    }
}
//��ջ
int OutStack(SqStack &st,ElemType &c){
    //�ж�ջ�Ƿ�Ϊ��
    if(st.top==-1)return 0;
    else{
        c=st.data[st.top];
        st.top--;
        return 1;
    }
}
//��ʾջ�����е�Ԫ��
void DisplayStack(SqStack &st){
    int i;
    if(st.top==-1) printf("ջΪ��\n");
    else{
        for(i=0;i<=st.top;i++){
            printf("%c",st.data[i]);
        }
        printf("\n");
    }
}
//�ж�ջ��ջ��
int EmptyAndFullStack(SqStack &st){
    if(st.top==-1)return 0;
    else if(st.top==99)return 1;
    else return 2;
}
//ͳ��ջ��Ԫ�ظ���
int CountStack(SqStack &st){
    if(st.top!=-1)return st.top+=1;
    else return 0;
}
//����ĳԪ���Ƿ���ջ��
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
        printf("    ���˵�    \n");
        printf("1.��ʼ��˳��ջ\n");
        printf("2.��ջһ��Ԫ��\n");
        printf("3.��ջһ��Ԫ��\n");
        printf("4.��ʾջ�����е�Ԫ��\n");
        printf("5.�ж�ջ��ջ��\n");
        printf("6.ͳ��ջ��Ԫ�ظ���\n");
        printf("7.����ĳԪ���Ƿ���ջ��\n");
        printf("0.�˳�\n");
        scanf("%d",&flag);
        switch(flag){
            case 1:
                InitStack(st);
                printf("��ʼ���ɹ�\n");
                break;
            case 2:
                printf("������Ҫ��ջ��Ԫ��ֵ��\n");
                scanf(" %c",&e);
                printf(Push(st,e)==0?"ջ����\n":"��ջ���\n");
                break;
            case 3:
                if(OutStack(st,e)){
                    printf("��ǰ��ջ��Ԫ���ǣ�%c\n",e);
                }else{
                    printf("��ǰջ�ղ��ܳ�ջ��\n");
                }
                break;
            case 4:
                DisplayStack(st);
                break;
            case 5:
                printf("%s",EmptyAndFullStack(st)==0?"ջΪ��ջ":EmptyAndFullStack(st)==1?"ջ����":"ջδ��");
                break;
            case 6:
                printf("%d",CountStack(st));
                break;
            case 7:
                printf("������ҪҪ��ѯ��Ԫ��ֵ��\n");
                scanf("%s",&e);
                printf(isExistStack(st,e)== true?"��ֵ��ջ��\n":"��ֵ����ջ��\n");
                break;
            case 0:
                printf("���������");
                DestoryStack(st);
                exit(0);
                break;
        }
        printf("%d\n",flag);
    }while(flag<=20);
}



