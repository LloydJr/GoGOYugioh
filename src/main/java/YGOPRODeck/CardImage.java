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
@Table(name = "cardImage")
public class CardImage implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "Id", nullable = false)
    private Integer id;
    @Column(name = "imageUrl", unique = true)
    private String imageUrl;
    @Column(name = "imageUrlSmall", unique = true)
    private String imageUrlSmall;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageUrlSmall() {
        return imageUrlSmall;
    }

    public void setImageUrlSmall(String imageUrlSmall) {
        this.imageUrlSmall = imageUrlSmall;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}

