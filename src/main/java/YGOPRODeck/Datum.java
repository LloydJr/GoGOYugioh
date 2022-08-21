package YGOPRODeck;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.Table;

import javax.persistence.Id;
import javax.persistence.Column;

@Generated("jsonschema2pojo")
@Entity
@Table(name = "datum")
public class Datum {

    @Id
    @Column(name = "Id", nullable = false)
    private Integer id;
    @Column(name = "name", unique = true)
    private String name;
    @Column(name = "type", unique = true)
    private String type;
    @Column(name = "desciption", unique = true)
    private String desc;
    @Column(name = "atk", nullable = false)
    private Integer atk;
    @Column(name = "def", nullable = false)
    private Integer def;
    @Column(name = "level", nullable = false)
    private Integer level;
    @Column(name = "race", unique = true)
    private String race;
    @Column(name = "attribute", unique = true)
    private String attribute;
    private List<CardSet> cardSets = null;
    private List<CardImage> cardImages = null;
    private List<CardPrice> cardPrices = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getAtk() {
        return atk;
    }

    public void setAtk(Integer atk) {
        this.atk = atk;
    }

    public Integer getDef() {
        return def;
    }

    public void setDef(Integer def) {
        this.def = def;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public List<CardSet> getCardSets() {
        return cardSets;
    }

    public void setCardSets(List<CardSet> cardSets) {
        this.cardSets = cardSets;
    }

    public List<CardImage> getCardImages() {
        return cardImages;
    }

    public void setCardImages(List<CardImage> cardImages) {
        this.cardImages = cardImages;
    }

    public List<CardPrice> getCardPrices() {
        return cardPrices;
    }

    public void setCardPrices(List<CardPrice> cardPrices) {
        this.cardPrices = cardPrices;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
