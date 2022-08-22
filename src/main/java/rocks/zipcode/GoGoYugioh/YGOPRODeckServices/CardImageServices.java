package rocks.zipcode.GoGoYugioh.YGOPRODeckServices;


import javax.persistence.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rocks.zipcode.GoGoYugioh.YGOPRODeck.CardImage;


@Service
public class CardImageServices {
@Autowired
    private static EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
    .createEntityManagerFactory("GoGoYugioh");

    EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
    EntityTransaction et = null;

    public void getCardImageId(Integer imageId) {
        String query = "SELECT x FROM x WHERE x.Id = id";

        TypedQuery<CardImage> typedQuery = em.createQuery(query, CardImage.class);
        typedQuery.setParameter("imageId", imageId);
        CardImage cardImage = null;
        try{
            cardImage = typedQuery.getSingleResult();
            System.out.println(cardImage.getId() + cardImage.getImageUrl()
                    + cardImage.getImageUrlSmall());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
    }
    public void findAllCardImageId() {
        String query = "SELECT x FROM cardImage x WHERE x.Id IS NOT NULL";
        TypedQuery<CardImage> typedQuery = em.createQuery(query, CardImage.class);
        List<CardImage> cardImageList;
        try {
            cardImageList = typedQuery.getResultList();
            cardImageList.forEach(cardImage -> System.out.println( cardImage.getId()
                    + cardImage.getImageUrl() + cardImage.getImageUrlSmall()));
        } catch (NoResultException e) {
            e.printStackTrace();
        } finally {
            em.close();
        }

    }

}
