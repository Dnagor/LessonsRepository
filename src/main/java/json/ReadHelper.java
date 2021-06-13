package json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ReadHelper {
    public static void main(String[] args) {
        String json = "{\"websites\":\n" +
                "    [{\"amazon\": {\n" +
                "    \"id\": 1,\n" +
                "    \"books\": [\n" +
                "      {\n" +
                "        \"author\": \"Test1\",\n" +
                "        \"bookTitle\": \"Pascal\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"author\": \"Test2\",\n" +
                "        \"bookTitle\": \"JS\"\n" +
                "      }\n" +
                "    ]\n" +
                "  }\n" +
                "  },\n" +
                "  {\"rozetka\": {\n" +
                "    \"id\": 2,\n" +
                "    \"books\": [\n" +
                "      {\n" +
                "        \"author\": \"Test3\",\n" +
                "        \"bookTitle\": \"java\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"author\": \"Test4\",\n" +
                "        \"bookTitle\": \"Delphi\"\n" +
                "      }\n" +
                "    ]\n" +
                "  }\n" +
                "  }\n" +
                "]\n" +
                "}";

        ObjectMapper objectMapper = new ObjectMapper();
        Websites obj = null;
        try {
            obj = objectMapper.readValue(json, Websites.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println(obj);
    }

//    public static void main(String[] args) {
//        fileReader();
//    }
}
