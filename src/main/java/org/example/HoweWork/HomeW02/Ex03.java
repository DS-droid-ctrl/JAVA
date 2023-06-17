package org.example.HoweWork.HomeW02;

import java.util.Scanner;


public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int n = scanner.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        printArray(array);
        sumindex(array);
        replaceArr(array, sumindex(array));
        int[] resArr = replaceArr(array, sumindex(array));
        for (int elem: resArr){
            System.out.print(elem + " ");
        }
    }

    /**
     * @apiNote Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива
     * @param arr массив
     * @param replacer заменитель отрицательных чисел
     * @return результат
     */

    private static int[] replaceArr(int[] arr, int replacer) {
        int[] resArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                resArr[i] = replacer;
            } else {
                resArr[i] = arr[i];
            }
        }
        return resArr;
    }

    private static int sumindex(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {

            int temp = array[i];
            if (temp < 0) {
                temp *= -1;
            }
            if (temp > 9 && temp <= 99) {
                sum += i;
            }
        }
        return sum;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println('\n');
    }
}
