package apiTests;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import testBase.BaseClassAPI;

public class SampleAPITest extends BaseClassAPI {
	
	 @Test
	    public void verifyGetUsers() {

		 given()
         .queryParam("postId", 1)
     .when()
         .get("/comments")
     .then()
         .log().all()
         .statusCode(200);
 }

}
