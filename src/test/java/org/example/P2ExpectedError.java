package org.example;

import org.testng.annotations.Test;

public class P2ExpectedError {
    @Test(expectedExceptions = {ArithmeticException.class, NullPointerException.class})
    public void m1() {

        throw new NumberFormatException();
    }
}
