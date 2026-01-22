package apiTests;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class verifyGetUsers {
	
	@Test
	 public void verifyGetUser() {
		given()
        .baseUri("https://reqres.in")
        .header("User-Agent", "Mozilla/5.0")
    .when()
        .get("/api/users?page=2")
    .then()
        .statusCode(200);
	}

}
