package com.yilmazakkan.TheWeather.repository;


import com.yilmazakkan.TheWeather.entity.City;

import java.util.List;

public interface CityDAO {
    public List<City> findAll();

    public City findById(long id);

    public void save(City city);

    public void deleteById(long id);

    public City update(long id, City city);
}
