package org.example;

import org.testng.annotations.Test;

public class P4DependsOn {
    @Test
    public void b() {
        System.out.println("b");
    }

    @Test(dependsOnMethods = {"b"})
    public void a() {
        System.out.println("a");
    }
    @Test
    public void c() {
        System.out.println("c");
    }
}
