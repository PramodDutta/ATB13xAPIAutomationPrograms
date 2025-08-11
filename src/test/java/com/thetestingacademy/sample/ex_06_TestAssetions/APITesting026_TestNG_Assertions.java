package com.thetestingacademy.sample.ex_06_TestAssetions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class APITesting026_TestNG_Assertions {


//    @Test
//    public void test_hardAssertExample() {
//        System.out.println("Start of the program");
//        Assert.assertEquals("pramod", "Pramod");
//        System.out.println("End of the program");
//    }


    @Test
    public void test_softAssertExample() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("pramod","Pramod");
        System.out.println("End of program");
        softAssert.assertAll();
    }


}
