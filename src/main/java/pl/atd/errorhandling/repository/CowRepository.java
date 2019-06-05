package pl.atd.errorhandling.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.atd.errorhandling.model.Cow;

@Repository
public interface CowRepository extends CrudRepository<Cow, Long> {
}
