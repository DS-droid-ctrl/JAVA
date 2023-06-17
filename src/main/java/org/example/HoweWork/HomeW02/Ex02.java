package org.example.HoweWork.HomeW02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел: ");
        int n = scanner.nextInt();
        System.out.println("zadanie2(n, scanner) = " + zadanie2(n, scanner));
    }

    /**
     * @param n длина последовательности
     * @param scanner вспомогательный класс
     * @return результат
     * @apiNote Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей
     */

    private static boolean zadanie2(int n, Scanner scanner) {
        boolean flag = false;
        int n1 = scanner.nextInt();
        for (int i = 0; i < n - 1; i++) {
            int n2 = scanner.nextInt();
            if (n2 < n1) return false;
            n1 = n2;
        }
        return  true;
    }
}
