package openweatherapp.apiopgave.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Sys extends BaseEntity {


    private static final long serialVersionUID = -7722654354126628100L;

    @OneToOne(mappedBy = "sys")
    private AllWeather allWeather;
    private Integer type;
    @Column(name = "number")
    private Integer id;
    private String country;
    private Integer sunrise;
    private Integer sunset;


    public AllWeather getAllWeather() {
        return allWeather;
    }

    public void setAllWeather(AllWeather allWeather) {
        this.allWeather = allWeather;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getSunrise() {
        return sunrise;
    }

    public void setSunrise(Integer sunrise) {
        this.sunrise = sunrise;
    }

    public Integer getSunset() {
        return sunset;
    }

    public void setSunset(Integer sunset) {
        this.sunset = sunset;
    }
}
