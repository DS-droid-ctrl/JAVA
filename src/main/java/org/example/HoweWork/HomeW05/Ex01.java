package org.example.HoweWork.HomeW05;

import org.example.Seminars.Sem04.Ex02;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Ex01 {
    public static void main(String[] args) {
        ex01();
//        ex02();


    }

    private static void ex01() {
        String text = "Россия идет вперед всей планеты. Планета — это не Россия.";
        text = text.replaceAll("[-|–|—]|\\p{Punct}", " ");
        while (text.contains("  ")) {
            text = text.replace("  ", " ");
        }

        String findWord = "Россия";

        String[] arrayText = text.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String currentWord : arrayText) {
            if (!findWord.toLowerCase().equals(currentWord.toLowerCase())) {
                continue;
            }

            int count = map.getOrDefault(findWord.toLowerCase(), 0);
            map.put(currentWord.toLowerCase(), ++count);
        }

        System.out.println("Количество искомого слова: " + map.getOrDefault(findWord.toLowerCase(), 0));
    }

    private static void ex02() {
        String text = "Россия идет вперед всей планеты. Планета — это не Россия.";
        text = text.replaceAll("[-|–|—]|\\p{Punct}", " ");
        while (text.contains("  ")) {
            text = text.replace("  ", " ");
        }
        String[] arrayText = text.split(" ");

        Map<String, Integer> map = getCountWords(arrayText);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    private static Map<String, Integer> getCountWords(String[] array) {
        Map<String, Integer> map = new HashMap<>();

        for (String current : array) {
            int count = map.getOrDefault(current.toLowerCase(), 0);
            map.put(current.toLowerCase(), ++count);
        }

        return map;
    }
}
