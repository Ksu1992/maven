package org.alevel.Practise11;
//Напишите метод, который добавляет 100000 элементов в ArrayList и
//LinkedList. Напишите еще один метод, который выбирает из заполненного
//списка элемент наугад 100000 раз. Замерьте время, которое потрачено на
//это.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListPerformance {

    public static void addElements(List<Integer> list) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }

        long end = System.currentTimeMillis();
        System.out.println("Time taken to add elements: " + (end - start) + " ms");
    }

    public static void getRandomElements(List<Integer> list) {
        Random random = new Random();
        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            int randomIndex = random.nextInt(list.size());
            list.get(randomIndex);
        }

        long end = System.currentTimeMillis();
        System.out.println("Time taken to get random elements: " + (end - start) + " ms");
    }

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        addElements(arrayList);
        getRandomElements(arrayList);

        List<Integer> linkedList = new LinkedList<>();
        addElements(linkedList);
        getRandomElements(linkedList);
    }
}
