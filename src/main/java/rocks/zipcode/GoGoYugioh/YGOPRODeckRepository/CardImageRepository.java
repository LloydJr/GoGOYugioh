package rocks.zipcode.GoGoYugioh.YGOPRODeckRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import rocks.zipcode.GoGoYugioh.YGOPRODeck.CardImage;
import rocks.zipcode.GoGoYugioh.YGOPRODeck.Datum;

import java.util.Optional;

@Repository
public interface CardImageRepository extends CrudRepository<CardImage, Long>{
    @Override
    <S extends CardImage> S save(S entity);

    @Override
    <S extends CardImage> Iterable<S> saveAll(Iterable<S> entities);

    @Override
    Optional<CardImage> findById(Long aLong);

    @Override
    boolean existsById(Long aLong);

    @Override
    Iterable<CardImage> findAll();

    @Override
    Iterable<CardImage> findAllById(Iterable<Long> longs);

    @Override
    long count();

    @Override
    void deleteById(Long aLong);

    @Override
    void delete(CardImage entity);

    @Override
    void deleteAllById(Iterable<? extends Long> longs);

    @Override
    void deleteAll(Iterable<? extends CardImage> entities);

    @Override
    void deleteAll();

}
