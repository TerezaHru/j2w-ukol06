package cz.czechitas.java2webapps.ukol6.repository;
import cz.czechitas.java2webapps.ukol6.entity.Vizitka;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository pro přístup k databázové tabulce {@code osoba}.
 *
 * Repository automaticky implementuje metody pro operace Create, Read, Update, Delete.
 */
@Repository
public interface VizitkaRepository extends CrudRepository<Vizitka, Long> {

}