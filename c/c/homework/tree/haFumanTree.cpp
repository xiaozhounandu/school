//
// Created by 魏志杰 on 2022/11/24.
//

#include <stdio.h>
#include <string.h>

#define N   (50)        // 树中叶子结点数最大值
#define M   (2 * N - 1) // 树中结点总数最大值

typedef struct
{
    char data[5]; // 结点值
    int weight; // 权重
    int parent; // 双亲结点
    int lchild; // 左孩子结点
    int rchild; // 右孩子结点
}HTNode; // 声明哈夫曼树结点类型

typedef struct
{
    char cd[N]; // 存放哈夫曼编码
    int start;
}HCode;         // 声明哈夫曼编码类型

//由含有n个叶子结点的ht构造完整的哈夫曼树
static void create_huffman_tree(HTNode ht[], int n)
{
    int i;int k;int lnode;int rnode;
    int min1;int min2;            //最小的和次小的数值
    // 所有结点的相关域设置初值为-1
    for(i = 0; i < 2 * n - 1; i++)
        ht[i].parent = ht[i].lchild = ht[i].rchild = -1;
    for(i = n; i < 2 * n - 1; i++) // 构造哈夫曼树的分支结点
    {
        min1 = min2 = 32767;
        lnode = rnode = -1;
        for(k = 0; k <= i - 1; k++) // 查找最小和次小的结点
        {
            if(ht[k].parent == -1) // 只在尚未构造二叉树的结点中查找
            {     //min1
                if(ht[k].weight < min1)
                {
                    min2 = min1;
                    rnode = lnode;
                    min1 = ht[k].weight;
                    lnode = k;
                }   //min2
                else if(ht[k].weight < min2)
                {
                    min2 = ht[k].weight;
                    rnode = k;
                }
            }
        }
        ht[lnode].parent = i; // 合并两个最小和次小的结点
        ht[rnode].parent = i;
        ht[i].weight = ht[lnode].weight + ht[rnode].weight; // 计算双亲结点的权重
        ht[i].lchild = lnode; // 设置双亲结点的左孩子
        ht[i].rchild = rnode; // 设置双亲结点的右孩子
    }
}

//由哈夫曼树ht构造哈夫曼编码hcd
static void create_huffman_code(HTNode ht[], HCode hcd[], int n)
{
    int i;int f;int c;
    HCode hc;

    for(i = 0; i < n; i++)        // 根据哈夫曼树构造所有叶子结点的哈夫曼编码
    {
        hc.start = n;
        c = i;
        f = ht[i].parent;
        while(f != -1)            // 循环直到树根结点
        {
            if(ht[f].lchild == c) // 处理左孩子结点
                hc.cd[hc.start--] = '0';
            else                  // 处理右孩子结点
                hc.cd[hc.start--] = '1';
            c = f;
            f = ht[f].parent;     //parent
        }
        hc.start++;                // start指向哈夫曼编码最开始字符
        hcd[i] = hc;
    }
}

//输出哈夫曼编码
static void display_huffman_code(HTNode ht[], HCode hcd[], int n)
{
    int i;
    int k;int sum = 0;int m = 0;
    int j;

    printf("输出哈夫曼编码:\n");
    for(i = 0; i < n; i++)
    {
        j = 0;
        printf("      %s:\t", ht[i].data);
        for(k = hcd[i].start; k <= n; k++)
        {
            printf("%c", hcd[i].cd[k]);
            j++;
        }
        m += ht[i].weight;
        sum += ht[i].weight * j;
        printf("\n");
    }
    printf("\n平均长度 = %g\n", 1.0 * sum / m);
}

int main(void)
{
    int n = 15;
    int i;
    HTNode ht[M];
    HCode hcd[N];
    char *str[] = {"The", "of", "a", "to", "and", "in", "that", "he", "is", "at", "on", "for", "His", "are", "be"};
    int fnum[] = {1192, 677, 541, 518, 462, 450, 242, 195, 190, 181, 174, 157, 138, 124, 123};

    for(i = 0; i < n; i++)
    {
        strcpy(ht[i].data, str[i]);
        ht[i].weight = fnum[i];
    }
    create_huffman_tree(ht, n);      // 创建哈夫曼树
    create_huffman_code(ht, hcd, n); // 构造哈夫曼编码
    display_huffman_code(ht, hcd, n); // 输出哈夫曼编码

    return 0;
}
