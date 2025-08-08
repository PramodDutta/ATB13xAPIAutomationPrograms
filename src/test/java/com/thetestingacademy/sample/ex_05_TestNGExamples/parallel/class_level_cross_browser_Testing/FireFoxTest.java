package com.thetestingacademy.sample.ex_05_TestNGExamples.parallel.class_level_cross_browser_Testing;

import org.testng.annotations.Test;

public class FireFoxTest {
    @Test
    public void test_firefox(){
        System.out.println("2");
        System.out.println(Thread.currentThread().getId());

    }
}
