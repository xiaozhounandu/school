#include<stdio.h>
int main(){
	int year,month,leap,day,dayth=0;
	printf("请输入年 月 日（格式为2021 9 8）:\n");
	scanf("%d%d%d",&year,&month,&day);
	if(year%4 == 0 && year%100 != 0 || year%400 ==0)//判断输入的年份是否为闰年
		leap=29;
	else
		leap=28;
	if(month<1||month>12)
		printf("输入月份不合法\n");
	if(day<1||day>31)
		printf("输入日期不合法\n");
	month=month-1;
	switch(month)
	{
	case 11 : dayth += 30;
	case 10 : dayth += 31;
	case  9 : dayth += 30;
	case  8 : dayth += 31;
	case  7 : dayth += 31;
	case  6 : dayth += 30;
	case  5 : dayth += 31;
	case  4 : dayth += 30;
	case  3 : dayth += 31;
	case  2 : dayth += leap;
	case  1 : dayth += 31;
	}
	dayth+=day;
	printf("是%d年的第%d天\n",year,dayth);
	return 0;
}
