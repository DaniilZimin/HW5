package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {


    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int spendingAmount = 0;
        for (int i : arr) {
            spendingAmount += i;
        }
        System.out.println("Сумма трат за месяц составила " + spendingAmount + " рублей.");
        int minWaste = 200_000;
        for (int i : arr) {
            if (i < minWaste) {
                minWaste = i;
            }
        }
        int maxWaste = 0;
        for (int i : arr) {
            if (i > maxWaste) {
                maxWaste = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minWaste + " рублей. Максимальная сумма трат за день составила " + maxWaste + " рублей.");

        double numberOfDays = 30;
        double averageAmount = spendingAmount / numberOfDays;
        System.out.println("Средняя суммма трат за месяц составила " + averageAmount + " рублей.");


        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
