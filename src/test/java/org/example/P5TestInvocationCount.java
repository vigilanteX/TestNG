package org.example;

import org.testng.annotations.Test;

public class P5TestInvocationCount
{
    @Test(invocationCount = 5)
    public void m1()
    {
        System.out.println("m1");
    }
}
