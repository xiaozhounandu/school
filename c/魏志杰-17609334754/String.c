#include "stdio.h"
#include "string.h"
int main(){
//定义相关的m,n,i 
	int m,n,i;
//char数组	 
	char str[20], substr[20];
	
	 printf("请输入要分割的字符串");
	//gets 函数从标准输入存储在字符串中。
	gets(str);
	printf("请输入m，n 的值");
	scanf("%d,%d",&m,&n);
	//循环	
	for(i=0;i<n;i++){
	substr[i] = str[m+i];
	}
	//puts ()函数用来向标准输出SUBSTR
		puts(substr); 


}
