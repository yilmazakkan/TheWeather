package com.yilmazakkan.TheWeather.service;

import com.yilmazakkan.TheWeather.entity.Weather;
import org.json.JSONException;

import java.io.IOException;
import java.net.UnknownHostException;
import java.text.ParseException;
import java.util.List;

public interface WeatherService {

    Weather getCurrentWeather(String city) throws IOException, ParseException, JSONException, org.json.simple.parser.ParseException;
    public Weather save(Weather weather) throws IOException;
    public List<Weather> findAll();
    public List<Weather> findByCity(String city);
    public Weather findById(long id);
    public void deleteById(Long id);
}
