package openweatherapp.apiopgave.Repository;

import openweatherapp.apiopgave.Model.Coord;
import org.springframework.data.repository.CrudRepository;

public interface CoordRepository extends CrudRepository<Coord, Long> {
}
