package com.work;

public class StuScore {
    public static void main(String[] args) {
        int[][] students = new int[10][];

        // init students
        for (int i = 100; i < 110; i++) {
            students[i - 100] = new int[2];
            students[i - 100][0] = i;
            students[i - 100][1] = (int) (Math.random() * 100);
        }

        int slow = 0;

        // tow pointer sort
        for (int fast = 1; fast < students.length; fast++)
            slow = students[fast][1] > students[slow][1] ? fast : slow;


        System.out.println("highest => " + students[slow][1]);

        //foreach students
        for (int[] num : students) {
            for (int x : num) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
