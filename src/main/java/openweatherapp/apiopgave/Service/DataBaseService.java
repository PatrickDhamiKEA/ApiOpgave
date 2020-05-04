package openweatherapp.apiopgave.Service;

import openweatherapp.apiopgave.Exception.NotFoundException;
import openweatherapp.apiopgave.Model.AllWeather;
import openweatherapp.apiopgave.Model.Weather;
import openweatherapp.apiopgave.Repository.AllWeatherRepository;
import openweatherapp.apiopgave.Repository.WeatherRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataBaseService {
    private AllWeatherRepository allWeatherRepository;
    private WeatherRepository weatherRepository;

    public DataBaseService(AllWeatherRepository allWeatherRepository, WeatherRepository weatherRepository) {
        this.allWeatherRepository = allWeatherRepository;
        this.weatherRepository = weatherRepository;
    }

    public List<AllWeather> getHistoricalWeatherFromDB() {
        return (List<AllWeather>) allWeatherRepository.findAll();
    }

    public AllWeather getAllWeaherByID(Long id) {
        return allWeatherRepository.findById(id).orElseThrow(() -> new NotFoundException("The weather with id=" + id + " was not found."));
    }

    public Weather getWeatherByID(Long id) {
        return weatherRepository.findById(id).orElseThrow(() -> new NotFoundException("The weather with id="+id+" was not found."));
    }
}
