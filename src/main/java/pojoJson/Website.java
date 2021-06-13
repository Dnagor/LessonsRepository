package pojoJson;

import java.util.HashMap;
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
"amazon",
"rozetka"
})
@Generated("jsonschema2pojo")
public class Website {

@JsonProperty("amazon")
private Amazon amazon;
@JsonProperty("rozetka")
private Rozetka rozetka;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("amazon")
public Amazon getAmazon() {
return amazon;
}

@JsonProperty("amazon")
public void setAmazon(Amazon amazon) {
this.amazon = amazon;
}

@JsonProperty("rozetka")
public Rozetka getRozetka() {
return rozetka;
}

@JsonProperty("rozetka")
public void setRozetka(Rozetka rozetka) {
this.rozetka = rozetka;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}