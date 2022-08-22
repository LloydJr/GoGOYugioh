package rocks.zipcode.GoGoYugioh.YGOPRODeck;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

@Generated("jsonschema2pojo")
@Entity
@Table(name = "cardSet")
public class CardSet implements Serializable {
    private static final long serialVersionUID = 3L;


    @Id
    @Column(name = "setName", unique = true)
    private String setName;
    @Column(name = "setCode", unique = true)
    private String setCode;
    @Column(name = "setRarity", unique = true)
    private String setRarity;
    @Column(name = "setRarityCode", unique = true)
    private String setRarityCode;
    @Column(name = "setPrice", unique = true)
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