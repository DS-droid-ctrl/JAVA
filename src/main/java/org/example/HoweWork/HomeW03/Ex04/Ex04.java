package org.example.HoweWork.HomeW03.Ex04;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое значение: ");
        list.add(Integer.valueOf(scanner.nextLine()));
        System.out.println("Введите второе значение: ");
        list.add(Integer.valueOf(scanner.nextLine()));
        System.out.println("Введите третье значение: ");
        list.add(Integer.valueOf(scanner.nextLine()));
        int min = list.get(0);
        int max = list.get(0);
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            sum += num;
        }
        double average = (double) sum / list.size();
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println("Average value: " + average);
    }
}