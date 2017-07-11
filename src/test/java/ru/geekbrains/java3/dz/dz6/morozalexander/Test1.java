package ru.geekbrains.java3.dz.dz6.morozalexander;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class Test1 {
    private TaskNo1No2 t;

    private int[] arr;
    private int[] res;

    @Parameters
    public static Collection params() {
        return Arrays.asList(
                new Object[][]{
                        {new int[] {1, 2, 4, 4, 2, 3, 4, 1, 7}, new int[] {1, 7}},
                        {new int[] {1, 2, 3, 4, 0, 4, 7, 8, 9}, new int[] {7, 8, 9}},
                        {new int[] {4, 1, 2, 3}, new int[] {1, 2, 3}},
                        {new int[] {4, 4, 2, 3}, new int[] {1, 2, 3}}   //fail
                }
        );
    }

    public Test1(int[] arr, int[] res) {
        this.arr = arr;
        this.res = res;
    }

    @Before
    public void init() {
        t = new TaskNo1No2();
    }

    @After
    public void tearDown() throws Exception { t = null; }

    @Test
    public void testGetPartOfArrayWithParams() { Assert.assertArrayEquals(res, t.getPartOfArray(arr)); }
}