package apiMethods;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.equalTo;

public class GetEmailFromBody {
    public static Boolean getEmailFromBody(String fistName, String secondName) {
        given()
                .baseUri("https://reqres.in/api")
                .basePath("/users")
                .contentType(ContentType.JSON)
                .when().get()
                .then().statusCode(200)
                .body("data.find{it.first_name =='" + fistName + "'}.email", equalTo("george.bluth@reqres.in"))
                .and()
                .body("data.find{it.last_name =='" + secondName + "'}.email", equalTo("george.bluth@reqres.in"));
        return Boolean.TRUE;
    }
}
