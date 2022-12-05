//
// Created by 魏志杰 on 2022/11/30.
//

//普里姆算法



#include<stdio.h>
#include<stdlib.h>
typedef int InfoType;
#define MAXV 6
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

//
void DispMat1(MGraph g){
    int i,j;
    for(i=0;i<g.n;i++){
        for(j=0;j<g.n;j++)
            if(g.edges[i][j]==INF) printf("%6s","∞");
            else printf("%4d",g.edges[i][j]);
        printf("\n");
    }
}
void Prim(MGraph g,int v){
    int lowcost[MAXV],min,n=g.n;
    int closest[MAXV],i,j,k;
    for(i=0;i<n;i++){
        lowcost[i]=g.edges[v][i];
        closest[i]=v;
    }
    for(i=1;i<n;i++){
        min=INF;
        for(j=0;j<n;j++)
            if(lowcost[j]!=0&&lowcost[j]<min){
                min=lowcost[j];
                k=j;
            }
        printf("  边（%d,%d）权为：%d\n",closest[k],k,min);
        lowcost[k]=0;
        for(j=0;j<n;j++)
            if(g.edges[k][j]!=0&&g.edges[k][j]<lowcost[j]){
                lowcost[j]=g.edges[k][j];
                closest[j]=k;
            }
    }
}

int main(){
    int i,j,u=3;
    MGraph g;
//    int A[MAXV][MAXV]={{0,5,8,7,INF,3},
//                       {5,0,4,INF,INF,INF},
//                       {8,4,0,5,INF,9},
//                       {7,INF,5,0,5,INF},
//                       {INF,INF,INF,5,0,1},
//                       {3,INF,9,INF,1,0}};

    int A[MAXV][MAXV]={{0,7,10,6,1,2},
                       {7,0,5,INF,INF,INF},
                       {10,5,0,4,INF,INF},
                       {6,INF,4,0,6,INF},
                       {1,INF,INF,6,0,1},
                       {2,INF,INF,INF,1,0}};
    g.n=6;g.e=10;
    for(i=0;i<g.n;i++)
        for(j=0;j<g.n;j++)
            g.edges[i][j]=A[i][j];
    printf("图的邻接矩阵：\n");
    DispMat1(g);
    printf("普里姆算法求解结果：\n");
    Prim(g,0);
    printf("\n");
}









