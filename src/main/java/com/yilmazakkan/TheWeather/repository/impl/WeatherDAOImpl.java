package com.yilmazakkan.TheWeather.repository.impl;

import com.yilmazakkan.TheWeather.entity.User;
import com.yilmazakkan.TheWeather.entity.Weather;
import com.yilmazakkan.TheWeather.repository.WeatherDAO;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.List;
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
    public void save(Weather weather) throws IOException {

        // get the current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        String systemipaddress = "";

            URL url_name = new URL("http://bot.whatismyipaddress.com");

            BufferedReader sc =
                    new BufferedReader(new InputStreamReader(url_name.openStream()));

            // reads system IPAddress
            systemipaddress = sc.readLine().trim();
            

            weather.setIp(systemipaddress);

        // save user

        currentSession.saveOrUpdate(weather);

    }

    @Override
    public List<Weather> findAll() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Weather> theQuery = currentSession.createQuery("select a from Weather a", Weather.class);
        List<Weather> weathers = theQuery.getResultList();
        return weathers;
    }

    @Override
    public Weather findById(long id) {
        // get the current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        // get the user
        Weather weather =
                currentSession.get(Weather.class, id);

        // return the user
        return weather;
    }

    @Override
    public List<Weather> findByCity(String city) {
        Session currentSession = entityManager.unwrap(Session.class);
        // create a query
        Query<Weather> theQuery =
                currentSession.createQuery("select a from Weather a where a.city =: city ", Weather.class);
        theQuery.setParameter("city", city);
        // execute query and get result list
        List<Weather> weathers = theQuery.getResultList();
        // return the results
        return weathers;
    }
}
