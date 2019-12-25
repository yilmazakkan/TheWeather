package com.yilmazakkan.TheWeather.service.impl;

import com.yilmazakkan.TheWeather.entity.Weather;
import com.yilmazakkan.TheWeather.repository.WeatherDAO;
import com.yilmazakkan.TheWeather.service.JsonWeatherParser;
import com.yilmazakkan.TheWeather.service.WeatherService;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.text.ParseException;


@Service
public class WeatherServiceImpl implements WeatherService {
    private final JsonWeatherParser parser = new JsonWeatherParser();
    @Value("${api.key}")
    private String ApiKey;
    @Autowired
    private WeatherDAO weatherDAO;

    @Override
    public Weather getCurrentWeather(String city)
            throws IOException, ParseException, JSONException, org.json.simple.parser.ParseException {
        return getWeatherFromJson(getJsonFromServer(city));
    }


    public Weather save(Weather weather) throws IOException {
        weatherDAO.save(weather);
        return weather;
    }


    private Weather getWeatherFromJson(String json)
            throws ParseException, org.json.simple.parser.ParseException, JSONException {
        parser.setJsonToParsing(json);
        return parser.getWeather();
    }

    private String getJsonFromServer(String city) throws IOException {

        String result = "";

        URL url = new URL(
                "http://api.openweathermap.org/data/2.5/weather?q=" + city + "&APPID=" + ApiKey);
        URLConnection urlConnection = url.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            result += result.concat(inputLine);
        }
        in.close();
        return result;
    }




}
