package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class AuthenticationManagement {


    public static String generateToken(){

        String body ="{ \"password\": \"Mark.123\", \"rememberMe\": true, \"username\": \"mark_twain\" }";

        Response response = given().contentType(ContentType.JSON).body(body).post("https://managementonschools.com/");

        return response.jsonPath().getString("id_token");
    }
}
