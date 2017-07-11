package ru.geekbrains.java3.dz.dz4.morozalexander;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Task2 {
    private Object m = new Object();

    public void printToFile(String s) {
        for (int i = 0; i < 10; i++) {
            synchronized (m) {
                try (BufferedWriter bw = new BufferedWriter(new FileWriter("FWTEST.txt", true))) {
                    bw.write(s);
                    bw.newLine();
                    System.out.println(s + " printing");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}