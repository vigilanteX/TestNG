package org.example;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class P8ParallelDataSource
{

    @Test(dataProvider = "dataSource")
    public void data(String s1, String s2, String s3) throws InterruptedException {

        System.out.println(s1 + " " + s2 + " " + s3);
        Thread.sleep(5000);
    }

    @DataProvider(parallel = true)
    public Object[][] dataSource() {
        return new Object[][]{
                {"hello", "world", "1"},
                {"hell", "world", "2"},
                {"bye", "world", "3"},
                {"hello", "world", "1"},
                {"hell", "world", "2"},
                {"bye", "world", "3"},
                {"hello", "world", "1"},
                {"hell", "world", "2"},
                {"bye", "world", "3"},
                {"hello", "world", "1"},
                {"hell", "world", "2"},
                {"bye", "world", "3"}
        };
    }

}
