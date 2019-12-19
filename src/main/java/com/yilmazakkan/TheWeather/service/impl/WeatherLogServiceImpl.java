package com.yilmazakkan.TheWeather.service.impl;

import com.yilmazakkan.TheWeather.entity.WeatherLog;
import com.yilmazakkan.TheWeather.repository.WeatherLogDAO;
import com.yilmazakkan.TheWeather.service.WeatherLogService;

import java.util.List;

public class WeatherLogServiceImpl implements WeatherLogService {

    private WeatherLogDAO weatherLogDAO;

    public WeatherLogServiceImpl(WeatherLogDAO weatherLogDAO) {
        this.weatherLogDAO = weatherLogDAO;
    }

    @Override
    public List<WeatherLog> findAll() {
        return weatherLogDAO.findAll();
    }

    @Override
    public WeatherLog findById(long id) {
        return weatherLogDAO.findById(id);
    }

    @Override
    public void save(WeatherLog weatherLog) {
        weatherLogDAO.save(weatherLog);

    }

    @Override
    public void deleteById(long id) {
        weatherLogDAO.deleteById(id);
    }
}
