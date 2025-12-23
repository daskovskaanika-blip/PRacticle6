package com.algorithmization.nika.practice6;

import java.util.Random;
import java.util.Scanner;

public class task5 {
    static void main() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] array;
        int n;

        System.out.println("Введите размер массива: ");
        n = scanner.nextInt();
        array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(10,100);
            System.out.print(array[i] + " ");
        }

        System.out.println("Что проверить?");
        System.out.println("1 - Возрастание");
        System.out.println("2 - Спадение");
        int choice = scanner.nextInt();

        boolean isOrdered = true;

        if (choice == 1) {
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    isOrdered = false;
                    break;
                }
            }
            System.out.println("Массив растущий: " + isOrdered);

        } else if (choice == 2) {
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i + 1]) {
                    isOrdered = false;
                    break;
                }
            }
            System.out.println("Массив убывающий: " + isOrdered);
        } else {
            System.out.println("Неправильный выбор!");
        }
    }
}
