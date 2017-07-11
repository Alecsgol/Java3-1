package ru.geekbrains.java3.dz.dz6.morozalexander;

import java.util.Arrays;

/**
 * 1. Написать метод, которому в качестве аргумента передается не пустой одномерный
 * целочисленный массив, метод должен вернуть новый массив, который получен путем
 * вытаскивания элементов из исходного массива, идущих после последней четверки. Входной
 * массив должен содержать хотя бы одну четверку, в противном случае в методе необходимо
 * выбросить RuntimeException.
 * Написать набор тестов для этого метода (варианта 3-4 входных данных)
 * вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ]
 *
 * 2. Написать метод, который проверяет что массив состоит только из чисел 1 и 4. Если в массиве
 * нет хоть одной 4 или 1, то метод вернет false;
 * Написать набор тестов для этого метода (варианта 3-4 входных данных)
 *
 * 3. Создать небольшую БД (таблица: студенты; поля: id, фамилия, балл). Написать тесты для
 * проверки того, что при работе с базой корректно добавляются, обновляются и читаются
 * записи. Следует учесть что в базе есть заранее добавленные записи, и после проведения
 * тестов эти записи не должны быть удалены/именены/добавлены.
 */

public class TaskNo1No2 {

    public int[] getPartOfArray(int[] arr) throws RuntimeException {
        if (arr.length == 0) { throw new NullPointerException(); }

        int lastIndexOf4 = -1;
        for (int i = 0; i < arr.length; i++) if (arr[i] == 4) lastIndexOf4 = i + 1;

        if (lastIndexOf4 == -1) throw new RuntimeException();
        else return Arrays.copyOfRange(arr, lastIndexOf4, arr.length);
    }

    public boolean checkArrayFor1And4(int[] arr) {
        int count1 = 0, count4 = 0;
        for (int x : arr) {
            if (x == 1) count1++;
            else if (x == 4) count4++;
            else return false;
        }

        return (count1 > 0 && count4 > 0);
    }
}