package demo.xiaozhounandu.www;

import demo.xiaozhounandu.www.Student;

public class Class {
        Student[] s;

        Class(Student[] s) {
            this.s = s;
        }

        double getAverage() { //平均成绩
            double sum = 0;
            for (int i = 0; i < s.length; i++) {
                sum += s[i].score;
            }
            return sum / s.length;
        }

        double getMax() { //最高成绩
            double maxScore = 0;
            for (int i = 0; i < s.length; i++) {
                if (s[i].score > maxScore) {
                    maxScore = s[i].score;
                }
            }
            return maxScore;
        }

        double getMin() { //最低成绩
            double minScore = 100;
            for (int i = 0; i < s.length; i++) {
                if (s[i].score < minScore) {
                    minScore = s[i].score;
                }
            }
            return minScore;
        }

        String gradeDistribution() { //本次考试成绩的分布情况
            int great = 0;
            int good = 0;
            int pass = 0;
            int failure = 0;
            for (int i = 0; i < s.length; i++) {
                int grade = (int) (s[i].score / 10);
                switch (grade) {
                    case 10:
                    case 9:
                        great++;
                        break;
                    case 8:
                    case 7:
                        good++;
                        break;
                    case 6:
                        pass++;
                        break;
                    default:
                        failure++;
                        break;
                }
            }
            return "优秀：" + great + " 良好：" + good + " 及格：" + pass + " 不及格：" + failure;
        }
    }


