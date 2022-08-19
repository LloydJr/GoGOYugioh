package YGOPRODeck;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class CardSet {

    private String setName;
    private String setCode;
    private String setRarity;
    private String setRarityCode;
    private String setPrice;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getSetName() {
        return setName;
    }

    public void setSetName(String setName) {
        this.setName = setName;
    }

    public String getSetCode() {
        return setCode;
    }

    public void setSetCode(String setCode) {
        this.setCode = setCode;
    }

    public String getSetRarity() {
        return setRarity;
    }

    public void setSetRarity(String setRarity) {
        this.setRarity = setRarity;
    }

    public String getSetRarityCode() {
        return setRarityCode;
    }

    public void setSetRarityCode(String setRarityCode) {
        this.setRarityCode = setRarityCode;
    }

    public String getSetPrice() {
        return setPrice;
    }

    public void setSetPrice(String setPrice) {
        this.setPrice = setPrice;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}