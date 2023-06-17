package org.example.HoweWork.HomeW01;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сумма положительных чисел = " + zadanie1(scanner));
    }

    /**
     * @apiNote Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, после
     * которых следует отрицательное число
     * @param scanner вспомогательный класс
     * @return результат
     */

    private static int zadanie1(Scanner scanner) {
        int sum = 0;
        System.out.print("Введите 1 элемент: ");
        int a = scanner.nextInt();
        while (a != 0) {
            System.out.print("Введите следующий элемент: ");
            int b = scanner.nextInt();
            if (b != 0) {
                if (a > 0 && b < 0) {
                    sum += a;
                }
            }
            a = b;
        }
        scanner.close();
        return sum;
    }
}


