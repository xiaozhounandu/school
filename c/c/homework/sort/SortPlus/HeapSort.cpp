//
// Created by 魏志杰 on 2022/12/15.
//
#include "stdio.h"
#include "stdlib.h"
typedef int KeyType;
#define MAXE 20
typedef char InfoType[10];
typedef struct{
    KeyType key;
    InfoType data;
}RecType;
int count=1;
void DispHeap(RecType R[],int i,int n){
    if(i<=n) printf("%d",R[i].key);
    if(2*i<=n||2*i+1<n){
        printf("(");
        if(2*i<=n) DispHeap(R,2*i,n);
        printf(",");
        if(2*i+1<=n) DispHeap(R,2*i+1,n);
        printf(")");
    }
}
void Sift(RecType R[],int low,int high){
    int i=low,j=2*i;
    RecType temp=R[i];
    while(j<=high){
        if(j<high&&R[j].key<R[j+1].key)
            j++;
        if(temp.key<R[j].key){
            R[i]=R[j];
            i=j;
            j=2*i;
        }
        else break;
    }
    R[i]=temp;
}
void HeapSort(RecType R[],int n){
    int i,j;
    RecType temp;
    for(i=n/2;i>=1;i--)
        Sift(R,i,n);
    printf("  初始堆：");
    DispHeap(R,1,n);
    printf("\n");
    for(i=n;i>=2;i--){
        printf("第%d趟排序：\n",count++);
        printf("交换%d与%d，输出%d\n",R[i].key,R[1].key,R[1].key);
        temp=R[1];
        R[1]=R[i];
        R[i]=temp;
        printf("  排序结果：");
        for(j=1;j<=n;j++)
            printf("%2d",R[j].key);
        printf("\n");
        Sift(R,1,i-1);
        printf("筛选调整得到堆：");
        DispHeap(R,1,i-1);
        printf("\n");
    }
}

int main(){
    int i,k,n=10;
    KeyType a[]={6,8,7,9,0,1,3,2,4,5};
    RecType R[MAXE];
    for(i=1;i<=n;i++)
        R[i].key=a[i-1];
    printf("初始关键字：");
    for(k=1;k<=n;k++)
        printf("%2d",R[k].key);
    printf("\n");
    for(i=n/2;i>=1;i--)
        Sift(R,i,n);
    HeapSort(R,n);
    printf("最终结果：");
    for(k=1;k<=n;k++)
        printf("%2d",R[k].key);
    printf("\n");
}





