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

void Merge(RecType R[],int low,int mid,int high){
    RecType *R1;
    int i=low,j=mid+1,k=0;
    R1=(RecType *)malloc((high-low+1)*sizeof(RecType));
    while(i<=mid&&j<=high){
        if(R[i].key<=R[j].key){
            R1[k]=R[i];
            i++;k++;
        }
        else{
            R1[k]=R[j];
            j++;k++;
        }
    }
    while(i<=mid){
        R1[k]=R[i];
        i++;k++;
    }
    while(j<=high){
        R1[k]=R[j];
        j++;k++;
    }
    for(k=0,i=low;i<=high;k++,i++)
        R[i]=R1[k];
}
void MergePass(RecType R[],int length,int n){
    int i;
    for(i=0;i+2*length-1<n;i=i+2*length)
        Merge(R,i,i+length-1,i+2*length-1);
    if(i+length-1<n)
        Merge(R,i,i+length-1,n-1);
}

void MergeSort(RecType R[],int n){
    int length,k,i=1;
    for(length=1;length<n;length=2*length){
        MergePass(R,length,n);;
        printf("第%d趟归并：",i++);
        for(k=0;k<n;k++)
            printf("%4d",R[k].key);
        printf("\n");
    }
}

int main(){
    int i,k,n=10;
    //KeyType a[]={18,2,20,34,12,32,6,16,5,8};
    KeyType a[]={75,87,68,92,88,61,77,96,80,72};
    RecType R[MAXE];
    for(i=0;i<n;i++)
        R[i].key=a[i];
    printf("初始关键字：");
    for(k=0;k<n;k++)
        printf("%4d",R[k].key);
    printf("\n");
    MergeSort(R,n);
    printf(" 最后结果：");
    for(k=0;k<n;k++)
        printf("%4d",R[k].key);
    printf("\n");
}





