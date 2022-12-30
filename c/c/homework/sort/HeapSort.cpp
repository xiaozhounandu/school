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


void Sift(SqType R[], int low, int high) {


    int i = low;
    int j = 2 * i;
    SqType tmp = R[i];
    while (j <= high) {
        if (j < high && R[j].key < R[j + 1].key)
            j++;
        if (tmp.key < R[j].key) {
            R[i] = R[j];
            i = j;
            j = 2 * i;
        } else break;
    }
    R[i] = tmp;

}


void HeapSort(SqType R[],int n){
    int i;
    SqType tmp;
    for (int i = n/2; i >=1; i--)
        Sift(R,i,n);
        for (int i = n; i >=2 ; i--) {
            tmp=R[1];
            R[1]=R[i];
            R[i]=tmp;
            Sift(R,1,i-1);
        }
}


int main(){
    SqType R[MaxSize];
    KeyType A[]={6,8,7,9,0,1,3,2,4,5};
    int i,n=10;
    for (int i = 0; i < n; i++)
        R[i+1].key=A[i];
        HeapSort(R,n);
        printf("result");
        for (int i = 1; i <=n; i++)
            printf("%3d",R[i].key);
    printf("\n");

        }
