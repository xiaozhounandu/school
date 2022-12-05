//
// Created by 魏志杰 on 2022/11/3.
//
#include "stdlib.h"
#include "stdio.h"

//1）建立串s=“abcdefghefghijklmn”和串s1=“xyz”；
//（2）输出串s；
//（3）输出串s的长度；
//（4）在串s的第9个字符位置插入串s1而产生串s2；
//（5）输出串s2；
//（6）删除串s第2个字符开始的5个字符而产生串s2；
//（7）输出串s2；
//（8）将串s第2个字符开始的5个字符替换成串s1而产生串s2；
//（9）输出串s2；
//（10）提取串s的第2个字符开始的10个字符而产生串s3；
//（11）将串s1和串s2连接起来而产生串s4；
//（12）输出串s4


#define MaxSize 100


typedef struct{
    char data[MaxSize];
    int length;
}SqString;


//串赋值

void Assign(SqString &s ,char str[]){
    int i=0;
    while (str[i] != '\0'){
        s.data[i]=str[i];
        i++;
    }
    s.length=i;
}

//销毁
void DestroyStr(SqString s){

}


//copy SqString


void StrCopy(SqString &s,SqString t){
    int i;
    for (int i = 0; i < t.length; i++) {
        s.data[i]=t.data[i];
        s.length=t.length;
    }

}

//length

int StrLength(SqString s){
    return s.length;
}

//equals

int  StrEquals(SqString s,SqString s2){
    int i=0;
    if(s.length!=s2.length)
        return 0;
    else{
        for (i=0;i<s.length;i++)
            if(s.data[i]!=s2.data[i])
                return 0;
        return 1;
    }

}

//connect

SqString Concat(SqString s,SqString s2){
    SqString r;
    int i,j;
    for (int i = 0; i < s.length; i++)
        r.data[i]=s.data[i];            //s->r
    for (int j = 0; j < s2.length; j++) {
        r.data[s.length+1]=s2.data[i];  //s2->r
        r.length=i+j;
        return r;
    }
}



//son

SqString SubStr(SqString s,int i,int j){
    SqString t;
    int k;
    if(i<1 || i>s.length || j<1|| i+j>s.length+1)  //argument error
        t.length=0;
    else{
        for ( k = i-1; k < i+j-1; k++) {
            t.data[k-i+1]=s.data[k];
            t.length=j;
        }
        return t;
    }
}





void DispStr(SqString s){
    int i;
    for (int i = 0; i < s.length; i++) {
        printf("%c",s.data[i]);
    }
    printf("\n");
}

//insert

//字串插入运算
int InsStr(SqString &s,int i,SqString t)
{
    int j;
    if(i<1 || i>s.length+1)
        return 0;
    else
    {
        for(j=s.length-1;j>i-1;j--)
            s.data[j+t.length]=s.data[j];
        for(j=0;j<t.length;j++)
            s.data[i+j-1]=t.data[j];
        s.length=s.length+t.length;
        return 1;
    }
}

//
//SqString DelStr(SqString &s,int i,int j)		//串删去
//{
//    int k;
//    SqString str;
//    str.length=0;
//    if (i<=0 || i>s.length || i+j>s.length+1) //参数不正确时返回空串
//        return str;
//    for (k=0;k<i-1;k++)       		//s.data[0..i-2]→str
//        str.data[k]=s.data[k];
//    for (k=i+j-1;k<s.length;k++)	//s.data[i+j-1..s.length-1]→str
//        str.data[k-j]=s.data[k];
//    str.length=s.length-j;
//    return str;
//}


SqString RepStr(SqString s,int i,int j,SqString t)	//子串替换
{
    int k;
    SqString str;
    str.length=0;
    if (i<=0 || i>s.length || i+j-1>s.length) //参数不正确时返回空串
        return str;
    for (k=0;k<i-1;k++)				//s.data[0..i-2]→str
        str.data[k]=s.data[k];
    for (k=0;k<t.length;k++)   		//t.data[0..t.length-1]→str
        str.data[i+k-1]=t.data[k];
    for (k=i+j-1;k<s.length;k++)	//s.data[i+j-1..s.length-1]→str
        str.data[t.length+k-j]=s.data[k];
    str.length=s.length-j+t.length;
    return str;
}



//（4）在串s的第9个字符位置插入串s1而产生串s2；
//（5）输出串s2；
//（6）删除串s第2个字符开始的5个字符而产生串s2；
//（7）输出串s2；
//（8）将串s第2个字符开始的5个字符替换成串s1而产生串s2；
//（9）输出串s2；
//（10）提取串s的第2个字符开始的10个字符而产生串s3；
//（11）将串s1和串s2连接起来而产生串s4；
//（12）输出串s4
int DelStr(SqString &s, int i, int j){
    int k;
    if (i<1 || i>s.length || j<1 || i+j>s.length+1)
        return 0;
    else{
        for(k=i+j-1;k<s.length;k++)
            s.data[k-j]=s.data[k];
        s.length=s.length-j;
        return 1;
    }
}

int main(){
SqString s ,s1,s2,s3,s4;
    Assign(s,"abcdefghefghijklmn");
    Assign(s1,"xyz");
    printf("s");
    DispStr(s);
    printf("s1");
    DispStr(s1);

    printf("s的长度：%d\n", StrLength(s));

    InsStr(s,9,s1);
    printf("s2insert\n");DispStr(s);


    DelStr(s,2,5);
    printf("s2del");
    DispStr(s);


    printf("rep\n");
    RepStr(s,2,5,s1);
    DispStr(s2);
//（10）提取串s的第2个字符开始的10个字符而产生串s3；
//（11）将串s1和串s2连接起来而产生串s4；
//（12）输出串s4

    s4= Concat(s1,s3);
    printf("s4");
    DispStr(s4);



}







