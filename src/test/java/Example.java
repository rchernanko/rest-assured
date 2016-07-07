import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;
import org.junit.runner.Request;

import java.util.List;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

public class Example {



    @Test
    public void testGetSingleUser() {
//        expect().
//                statusCode(200).
//                body(
//                        "email", equalTo("test@hascode.com"),
//                        "firstName", equalTo("Tim"),
//                        "lastName", equalTo("Testerman"),
//                        "id", equalTo("1")).
//                when().
//                get("/https://api.github.com/");
//
//        when().request("CONNECT", "/api.github.com/").
//                then().
//                statusCode(200);

//        Response response = RestAssured.get("http://jsonplaceholder.typicode.com/posts");
//        System.out.println(response.getBody().print());

//        Request request =
//        Response response1 = RestAssured.get("https://api.github.com/");
//        System.out.println(response1.getBody().print());


//        expect().body("userId", equalTo(1)).when().get("https://api.github.com/");

        List<Integer> winningNumbers = get("https://api.github.com/users/rchernanko/repos").path("id");

        System.out.println(winningNumbers);


    }




}
