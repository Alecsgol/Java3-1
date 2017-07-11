package ru.geekbrains.java3.dz.dz6.morozalexander;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Test3 {
    TaskNo3 t;

    @Before
    public void init() {
        t = new TaskNo3();
    }

    @Test
    public void testSelectAll() {
        Assert.assertTrue(t.sqlSelectAll("SELECT * FROM students"));
    }

    @Test
    public void testSQLInsert() {
        Assert.assertTrue(t.sqlUpdateQuery("INSERT INTO students (surname, score) VALUES ('TESTOV', '9')") > 0);
    }

    @Test
    public void testSQLUpdate() {
        Assert.assertTrue(t.sqlUpdateQuery("UPDATE students SET score = '9'") > 0);
    }
}