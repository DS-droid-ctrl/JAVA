package org.example.Seminars.Sem04;

import java.util.LinkedList;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            linkedList.add(scanner.nextInt());
        }
        System.out.println("linkedList = " + linkedList);
        scanner.close();
        System.out.println("linkedList.peek() = " + linkedList.peek()); // возвращает список
        System.out.println("linkedList.pop() = " + linkedList.pop()); // удаляет 1 значение
        linkedList.push(1); // добавили 1 в начало
        linkedList.add(2); // добавили 2 в конец
        linkedList.addLast(3); // добавили 3 в конец
        linkedList.addFirst(3); // добавили 3 в начало
        linkedList.removeFirst(); // удаление первого значения
        linkedList.removeLast(); // удаление последнего значения
        linkedList.contains(3); // true - 3 есть в списке
    }
}
