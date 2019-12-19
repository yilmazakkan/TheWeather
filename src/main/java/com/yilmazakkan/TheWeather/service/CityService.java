package com.yilmazakkan.TheWeather.service;

import com.yilmazakkan.TheWeather.entity.City;

import java.util.List;

public interface CityService {
    public List<City> findAll();

    public City findById(long id);

    public void save(City city);

    public City deleteById(long id);

    public void update(long id, City city);
}
