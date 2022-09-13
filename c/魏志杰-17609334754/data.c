#include "stdio.h"
#include "string.h"
int main(){
    //定义相关的年，月，日期，总和，变量i
    int year ,month,data,sum,i;
    //创建a数组，将一年中的十二个月的日期放入数组，因为要通过下标访问，所以数组第一个数为0,剩下的数是月份天数
    int a [13] ={0,31,28,31,30,31,30,31,31,31,30,30,31};
    printf("请输入年：");
    //获取年份
    scanf("%d" ,&year);
    printf("请输入月：");
    //获取月份
    scanf("%d" ,&month);
    printf("请输入日：");
    //获取日子
    scanf("%d" ,&data);
    printf("你输入的日期是 : %d年,%d月,%d日",year,month,data       );
   //循环取值，计算时间
   for(i=0;i<=month;i++){
   sum=sum+a[i];
   } 
   //赋值 
   sum=sum+data;
   printf("\n%d年,%d月,%d日,是今年的第%d天",year,month,data,sum);










}