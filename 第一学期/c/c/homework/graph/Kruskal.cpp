//
// Created by 魏志杰 on 2022/12/8.
//

//graph.h的定义如下：
#include<stdio.h>
#include<stdlib.h>
typedef int InfoType;
#define MAXV 50
#define MAXE 50
#define INF 32367
typedef struct{  //邻接矩阵类型
    int no;
    InfoType info;
}VertexType;
typedef struct{
    int edges[MAXV][MAXV];
    int n,e;
    VertexType vexs[MAXV];
}MGraph;
typedef struct ANode{  //邻接链表类型
    int adjvex;
    struct ANode *nextarc;
    InfoType info;
}ArcNode;
typedef int Vertex;
typedef struct Vnode{
    Vertex data;
    ArcNode *firstarc;
}VNode;
typedef VNode AdjList[MAXV];
typedef struct{
    AdjList adjlist;
    int n,e;
}ALGraph;
typedef struct{
    int u;
    int v;
    int w;
}Edge;

void DispMat1(MGraph g){
    int i,j;
    for(i=0;i<g.n;i++){
        for(j=0;j<g.n;j++)
            if(g.edges[i][j]==INF) printf("%8s","∞");
            else printf("%6d",g.edges[i][j]);
        printf("\n");
    }
}
void SortEdge(MGraph g,Edge E[]){
    int i,j,k=0;
    Edge temp;
    for(i=0;i<g.n;i++)
        for(j=0;j<g.n;j++)
            if(g.edges[i][j]<INF){
                E[k].u=i;
                E[k].v=j;
                E[k].w=g.edges[i][j];
                k++;
            }
    for(i=1;i<k;i++){
        temp=E[i];
        j=i-1;
        while(j>=0&&temp.w<E[j].w){
            E[j+1]=E[j];
            j--;
        }
        E[j+1]=temp;
    }
}
void Kruskal(Edge E[],int n,int e){
    int i,j,m1,m2,sn1,sn2,k;
    int vset[MAXE];
    for(i=0;i<n;i++)vset[i]=i;
    k=1;
    j=0;
    while(k<n){
        m1=E[j].u;m2=E[j].v;
        sn1=vset[m1];sn2=vset[m2];
        if(sn1!=sn2){
            printf("  (%d,%d):%d\n",m1,m2,E[j].w);
            k++;
            for(i=0;i<n;i++)
                if(vset[i]==sn2)
                    vset[i]=sn1;
        }
        j++;
    }
}

int main(){
    int i,j,u=3;
    MGraph g;
    Edge E[MAXE];
//    int A[MAXV][MAXV]={{0,5,8,7,INF,3},
//                       {5,0,4,INF,INF,INF},
//                       {8,4,0,5,INF,9},
//                       {7,INF,5,0,5,INF},
//                       {INF,INF,INF,5,0,1},
//                       {3,INF,9,INF,1,0}};

    int A[MAXV][MAXV]={{0,1,3,4,7},
                       {1,0,2,INF,INF},
                       {3,2,0,5,8},
                       {4,INF,5,0,6},
                       {7,INF,8,6,0}};
    g.n=5;g.e=10;
    for(i=0;i<g.n;i++)
        for(j=0;j<g.n;j++)
            g.edges[i][j]=A[i][j];
    SortEdge(g,E);
    printf("图的邻接矩阵：\n");
    DispMat1(g);
    printf("克鲁斯卡尔算法求解结果：\n");
    Kruskal(E,g.n,g.e);
    printf("\n");
}


