// Test using HashMap + Schema

package Assignments.Gorest_IO.Java;

import Assignments.Gorest_IO.models.AccountData;
import Assignments.Gorest_IO.models.UserResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.*;
import org.skyscreamer.jsonassert.Customization;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.skyscreamer.jsonassert.ValueMatcher;
import org.skyscreamer.jsonassert.comparator.CustomComparator;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class GorestTest_HashMap extends BaseTest {

    // Verify that API token is mandatory for an API call
    @Test
    public void test_API_Token(){
    // Create User's Account
        HashMap<String, String> reqMap = new HashMap<>();
        reqMap.put("name", "Alan");
        reqMap.put("email", "test" + System.currentTimeMillis() + "@email.com");
        reqMap.put("gender", "Male");
        reqMap.put("status", "active");

        requestSpecification.body(reqMap)
                .when().post("users")
                .then().spec(responseSpecification)
                .assertThat().statusCode(201)
                .body(matchesJsonSchemaInClasspath("json_Schema/defaultAccount.json"))
                .extract().response().asString();
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
    public void test_user_queried(){
    // Create User's Account
        HashMap<String, String> reqMap = new HashMap<>();
        reqMap.put("name", "Alan");
        reqMap.put("email", "test" + System.currentTimeMillis() + "@email.com");
        reqMap.put("gender", "Male");
        reqMap.put("status", "active");

        String responseBodyAccount = requestSpecification
                .body(reqMap)
                .when().post("users")
                .then().spec(responseSpecification).assertThat().statusCode(201).body(matchesJsonSchemaInClasspath("json_Schema/defaultAccount.json")).extract().response().asString();
        JSONObject jsonObject = new JSONObject(responseBodyAccount);
        JSONObject data = jsonObject.getJSONObject("data");
        int userID = data.getInt("id");

    // GET user queried
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
    public void test_Single_User_Post(){
        // Create User's Account
        HashMap<String, String> reqMap = new HashMap<>();
        reqMap.put("name", "Alan");
        reqMap.put("email", "test" + System.currentTimeMillis() + "@email.com");
        reqMap.put("gender", "Male");
        reqMap.put("status", "active");

        String responseBodyAccount = requestSpecification
                .body(reqMap)
                .when().post("users")
                .then().spec(responseSpecification).assertThat().statusCode(201).body(matchesJsonSchemaInClasspath("json_Schema/defaultAccount.json")).extract().response().asString();
        JSONObject jsonObject = new JSONObject(responseBodyAccount);
        JSONObject data = jsonObject.getJSONObject("data");
        int userID = data.getInt("id");

    // Create User's Post
        reqMap.put("title", "Lorem ipsum dolor sit amet");
        reqMap.put("body", "Morbi finibus metus sit amet massa commodo, non porttitor erat interdum. Nam id lacus ante. Phasellus et bibendum ligula. Nunc imperdiet ipsum eget tempor dictum. Donec sit amet nulla hendrerit nunc malesuada tincidunt. Sed eu varius justo. Integer at imperdiet purus. Nullam posuere tortor sed commodo gravida. Mauris imperdiet, libero in scelerisque egestas, mauris nulla facilisis risus, malesuada vestibulum est turpis ut metus. Nulla facilisi. Aenean non sagittis purus, in tincidunt elit. Nulla laoreet est at ipsum semper, sit amet imperdiet sem accumsan. Sed sed neque tincidunt, lacinia quam id, maximus lacus.");

        String responseBodyPost = requestSpecification
                .body(reqMap)
                .when().post("users/" + userID + "/posts")
                .then().spec(responseSpecification).assertThat().statusCode(201).extract().response().asString();
        JSONObject jsonObject2 = new JSONObject(responseBodyPost);
        JSONObject data2 = jsonObject2.getJSONObject("data");
        String title = data2.getString("title");
        int postID = data2.getInt("id");
        Assert.assertEquals("Lorem ipsum dolor sit amet", title);

    // GET Single User's Post
        String responseBody = requestSpecification.get("posts/" + postID)
                .then().spec(responseSpecification).assertThat().statusCode(200).extract().response().asString();
        JSONObject jsonObject3 = new JSONObject(responseBody);
        JSONObject data3 = jsonObject3.getJSONObject("data");
        int user_ID = data3.getInt("id");
        Assert.assertEquals(postID, user_ID);
    }

    // Verify that the API returns all the User's Comments in the response.
    @Test
    public void test_All_Users_Comment(){
        requestSpecification.get("comments")
                .then().spec(responseSpecification).assertThat().statusCode(200).extract().response().asString();
    }

    // Verify that the API returns one User's Comments in the response.
    @Test
    public void test_Single_User_Comment(){
    // Create User's Account
        HashMap<String, String> reqMap = new HashMap<>();
        reqMap.put("name", "Alan");
        reqMap.put("email", "test" + System.currentTimeMillis() + "@email.com");
        reqMap.put("gender", "Male");
        reqMap.put("status", "active");

        String responseBodyAccount = requestSpecification
                .body(reqMap)
                .when().post("users")
                .then().spec(responseSpecification).assertThat().statusCode(201).body(matchesJsonSchemaInClasspath("json_Schema/defaultAccount.json")).extract().response().asString();
        JSONObject jsonObject = new JSONObject(responseBodyAccount);
        JSONObject data = jsonObject.getJSONObject("data");
        int userID = data.getInt("id");

    // Create User's Post
        reqMap.put("title", "Lorem ipsum dolor sit amet");
        reqMap.put("body", "Morbi finibus metus sit amet massa commodo, non porttitor erat interdum. Nam id lacus ante. Phasellus et bibendum ligula. Nunc imperdiet ipsum eget tempor dictum. Donec sit amet nulla hendrerit nunc malesuada tincidunt. Sed eu varius justo. Integer at imperdiet purus. Nullam posuere tortor sed commodo gravida. Mauris imperdiet, libero in scelerisque egestas, mauris nulla facilisis risus, malesuada vestibulum est turpis ut metus. Nulla facilisi. Aenean non sagittis purus, in tincidunt elit. Nulla laoreet est at ipsum semper, sit amet imperdiet sem accumsan. Sed sed neque tincidunt, lacinia quam id, maximus lacus.");

        String responseBodyPost = requestSpecification
                .body(reqMap)
                .when().post("users/" + userID + "/posts")
                .then().spec(responseSpecification).assertThat().statusCode(201).extract().response().asString();
        JSONObject jsonObject2 = new JSONObject(responseBodyPost);
        JSONObject data2 = jsonObject2.getJSONObject("data");
        String title = data2.getString("title");
        int postID = data2.getInt("id");
        Assert.assertEquals("Lorem ipsum dolor sit amet", title);

    // Create User's Comment
        reqMap.put("name", "Alan");
        reqMap.put("email", "test" + System.currentTimeMillis() + "@email.com");
        reqMap.put("body", "Test Morbi finibus metus sit amet massa commodo, non porttitor erat interdum. Nam id lacus ante. Phasellus et bibendum ligula. Nunc imperdiet ipsum eget tempor dictum11.");

        String responseBodyComment = requestSpecification
                .body(reqMap)
                .when().post("posts/" + postID + "/comments")
                .then().spec(responseSpecification).assertThat().statusCode(201).extract().response().asString();

        JSONObject jsonObject3 = new JSONObject(responseBodyComment);
        JSONObject data3 = jsonObject3.getJSONObject("data");
        String name = data3.getString("name");
        int commentID = data3.getInt("id");
        Assert.assertEquals("Alan", name);

    // GET a Single User's Comment
        String responseBody = requestSpecification.get("comments/" + commentID)
                .then().spec(responseSpecification).assertThat().statusCode(200).extract().response().asString();
        JSONObject jsonObject4 = new JSONObject(responseBody);
        JSONObject data4 = jsonObject4.getJSONObject("data");
        String body = data4.getString("body");
        Assert.assertEquals(body, "Test Morbi finibus metus sit amet massa commodo, non porttitor erat interdum. Nam id lacus ante. Phasellus et bibendum ligula. Nunc imperdiet ipsum eget tempor dictum11.");
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
    public void test_Single_User_ToDo(){
        // Create User's Account
        HashMap<String, String> reqMap = new HashMap<>();
        reqMap.put("name", "Alan");
        reqMap.put("email", "test" + System.currentTimeMillis() + "@email.com");
        reqMap.put("gender", "Male");
        reqMap.put("status", "active");

        String responseBodyAccount = requestSpecification
                .body(reqMap)
                .when().post("users")
                .then().spec(responseSpecification).assertThat().statusCode(201).body(matchesJsonSchemaInClasspath("json_Schema/defaultAccount.json")).extract().response().asString();
        JSONObject jsonObject = new JSONObject(responseBodyAccount);
        JSONObject data = jsonObject.getJSONObject("data");
        int userID = data.getInt("id");

    // Create a User's To_do
        reqMap.put("title", "Donec cursus diam posuere lectus pellentesque aliquet");
        reqMap.put("due_on", "2022-02-02T00:00:00.000+05:30" + System.currentTimeMillis());
        reqMap.put("status", "completed");

        String responseBodyToDo = requestSpecification
                .body(reqMap)
                .when().post("users/" + userID + "/todos")
                .then().spec(responseSpecification).assertThat().statusCode(201).extract().response().asString();
        JSONObject jsonObject2 = new JSONObject(responseBodyToDo);
        JSONObject data2 = jsonObject2.getJSONObject("data");
        String title = data2.getString("title");
        int ToDo_ID = data2.getInt("id");
        Assert.assertEquals("Donec cursus diam posuere lectus pellentesque aliquet", title);

    // Get Single User's To_do
        String responseBody = requestSpecification
                .get("todos/" + ToDo_ID)
                .then().spec(responseSpecification).assertThat().statusCode(200).extract().response().asString();
        JSONObject jsonObject3 = new JSONObject(responseBody);
        JSONObject data3 = jsonObject3.getJSONObject("data");
        String title2 = data3.getString("title");
        Assert.assertEquals(title2, "Donec cursus diam posuere lectus pellentesque aliquet");
    }

    // Verify creating a User account in the response
    @Test
    public void test_Create_User_Account(){
    // Create User's Account
        HashMap<String, String> reqMap = new HashMap<>();
        reqMap.put("name", "Alan");
        reqMap.put("email", "test" + System.currentTimeMillis() + "@email.com");
        reqMap.put("gender", "Male");
        reqMap.put("status", "active");

        String responseBodyAccount = requestSpecification
                .body(reqMap)
                .when().post("users")
                .then().spec(responseSpecification).assertThat().statusCode(201).body(matchesJsonSchemaInClasspath("json_Schema/defaultAccount.json")).extract().response().asString();
        JSONObject jsonObject = new JSONObject(responseBodyAccount);
        JSONObject data = jsonObject.getJSONObject("data");
        String name = data.getString("name");
        Assert.assertEquals("Alan", name);
    }

    // Verify creating the same User account with message email taken in response
    @Test
    public void test_Create_User_Account_Email_Taken(){
    // Create User's Account
        HashMap<String, String> reqMap = new HashMap<>();
        reqMap.put("name", "Alan");
        reqMap.put("email", "test" + System.currentTimeMillis() + "@email.com");
        reqMap.put("gender", "Male");
        reqMap.put("status", "active");

        String responseBodyAccount = requestSpecification
                .body(reqMap)
                .when().post("users")
                .then().spec(responseSpecification).assertThat().statusCode(201).body(matchesJsonSchemaInClasspath("json_Schema/defaultAccount.json")).extract().response().asString();
        JSONObject jsonObject = new JSONObject(responseBodyAccount);
        JSONObject data = jsonObject.getJSONObject("data");
        String name = data.getString("name");
        Assert.assertEquals("Alan", name);

    // Create Same Account
        requestSpecification
                .body(reqMap)
                .when().post("users")
                .then().spec(responseSpecification).assertThat().statusCode(422).extract().response().asString();
    }

    // Verify creating a User's Post in the response
    @Test
    public void test_Create_User_Post(){
    // Create User's Account
        HashMap<String, String> reqMap = new HashMap<>();
        reqMap.put("name", "Alan");
        reqMap.put("email", "test" + System.currentTimeMillis() + "@email.com");
        reqMap.put("gender", "Male");
        reqMap.put("status", "active");

        String responseBodyAccount = requestSpecification
                .body(reqMap)
                .when().post("users")
                .then().spec(responseSpecification).assertThat().statusCode(201).body(matchesJsonSchemaInClasspath("json_Schema/defaultAccount.json")).extract().response().asString();
        JSONObject jsonObject = new JSONObject(responseBodyAccount);
        JSONObject data = jsonObject.getJSONObject("data");
        int userID = data.getInt("id");

    // Create User's Post
        reqMap.put("title", "Lorem ipsum dolor sit amet");
        reqMap.put("body", "Morbi finibus metus sit amet massa commodo, non porttitor erat interdum. Nam id lacus ante. Phasellus et bibendum ligula. Nunc imperdiet ipsum eget tempor dictum. Donec sit amet nulla hendrerit nunc malesuada tincidunt. Sed eu varius justo. Integer at imperdiet purus. Nullam posuere tortor sed commodo gravida. Mauris imperdiet, libero in scelerisque egestas, mauris nulla facilisis risus, malesuada vestibulum est turpis ut metus. Nulla facilisi. Aenean non sagittis purus, in tincidunt elit. Nulla laoreet est at ipsum semper, sit amet imperdiet sem accumsan. Sed sed neque tincidunt, lacinia quam id, maximus lacus.");

        String responseBody = requestSpecification
                .body(reqMap)

                .when().post("users/" + userID + "/posts")
                .then().spec(responseSpecification).assertThat().statusCode(201).extract().response().asString();
        JSONObject jsonObject2 = new JSONObject(responseBody);
        JSONObject data2 = jsonObject2.getJSONObject("data");
        String title = data2.getString("title");
        Assert.assertEquals("Lorem ipsum dolor sit amet", title);
    }

    // Verify required field on "User's Post" response
    @Test
    public void test_Required_Field_User_Post(){
    // Create User's Account
        HashMap<String, String> reqMap = new HashMap<>();
        reqMap.put("name", "Alan");
        reqMap.put("email", "test" + System.currentTimeMillis() + "@email.com");
        reqMap.put("gender", "Male");
        reqMap.put("status", "active");

        String responseBodyAccount = requestSpecification
                .body(reqMap)
                .when().post("users")
                .then().spec(responseSpecification).assertThat().statusCode(201).body(matchesJsonSchemaInClasspath("json_Schema/defaultAccount.json")).extract().response().asString();
        JSONObject jsonObject = new JSONObject(responseBodyAccount);
        JSONObject data = jsonObject.getJSONObject("data");
        int userID = data.getInt("id");

    // Create User's Account required field
        requestSpecification
                .body("{}")
                .when().post("users/" + userID + "/posts")
                .then().spec(responseSpecification).assertThat().statusCode(422).extract().response().asString();
    }

    // Verify creating a User's Comment in the response
    @Test
    public void test_Create_User_Comment(){
    // Create User's Account
        HashMap<String, String> reqMap = new HashMap<>();
        reqMap.put("name", "Alan");
        reqMap.put("email", "test" + System.currentTimeMillis() + "@email.com");
        reqMap.put("gender", "Male");
        reqMap.put("status", "active");

        String responseBodyAccount = requestSpecification
                .body(reqMap)
                .when().post("users")
                .then().spec(responseSpecification).assertThat().statusCode(201).body(matchesJsonSchemaInClasspath("json_Schema/defaultAccount.json")).extract().response().asString();
        JSONObject jsonObject = new JSONObject(responseBodyAccount);
        JSONObject data = jsonObject.getJSONObject("data");
        int userID = data.getInt("id");

    // Create User's Post
        reqMap.put("title", "Lorem ipsum dolor sit amet");
        reqMap.put("body", "Morbi finibus metus sit amet massa commodo, non porttitor erat interdum. Nam id lacus ante. Phasellus et bibendum ligula. Nunc imperdiet ipsum eget tempor dictum. Donec sit amet nulla hendrerit nunc malesuada tincidunt. Sed eu varius justo. Integer at imperdiet purus. Nullam posuere tortor sed commodo gravida. Mauris imperdiet, libero in scelerisque egestas, mauris nulla facilisis risus, malesuada vestibulum est turpis ut metus. Nulla facilisi. Aenean non sagittis purus, in tincidunt elit. Nulla laoreet est at ipsum semper, sit amet imperdiet sem accumsan. Sed sed neque tincidunt, lacinia quam id, maximus lacus.");

        String responseBodyPost = requestSpecification
                .body(reqMap)

                .when().post("users/" + userID + "/posts")
                .then().spec(responseSpecification).assertThat().statusCode(201).extract().response().asString();
        JSONObject jsonObject2 = new JSONObject(responseBodyPost);
        JSONObject data2 = jsonObject2.getJSONObject("data");
        String title = data2.getString("title");
        int postID = data2.getInt("id");
        Assert.assertEquals("Lorem ipsum dolor sit amet", title);

    // Create User's Comment
        reqMap.put("name", "Alan");
        reqMap.put("email", "test" + System.currentTimeMillis() + "@email.com");
        reqMap.put("body", "Test Morbi finibus metus sit amet massa commodo, non porttitor erat interdum. Nam id lacus ante. Phasellus et bibendum ligula. Nunc imperdiet ipsum eget tempor dictum11.");

        String responseBody = requestSpecification
                .body(reqMap)

                .when().post("posts/" + postID + "/comments")
                .then().spec(responseSpecification).assertThat().statusCode(201).extract().response().asString();
        JSONObject jsonObject3 = new JSONObject(responseBody);
        JSONObject data3 = jsonObject3.getJSONObject("data");
        String name = data3.getString("name");
        Assert.assertEquals("Alan", name);
    }

    // Verify required field on "User's Comment" response
    @Test
    public void test_Required_Field_User_Comment(){
    // Create User's Account
        HashMap<String, String> reqMap = new HashMap<>();
        reqMap.put("name", "Alan");
        reqMap.put("email", "test" + System.currentTimeMillis() + "@email.com");
        reqMap.put("gender", "Male");
        reqMap.put("status", "active");

        String responseBodyAccount = requestSpecification
                .body(reqMap)
                .when().post("users")
                .then().spec(responseSpecification).assertThat().statusCode(201).body(matchesJsonSchemaInClasspath("json_Schema/defaultAccount.json")).extract().response().asString();
        JSONObject jsonObject = new JSONObject(responseBodyAccount);
        JSONObject data = jsonObject.getJSONObject("data");
        int userID = data.getInt("id");

    // User's Comment required field
        requestSpecification
                .body("{}")

                .when().post("users/" + userID + "/posts")
                .then().spec(responseSpecification).assertThat().statusCode(422).extract().response().asString();
    }

    // Verify creating a User's To-Do in the response
    @Test
    public void test_Creating_User_ToDo(){
    // Create User's Account
        HashMap<String, String> reqMap = new HashMap<>();
        reqMap.put("name", "Alan");
        reqMap.put("email", "test" + System.currentTimeMillis() + "@email.com");
        reqMap.put("gender", "Male");
        reqMap.put("status", "active");

        String responseBodyAccount = requestSpecification
                .body(reqMap)
                .when().post("users")
                .then().spec(responseSpecification).assertThat().statusCode(201).body(matchesJsonSchemaInClasspath("json_Schema/defaultAccount.json")).extract().response().asString();
        JSONObject jsonObject = new JSONObject(responseBodyAccount);
        JSONObject data = jsonObject.getJSONObject("data");
        int userID = data.getInt("id");

    // Create User's To_Do's
        reqMap.put("title", "Donec cursus diam posuere lectus pellentesque aliquet");
        reqMap.put("due_on", "2022-02-02T00:00:00.000+05:30 " + System.currentTimeMillis());
        reqMap.put("status", "completed");

        String responseBody = requestSpecification
                .body(reqMap)

                .when().post("users/" + userID + "/todos")
                .then().spec(responseSpecification).assertThat().statusCode(201).extract().response().asString();
        JSONObject jsonObject2 = new JSONObject(responseBody);
        JSONObject data2 = jsonObject2.getJSONObject("data");
        String title = data2.getString("title");
        Assert.assertEquals("Donec cursus diam posuere lectus pellentesque aliquet", title);

    }

    // Verify required field on "User's To-Do" response
    @Test
    public void test_Required_Field_User_ToDo(){
    // Create User's Account
        HashMap<String, String> reqMap = new HashMap<>();
        reqMap.put("name", "Alan");
        reqMap.put("email", "test" + System.currentTimeMillis() + "@email.com");
        reqMap.put("gender", "Male");
        reqMap.put("status", "active");

        String responseBodyAccount = requestSpecification
                .body(reqMap)
                .when().post("users")
                .then().spec(responseSpecification).assertThat().statusCode(201).body(matchesJsonSchemaInClasspath("json_Schema/defaultAccount.json")).extract().response().asString();
        JSONObject jsonObject = new JSONObject(responseBodyAccount);
        JSONObject data = jsonObject.getJSONObject("data");
        int userID = data.getInt("id");

    // User To_do's required field
        requestSpecification
                .when().post("users/" + userID + "/todos")
                .then().spec(responseSpecification).assertThat().statusCode(422).extract().response().asString();

    }

    // Change User's Account Info and return 204 HTTP status code
    @Test
    public void test_Update_User_Account(){
    // Create Account
        HashMap<String, String> reqMap = new HashMap<>();
        reqMap.put("name", "Alan");
        reqMap.put("email", "test" + System.currentTimeMillis() + "@email.com");
        reqMap.put("gender", "Male");
        reqMap.put("status", "active");

        String responseBodyAccount = requestSpecification
                .body(reqMap)
                .when().post("users")
                .then().spec(responseSpecification).assertThat().statusCode(201).body(matchesJsonSchemaInClasspath("json_Schema/defaultAccount.json")).extract().response().asString();
        JSONObject jsonObject = new JSONObject(responseBodyAccount);
        JSONObject data = jsonObject.getJSONObject("data");

    // Updating Account Name, and Email
        int userID = data.getInt("id");

        reqMap.put("name", "Sarah");
        reqMap.put("email", "test" + System.currentTimeMillis() + "@email.com");
        reqMap.put("gender", "Female");
        reqMap.put("status", "active");

        String responseBody = requestSpecification
                .body(reqMap)
                .when().patch("users/" + userID)
                .then().spec(responseSpecification).assertThat().statusCode(200).extract().response().asString();
        JSONObject updatedJson = new JSONObject(responseBody);
        JSONObject data2 = updatedJson.getJSONObject("data");
        String name = data2.getString("name");
        Assert.assertEquals("Sarah", name);
    }

    // Verify deleting a User Account and return 204 HTTP status code
    @Test
    public void test_Delete_User_Account(){
    // Create User's Account
        HashMap<String, String> reqMap = new HashMap<>();
        reqMap.put("name", "Alan");
        reqMap.put("email", "test" + System.currentTimeMillis() + "@email.com");
        reqMap.put("gender", "Male");
        reqMap.put("status", "active");

        String responseBodyAccount = requestSpecification
                .body(reqMap)
                .when().post("users")
                .then().spec(responseSpecification).assertThat().statusCode(201).body(matchesJsonSchemaInClasspath("json_Schema/defaultAccount.json")).extract().response().asString();
        JSONObject jsonObject = new JSONObject(responseBodyAccount);
        JSONObject data = jsonObject.getJSONObject("data");

    // Deleting Account
        int userID = data.getInt("id");
        requestSpecification
                .body(reqMap)

                .when().delete("users/" + userID)
                .then().spec(responseSpecification).assertThat().statusCode(204).extract().response().asString();
    }

    // Verify cannot delete Non-Exist Account and return 404 HTTP status code
    @Test
    public void test_Delete_Non_Exist_Account(){
        // Create User's Account
        HashMap<String, String> reqMap = new HashMap<>();
        reqMap.put("name", "Alan");
        reqMap.put("email", "test" + System.currentTimeMillis() + "@email.com");
        reqMap.put("gender", "Male");
        reqMap.put("status", "active");

        String responseBodyAccount = requestSpecification
                .body(reqMap)
                .when().post("users")
                .then().spec(responseSpecification).assertThat().statusCode(201).body(matchesJsonSchemaInClasspath("json_Schema/defaultAccount.json")).extract().response().asString();
        JSONObject jsonObject = new JSONObject(responseBodyAccount);
        JSONObject data = jsonObject.getJSONObject("data");

    // Deleting a Non-Exist-Account, by userID increment by 1
        int userID = data.getInt("id");
        requestSpecification
                .body(reqMap)

                .when().delete("users/" + userID + 1)
                .then().assertThat().statusCode(404).extract().response().asString();
    }

}
