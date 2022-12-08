//
// Created by κ־�� on 2022/12/8.
//
//graph.h�Ķ������£�
#include<stdio.h>
#include<stdlib.h>
typedef int InfoType;
#define MAXV 50
#define MAXE 50
#define INF 32367
typedef struct{  //�ڽӾ�������
    int no;
    InfoType info;
}VertexType;
typedef struct{
    int edges[MAXV][MAXV];
    int n,e;
    VertexType vexs[MAXV];
}MGraph;
typedef struct ANode{  //�ڽ���������
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
            if(g.edges[i][j]==INF) printf("%4s","��");
            else printf("%4d",g.edges[i][j]);
        printf("\n");
    }
}
void ppath(int path[],int i,int v){
    int k;
    k=path[i];
    if(k==v) return;
    ppath(path,k,v);
    printf("%d,",k);
}
void DisPath(int dist[],int path[],int s[],int n,int v){
    int i;
    printf("  path:");
    for(i=0;i<n;i++)
        printf("%3d",path[i]);
    printf("\n");
    for(i=0;i<n;i++)
        if(s[i]==1){
            if(i!=v){
                printf("  ��%d��%d�����·������Ϊ��%d\t·��Ϊ��",v,i,dist[i]);
                printf("%d,",v);ppath(path,i,v);printf("%d\n",i);
            }
        }
        else printf("  ��%d��%d������·��\n",v,i);
}
void Dijkstra(MGraph g,int v){
    int dist[MAXV],path[MAXV];
    int s[MAXV];
    int mindis,i,j,u,n=g.n;
    for(i=0;i<n;i++){
        dist[i]=g.edges[v][i];
        s[i]=0;
        if(g.edges[v][i]<INF)
            path[i]=v;
        else path[i]=-1;
    }
    s[v]=1;path[v]=0;
    for(i=0;i<n;i++){
        mindis=INF;
        u=-1;
        for(j=0;j<n;j++)
            if(s[j]==0&&dist[j]<mindis){
                u=j;
                mindis=dist[j];
            }
        s[u]=1;
        for(j=0;j<n;j++)
            if(s[j]==0)
                if(g.edges[u][j]<INF&&dist[u]+g.edges[u][j]<dist[j]){
                    dist[j]=dist[u]+g.edges[u][j];
                    path[j]=u;
                }
    }
    printf("������·����\n");
    DisPath(dist,path,s,n,v);
}

int main(){
    int i,j,u=0;
    MGraph g;
    int A[MAXV][6]={{0,5,INF,7,INF,INF},
                    {INF,0,4,INF,INF,INF},
                    {8,INF,0,INF,INF,9},
                    {INF,INF,5,0,INF,6},
                    {INF,INF,INF,5,0,INF},
                    {3,INF,INF,INF,1,0}};
    g.n=6;g.e=10;
    for(i=0;i<g.n;i++)
        for(j=0;j<g.n;j++)
            g.edges[i][j]=A[i][j];
    printf("����ͼG���ڽӾ���\n");
    DispMat1(g);
    printf("\n�ҽ�˹�����㷨�������\n");
    Dijkstra(g,u);
    printf("\n");
}
