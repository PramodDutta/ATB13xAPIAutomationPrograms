package com.thetestingacademy.sample.ex_05_TestNGExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting021_TestNG_AlwaysRun {

    @Test
    public void test_new_register() {
        Assert.assertTrue(true);
    }

    @Test(alwaysRun = true)
    public void test_loginPage() {
        Assert.assertTrue(true);
    }

    @Test
    public void test_normal() {
        Assert.assertTrue(true);
    }
}
