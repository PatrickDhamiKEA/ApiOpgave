package openweatherapp.apiopgave.Repository;

import openweatherapp.apiopgave.Model.Weather;
import org.springframework.data.repository.CrudRepository;

public interface WeatherRepository extends CrudRepository<Weather, Long> {
}
