package openweatherapp.apiopgave.Repository;

import openweatherapp.apiopgave.Model.Wind;
import org.springframework.data.repository.CrudRepository;

public interface WindRepository extends CrudRepository<Wind, Long> {
}
