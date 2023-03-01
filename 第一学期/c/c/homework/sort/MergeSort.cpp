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


void Merge(SqType R[],int low,int mid,int high){
    SqType *R1;
    int i=low,j=mid+1,k=0;
    R1=(SqType *) malloc((high-low+1) * sizeof(SqType));
    while (i<=mid&&j<=high)
        if(R[i].key<=R[j].key){
            R1[k]=R[i];
            i++;k++;

        } else{
            R1[k]=R[j];
            j++;k++;
        }
    while (i<=mid){
        R1[k]=R[i];
        i++;k++;

    }
    while (j<=high){
        R1[k]=R[j];
        j++;k++;
    }
    for (k = 0,i=low; i<=high;k++,i++)
        R[i]=R1[k];
        free(R1);

}
void MergePass(SqType R[],int length,int n){
    int i;
    for ( i = 0; i+2 * length-1<n; i=i+2*length)
        Merge(R,i,i+length-1,i+2*length-1);
        if(i+length-1<n)
        Merge(R,i,i+length-1,n-1);

}


void MergeSort(SqType R[],int n){
    int length;
    for (length=1;length<n;length=2*length)
        MergePass(R,length,n);

}



int main(){
   SqType R[MaxSize];
   KeyType A[]={18,2,20,34,12,32,6,16,5,8};
   int i,n=10;
    for (i = 0; i < n; i++)
        R[i].key=A[i];
    MergeSort(R,n);
    printf("sort result");
    for ( i = 0; i < n; i++)
        printf("%3d",R[i].key);
    printf("\n");
}