package org.example.HoweWork.HomeW03.Ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("Молоко", "Белорусия", 69.99, 329.99, 1);
        Item item2 = new Item("Хлеб", "Россия", 50.99, 500.0, 1);
        Item item3 = new Item("Масло", "Россия", 190.99, 180.0, 2);
        Item item4 = new Item("Мука", "Белорусия", 54.99, 1000.0, 3);
        Item item5 = new Item("Бананы", "Эквадор", 120.99, 1000.0, 2);
        Item item6 = new Item("Тан", "Казахстан", 20.99, 523.05, 1);
        Item item7 = new Item("Сыр", "Абхазия", 240.29, 200.0, 1);

        List<Item> itemsList = new ArrayList<>();

        itemsList.add(item1);
        itemsList.add(item2);
        itemsList.add(item3);
        itemsList.add(item4);
        itemsList.add(item5);
        itemsList.add(item6);
        itemsList.add(item7);

        System.out.println(itemsList);
        int ourSort = 0;
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        while (flag) {
            System.out.println("Введите сорт товара (1, 2, 3)");
            String sort = scanner.nextLine();
            try {
                if (Integer.parseInt(sort) > 0 && Integer.parseInt(sort) <= 3) {
                    flag = false;
                    ourSort = Integer.parseInt(sort);
                }
            } catch (Exception e) {
                System.out.println("Введен неверный сорт. Попробуйте еще раз.");
            }
        }
        scanner.close();

        double minPrice = itemsList.get(0).getPrice();
        for (Item item : itemsList) {

            if (item.getSort().equals(ourSort)) {
                if (item.getPrice() < minPrice) {
                    minPrice = item.getPrice();
                }
            }
        }
        StringBuilder ourNames = new StringBuilder();
        for (Item item : itemsList) {

            if (item.getSort().equals(ourSort) && (item.getPrice() == minPrice)) {
                ourNames.append(item.getName()).append("\n");
            }
        }
        System.out.println("Товары с наименьшей ценой сорта " + ourSort + ": \n" + ourNames);
    }
}
