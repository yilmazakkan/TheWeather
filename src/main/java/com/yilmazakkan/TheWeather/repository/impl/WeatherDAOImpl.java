package com.yilmazakkan.TheWeather.repository.impl;

import com.yilmazakkan.TheWeather.entity.Weather;
import com.yilmazakkan.TheWeather.repository.WeatherDAO;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;


@Repository
public class WeatherDAOImpl implements WeatherDAO {

    // define field for entitymanager
    private EntityManager entityManager;

    // set up constructor injection
    @Autowired
    public WeatherDAOImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }


    @Override
    public void save(Weather weather) {

        // get the current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        // save user
        currentSession.saveOrUpdate(weather);

    }
}
