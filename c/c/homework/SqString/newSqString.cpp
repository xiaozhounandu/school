#define MaxSize 100
#include "stdio.h"
#include "stdlib.h"


struct SqString{
    char data[MaxSize];
    int length;
};

void Assign(SqString &s, char str[]){
    int i=0;
    while (str[i]!='\0'){
        s.data[i]=str[i];
        i++;
    }
    s.length=i;
}

void PrintString(SqString &s){
    int i;
    for(i=0; i<s.length;i++)
        printf("%c ", s.data[i]);
    printf("\n");
}

void StrCopy(SqString &s, SqString t){
    int i;
    for (i=0; i<t.length; i++)
        s.data[i]=t.data[i];
    s.length=t.length;
}

int StrLength(SqString s){
    return s.length;
}

int StrEquals(SqString s, SqString t){
    int i=0;
    if(s.length!=t.length)
        return 0;
    else{
        for(i=0;i<s.length;i++)
            if(s.data[i]!=t.data[i])
                return 0;
        return 1;
    }
}

int InsStr(SqString &s, int i, SqString t){
    int j;
    if(i<1 || i>s.length+1)
        return 0;
    else{
        for(j=s.length-1;j>=i-1;j--)
            s.data[j+t.length]=s.data[j];
        for(j=0;j<t.length;j++)
            s.data[i+j-1]=t.data[j];
        s.length+=t.length;
        return 1;
    }
}

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

int RepStr(SqString &s, int i, int j, SqString t){
    DelStr(s, i, j);
    InsStr(s, i, t);
    return 1;
}

SqString SubStr(SqString s, int i, int j){
    SqString t;
    int k;
    if(i<1 || i>s.length || j<1||i+j>s.length+1)
        t.length=0;
    else{
        for(k=i-1;k<i+j-1;k++)
            t.data[k-i+1]=s.data[k];
        t.length=j;
    }
    return t;
}

SqString Concat(SqString s, SqString t){
    SqString r;
    int i,j;
    for(i=0;i<s.length;i++)
        r.data[i]=s.data[i];
    for(j=0;j<t.length;j++)
        r.data[s.length+j]=t.data[j];
    r.length=i+j;
    return r;
}

int main(void){
    SqString s,s1,s2,s3,s4;

    Assign(s, "abcdefghefghijklmn");
    Assign(s1, "xyz");

    PrintString(s);

    printf("length %d\n", StrLength(s));

    StrCopy(s2, s);
    InsStr(s2, 9, s1);
    printf("str2 = ");
    PrintString(s2);

    printf("d 2 -> 5 = %d\n", DelStr(s, 2, 5));

    StrCopy(s2, s);
    printf("s2 = ");
    PrintString(s2);

    RepStr(s, 2, 5, s1);
    StrCopy(s2, s);
    printf("s2 = ");
    PrintString(s2);

    InsStr(s, 1, s2);
    printf("s = ");
    PrintString(s);

    s3 = SubStr(s, 2, 10);
    printf("s3 = ");
    PrintString(s3);

    s4 = Concat(s1, s2);
    printf("s4 = ");
    PrintString(s4);

    return 0;
}