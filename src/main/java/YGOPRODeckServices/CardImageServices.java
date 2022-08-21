package YGOPRODeckServices;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CardImageServices {
    private static EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
    .createEntityManagerFactory("GoGoYugioh");

    EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
}
