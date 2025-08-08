package com.thetestingacademy.sample.ex_05_TestNGExamples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class APITesting019_TestNG_Parameter {


    @Parameters("browser")
    @Test
    public void demo1(String value){
        System.out.println("Hi i am demo");
        System.out.println("You are running this param");

        if(value.equalsIgnoreCase("firefox")){
            System.out.println("Start the firefox");
        }
        if(value.equalsIgnoreCase("chrome")){
            System.out.println("Start the chrome!");
        }
        if(value.equalsIgnoreCase("safari")){
            System.out.println("We can't run on Safari");
        }

    }
}
