package org.example.XML.ParallelMethods;

import org.testng.annotations.Test;

public class Class1
{
    @Test
    public void test1() throws InterruptedException {
        System.out.println(1);
        Thread.sleep(5000);
    }

    @Test
    public void test2() throws InterruptedException {
        System.out.println(2);
        Thread.sleep(5000);

    }

    @Test
    public void test3() throws InterruptedException {
        System.out.println(3);
        Thread.sleep(5000);

    }

    @Test
    public void test4() throws InterruptedException {
        System.out.println(4);
        Thread.sleep(5000);

    }

    @Test
    public void test5() throws InterruptedException {
        System.out.println(5);
        Thread.sleep(5000);

    }
}
