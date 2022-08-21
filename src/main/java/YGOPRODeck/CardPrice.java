package YGOPRODeck;

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
@Table(name = "cardPrice")
public class CardPrice implements Serializable {
    private static final long serialVersionUID = 2L;

    @Id
    @Column(name = "cardMarketPrice", unique = true)
    private String cardmarketPrice;
    @Column(name = "tcgplayerPrice", unique = true)
    private String tcgplayerPrice;
    @Column(name = "ebayPrice", unique = true)
    private String ebayPrice;
    @Column(name = "amazonPrice", unique = true)
    private String amazonPrice;
    @Column(name = "coolstuffincPrice", unique = true)
    private String coolstuffincPrice;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getCardmarketPrice() {
        return cardmarketPrice;
    }

    public void setCardmarketPrice(String cardmarketPrice) {
        this.cardmarketPrice = cardmarketPrice;
    }

    public String getTcgplayerPrice() {
        return tcgplayerPrice;
    }

    public void setTcgplayerPrice(String tcgplayerPrice) {
        this.tcgplayerPrice = tcgplayerPrice;
    }

    public String getEbayPrice() {
        return ebayPrice;
    }

    public void setEbayPrice(String ebayPrice) {
        this.ebayPrice = ebayPrice;
    }

    public String getAmazonPrice() {
        return amazonPrice;
    }

    public void setAmazonPrice(String amazonPrice) {
        this.amazonPrice = amazonPrice;
    }

    public String getCoolstuffincPrice() {
        return coolstuffincPrice;
    }

    public void setCoolstuffincPrice(String coolstuffincPrice) {
        this.coolstuffincPrice = coolstuffincPrice;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
