package com.thetestingacademy.sample.ex_01_RA_Basics;

import io.restassured.RestAssured;

public class RestAssuredHelloWorld {
    public static void main(String[] args) {

        // https://restful-booker.herokuapp.com/ping
        //

        RestAssured.given()
                        .baseUri("https://restful-booker.herokuapp.com")
                        .basePath("/ping")
                .when()
                        .log().all().get().
                then()
                        .log().all().statusCode(201);





    }
}
