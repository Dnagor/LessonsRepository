package pojoJson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Helper {
    private static ObjectMapper objectMapper = new ObjectMapper();
    public static Websites readJson(){
        File file = new File("C:\\Users\\1\\git\\Lesson8\\src\\main\\java\\json\\jsonTask.json");
        pojoJson.Websites websites = null;
        try {
            websites = objectMapper.readValue(file, pojoJson.Websites.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return websites;
    }

}
