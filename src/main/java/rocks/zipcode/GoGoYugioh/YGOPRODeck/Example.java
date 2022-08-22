package rocks.zipcode.GoGoYugioh.YGOPRODeck;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Example implements Serializable {
    private static final long serialVersionUID = 5L;


    private List<Datum> data = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
