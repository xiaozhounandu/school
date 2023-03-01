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
            if(g.edges[i][j]==INF) printf("%6s","∞");
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
//void DisPath(int dist[],int path[],int s[],int n,int v){
//    int i;
//    printf("path:");
//    for(i=0;i<n;i++)
//        printf("%3d",path[i]);
//    printf("\n");
//    for(i=0;i<n;i++)
//        if(s[i]==1){
//            if(i!=v){
//                printf("  从%d到%d的最短路径长度为：%d\t路径为：",v,i,dist[i]);
//                printf("%d,",v);ppath(path,i,v);printf("%d\n",i);
//            }
//        }
//        else printf("  从%d到%d不存在路径\n",v,i);
//}


void DisPath(MGraph g, int dist[], int path[], int S[], int v, int i1) {
    int i,j,k;
    int apath[MAXV],d;
    for (i=0;i<g.n;i++)
        if(S[i] ==1 && i!=v){
            printf("  从%d到%d的最短路径长度为：%d\t路径为：",v,i,dist[i]);
            d=0;apath[d]=i;
            k=path[i];
            if(k==-1)
                printf("no path");
            else
            {
                while (k!=v){
                    d++;apath[d]=k;
                    k=path[k];
                }
                d++;apath[d]=v;
                printf("%d",apath[d]);
                for (int j = d-1; j >=0 ; j--)

                    printf("%d",apath[j]);
                printf("\n");
            }
        }
}
void Dijkstra(MGraph g,int v){
    int dist[MAXV],path[MAXV];
    int s[MAXV];
    int mindis,i,j,u=0,n=g.n;
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
    printf("输出最短路径：\n");
    DisPath(g, dist, path, s, n, v);
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
    printf("有向图G的邻接矩阵：\n");
    DispMat1(g);
    printf("\n狄杰斯特拉算法求解结果：\n");
    Dijkstra(g,u);
    printf("\n");
}

