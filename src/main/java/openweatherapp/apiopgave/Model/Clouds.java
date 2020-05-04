package openweatherapp.apiopgave.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "clouds")
public class Clouds extends BaseEntity {


    private static final long serialVersionUID = -516037239624818253L;

    @OneToOne(mappedBy = "clouds")
    private AllWeather allWeather;

    @Column(name = "total")
    private int all;


    public AllWeather getAllWeather() {
        return allWeather;
    }

    public void setAllWeather(AllWeather allWeather) {
        this.allWeather = allWeather;
    }

    public int getAll() {
        return all;
    }

    public void setAll(int all) {
        this.all = all;
    }
}
