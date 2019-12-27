package com.yilmazakkan.TheWeather.repository;


import com.yilmazakkan.TheWeather.entity.Weather;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.List;

public interface WeatherDAO {

    public void save(Weather weather) throws IOException;

    public List<Weather> findAll();

    public Weather findById(long id);

    public List<Weather> findByCity(String city);
}
