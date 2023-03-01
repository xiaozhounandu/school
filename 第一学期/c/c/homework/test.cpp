//
// Created by 魏志杰 on 2022/11/12.
//



#include "stdio.h"
#include "stdlib.h"

void swap(int x,int y){
    int temp=x;
    x=y;
    y=temp;

    printf("%d",x);
    printf("%d",y);

}

void swap01(int *x1 ,int *y1){

    int temp =*x1;
    *x1=*y1;
    *y1=temp;

}



int main(){
        int a=10;
        int *p;
        p=&a;
        printf("\n");
    printf("%d,*d is\n",*p);


    int arr[]={1,2,23,4,4,5};

    int *point=arr;
//    int const *points=????
//    int point * const=????

    for (int i = 0; i < 5; i++) {

        printf("%d " " ",arr[i]);

    }


    int x=20;
    int y=10;
    swap(x,y);
    printf("%d",x);
    printf("%d",y);


    int x1=30;
    int y1=40;

    swap01(&x1,&y1);
    printf("%d",x1);
    printf("%d",y1);
    }
