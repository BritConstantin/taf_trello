package api;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class GetBoardTest {
    private final String PERSONA_KEY = "2b83956a4f9a3216169c32206802f7b2";
    private final String TOKEN = "06f09412f5030380b11440313ea34b66d9a5289b80c0ae6bddc7a6a822f85478";
    private final String BOARD_ID = "q3U97LPZ";

    @Test
    public void getBoard(){
        String url = "https://api.trello.com/1/boards/" + BOARD_ID + "?key=" + PERSONA_KEY + "&token=" + TOKEN;
        int statusCode = given().
                get(url).
                statusCode();
        Assert.assertEquals(statusCode, 200);

    }
    @Test
    public void getGrenBoardLabel(){
        String url = "https://api.trello.com/1/boards/" + BOARD_ID + "?key=" + PERSONA_KEY + "&token=" + TOKEN;
        given().
                get(url).
                then().
                body("labelNames.green", equalTo("Meta"));
    }
}
