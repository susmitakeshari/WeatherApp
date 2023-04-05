package com.example.weatherapp.RestAPI;


import com.example.weatherapp.info.WeatherData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public class APIManager {

    private static Weatherervice weatherervice;
    private static final String URL = "http://api.openweathermap.org/data/2.5";


    public interface Weatherervice {

        @GET("/forecast")
        Call<WeatherData> getCurrentWeather(@Query("q") String city,
                                            @Query("appid") String apikey);
    }

}