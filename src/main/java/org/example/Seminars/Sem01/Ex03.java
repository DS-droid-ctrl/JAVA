package org.example.Seminars.Sem01;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        System.out.printf("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("zadanie3(str) = " + zadanie3(str));
        scanner.close();
    }

    /**
     * @apiNote Дана строка. Поменять местами ее половины
     * @param str
     * @return перевернутая строка
     */

    private static String zadanie3(String str) {
        String up = str.substring(0, str.length()/2);
        String down = str.substring(str.length()/2);
        return down + up;
    }
}
