package com.algorithmization.nika.practice6;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task3 {
    static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n;
        int userNumber;
        int[] array;
        int userReplace;

        System.out.println("Введите размер массива: ");
        n = scanner.nextInt();
        array = new int[n];
        System.out.println("Массив: ");
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Введите число, которое хотите изменить: ");
        userNumber = scanner.nextInt();
        System.out.println("Введите число, на которое хотите изменить: ");
        userReplace = scanner.nextInt();

        boolean isfound = false;
        for (int i = 0; i < n; i++) {
            if (array[i] == userNumber) {
                array[i] = userReplace;
                isfound = true;
                break;
            }
        }
        if (isfound) {
            System.out.printf("Число {%d} есть в массиве и оно измененно на {%d}", userNumber, userReplace);
            System.out.println();
            System.out.println("Изменённый массив: " + Arrays.toString(array));
        }
        else {
            System.out.printf("Числа {%d} нет в массиве", userNumber);
        }
    }
}
