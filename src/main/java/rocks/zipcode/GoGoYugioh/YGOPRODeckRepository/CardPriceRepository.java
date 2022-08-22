package rocks.zipcode.GoGoYugioh.YGOPRODeckRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import rocks.zipcode.GoGoYugioh.YGOPRODeck.CardPrice;

@Repository
public interface CardPriceRepository extends CrudRepository<CardPrice, Long> {
    
}
