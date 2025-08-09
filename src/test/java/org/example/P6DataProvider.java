package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class P6DataProvider {
    @DataProvider
    public Object[][] dataprovider_method() {
        return new Object[][]{{"hello", "world"}, {"bye", "world"}};
    }

    @Test(dataProvider = "dataprovider_method")
    public void m1(String val, String val2) {
        System.out.println(val + " " + val2);
    }


}
