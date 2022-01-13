// These test cases used classes in "models" folder
// and @Dataprovider for passing failure tests status code 400

package Assignments.Gorest_IO.Java;

import Assignments.Gorest_IO.models.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;
import org.skyscreamer.jsonassert.Customization;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.skyscreamer.jsonassert.ValueMatcher;
import org.skyscreamer.jsonassert.comparator.CustomComparator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class GorestTest_Data extends BaseTest{

    @DataProvider
    public Object[][] data_Email_Taken(){
        return new Object[][]{
                {"email", "has already been taken"}
        };
    }

    @DataProvider
    public Object[][] data_Required_Field_User_Post_and_Comment(){
        return new Object[][]{
                {"user", "must exist", "title", "can't be blank", "body", "can't be blank"},
        };
    }

    @DataProvider
    public Object[][] data_Required_Field_User_ToDo(){
        return new Object[][]{
                {"user", "must exist", "title", "can't be blank", "status", "can't be blank"},
        };
    }

    @DataProvider
    public Object[][] data_delete_Non_Exist_Account(){
        return new Object[][]{
                {"message", "Resource not found"}
        };
    }

//-----------------------------------------------------------------------------------------------------------------
    // Verify that API token is mandatory for an API call
    @Test
    public void test_API_Token() throws JsonProcessingException {
    // Create User's Account
        ObjectMapper mapper = new ObjectMapper();

        AccountData accountData = new AccountData();
        accountData.setName("Alan");
        accountData.setGender("male");
        accountData.setEmail("email" + System.currentTimeMillis() + "@email.com");
        accountData.setStatus("active");

        UserResponse userResponse = requestSpecification.body(accountData)
                .when().post("users")
                .then().spec(responseSpecification)
                .assertThat().statusCode(201)
                .body(matchesJsonSchemaInClasspath("json_Schema/defaultAccount.json"))
                .extract().response().as(UserResponse.class);

        Assert.assertEquals(accountData.getName(), userResponse.getData().getName());
        Assert.assertEquals(accountData.getEmail(), userResponse.getData().getEmail());
        Assert.assertEquals(accountData.getGender(), userResponse.getData().getGender());
        Assert.assertEquals(accountData.getStatus(), userResponse.getData().getStatus());

        String requestJson = mapper.writeValueAsString(accountData);
        String responseJson = mapper.writeValueAsString(userResponse.getData());
        JSONAssert.assertEquals(requestJson, responseJson,
                new CustomComparator(JSONCompareMode.STRICT_ORDER,
                        new Customization("id", new ValueMatcher<Object>() {
                            @Override
                            public boolean equal(Object o, Object t1) {
                                return false;
                            }
                        })
                )
        );

    }

    // Verify that the API returns all the users in the response.
    @Test
    public void test_return_all_Users(){
        requestSpecification
                .body("{}")
                .when()
                .get("users")
                .then().spec(responseSpecification).assertThat().statusCode(200).extract().response().asString();
    }

    // Verify HTTP status code from the API returns 200
    @Test
    public void test_API_status_code_200(){
        String homePage = "https://gorest.co.in/";

        requestSpecification
                .log().all()
                .get(homePage)
                .then().spec(responseSpecification).assertThat().statusCode(200).extract().response().asString();
    }

    // Verify that a user can be queried from the list of users
    @Test
    public void test_user_queried() throws JsonProcessingException {
    // Create User's Account
        ObjectMapper mapper = new ObjectMapper();

        AccountData accountData = new AccountData();
        accountData.setName("Alan");
        accountData.setGender("male");
        accountData.setEmail("email" + System.currentTimeMillis() + "@email.com");
        accountData.setStatus("active");

        UserResponse userResponse = requestSpecification.body(accountData)
                .when().post("users")
                .then().spec(responseSpecification)
                .assertThat().statusCode(201)
                .body(matchesJsonSchemaInClasspath("json_Schema/defaultAccount.json"))
                .extract().response().as(UserResponse.class);

        Assert.assertEquals(accountData.getName(), userResponse.getData().getName());
        Assert.assertEquals(accountData.getEmail(), userResponse.getData().getEmail());
        Assert.assertEquals(accountData.getGender(), userResponse.getData().getGender());
        Assert.assertEquals(accountData.getStatus(), userResponse.getData().getStatus());

        String requestJson = mapper.writeValueAsString(accountData);
        String responseJson = mapper.writeValueAsString(userResponse.getData());
        JSONAssert.assertEquals(requestJson, responseJson, JSONCompareMode.LENIENT);

    // GET user queried
        int userID = userResponse.getData().getId();
        given().when().get("users/" + userID + "/?page=1")
                .then().spec(responseSpecification).assertThat().statusCode(200).extract().response().asString();
    }

    // Verify that the users belong to page 2 can be queried
    @Test
    public void test_users_queried_page_2(){
        requestSpecification
                .body("{}")
                .when()
                .get("users/?page=2")
                .then().spec(responseSpecification).assertThat().statusCode(200).extract().response().asString();
    }

    // Verify that the API returns all the User's Post in the response.
    @Test
    public void test_All_Users_Post(){
        requestSpecification.when().get("posts")
                .then().spec(responseSpecification).assertThat().statusCode(200).extract().response().asString();
    }

    // Verify that the API returns one User's Post in the response.
    @Test
    public void test_Single_User_Post() throws JsonProcessingException {
    // Create User's Account
        ObjectMapper mapper = new ObjectMapper();

        AccountData accountData = new AccountData();
        accountData.setName("Alan");
        accountData.setGender("male");
        accountData.setEmail("email" + System.currentTimeMillis() + "@email.com");
        accountData.setStatus("active");

        UserResponse userResponse = requestSpecification
                .body(accountData)
                .when().post("users")
                .then().spec(responseSpecification)
                .assertThat().statusCode(201)
                .body(matchesJsonSchemaInClasspath("json_Schema/defaultAccount.json"))
                .extract().response().as(UserResponse.class);

        Assert.assertEquals(accountData.getName(), userResponse.getData().getName());
        Assert.assertEquals(accountData.getEmail(), userResponse.getData().getEmail());
        Assert.assertEquals(accountData.getGender(), userResponse.getData().getGender());
        Assert.assertEquals(accountData.getStatus(), userResponse.getData().getStatus());

        String requestJson = mapper.writeValueAsString(accountData);
        String responseJson = mapper.writeValueAsString(userResponse.getData());
        JSONAssert.assertEquals(requestJson, responseJson, JSONCompareMode.LENIENT);

    // Create User's Post
        AccountPost accountPost = new AccountPost();
        accountPost.setTitle("Lorem ipsum dolor sit amet");
        accountPost.setBody("Morbi finibus metus sit amet massa commodo, non porttitor erat interdum. Nam id lacus ante. Phasellus et bibendum ligula. Nunc imperdiet ipsum eget tempor dictum. Donec sit amet nulla hendrerit nunc malesuada tincidunt. Sed eu varius justo. Integer at imperdiet purus. Nullam posuere tortor sed commodo gravida. Mauris imperdiet, libero in scelerisque egestas, mauris nulla facilisis risus, malesuada vestibulum est turpis ut metus. Nulla facilisi. Aenean non sagittis purus, in tincidunt elit. Nulla laoreet est at ipsum semper, sit amet imperdiet sem accumsan. Sed sed neque tincidunt, lacinia quam id, maximus lacus.");

        int userID = userResponse.getData().getId();
        UserPost userResponsePost = requestSpecification
                .body(accountPost)
                .when().post("users/" + userID + "/posts")
                .then().spec(responseSpecification).assertThat().statusCode(201).extract().response().as(UserPost.class);
        Assert.assertEquals(accountPost.getTitle(), userResponsePost.getData().getTitle());
        Assert.assertEquals(accountPost.getBody(), userResponsePost.getData().getBody());

        String requestJson2 = mapper.writeValueAsString(accountPost);
        String responseJson2 = mapper.writeValueAsString(userResponsePost.getData());
        JSONAssert.assertEquals(requestJson2, responseJson2, JSONCompareMode.LENIENT);

    // GET Single User's Post
        int postID = userResponsePost.getData().getId();
        UserPost responseBody = requestSpecification.get("posts/" + postID)
                .then().spec(responseSpecification).assertThat().statusCode(200).extract().response().as(UserPost.class);
        Assert.assertEquals(accountPost.getTitle(), userResponsePost.getData().getTitle());
        Assert.assertEquals(accountPost.getBody(), userResponsePost.getData().getBody());

        String requestJson3 = mapper.writeValueAsString(accountPost);
        String responseJson3 = mapper.writeValueAsString(responseBody.getData());
        JSONAssert.assertEquals(requestJson3, responseJson3, JSONCompareMode.LENIENT);
    }

    // Verify that the API returns all the User's Comments in the response.
    @Test
    public void test_All_Users_Comment(){
        requestSpecification.get("comments")
                .then().spec(responseSpecification).assertThat().statusCode(200).extract().response().asString();
    }

    // Verify that the API returns one User's Comments in the response.
    @Test
    public void test_Single_User_Comment() throws JsonProcessingException {
    // Create User's Account
        ObjectMapper mapper = new ObjectMapper();

        AccountData accountData = new AccountData();
        accountData.setName("Alan");
        accountData.setGender("male");
        accountData.setEmail("email" + System.currentTimeMillis() + "@email.com");
        accountData.setStatus("active");

        UserResponse userResponse = requestSpecification
                .body(accountData)
                .when().post("users")
                .then().spec(responseSpecification)
                .assertThat().statusCode(201)
                .body(matchesJsonSchemaInClasspath("json_Schema/defaultAccount.json"))
                .extract().response().as(UserResponse.class);

        Assert.assertEquals(accountData.getName(), userResponse.getData().getName());
        Assert.assertEquals(accountData.getEmail(), userResponse.getData().getEmail());
        Assert.assertEquals(accountData.getGender(), userResponse.getData().getGender());
        Assert.assertEquals(accountData.getStatus(), userResponse.getData().getStatus());

        String requestJson = mapper.writeValueAsString(accountData);
        String responseJson = mapper.writeValueAsString(userResponse.getData());
        JSONAssert.assertEquals(requestJson, responseJson, JSONCompareMode.LENIENT);

    // Create User's Post
        AccountPost accountPost = new AccountPost();
        accountPost.setTitle("Lorem ipsum dolor sit amet");
        accountPost.setBody("Morbi finibus metus sit amet massa commodo, non porttitor erat interdum. Nam id lacus ante. Phasellus et bibendum ligula. Nunc imperdiet ipsum eget tempor dictum. Donec sit amet nulla hendrerit nunc malesuada tincidunt. Sed eu varius justo. Integer at imperdiet purus. Nullam posuere tortor sed commodo gravida. Mauris imperdiet, libero in scelerisque egestas, mauris nulla facilisis risus, malesuada vestibulum est turpis ut metus. Nulla facilisi. Aenean non sagittis purus, in tincidunt elit. Nulla laoreet est at ipsum semper, sit amet imperdiet sem accumsan. Sed sed neque tincidunt, lacinia quam id, maximus lacus.");

        int userID = userResponse.getData().getId();
        UserPost userResponsePost = requestSpecification
                .body(accountPost)
                .when().post("users/" + userID + "/posts")
                .then().spec(responseSpecification).assertThat().statusCode(201).extract().response().as(UserPost.class);
        Assert.assertEquals(accountPost.getTitle(), userResponsePost.getData().getTitle());
        Assert.assertEquals(accountPost.getBody(), userResponsePost.getData().getBody());

        String requestJson2 = mapper.writeValueAsString(accountPost);
        String responseJson2 = mapper.writeValueAsString(userResponsePost.getData());
        JSONAssert.assertEquals(requestJson2, responseJson2, JSONCompareMode.LENIENT);

    // Create User's Comment
        int postID = userResponsePost.getData().getId();
        AccountComment accountComment = new AccountComment();
        accountComment.setName("Alan");
        accountComment.setEmail("test" + System.currentTimeMillis() + "@email.com");
        accountComment.setBody("Test Morbi finibus metus sit amet massa commodo, non porttitor erat interdum. Nam id lacus ante. Phasellus et bibendum ligula. Nunc imperdiet ipsum eget tempor dictum11.");

        UserComment responseBodyComment = requestSpecification
                .body(accountComment)
                .when().post("posts/" + postID + "/comments")
                .then().spec(responseSpecification).assertThat().statusCode(201).extract().response().as(UserComment.class);
        Assert.assertEquals(accountComment.getName(), responseBodyComment.getData().getName());
        Assert.assertEquals(accountComment.getEmail(), responseBodyComment.getData().getEmail());
        Assert.assertEquals(accountComment.getBody(), responseBodyComment.getData().getBody());

        String requestJson3 = mapper.writeValueAsString(accountComment);
        String responseJson3 = mapper.writeValueAsString(responseBodyComment.getData());
        JSONAssert.assertEquals(requestJson3, responseJson3, JSONCompareMode.LENIENT);


    // GET a Single User's Comment
        int commentID = responseBodyComment.getData().getId();
        UserComment responseBody = requestSpecification.get("comments/" + commentID)
                .then().spec(responseSpecification).assertThat().statusCode(200).extract().response().as(UserComment.class);
        Assert.assertEquals(responseBodyComment.getData().getName(), responseBody.getData().getName());
        Assert.assertEquals(responseBodyComment.getData().getEmail(), responseBody.getData().getEmail());
        Assert.assertEquals(responseBodyComment.getData().getBody(), responseBody.getData().getBody());

        String requestJson4 = mapper.writeValueAsString(accountComment);
        String responseJson4 = mapper.writeValueAsString(responseBody.getData());
        JSONAssert.assertEquals(requestJson4, responseJson4, JSONCompareMode.LENIENT);

    }

    // Verify that the API returns all User's Todos in the response.
    @Test
    public void test_All_User_ToDo(){
        requestSpecification
                .body("{}")
                .when()
                .get("todos")
                .then().spec(responseSpecification).assertThat().statusCode(200).extract().response().asString();
    }

    // Verify that the API returns one User's Todos in the response.
    @Test
    public void test_Single_User_ToDo() throws JsonProcessingException {
    // Create User's Account
        ObjectMapper mapper = new ObjectMapper();

        AccountData accountData = new AccountData();
        accountData.setName("Alan");
        accountData.setGender("male");
        accountData.setEmail("email" + System.currentTimeMillis() + "@email.com");
        accountData.setStatus("active");

        UserResponse userResponse = requestSpecification
                .body(accountData)
                .when().post("users")
                .then().spec(responseSpecification)
                .assertThat().statusCode(201)
                .body(matchesJsonSchemaInClasspath("json_Schema/defaultAccount.json"))
                .extract().response().as(UserResponse.class);

        Assert.assertEquals(accountData.getName(), userResponse.getData().getName());
        Assert.assertEquals(accountData.getEmail(), userResponse.getData().getEmail());
        Assert.assertEquals(accountData.getGender(), userResponse.getData().getGender());
        Assert.assertEquals(accountData.getStatus(), userResponse.getData().getStatus());

        String requestJson = mapper.writeValueAsString(accountData);
        String responseJson = mapper.writeValueAsString(userResponse.getData());
        JSONAssert.assertEquals(requestJson, responseJson, JSONCompareMode.LENIENT);

    // Create a User's To_do
        AccountToDo accountToDo = new AccountToDo();
        accountToDo.setTitle("Donec cursus diam posuere lectus pellentesque aliquet");
        accountToDo.setDue_on("2022-02-02T00:00:00.000+05:30");
        accountToDo.setStatus("completed");

        int userID = userResponse.getData().getId();
        UserAccountToDo responseBodyToDo = requestSpecification
                .body(accountToDo)
                .when().post("users/" + userID + "/todos")
                .then().spec(responseSpecification).assertThat().statusCode(201).extract().response().as(UserAccountToDo.class);
        Assert.assertEquals(accountToDo.getTitle(), responseBodyToDo.getData().getTitle());
        Assert.assertEquals(accountToDo.getDue_on(), responseBodyToDo.getData().getDue_on());
        Assert.assertEquals(accountToDo.getStatus(), responseBodyToDo.getData().getStatus());

        String requestJson2 = mapper.writeValueAsString(accountToDo);
        String responseJson2 = mapper.writeValueAsString(responseBodyToDo.getData());
        JSONAssert.assertEquals(requestJson2, responseJson2, JSONCompareMode.LENIENT);

    // Get Single User's To_do
        int ToDo_ID = responseBodyToDo.getData().getId();
        UserAccountToDo responseBody = requestSpecification
                .get("todos/" + ToDo_ID)
                .then().spec(responseSpecification).assertThat().statusCode(200).extract().response().as(UserAccountToDo.class);
        Assert.assertEquals(accountToDo.getTitle(), responseBody.getData().getTitle());
        Assert.assertEquals(accountToDo.getDue_on(), responseBody.getData().getDue_on());
        Assert.assertEquals(accountToDo.getStatus(), responseBody.getData().getStatus());

        String requestJson3 = mapper.writeValueAsString(accountToDo);
        String responseJson3 = mapper.writeValueAsString(responseBody.getData());
        JSONAssert.assertEquals(requestJson3, responseJson3, JSONCompareMode.LENIENT);
    }

    // Verify creating a User account in the response
    @Test
    public void test_Create_User_Account() throws JsonProcessingException {
        // Create User's Account
        ObjectMapper mapper = new ObjectMapper();

        AccountData accountData = new AccountData();
        accountData.setName("Alan");
        accountData.setGender("male");
        accountData.setStatus("active");
        accountData.setEmail("test" + System.currentTimeMillis() + "@email.com");

        UserResponse userResponse = requestSpecification
                .body(accountData)
                .when().post("users")
                .then().spec(responseSpecification).assertThat().statusCode(201).body(matchesJsonSchemaInClasspath("json_Schema/defaultAccount.json")).extract().response()
                .as(UserResponse.class);

        String requestJson = mapper.writeValueAsString(accountData);
        String responseJson = mapper.writeValueAsString(userResponse.getData());
        JSONAssert.assertEquals(requestJson, responseJson,
                new CustomComparator(JSONCompareMode.STRICT_ORDER,
                        new Customization("id.name.email", new ValueMatcher<Object>() {
                            @Override
                            public boolean equal(Object o, Object t1) {
                                return true;
                            }
                        })
                )
        );

    }

    // Verify creating the same User account with message email taken in response
    @Test(dataProvider = "data_Email_Taken")
    public void test_Create_User_Account_Email_Taken(String email, String text) throws JsonProcessingException {
        // Create User's Account
        ObjectMapper mapper = new ObjectMapper();

        AccountData accountData = new AccountData();
        accountData.setName("Alan");
        accountData.setGender("male");
        accountData.setStatus("active");
        accountData.setEmail("test" + System.currentTimeMillis() + "@email.com");

        UserResponse userResponse = requestSpecification
                .body(accountData)
                .when().post("users")
                .then().spec(responseSpecification).assertThat().statusCode(201).body(matchesJsonSchemaInClasspath("json_Schema/defaultAccount.json")).extract().response()
                .as(UserResponse.class);

        String requestJson = mapper.writeValueAsString(accountData);
        String responseJson = mapper.writeValueAsString(userResponse.getData());
        JSONAssert.assertEquals(requestJson, responseJson,
                new CustomComparator(JSONCompareMode.STRICT_ORDER,
                        new Customization("id.name.email", new ValueMatcher<Object>() {
                            @Override
                            public boolean equal(Object o, Object t1) {
                                return true;
                            }
                        })
                )
        );

        // Create Same Account
        String responseBody = requestSpecification
                .body(accountData)
                .when().post("users")
                .then().spec(responseSpecification).assertThat().statusCode(422).extract().response().asString();

        Assert.assertEquals("{\"meta\":null,\"data\":[{\"field\":\""+ email +"\",\"message\":\""+ text +"\"}]}", responseBody);


    }

    // Verify creating a User's Post in the response
    @Test
    public void test_Create_User_Post() throws JsonProcessingException {
    // Create User's Account
        ObjectMapper mapper = new ObjectMapper();

        AccountData accountData = new AccountData();
        accountData.setName("Alan");
        accountData.setGender("male");
        accountData.setEmail("email" + System.currentTimeMillis() + "@email.com");
        accountData.setStatus("active");

        UserResponse userResponse = requestSpecification
                .body(accountData)
                .when().post("users")
                .then().spec(responseSpecification)
                .assertThat().statusCode(201)
                .body(matchesJsonSchemaInClasspath("json_Schema/defaultAccount.json"))
                .extract().response().as(UserResponse.class);

        Assert.assertEquals(accountData.getName(), userResponse.getData().getName());
        Assert.assertEquals(accountData.getEmail(), userResponse.getData().getEmail());
        Assert.assertEquals(accountData.getGender(), userResponse.getData().getGender());
        Assert.assertEquals(accountData.getStatus(), userResponse.getData().getStatus());

        String requestJson = mapper.writeValueAsString(accountData);
        String responseJson = mapper.writeValueAsString(userResponse.getData());
        JSONAssert.assertEquals(requestJson, responseJson, JSONCompareMode.LENIENT);

    // Create User's Post
        AccountPost accountPost = new AccountPost();
        accountPost.setTitle("Lorem ipsum dolor sit amet");
        accountPost.setBody("Morbi finibus metus sit amet massa commodo, non porttitor erat interdum. Nam id lacus ante. Phasellus et bibendum ligula. Nunc imperdiet ipsum eget tempor dictum. Donec sit amet nulla hendrerit nunc malesuada tincidunt. Sed eu varius justo. Integer at imperdiet purus. Nullam posuere tortor sed commodo gravida. Mauris imperdiet, libero in scelerisque egestas, mauris nulla facilisis risus, malesuada vestibulum est turpis ut metus. Nulla facilisi. Aenean non sagittis purus, in tincidunt elit. Nulla laoreet est at ipsum semper, sit amet imperdiet sem accumsan. Sed sed neque tincidunt, lacinia quam id, maximus lacus.");

        int userID = userResponse.getData().getId();
        UserPost userResponsePost = requestSpecification
                .body(accountPost)
                .when().post("users/" + userID + "/posts")
                .then().spec(responseSpecification).assertThat().statusCode(201).extract().response().as(UserPost.class);
        Assert.assertEquals(accountPost.getTitle(), userResponsePost.getData().getTitle());
        Assert.assertEquals(accountPost.getBody(), userResponsePost.getData().getBody());

        String requestJson2 = mapper.writeValueAsString(accountPost);
        String responseJson2 = mapper.writeValueAsString(userResponsePost.getData());
        JSONAssert.assertEquals(requestJson2, responseJson2, JSONCompareMode.LENIENT);
    }

    // Verify required field on "User's Post" response
    @Test(dataProvider = "data_Required_Field_User_Post_and_Comment")
    public void test_Required_Field_User_Post(String user, String userText, String title, String titleText, String body, String bodyText) throws JsonProcessingException {
    // Create User's Account
        ObjectMapper mapper = new ObjectMapper();

        AccountData accountData = new AccountData();
        accountData.setName("Alan");
        accountData.setGender("male");
        accountData.setEmail("email" + System.currentTimeMillis() + "@email.com");
        accountData.setStatus("active");

        UserResponse userResponse = requestSpecification
                .body(accountData)
                .when().post("users")
                .then().spec(responseSpecification)
                .assertThat().statusCode(201)
                .body(matchesJsonSchemaInClasspath("json_Schema/defaultAccount.json"))
                .extract().response().as(UserResponse.class);

        Assert.assertEquals(accountData.getName(), userResponse.getData().getName());
        Assert.assertEquals(accountData.getEmail(), userResponse.getData().getEmail());
        Assert.assertEquals(accountData.getGender(), userResponse.getData().getGender());
        Assert.assertEquals(accountData.getStatus(), userResponse.getData().getStatus());

        String requestJson = mapper.writeValueAsString(accountData);
        String responseJson = mapper.writeValueAsString(userResponse.getData());
        JSONAssert.assertEquals(requestJson, responseJson, JSONCompareMode.LENIENT);

    // Create User's Post required field
        int userID = accountData.getId();
        String responseBody = requestSpecification
                .body("{}")
                .when().post("users/" + userID + "/posts")
                .then().spec(responseSpecification).assertThat().statusCode(422).extract().response().asString();

        Assert.assertEquals("{\"meta\":null,\"data\":[{\"field\":\""+ user +"\",\"message\":\""+ userText +"\"},{\"field\":\""+ title +"\",\"message\":\""+ titleText +"\"},{\"field\":\""+ body +"\",\"message\":\""+ bodyText +"\"}]}", responseBody);
    }

    // Verify creating a User's Comment in the response
    @Test
    public void test_Create_User_Comment() throws JsonProcessingException {
    // Create User's Account
        ObjectMapper mapper = new ObjectMapper();

        AccountData accountData = new AccountData();
        accountData.setName("Alan");
        accountData.setGender("male");
        accountData.setEmail("email" + System.currentTimeMillis() + "@email.com");
        accountData.setStatus("active");

        UserResponse userResponse = requestSpecification
                .body(accountData)
                .when().post("users")
                .then().spec(responseSpecification)
                .assertThat().statusCode(201)
                .body(matchesJsonSchemaInClasspath("json_Schema/defaultAccount.json"))
                .extract().response().as(UserResponse.class);

        Assert.assertEquals(accountData.getName(), userResponse.getData().getName());
        Assert.assertEquals(accountData.getEmail(), userResponse.getData().getEmail());
        Assert.assertEquals(accountData.getGender(), userResponse.getData().getGender());
        Assert.assertEquals(accountData.getStatus(), userResponse.getData().getStatus());

        String requestJson = mapper.writeValueAsString(accountData);
        String responseJson = mapper.writeValueAsString(userResponse.getData());
        JSONAssert.assertEquals(requestJson, responseJson, JSONCompareMode.LENIENT);

    // Create User's Post
        AccountPost accountPost = new AccountPost();
        accountPost.setTitle("Lorem ipsum dolor sit amet");
        accountPost.setBody("Morbi finibus metus sit amet massa commodo, non porttitor erat interdum. Nam id lacus ante. Phasellus et bibendum ligula. Nunc imperdiet ipsum eget tempor dictum. Donec sit amet nulla hendrerit nunc malesuada tincidunt. Sed eu varius justo. Integer at imperdiet purus. Nullam posuere tortor sed commodo gravida. Mauris imperdiet, libero in scelerisque egestas, mauris nulla facilisis risus, malesuada vestibulum est turpis ut metus. Nulla facilisi. Aenean non sagittis purus, in tincidunt elit. Nulla laoreet est at ipsum semper, sit amet imperdiet sem accumsan. Sed sed neque tincidunt, lacinia quam id, maximus lacus.");

        int userID = userResponse.getData().getId();
        UserPost userResponsePost = requestSpecification
                .body(accountPost)
                .when().post("users/" + userID + "/posts")
                .then().spec(responseSpecification).assertThat().statusCode(201).extract().response().as(UserPost.class);
        Assert.assertEquals(accountPost.getTitle(), userResponsePost.getData().getTitle());
        Assert.assertEquals(accountPost.getBody(), userResponsePost.getData().getBody());

        String requestJson2 = mapper.writeValueAsString(accountPost);
        String responseJson2 = mapper.writeValueAsString(userResponsePost.getData());
        JSONAssert.assertEquals(requestJson2, responseJson2, JSONCompareMode.LENIENT);

    // Create User's Comment
        int postID = userResponsePost.getData().getId();
        AccountComment accountComment = new AccountComment();
        accountComment.setName("Alan");
        accountComment.setEmail("test" + System.currentTimeMillis() + "@email.com");
        accountComment.setBody("Test Morbi finibus metus sit amet massa commodo, non porttitor erat interdum. Nam id lacus ante. Phasellus et bibendum ligula. Nunc imperdiet ipsum eget tempor dictum11.");

        UserComment responseBodyComment = requestSpecification
                .body(accountComment)
                .when().post("posts/" + postID + "/comments")
                .then().spec(responseSpecification).assertThat().statusCode(201).extract().response().as(UserComment.class);
        Assert.assertEquals(accountComment.getName(), responseBodyComment.getData().getName());
        Assert.assertEquals(accountComment.getEmail(), responseBodyComment.getData().getEmail());
        Assert.assertEquals(accountComment.getBody(), responseBodyComment.getData().getBody());

        String requestJson3 = mapper.writeValueAsString(accountComment);
        String responseJson3 = mapper.writeValueAsString(responseBodyComment.getData());
        JSONAssert.assertEquals(requestJson3, responseJson3, JSONCompareMode.LENIENT);
    }

    // Verify required field on "User's Comment" response
    @Test(dataProvider = "data_Required_Field_User_Post_and_Comment")
    public void test_Required_Field_User_Comment(String user, String userText, String title, String titleText, String body, String bodyText) throws JsonProcessingException {
        // Create User's Account
        ObjectMapper mapper = new ObjectMapper();

        AccountData accountData = new AccountData();
        accountData.setName("Alan");
        accountData.setGender("male");
        accountData.setEmail("email" + System.currentTimeMillis() + "@email.com");
        accountData.setStatus("active");

        UserResponse userResponse = requestSpecification
                .body(accountData)
                .when().post("users")
                .then().spec(responseSpecification)
                .assertThat().statusCode(201)
                .body(matchesJsonSchemaInClasspath("json_Schema/defaultAccount.json"))
                .extract().response().as(UserResponse.class);

        Assert.assertEquals(accountData.getName(), userResponse.getData().getName());
        Assert.assertEquals(accountData.getEmail(), userResponse.getData().getEmail());
        Assert.assertEquals(accountData.getGender(), userResponse.getData().getGender());
        Assert.assertEquals(accountData.getStatus(), userResponse.getData().getStatus());

        String requestJson = mapper.writeValueAsString(accountData);
        String responseJson = mapper.writeValueAsString(userResponse.getData());
        JSONAssert.assertEquals(requestJson, responseJson, JSONCompareMode.LENIENT);

        // User's Comment required field
        int userID = accountData.getId();
        String responseBody = requestSpecification
                .body("{}")

                .when().post("users/" + userID + "/posts")
                .then().spec(responseSpecification).assertThat().statusCode(422).extract().response().asString();

        Assert.assertEquals("{\"meta\":null,\"data\":[{\"field\":\""+ user +"\",\"message\":\""+ userText +"\"},{\"field\":\""+ title +"\",\"message\":\""+ titleText +"\"},{\"field\":\""+ body +"\",\"message\":\""+ bodyText +"\"}]}" ,responseBody);
    }

    // Verify creating a User's To-Do in the response
    @Test
    public void test_Creating_User_ToDo() throws JsonProcessingException {
    // Create User's Account
        ObjectMapper mapper = new ObjectMapper();

        AccountData accountData = new AccountData();
        accountData.setName("Alan");
        accountData.setGender("male");
        accountData.setEmail("email" + System.currentTimeMillis() + "@email.com");
        accountData.setStatus("active");

        UserResponse userResponse = requestSpecification
                .body(accountData)
                .when().post("users")
                .then().spec(responseSpecification)
                .assertThat().statusCode(201)
                .body(matchesJsonSchemaInClasspath("json_Schema/defaultAccount.json"))
                .extract().response().as(UserResponse.class);

        Assert.assertEquals(accountData.getName(), userResponse.getData().getName());
        Assert.assertEquals(accountData.getEmail(), userResponse.getData().getEmail());
        Assert.assertEquals(accountData.getGender(), userResponse.getData().getGender());
        Assert.assertEquals(accountData.getStatus(), userResponse.getData().getStatus());

        String requestJson = mapper.writeValueAsString(accountData);
        String responseJson = mapper.writeValueAsString(userResponse.getData());
        JSONAssert.assertEquals(requestJson, responseJson, JSONCompareMode.LENIENT);

    // Create a User's To_do
        AccountToDo accountToDo = new AccountToDo();
        accountToDo.setTitle("Donec cursus diam posuere lectus pellentesque aliquet");
        accountToDo.setDue_on("2022-02-02T00:00:00.000+05:30");
        accountToDo.setStatus("completed");

        int userID = userResponse.getData().getId();
        UserAccountToDo responseBodyToDo = requestSpecification
                .body(accountToDo)
                .when().post("users/" + userID + "/todos")
                .then().spec(responseSpecification).assertThat().statusCode(201).extract().response().as(UserAccountToDo.class);
        Assert.assertEquals(accountToDo.getTitle(), responseBodyToDo.getData().getTitle());
        Assert.assertEquals(accountToDo.getDue_on(), responseBodyToDo.getData().getDue_on());
        Assert.assertEquals(accountToDo.getStatus(), responseBodyToDo.getData().getStatus());

        String requestJson2 = mapper.writeValueAsString(accountToDo);
        String responseJson2 = mapper.writeValueAsString(responseBodyToDo.getData());
        JSONAssert.assertEquals(requestJson2, responseJson2, JSONCompareMode.LENIENT);

    }

    // Verify required field on "User's To-Do" response
    @Test(dataProvider = "data_Required_Field_User_ToDo")
    public void test_Required_Field_User_ToDo(String user, String userText, String title, String titleText, String status, String statusText) throws JsonProcessingException {
    // Create User's Account
        ObjectMapper mapper = new ObjectMapper();

        AccountData accountData = new AccountData();
        accountData.setName("Alan");
        accountData.setGender("male");
        accountData.setEmail("email" + System.currentTimeMillis() + "@email.com");
        accountData.setStatus("active");

        UserResponse userResponse = requestSpecification
                .body(accountData)
                .when().post("users")
                .then().spec(responseSpecification)
                .assertThat().statusCode(201)
                .body(matchesJsonSchemaInClasspath("json_Schema/defaultAccount.json"))
                .extract().response().as(UserResponse.class);

        Assert.assertEquals(accountData.getName(), userResponse.getData().getName());
        Assert.assertEquals(accountData.getEmail(), userResponse.getData().getEmail());
        Assert.assertEquals(accountData.getGender(), userResponse.getData().getGender());
        Assert.assertEquals(accountData.getStatus(), userResponse.getData().getStatus());

        String requestJson = mapper.writeValueAsString(accountData);
        String responseJson = mapper.writeValueAsString(userResponse.getData());
        JSONAssert.assertEquals(requestJson, responseJson, JSONCompareMode.LENIENT);

        // User To_do's required field
        int userID = accountData.getId();
        String responseBody = requestSpecification
                .when().post("users/" + userID + "/todos")
                .then().spec(responseSpecification).assertThat().statusCode(422).extract().response().asString();
        Assert.assertEquals("{\"meta\":null,\"data\":[{\"field\":\""+ user +"\",\"message\":\""+ userText +"\"},{\"field\":\""+ title +"\",\"message\":\""+ titleText +"\"},{\"field\":\""+ status +"\",\"message\":\""+ statusText +"\"}]}", responseBody);
    }

    // Change User's Account Info and return 204 HTTP status code
    @Test
    public void test_Update_User_Account() throws JsonProcessingException {
        // Create User's Account
        ObjectMapper mapper = new ObjectMapper();

        AccountData accountData = new AccountData();
        accountData.setName("Alan");
        accountData.setGender("male");
        accountData.setEmail("email" + System.currentTimeMillis() + "@email.com");
        accountData.setStatus("active");

        UserResponse userResponse = requestSpecification
                .body(accountData)
                .when().post("users")
                .then().spec(responseSpecification)
                .assertThat().statusCode(201)
                .body(matchesJsonSchemaInClasspath("json_Schema/defaultAccount.json"))
                .extract().response().as(UserResponse.class);

        Assert.assertEquals(accountData.getName(), userResponse.getData().getName());
        Assert.assertEquals(accountData.getEmail(), userResponse.getData().getEmail());
        Assert.assertEquals(accountData.getGender(), userResponse.getData().getGender());
        Assert.assertEquals(accountData.getStatus(), userResponse.getData().getStatus());

        String requestJson = mapper.writeValueAsString(accountData);
        String responseJson = mapper.writeValueAsString(userResponse.getData());
        JSONAssert.assertEquals(requestJson, responseJson, JSONCompareMode.LENIENT);

        // Updating Account Name, and Email
        accountData.setName("Sarah");
        accountData.setGender("female");
        accountData.setEmail(System.currentTimeMillis() + "@email.com");
        accountData.setStatus("active");


        int userID = userResponse.getData().getId();
        String responseBody = requestSpecification
                .body(accountData)
                .when().patch("users/" + userID)
                .then().spec(responseSpecification).assertThat().statusCode(200).extract().response().asString();

        Assert.assertEquals("{\"meta\":null,\"data\":{\"email\":\"" + accountData.getEmail() +"\",\"" + "name\":\"Sarah\",\"gender\":\"female\",\"status\":\"active\",\"id\":" + userID + "}}", responseBody);
    }

    // Verify deleting a User Account and return 204 HTTP status code
    @Test
    public void test_Delete_User_Account() throws JsonProcessingException {
    // Create User's Account
        ObjectMapper mapper = new ObjectMapper();

        AccountData accountData = new AccountData();
        accountData.setName("Alan");
        accountData.setGender("male");
        accountData.setEmail("email" + System.currentTimeMillis() + "@email.com");
        accountData.setStatus("active");

        UserResponse userResponse = requestSpecification
                .body(accountData)
                .when().post("users")
                .then().spec(responseSpecification)
                .assertThat().statusCode(201)
                .body(matchesJsonSchemaInClasspath("json_Schema/defaultAccount.json"))
                .extract().response().as(UserResponse.class);

        Assert.assertEquals(accountData.getName(), userResponse.getData().getName());
        Assert.assertEquals(accountData.getEmail(), userResponse.getData().getEmail());
        Assert.assertEquals(accountData.getGender(), userResponse.getData().getGender());
        Assert.assertEquals(accountData.getStatus(), userResponse.getData().getStatus());

        String requestJson = mapper.writeValueAsString(accountData);
        String responseJson = mapper.writeValueAsString(userResponse.getData());
        JSONAssert.assertEquals(requestJson, responseJson, JSONCompareMode.LENIENT);

        // Deleting Account
        int userID = userResponse.getData().getId();
        String responseBody = requestSpecification
                .body(accountData)

                .when().delete("users/" + userID)
                .then().spec(responseSpecification).assertThat().statusCode(204).extract().response().asString();
        Assert.assertEquals("", responseBody);

    }

    // Verify cannot delete Non-Exist Account and return 404 HTTP status code
    @Test(dataProvider = "data_delete_Non_Exist_Account")
    public void test_Delete_Non_Exist_Account(String message, String messageText) throws JsonProcessingException {
    // Create User's Account
        ObjectMapper mapper = new ObjectMapper();

        AccountData accountData = new AccountData();
        accountData.setName("Alan");
        accountData.setGender("male");
        accountData.setEmail("email" + System.currentTimeMillis() + "@email.com");
        accountData.setStatus("active");

        UserResponse userResponse = requestSpecification
                .body(accountData)
                .when().post("users")
                .then().spec(responseSpecification)
                .assertThat().statusCode(201)
                .body(matchesJsonSchemaInClasspath("json_Schema/defaultAccount.json"))
                .extract().response().as(UserResponse.class);

        Assert.assertEquals(accountData.getName(), userResponse.getData().getName());
        Assert.assertEquals(accountData.getEmail(), userResponse.getData().getEmail());
        Assert.assertEquals(accountData.getGender(), userResponse.getData().getGender());
        Assert.assertEquals(accountData.getStatus(), userResponse.getData().getStatus());

        String requestJson = mapper.writeValueAsString(accountData);
        String responseJson = mapper.writeValueAsString(userResponse.getData());
        JSONAssert.assertEquals(requestJson, responseJson, JSONCompareMode.LENIENT);

        // Deleting a Non-Exist-Account, by userID increment by 10,000
        int userID = accountData.getId();
        String responseBody = requestSpecification
                .body(userResponse)

                .when().delete("users/" + userID + 10000)
                .then().assertThat().statusCode(404).spec(responseSpecification).extract().response().asString();
        Assert.assertEquals("{\"meta\":null,\"data\":{\""+ message +"\":\""+ messageText +"\"}}", responseBody);
    }

}
