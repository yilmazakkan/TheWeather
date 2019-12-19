package com.yilmazakkan.TheWeather.controller;

import com.yilmazakkan.TheWeather.entity.Weather;
import com.yilmazakkan.TheWeather.service.WeatherService;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.text.ParseException;


@RestController
public class WeatherController {

    private final WeatherService weatherService;

    @Autowired
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }
  //  localhost:9000/weather/tokyo
    @RequestMapping(value = "/weather/{city}", method = {RequestMethod.GET})
    public Weather currentWeather(@PathVariable String city) throws IOException, ParseException, JSONException, org.json.simple.parser.ParseException {

        Weather wt = weatherService.getCurrentWeather(city);
        weatherService.save(wt);
        return  wt;
    }


    }



