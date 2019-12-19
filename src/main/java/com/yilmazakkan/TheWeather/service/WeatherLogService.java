package com.yilmazakkan.TheWeather.service;

import com.yilmazakkan.TheWeather.entity.WeatherLog;

import java.util.List;

public interface WeatherLogService {
    public List<WeatherLog> findAll();

    public WeatherLog findById(long id);

    public void save(WeatherLog weatherLog);

    public void deleteById(long id);
}
