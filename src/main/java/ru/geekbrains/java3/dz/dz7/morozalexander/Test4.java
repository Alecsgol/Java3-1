package ru.geekbrains.java3.dz.dz7.morozalexander;

public class Test4 {

    @BeforeSuite
    public void taskBefore() {
        System.out.println(getClass().getSimpleName() + " before");
    }

    @BeforeSuite
    public void taskBefore2() {
        System.out.println(getClass().getSimpleName() + " before");
    }

    @Test(10)
    public void task1() {
        System.out.println(getClass().getSimpleName() + " task1");
    }
}