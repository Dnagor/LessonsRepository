package pojoJson;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"websites"
})

public class Websites {

@JsonProperty("websites")
private List<Website> websites = null;

@JsonProperty("websites")
public List<Website> getWebsites() {
return websites;
}

@JsonProperty("websites")
public void setWebsites(List<Website> websites) {
this.websites = websites;
}


}