package org.example;

import org.testng.annotations.Test;

public class P7ExternalDataProvider {
    @Test(dataProviderClass = P6DataProvider.class, dataProvider = "dataprovider_method")
    public void m1(String m1,String m2) {
        System.out.println(m1+" "+m2);
    }
}
