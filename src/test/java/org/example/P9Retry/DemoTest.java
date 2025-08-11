package org.example.P9Retry;

import org.testng.annotations.Test;

public class DemoTest {
    static int x = 0;

    @Test
    public void m1() {
        System.out.println("m1");
    }

    @Test(retryAnalyzer = CustomRetryer.class)
    public void m2() throws Exception {
        if (x == 0||x==2||x==3) {
            x++;
            throw new Exception("hello exception");
        }
        System.out.println("worked");
    }
}
