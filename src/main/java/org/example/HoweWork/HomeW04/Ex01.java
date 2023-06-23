package org.example.HoweWork.HomeW04;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов: ");
        int n = scanner.nextInt();
        scanner.close();
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            deque.add(i);
        }
        System.out.println(deque);

        System.out.print("Перевернутый список: ");
        while (deque.size() > 0) {
            System.out.print(deque.pollLast() + " ");
        }
    }
}
