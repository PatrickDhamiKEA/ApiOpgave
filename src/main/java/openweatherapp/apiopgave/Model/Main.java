package openweatherapp.apiopgave.Model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Main extends BaseEntity {

    private static final long serialVersionUID = -2600377620085294659L;

    @OneToOne(mappedBy = "main")
    private AllWeather allWeather;
    private Float temp;
    private Float feels_like;
    private Float temp_min;
    private Float temp_max;
    private Integer pressure;
    private Integer humidity;


    public AllWeather getAllWeather() {
        return allWeather;
    }

    public void setAllWeather(AllWeather allWeather) {
        this.allWeather = allWeather;
    }

    public Float getTemp() {
        return temp;
    }

    public void setTemp(Float temp) {
        this.temp = temp;
    }

    public Float getFeels_like() {
        return feels_like;
    }

    public void setFeels_like(Float feels_like) {
        this.feels_like = feels_like;
    }

    public Float getTemp_min() {
        return temp_min;
    }

    public void setTemp_min(Float temp_min) {
        this.temp_min = temp_min;
    }

    public Float getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(Float temp_max) {
        this.temp_max = temp_max;
    }

    public Integer getPressure() {
        return pressure;
    }

    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }
}
