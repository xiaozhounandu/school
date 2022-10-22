package demo.xiaozhounandu.www;

public class test {
        public static void main(String[] args) {

            String[] name = {"weimeng", "zhao", "qian", "sun", "li", "zhou", "wu", "zheng", "wang", "zhang"};
            double[] score = {100, 70, 81, 90, 60, 50, 78, 45, 58, 80};
            Student[] stu = new Student[10];
            for (int i = 0; i < stu.length; i++) {
                stu[i] = new Student(name[i], score[i]);
            }
            for (String x:name
                 ) {

            }
            Class c = new Class(stu);
            System.out.println("平均分：" + c.getAverage());

            System.out.println("最高分：" + c.getMax());
            System.out.println("最低分：" + c.getMin());
            System.out.println("成绩分布：" + c.gradeDistribution());
        }
    }


