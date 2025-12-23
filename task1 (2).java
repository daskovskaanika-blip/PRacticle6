package com.algorithmization.nika.practice6;

import java.util.Random;
import java.util.Scanner;

public class task1 {
    static void main(String[] args) {
        int[] array;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n;
        int odd = 0;
        int even = 0;

        System.out.println("Введите размер массива: ");
        n = scanner.nextInt();
        array = new int[n];

        System.out.println("Массив: ");
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
            if (array[i] % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }
        }
        System.out.println();

        System.out.printf("Количество чётных чисел: %d%nКоличество нечётных чисел: %d", even, odd);
    }
}
