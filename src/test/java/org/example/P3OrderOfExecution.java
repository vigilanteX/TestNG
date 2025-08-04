package org.example;

import org.testng.annotations.Test;

public class P3OrderOfExecution {
    @Test
    public void b() {
        System.out.println("b");
    }

    @Test
    public void a() {
        System.out.println("a");
    }
}
