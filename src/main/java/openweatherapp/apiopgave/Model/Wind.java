package openweatherapp.apiopgave.Model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Wind extends BaseEntity{

    private static final long serialVersionUID = 755017996686477518L;

    @OneToOne(mappedBy = "wind")
    private AllWeather allWeather;
    private Float speed;
    private Integer deg;


    public AllWeather getAllWeather() {
        return allWeather;
    }

    public void setAllWeather(AllWeather allWeather) {
        this.allWeather = allWeather;
    }

    public Float getSpeed() {
        return speed;
    }

    public void setSpeed(Float speed) {
        this.speed = speed;
    }

    public Integer getDeg() {
        return deg;
    }

    public void setDeg(Integer deg) {
        this.deg = deg;
    }
}
