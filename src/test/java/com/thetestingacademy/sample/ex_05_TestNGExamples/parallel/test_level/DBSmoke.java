package com.thetestingacademy.sample.ex_05_TestNGExamples.parallel.test_level;

import org.testng.annotations.Test;

public class DBSmoke {
    @Test
    public void test_DB_Smoke(){
        System.out.println(Thread.currentThread().getId());
    }
}
