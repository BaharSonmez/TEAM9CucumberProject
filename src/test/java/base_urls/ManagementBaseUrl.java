package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static utilities.AuthenticationManagement.generateToken;

public class ManagementBaseUrl {

    public static RequestSpecification spec;

    public static void setUp(){

        spec= new RequestSpecBuilder().setContentType(ContentType.JSON)
                .setBaseUri("https://managementonschools.com/").build();

    }

}
