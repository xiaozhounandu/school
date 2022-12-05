//
// Created by 魏志杰 on 2022/10/19.    最小值移出表头
//
#include<iostream>
#include<algorithm>
#include<cmath>
#include<vector>


using namespace std;

// 链表节点结构
typedef struct Node{
    int data;
    struct Node * next;
    Node(): next(NULL){};
    Node(int data):data(data), next(NULL){};
}Node, *LinkList;
// 输出循环单链表
void show(LinkList L){
    Node * p = L->next;
    while(p != L){
        cout<<p->data<<" ";
        p = p->next;
    }
    cout<<endl;
}

void deleteMin(LinkList &L){
    while(L->next != L){
        Node *p = L;
        Node *q = L->next;
        Node *pm = L;
        while(q!=L){
            if(q->data < pm->next->data){
                pm = p;
            }
            p = p->next;
            q = q->next;
        }
        Node * f = pm->next;
        pm->next = f->next;
        free(f);
        show(L);
    }
    free(L);
}


// 尾插创建链表
void careteListFromEnd(vector<int> v, LinkList &L){
    // 创建头
    L = new Node();
    L->next = L;

    // 设置尾指针
    Node *p = L;

    // 生成链表
    for(int i : v){
        Node *q = new Node(i);
        q->next = p->next;
        p->next = q;
        p = q;
    }
}

int main(){
    int a[] = {3,2,1,4,5,0};
    vector<int> va(a, a+6);
    int b[] = {7,8,9};
    vector<int> vb(b, b+3);
    LinkList La, Lb;
    careteListFromEnd(va, La);
    careteListFromEnd(vb, Lb);
    deleteMin(La);
    return 0;

}
