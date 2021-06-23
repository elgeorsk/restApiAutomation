package files;
import io.restassured.path.json.JsonPath;

public class MyMethods {

    public static JsonPath convertRawToJson(String response){
        JsonPath json = new JsonPath(response);
        return json;
    }
}
