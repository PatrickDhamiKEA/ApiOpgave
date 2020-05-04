package openweatherapp.apiopgave.Model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class AllWeather extends BaseEntity{

    private static final long serialVersionUID = 8112653261876639567L;

    @OneToOne(cascade = CascadeType.ALL)
    private Coord coord;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "allWeather", fetch = FetchType.EAGER)
    private List<Weather> weather = null;
    private String base;
    @OneToOne(cascade = CascadeType.ALL)
    private Main main;
    private Integer visibility;
    @OneToOne(cascade = CascadeType.ALL)
    private Wind wind;
    @OneToOne(cascade = CascadeType.ALL)
    private Clouds clouds;
    private Integer dt;
    @OneToOne(cascade = CascadeType.ALL)
    private Sys sys;
    private Integer timezone;
    @Column(name = "location_id")
    private Integer id;
    private String name;
    private Integer cod;
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "datetime_created")
    private Date datetimeCreated;


    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public Integer getDt() {
        return dt;
    }

    public void setDt(Integer dt) {
        this.dt = dt;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public Integer getTimezone() {
        return timezone;
    }

    public void setTimezone(Integer timezone) {
        this.timezone = timezone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public Date getDatetimeCreated() {
        return datetimeCreated;
    }

    public void setDatetimeCreated(Date datetimeCreated) {
        this.datetimeCreated = datetimeCreated;
    }
}
