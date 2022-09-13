#define _CRT_SECURE_NO_WARNINGS
#include "stdio.h"
#include "stdlib.h" 
#define N 5
struct student {
	//定义相关的参数 
	int num;
	char name[1024];
	int score[3];
};
typedef struct student stu;
void input(stu* p) {
	//循环 
	for (int i = 0; i < N; ++i) {
		//循环输入学生的相关信息 
		printf("请输入第%d个学生的信息\n", i + 1);
		printf("请输入学号\n");
		scanf("%d", &(p + i)->num);
		printf("请输入姓名\n");
		scanf("%s", &(p + i)->name);
		//相关的课程 
		for (int j = 0; j < 3; ++j) {
			printf("请输入成绩%d\n", j + 1);
			scanf("%d", &(p + i)->score[j]);
		}
	}
}
void print(stu* p) {//相关的表达式子 
	printf("%d\t", p->num);
	printf("%s\t", p->name);
	for (int j = 0; j < 3; ++j) {
		printf("%d\t", p->score[j]);
	}
}
double aver(stu* p) {//计算平均分
	double sum = 0;
	for (int i = 0; i < 3; ++i) {
		sum += p->score[i];
	}
	return sum / N;
}
int excellect(stu* p) {//判断最高分,返回下标
	double sum = 0;
	double max = 0;
	int record = 0;
	for (int i = 0; i < N; ++i) {
		sum = 0;
		for (int j = 0; j < 3; ++j) {
			sum += (p + i)->score[j];
		}
		if (max < sum) {
			max = sum;
			record = i;
		}
	}
	return record;
}
int main() {
	stu a[N];
	stu* p = a;
	input(p);
	printf("学号\t姓名\t成绩1\t成绩2\t成绩3\t平均\n");
	for (int i = 0; i < N; i++) {
		print(p + i);
		printf("%f\n", aver(p + i));
	}
	// printf("最高分的学生数据如下\n学号\t姓名\t成绩1\t成绩2\t成绩3\t平均\n");
	// int n = excellect(p);
	// print(p + n);
	// printf("%f\n", aver(p + n));
	// system("pause");
}
