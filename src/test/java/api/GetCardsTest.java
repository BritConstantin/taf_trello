package api;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;

public class GetCardsTest {
    private final String PERSONA_KEY = "2b83956a4f9a3216169c32206802f7b2";
    private final String TOKEN = "06f09412f5030380b11440313ea34b66d9a5289b80c0ae6bddc7a6a822f85478";
    private final String BOARD_ID = "q3U97LPZ";
    @Test
    public void getGrenBoardLabel(){
        String url = "https://api.trello.com/1/boards/" + BOARD_ID + "/cards?key=" + PERSONA_KEY + "&token=" + TOKEN;
        get(url).prettyPrint();
    }
}
