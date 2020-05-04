package openweatherapp.apiopgave.Service;


import openweatherapp.apiopgave.Exception.NotFoundException;
import openweatherapp.apiopgave.Model.AllWeather;
import openweatherapp.apiopgave.Repository.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiService {

    private RestTemplate restTemplate;
    private AllWeatherRepository allWeatherRepository;
    private CloudsRepository cloudsRepository;
    private CoordRepository coordRepository;
    private MainRepository mainRepository;
    private SysRepository sysRepository;
    private WeatherRepository weatherRepository;
    private WindRepository windRepository;


    public ApiService(RestTemplate restTemplate,
                      AllWeatherRepository allWeatherRepository,
                      CloudsRepository cloudsRepository,
                      CoordRepository coordRepository,
                      MainRepository mainRepository,
                      SysRepository sysRepository,
                      WeatherRepository weatherRepository,
                      WindRepository windRepository) {
        this.restTemplate = restTemplate;
        this.allWeatherRepository = allWeatherRepository;
        this.cloudsRepository = cloudsRepository;
        this.coordRepository = coordRepository;
        this.mainRepository = mainRepository;
        this.sysRepository = sysRepository;
        this. weatherRepository = weatherRepository;
        this.windRepository = windRepository;
    }


    public AllWeather getAllWeather(String city) {
        String url = "http://api.openweathermap.org/data/2.5/weather?appid=280feef131fa6f11a44188b78a279805&q=" + city + "&units=metric";
        AllWeather allWeather = new AllWeather();
        try {
            allWeather = restTemplate.getForObject(url, AllWeather.class);
        } catch (RuntimeException e) {
            throw new NotFoundException("No city found!");
        }

        allWeatherRepository.save(allWeather);
        cloudsRepository.save(allWeather.getClouds());
        coordRepository.save(allWeather.getCoord());
        mainRepository.save(allWeather.getMain());
        sysRepository.save(allWeather.getSys());
        weatherRepository.saveAll(allWeather.getWeather());
        windRepository.save(allWeather.getWind());
        return allWeather;
    }
}
