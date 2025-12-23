package com.algorithmization.nika.practice6;

public class task4 {
    static void main(String[] args) {
        int count = 0;

        for (int i = 0; i <= 90; i++) {
            double radian = Math.toRadians(i);
            double sinus = Math.sin(radian);

            System.out.printf("%.4f", sinus);
            count++;

            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }
    }
}
