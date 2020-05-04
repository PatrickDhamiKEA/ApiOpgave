package openweatherapp.apiopgave.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Weather extends BaseEntity{

    private static final long serialVersionUID = 6737730124439714032L;

    @ManyToOne
    @JoinColumn(name = "allWeather_id")
    private AllWeather allWeather;

    @Column(name = "name")
    private Integer id;
    private String main;
    private String description;
    private String icon;


    public AllWeather getAllWeather() {
        return allWeather;
    }

    public void setAllWeather(AllWeather allWeather) {
        this.allWeather = allWeather;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
