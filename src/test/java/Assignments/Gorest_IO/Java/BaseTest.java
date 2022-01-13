package Assignments.Gorest_IO.Java;

import io.restassured.RestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import org.testng.annotations.BeforeTest;

import static io.restassured.RestAssured.given;

public class BaseTest {
    @BeforeTest
    public void setUp(){
        RestAssured.baseURI = "https://gorest.co.in/public/v1/";
        RestAssured.requestSpecification = given()
                .header("Authorization", "Bearer token here")
                .header("Content-Type", "application/json")
                .log().all();
        RestAssured.responseSpecification = new ResponseSpecBuilder()
                .log(LogDetail.ALL)
                .build();
    }
}
