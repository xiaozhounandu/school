//
// Created by 魏志杰 on 2022/12/2.
//
#include "stdio.h"
#include "stdlib.h"
#define MaxSize 20
typedef int ElemType;


typedef int KeyType;
typedef struct {
    KeyType key;
    ElemType data;
}SqType;


//直接出一个临时空间
void insertSort(SqType R[],int n){
    int i, j;
    SqType tmp;
    for (i=1;i<n;i++){
        if(R[i-1].key>R[i].key){
            tmp=R[i];
            j=i-1;
            do{
                R[j+1]=R[j];
                j--;
            } while (j>=0&&R[j].key>tmp.key);
            R[j+1]=tmp;
        }
    }
}




int main(){
    SqType R[MaxSize];
    KeyType A[]={21,0,32,22,217,2,1,231,3,313,100};
    int i,n=10;
    for (int i = 0; i < n; i++)
        R[i].key=A[i];
        insertSort(R,n);
        printf("排序开始result\n");
        for (int i = 0; i < n; i++)
            printf("%6d",R[i].key);
            printf("\n");

}