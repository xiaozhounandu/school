//
// Created by 魏志杰 on 2022/12/1.
//
#include<stdio.h>
#include<stdlib.h>
#define INF 32367
# define MAX 100
#define INF 32367
int A[MAX][MAX],P[MAX][MAX];
typedef int edgetype;
typedef char vextype;
typedef struct{
    vextype vexs[MAX];
    edgetype edges[MAX][MAX];
    int n,e;
}MGraph;
void maxtrix(MGraph g){
    int i,j;
    for(i=0;i<g.n;i++){
        for(j=0;j<g.n;j++)
            if(g.edges[i][j]==INF) printf("%6s","∞");
            else printf("%4d",g.edges[i][j]);
        printf("\n");
    }
}
void ppath(int P[][MAX],int i,int j){
    int k;
    k=P[i][j];
    if(k==-1){
        printf("%d ,",i);
        printf("%d",j);
    }
    else{
        ppath(P,i,k);
        printf("%d,",k);
        ppath(P,k,j);
    }
}
void dispath(int A[][MAX],int P[][MAX],int n){
    int i,j;
    for(i=0;i<n;i++)
        for(j=0;j<n;j++)
        {
            if(A[i][j]==INF)
                if(i!=j)
                    printf("从顶点%d到顶点%d没有路径\n",i,j);
                else{
                    printf("从顶点%d到顶点%d的路径为：",i,j);
                    ppath(P,i,j);
                    printf("路径长度为：%d\n",A[i][j]);
                }
        }
}
void floyd(MGraph *G){
    int i,j,k;
    for(i=0;i<G->n;i++)
        for(j=0;j<G->n;j++){
            A[i][j]=G->edges[i][j];
            P[i][j]=-1;
        }
    for(k=0;k<G->n;k++)
        for(i=0;i<G->n;i++)
            for(j=0;j<G->n;j++)
                if(A[i][j]>(A[i][k]+A[k][j])){
                    A[i][j]=A[i][k]+A[k][j];
                    P[i][j]=k;
                }
    dispath(A,P,G->n);
}

int main(){
    int i,j;
    MGraph g;
    int b[MAX][MAX]={{0,5,INF,7,INF,INF},
                     {INF,0,4,INF,INF,INF},
                     {8,INF,0,INF,INF,9},
                     {INF,INF,5,0,INF,6},
                     {INF,INF,INF,5,0,INF},
                     {3,INF,INF,INF,1,0}};
    g.n=6;g.e=10;
    for(i=0;i<g.n;i++)
        for(j=0;j<g.n;j++)
            g.edges[i][j]=b[i][j];
    printf("floyed 算法求解：\n");
    floyd(&g);
    for(i=0;i<g.n;i++){
        for(j=0;j<g.n;j++)
            printf("%4d ",A[i][j]);
        printf("\n");
        printf("\n");
    }
    for(i=0;i<g.n;i++){
        for(j=0;j<g.n;j++)
            printf("%4d ",P[i][j]);
        printf("\n");
        printf("\n");
    }
    maxtrix(g);
}


