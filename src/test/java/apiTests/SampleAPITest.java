package apiTests;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class SampleAPITest {
	
	 @Test
	    public void verifyGetUsers() {

	        given()
	            .baseUri("https://reqres.in")
	        .when()
	            .get("/api/users?page=2")
	        .then()
	            .statusCode(200);
	    }

}
