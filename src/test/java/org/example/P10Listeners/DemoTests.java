package org.example.P10Listeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class DemoTests {

    @Test
    public void m1()
    {
    }

    @Test
    public void m2() throws Exception {
        throw new Exception("exception thrown");
    }

}
