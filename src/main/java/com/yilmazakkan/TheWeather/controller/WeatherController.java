package com.yilmazakkan.TheWeather.controller;

import com.yilmazakkan.TheWeather.entity.User;
import com.yilmazakkan.TheWeather.entity.Weather;
import com.yilmazakkan.TheWeather.service.WeatherService;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;


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
        Weather wt = new Weather();
        long startTime = System.currentTimeMillis();
        try {


            wt = weatherService.getCurrentWeather(city);


        } catch (Exception e) {
        }
        long elapsedTime = System.currentTimeMillis() - startTime;
        wt.setRequestTime(elapsedTime);
        System.out.print("------------------------------------------------- > " + elapsedTime);
        if (wt.getCountry() != null) {
            wt.setResult("Başarılı");
        } else {
            wt.setResult("Başarısız");
        }
        wt.setCity(city);
        weatherService.save(wt);
        return wt;

    }

    @RequestMapping(value = "/weathers", method = {RequestMethod.GET})
    public List<Weather> getWeatherLogbyAll() {

        return weatherService.findAll();

    }
    @RequestMapping(value = "/weathers/{id}", method = {RequestMethod.GET})
    public Weather getWeatherLogById(@PathVariable long id) {
        Weather weather = weatherService.findById(id);
        return weather;
    }
    @GetMapping("/weathers/log/{city}")
    public List<Weather> getWeatherLogByCity(@PathVariable String city) {
        List<Weather> weather = weatherService.findByCity(city);
        if (weather == null) {
            throw new RuntimeException("City not found - " + city);
        }
        return weather;
    }
}



