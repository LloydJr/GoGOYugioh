package rocks.zipcode.GoGoYugioh.YGOPRODeckRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import rocks.zipcode.GoGoYugioh.YGOPRODeck.Datum;

@Repository
public interface DatumRepository extends CrudRepository<Datum, Long> {
    
}
