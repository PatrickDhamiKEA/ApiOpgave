package openweatherapp.apiopgave.Repository;

import openweatherapp.apiopgave.Model.AllWeather;
import org.springframework.data.repository.CrudRepository;

public interface AllWeatherRepository extends CrudRepository<AllWeather, Long> {
}
