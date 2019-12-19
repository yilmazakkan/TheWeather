package com.yilmazakkan.TheWeather.repository;


import com.yilmazakkan.TheWeather.entity.WeatherLog;

import java.util.List;

public interface WeatherLogDAO {
    public List<WeatherLog> findAll();

    public WeatherLog findById(long id);

    public void save(WeatherLog weatherLog);

    public void deleteById(long id);
}
