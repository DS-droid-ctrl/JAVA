package org.example.HoweWork.HomeW01;

import java.util.*;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите строку: ");
        String s = scanner.nextLine();
        System.out.println("zadanbe01(s) = " + zadanbe01(s));
    }

    /**
     * @apiNote Учитывая входную строку s, измените порядок слов на противоположный
     * @param s строка
     * @return результат
     */

    private static String zadanbe01(String s) {
        List<String> words = Arrays.asList(s.trim().split("\\s+"));
        Collections.reverse(words);
        return String.join(" ", words);
    }
}

