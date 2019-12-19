package com.yilmazakkan.TheWeather.service.impl;

import com.yilmazakkan.TheWeather.entity.City;
import com.yilmazakkan.TheWeather.repository.CityDAO;
import com.yilmazakkan.TheWeather.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {


    private CityDAO cityDAO;

    @Autowired
    public CityServiceImpl(CityDAO cityDAO) {
        this.cityDAO = cityDAO;
    }


    @Override
    @Transactional
    public List<City> findAll() {
        return cityDAO.findAll();
    }

    @Override
    @Transactional
    public City findById(long id) {
        return cityDAO.findById(id);
    }

    @Override
    @Transactional
    public void save(City city) {
        cityDAO.save(city);
    }


    @Override
    @Transactional
    public City deleteById(long id) {
        cityDAO.deleteById(id);
        return null;
    }

    @Override
    public void update(long id, City city) {
        cityDAO.update(id,city);
    }
}
