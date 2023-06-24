package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static base_urls.ManagementBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US_15ApiStepDefs {
    Response response;

    @Given("tum guest userlar icin get request yap")
    public void tum_guest_userlar_icin_get_request_yap() {
        //Set the url
        //https://managementonschools.com/app/students/getAll
        spec.pathParams("first", "students", "second", "getAll");

        //Send the request and get the response
        response = given(spec).get("{first}/{second}");
        response.prettyPrint();

    }

    @Then("gelen bodyi dogrula {string}, {string}, {string}, {string}, {string}, {string}, {string},{string},{string},{string},{string}")
    public void gelenBodyiDogrula(String name, String surname, String birthplace, String phone, String gender, String dateOfBirth, String ssn, String username, String fatherName, String motherName, String password) {
        JsonPath jsonPath=response.jsonPath();

        Object actName = jsonPath.getList("findAll{it.username=='" + username + "'}.name").get(0);
        Object actUsername = jsonPath.getList("findAll{it.username=='" + username + "'}.username").get(0);
        Object actSurname = jsonPath.getList("findAll{it.username=='" + username + "'}.surname").get(0);
        Object actBirthPlace = jsonPath.getList("findAll{it.username=='" + username + "'}.birthPlace").get(0);
        Object actPhone = jsonPath.getList("findAll{it.username=='" + username + "'}.phoneNumber").get(0);
        Object actGender = jsonPath.getList("findAll{it.username=='" + username + "'}.gender").get(0);
        Object actBirthDay = jsonPath.getList("findAll{it.username=='" + username + "'}.birthDay").get(0);
        Object actmotherName = jsonPath.getList("findAll{it.username=='" + username + "'}.motherName").get(0);
        Object actfatherName = jsonPath.getList("findAll{it.username=='" + username + "'}.fatherName").get(0);
        Object actPassword = jsonPath.getList("findAll{it.username=='" + username + "'}.password").get(0);

        assertEquals(name, actName);
        assertEquals(username, actUsername);
        assertEquals(surname, actSurname);
        assertEquals(birthplace, actBirthPlace);
        assertEquals(phone, actPhone);
        assertEquals(gender, actGender);
        assertEquals(dateOfBirth, actBirthDay);
        assertEquals(motherName, actmotherName);
        assertEquals(fatherName, actfatherName);
        assertEquals(password, actPassword);
    }
}

