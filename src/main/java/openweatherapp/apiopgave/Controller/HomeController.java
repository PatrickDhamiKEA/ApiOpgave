package openweatherapp.apiopgave.Controller;

import openweatherapp.apiopgave.Exception.NotFoundException;
import openweatherapp.apiopgave.Service.ApiService;
import openweatherapp.apiopgave.Service.DataBaseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    private ApiService apiService;
    private DataBaseService dataBaseService;


    public HomeController(ApiService apiService, DataBaseService dataBaseService){
        this.apiService = apiService;
        this.dataBaseService = dataBaseService;
    }

    @GetMapping("/")
    public String home(@RequestParam(defaultValue = "copenhagen") String city, Model model){
        model.addAttribute("allWeather", apiService.getAllWeather(city));
        return "index";
    }

    @GetMapping("/historicalData")
    public String history(Model model){
        model.addAttribute("historicalWeather" ,dataBaseService.getHistoricalWeatherFromDB());
        return "historicalData";
    }

    @GetMapping("/historicalData/{id}")
    public String history(@PathVariable long id, Model model){
        model.addAttribute("allWeather", dataBaseService.getAllWeaherByID(id));
        model.addAttribute("weather", dataBaseService.getWeatherByID(id));
        return "detailsHistoricalData";
    }

    @ExceptionHandler(NotFoundException.class)
    public String exceptionHandling(Model model){
        model.addAttribute("message", "404 not found");
        return "exceptionPage";
    }
}
