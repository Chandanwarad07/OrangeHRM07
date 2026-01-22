package testBase;

import org.testng.annotations.BeforeClass;
import io.restassured.RestAssured;

public class BaseClassAPI {

    @BeforeClass
    public void setupAPI() {

        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }
}
