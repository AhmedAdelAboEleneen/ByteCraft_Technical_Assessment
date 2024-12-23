package tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CatFactsTest {

    @Test
    public void testRandomCatFact() {
        // Base URI for the Cat Facts API
        RestAssured.baseURI = "https://catfact.ninja";

        // Endpoint to fetch a random cat fact
        String endpoint = "/fact";

        // Step 1: Send GET request to fetch a random cat fact
        Response response = RestAssured
                .given()
                .when()
                .get(endpoint)
                .then()
                .statusCode(200) // Assert that the status code is 200
                .extract()
                .response();

        // Step 2: Extract the "fact" field from the response
        String catFact = response.jsonPath().getString("fact");

        // Step 3: Check that the "fact" field is not empty
        Assert.assertNotNull(catFact, "Cat fact should not be null");
        Assert.assertFalse(catFact.isEmpty(), "Cat fact should not be empty");

        // Print the cat fact
        System.out.println("Random Cat Fact: " + catFact);
    }
}

