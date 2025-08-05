package com.thetestingacademy.sample.ex_01_RA_Basics;

import io.restassured.RestAssured;

import java.util.Scanner;

public class APITesting_Lab02_RA {
    public static void main(String[] args) {


            // Gherkins Syntax
            // Given() -> Pre Req. - URL, Headers, Auth, Body....
            // When() -> HTTP method? - GET/POST/PUT/PATCH, DELETE...
            // Then() -> Validation -> 200 oK, firstname == PRAMOD

        // Full URL - https://api.zippopotam.us/IN/560016
        // base URI - https://api.zippopotam.us
        // bath Path - /IN/560016


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pincode!");
        String pincode = sc.next();

        RestAssured
                .given().baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
                .when()
                .get()
                .then().log().all()
                .statusCode(200);

        // Headers, Cookies, Response Body, ...others.


    }
}
