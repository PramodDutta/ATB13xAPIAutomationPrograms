package com.thetestingacademy.sample.ex_06_TestAssetions;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import org.hamcrest.Matchers;




public class APITesting025_RestAsssured_Assertions {

    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;
    String token;
    Integer bookingID;


    @Test
    public  void test_createBooking_POST(){

        // payload
        // given - setting up the body, url, base path, uri
        // when  - making the req
        // then - extraction
        String request_payload = "{\n" +
                "        \"firstname\": \"pramod\",\n" +
                "        \"lastname\": \"Dutta\",\n" +
                "        \"totalprice\": 3000,\n" +
                "        \"depositpaid\": true,\n" +
                "        \"bookingdates\": {\n" +
                "            \"checkin\": \"2025-07-22\",\n" +
                "            \"checkout\": \"2025-07-27\"\n" +
                "        },\n" +
                "        \"additionalneeds\": \"Breakfast\"\n" +
                "    }";


        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking");

        // header information
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(request_payload).log().all();

        response = requestSpecification.when().log().all().post();

        // Get Validate response to perform validation

        validatableResponse = response.then().log().all();


        //     // Rest Assured. Assertions
        validatableResponse.statusCode(200);

        //  Boooking ID !=null , firstname == Pramod
        //  Extract the response body and do it

//        System.out.println(response.asString());


        validatableResponse.body("bookingid",Matchers.notNullValue());
        validatableResponse.body("booking.firstname",Matchers.equalTo("pramod"));
        validatableResponse.body("booking.lastname", Matchers.equalTo("Dutta"));
        validatableResponse.body("booking.depositpaid",Matchers.equalTo(true));
//        validatableResponse.body("booking.bookingdates.checkin",Matchers.equalTo(true));










    }






}
