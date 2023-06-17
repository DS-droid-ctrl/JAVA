package org.example.HoweWork.HomeW03.Ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("Хлеб высший помол", 50.0, 1);
        Item item2 = new Item("Молоко", 69.99, 1);
        Item item3 = new Item("Мука", 60.89, 3);
        Item item4 = new Item("Сыр", 229.99, 1);
        Item item5 = new Item("Соль", 10.0, 2);
        Item item6 = new Item("Пельмени высший сорт", 349.99, 2);
        Item item7 = new Item("Коньяк высший пилотаж", 1529.99, 1);

        List<Item> ItemList = new ArrayList<>();
        ItemList.add(item1);
        ItemList.add(item2);
        ItemList.add(item3);
        ItemList.add(item4);
        ItemList.add(item5);
        ItemList.add(item6);
        ItemList.add(item7);

        String searchName = "высший";
        Double maxPrice = 0.0;
        String maxPriceName = "";

        for (Item Item : ItemList) {
            if (Item.getName().toLowerCase().contains(searchName) && (Item.getSort() == 1 || Item.getSort() == 2)) {
                if (maxPrice < Item.getPrice()) {
                    maxPrice = Item.getPrice();
                }
            }
        }

        for (Item Item : ItemList) {
            if (Item.getName().toLowerCase().contains(searchName) && (Item.getSort() == 1 || Item.getSort() == 2)) {
                if (Objects.equals(Item.getPrice(), maxPrice)) {

                    maxPriceName += Item.getName() + "\n";
                }
            }
        }
        System.out.println("Самые дорогие товары первого и второго сорта, в названии которых есть слово 'высший': ");
        System.out.println(maxPriceName);
        System.out.println("Наибольшая цена: " + maxPrice);
    }
}
