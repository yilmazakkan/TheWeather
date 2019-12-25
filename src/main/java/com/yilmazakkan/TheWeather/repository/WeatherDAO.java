package com.yilmazakkan.TheWeather.repository;


import com.yilmazakkan.TheWeather.entity.Weather;

import java.io.IOException;
import java.net.UnknownHostException;

public interface WeatherDAO {

    public void save(Weather weather) throws IOException;

}
