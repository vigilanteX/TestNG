package org.example;


import org.testng.annotations.*;

public class P1Annotations {
    @BeforeSuite
    public void method1() {
        System.out.println("BeforeSuite");
    }

    @BeforeTest
    public void method2() {
        System.out.println("before test");
    }

    @BeforeClass
    public void method3() {
        System.out.println("before class");
    }

    @BeforeMethod
    public void method4() {
        System.out.println("before Method");
    }

    @Test
    public void method5() {
        System.out.println("test-1");
    }

    @Test
    public void method6() {
        System.out.println("test-2");
    }

    @AfterSuite
    public void method7() {
        System.out.println("AfterSuite");
    }

    @AfterTest
    public void method8() {
        System.out.println("AfterTest");
    }

    @AfterClass
    public void method9() {
        System.out.println("AfterClass");
    }

    @AfterMethod
    public void method10() {
        System.out.println("AfterMethod");
    }

}
