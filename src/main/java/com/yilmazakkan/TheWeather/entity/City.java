package com.yilmazakkan.TheWeather.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "city_db")
public class City extends BaseEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "city_name")
    private String cityName;

    @JoinColumn(name = "user_id")
    @OneToMany(fetch = FetchType.LAZY)
    private List<WeatherLog> weatherLog;

    public City() {
    }

    public City(Long id, String cityName, List<WeatherLog> weatherLog) {
        super();

        this.id = id;
        this.cityName = cityName;
        this.weatherLog = weatherLog;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<WeatherLog> getWeatherLog() {
        return weatherLog;
    }

    public void setWeatherLog(List<WeatherLog> weatherLog) {
        this.weatherLog = weatherLog;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
