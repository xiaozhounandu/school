#include<stdio.h>
#include<string.h>

int main(){
 
	char c [30],*p,*ch = {"abcdefgh"};
 
	int m,n,i;
	printf("please write  m,n:");
	scanf("%d %d",&m,&n);
 
	if(m>strlen(ch)||m<=0||n<=0)
		printf("data is problom");
	else
	{									//截取字符串的长度
		for(p=ch+m-1,i=0;i<n;i++){		//条件就是ch+m-1   ch+m 表示开始的位置 但是因为数组下标是从0开始 所以减一操作
 
			if(*p)
				c[i] = *p++;            //通过判断*p 是否指向了一个值 来结束 
			else	
				break;					//条件判断 如果遇到结束标志'\0' 就跳出循环
		}
		c[i] = '\0';					//在程序的结尾处 添加上结束标志 '\0'
		printf("%s\n",c);
	}
 
 
 
 
}