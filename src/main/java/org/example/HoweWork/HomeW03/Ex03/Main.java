package org.example.HoweWork.HomeW03.Ex03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Item book1 = new Item("Солнечный удар", "Иван Бунин", 130.00, 2021, 323);
        Item book2 = new Item("Демиан", "Герман Гессе", 136.99, 2023, 256);
        Item book3 = new Item("Новогодние истории", "Николай Гоголь", 156.99, 1851, 480);
        Item book4 = new Item("Дом у озера", "Татьяна Корсакова", 135.00, 1985, 250);
        Item book5 = new Item("Странствия алхимика", "Алекс Каменев", 262.50, 1850, 352);
        Item book6 = new Item("Превращение", "Франц Афка", 125.99, 2015, 257);
        Item book7 = new Item("Большие перемены", "Даниэла Стил", 189.50, 2018, 352);
        Item book8 = new Item("Холодный дом", "Чарльз Диккенс", 313.80, 1564, 1184);

        List<Item> itemList = new ArrayList<>();

        itemList.add(book1);
        itemList.add(book2);
        itemList.add(book3);
        itemList.add(book4);
        itemList.add(book5);
        itemList.add(book6);
        itemList.add(book7);
        itemList.add(book8);
        System.out.println(itemList);

        StringBuilder sortedItem = new StringBuilder();
        for (Item item : itemList) {
            if (isPrime(item.getPgNum()) && item.getAuthor().toLowerCase().contains("а")) {
                if (item.getYear() >= 2010 && item.getYear() <= 2023) {
                    sortedItem.append(item.getName()).append("\n");
                }
            }
        }
        System.out.println(sortedItem);
    }

    private static boolean isPrime(Integer num) {

        if (num == 1) {
            return true;
        }
        if ((num % 2 == 0 && num != 2) || (num % 3 == 0 && num != 3) || (num % 5 == 0 && num != 5)) {
            return false;
        }
        for (int i = 2; i < num * num; i++) {
            if (i != num) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}