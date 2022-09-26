package io.arrogantprogrammer;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class CustomerTest {

    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/customers")
                .then()
                .statusCode(200);
    }
}
