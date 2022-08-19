package YGOPRODeck;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class CardPrice {

    private String cardmarketPrice;
    private String tcgplayerPrice;
    private String ebayPrice;
    private String amazonPrice;
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
