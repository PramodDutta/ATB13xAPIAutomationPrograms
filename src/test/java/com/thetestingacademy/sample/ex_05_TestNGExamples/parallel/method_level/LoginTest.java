package com.thetestingacademy.sample.ex_05_TestNGExamples.parallel.method_level;

import org.testng.annotations.Test;

public class LoginTest {
    @Test
    public void validLogin() {
        System.out.println("validLogin – Thread " + Thread.currentThread().getId());
    }

    @Test
    public void invalidLogin() {
        System.out.println("invalidLogin – Thread " + Thread.currentThread().getId());
    }

    @Test
    public void invalidLogin2() {
        System.out.println("invalidLogin – Thread " + Thread.currentThread().getId());
    }
}
