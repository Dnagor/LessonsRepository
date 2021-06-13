package src;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import json.Websites;
import org.testng.Assert;
import org.testng.annotations.Test;
import pojoJson.Website;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import static org.testng.AssertJUnit.*;

public class WebsitesCheck {

    ObjectMapper objectMapper = new ObjectMapper();

    //@BeforeClass
//    @Test
//    public void isPresent() throws JsonProcessingException {
//      //  URL url = this.getClass().getResource("json/jsonTask.json");
//        File file = new File("C:\\Users\\1\\git\\Lesson8\\src\\main\\java\\json\\jsonTask.json");
//        Websites websites = null;
//        try {
//            websites = objectMapper.readValue(file, Websites.class);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        Assert.assertEquals(websites.getWebsites().get(1).containsKey("rozetka"), true);
//
//    }
    @Test
    public void objectIsPresentTest() throws IOException {
        File file = new File("C:\\Users\\1\\git\\Lesson8\\src\\main\\java\\json\\jsonTask.json");
        pojoJson.Websites websites = objectMapper.readValue(file, pojoJson.Websites.class);
        assertNotNull(websites.getWebsites().get(0).getAmazon().getBooks().get(0).getAuthor());

    }


}
