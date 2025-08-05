package com.thetestingacademy.sample.ex_03_TestNG_AllureReoprt;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_Lab06_TestCase {

    String pincode;

    @Test
    // valid pincode -> 110001
    public void test_tc1_pincode_valid() {
        pincode = "110048";

        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }

    @Test
    // #,$,%,@ - any special input = pincode
    public void test_tc2_pincode_invalid() {
        pincode = "@";

        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }

    @Test
    //  ' ' =  blank, pincode
    public void test_tc3_pincode_invalid() {
        pincode = " ";

        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }


}
