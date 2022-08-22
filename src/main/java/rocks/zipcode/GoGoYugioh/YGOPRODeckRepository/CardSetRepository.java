package rocks.zipcode.GoGoYugioh.YGOPRODeckRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import rocks.zipcode.GoGoYugioh.YGOPRODeck.CardSet;

@Repository
public interface CardSetRepository extends CrudRepository<CardSet, Long> {
    
}
