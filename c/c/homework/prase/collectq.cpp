//
// Created by 魏志杰 on 2022/11/12. 编程即生活，永远不知道前面是什么
//
#include "stdio.h"
#include "stdlib.h"

#define InitSize 10
//数组存满，放弃治疗

//可以采取动态分配

//typedef struct {
//    int data[MaxSize];
//    int length;
//}Sqlist;
//
//
//void Init(Sqlist &L) {
//    for (int i = 0; i < MaxSize; i++) {
//        L.data[i] = 0;
//        L.length = 0;
//    }
//}
//随机访问
//存储密度高、
//扩展不方便
//插入删除有大量的问题


typedef struct {
    int *data;
    int length;
    int MaxSize;
}Seqlist;

void init(Seqlist &L){

    //申请一片内存空间

    L.data=(int *) malloc(InitSize*sizeof(int));
    L.length=0;
    L.MaxSize=InitSize;

}


//插入的相关操作
bool listInsert(Seqlist &L ,int i ,int e){

if(i>L.length+1||i<1)
    return false;
    //l---->i---e
    for (int j=L.length ;j>=i; j--) {
        L.data[j] = L.data[j - 1];
        L.data[i - 1] = e;
        L.length++;
        return true;
    }
}

bool listDel(Seqlist &L,int i,int e){
    if(i>L.length+1||i<1)
        return false;
    for (int j = L.length; j < i; j--) {
        L.data[i-1]=L.data[i];
        L.data[i]=e;
        L.length--;

    }
    return true;

}


int  getElen(Seqlist L,int i){
    return L.data[i-1];
}


int getElen1(Seqlist L,int &e){
    for (int i=0;i<=L.length;i++){
        if(L.data[i] == e){
            return i+1;
        }
        return 0;
    }
}



int main(){

Seqlist L;
    init(L);
    return 0;

}