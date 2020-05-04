package openweatherapp.apiopgave.Model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Coord extends BaseEntity {

    private static final long serialVersionUID = 5386665629627599209L;

    @OneToOne(mappedBy = "coord")
    private AllWeather allWeather;
    private Float lon;
    private Float lat;


    public Float getLon() {
        return lon;
    }

    public void setLon(Float lon) {
        this.lon = lon;
    }

    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }
}
