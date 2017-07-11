package ru.geekbrains.java3.dz.dz4.morozalexander;

/**
 * 1. Создать три потока, каждый из которых выводит определенную букву(A, B и C) 5 раз, порядок
 * должен быть именно ABСABСABС. Используйте wait/notify/notifyAll.
 *
 * 2. Написать совсем небольшой метод, в котором 3 потока построчно пишут данные в файл (штук
 * по 10 записей, с периодом в 20 мс)
 *
 * 3.  Написать  класс  МФУ  на  котором  возможны  одновременная  печать  и  сканирование
 * документов,  при  этом  нельзя  одновременно  печатать  два  документа  или  сканировать  (при
 * печати в консоль выводится сообщения "отпечатано 1, 2, 3,... страницы", при сканировании то
 * же самое только "отсканировано...", вывод в консоль все также с периодом в 50 мс.)
 */

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        Task1 t = new Task1();
        new Thread(() -> t.printA()).start();
        new Thread(() -> t.printB()).start();
        new Thread(() -> t.printC()).start();
    }

    public static void task2() {
        Task2 t = new Task2();
        new Thread(() -> t.printToFile("thread1")).start();
        new Thread(() -> t.printToFile("thread2")).start();
        new Thread(() -> t.printToFile("thread3")).start();
    }

    public static void task3() {
        Task3 t = new Task3();
        t.copyDocuments(150);
    }
}