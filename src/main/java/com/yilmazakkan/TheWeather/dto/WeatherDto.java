package com.yilmazakkan.TheWeather.dto;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class WeatherDto {


    private Long id;

    private String city;
    private String country;
    private String description;
    private String temperature;
    private String humidity;
    private String pressure;
    private String weatherID;
    private String sunriseTime;
    private String sunsetTime;
    private String date;
    private String ip;
    private Long requestTime;
    private String result;
    private String icon;

    public WeatherDto(Long id, String city, String country, String description, String temperature, String humidity, String pressure, String weatherID, String sunriseTime, String sunsetTime, String date, String ip, Long requestTime, String result, String icon) {
        this.id = id;
        this.city = city;
        this.country = country;
        this.description = description;
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.weatherID = weatherID;
        this.sunriseTime = sunriseTime;
        this.sunsetTime = sunsetTime;
        this.date = date;
        this.ip = ip;
        this.requestTime = requestTime;
        this.result = result;
        this.icon = icon;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getWeatherID() {
        return weatherID;
    }

    public void setWeatherID(String weatherID) {
        this.weatherID = weatherID;
    }

    public String getSunriseTime() {
        return sunriseTime;
    }

    public void setSunriseTime(String sunriseTime) {
        this.sunriseTime = sunriseTime;
    }

    public String getSunsetTime() {
        return sunsetTime;
    }

    public void setSunsetTime(String sunsetTime) {
        this.sunsetTime = sunsetTime;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Long getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Long requestTime) {
        this.requestTime = requestTime;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "WeatherDto{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", description='" + description + '\'' +
                ", temperature='" + temperature + '\'' +
                ", humidity='" + humidity + '\'' +
                ", pressure='" + pressure + '\'' +
                ", weatherID='" + weatherID + '\'' +
                ", sunriseTime='" + sunriseTime + '\'' +
                ", sunsetTime='" + sunsetTime + '\'' +
                ", date='" + date + '\'' +
                ", ip='" + ip + '\'' +
                ", requestTime=" + requestTime +
                ", result='" + result + '\'' +
                ", icon='" + icon + '\'' +
                '}';
    }


}
