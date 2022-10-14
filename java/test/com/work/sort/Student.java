package com.work.sort;

public class Student {
    private int stiID;
    private int score;

    @Override
    public String toString() {
        return "Student{" +
                "stiID='" + stiID + '\'' +
                ", score=" + score +
                '}';
    }

    public int getStiID() {
        return stiID;
    }

    public void setStiID(int stiID) {
        this.stiID = stiID;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student(int stiID, int score) {
        this.stiID = stiID;
        this.score = score;
    }

    public Student() {
    }
}
