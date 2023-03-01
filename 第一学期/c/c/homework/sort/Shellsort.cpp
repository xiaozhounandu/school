//
// Created by 魏志杰 on 2022/12/15.
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


void ShellSort(SqType R[] ,int n){
int i,j,d;
SqType tmp;
d=n/2;
    while (d>0){
        for (int i = d; i <n ; i++) {
tmp=R[i];
j=i-d;
            while (j>=0 && tmp.key<R[j].key){
                R[j+d]=R[j];
                j=j-d;
            }
            R[j+d] =tmp;
        }
        d=d/2;
    }
}

int main(){
    SqType R[MaxSize];
    KeyType A[]={9 ,8,7,6,5,4,3,2,1,0};
    int i,n=10;
    for (int i = 0; i < n; i++)
        R[i].key=A[i];
        ShellSort(R,n);
        printf("排序结果")  ;
        for (int i = 0; i < n; i++)

            printf("%3d",R[i].key);

            printf("\n");
        }











