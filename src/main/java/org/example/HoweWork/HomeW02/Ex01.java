package org.example.HoweWork.HomeW02;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел: ");
        int n = scanner.nextInt();
        System.out.println("zadanie1(n, scanner) = " + zadanie1(n, scanner));
    }

    /**
     * @param n длина последовательности
     * @param scanner вспомогательный класс
     * @return сумма чисел
     * @apiNote Дана последовательность N целых чисел. Найти сумму простых чисел
     */

    private static int zadanie1(int n, Scanner scanner) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            sum += a;
            }
        return sum;
    }
}
