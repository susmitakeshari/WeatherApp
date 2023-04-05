package com.example.weatherapp.RestAPI;


import com.example.weatherapp.info.WeatherData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherService {
    @GET("forecast")
    Call<WeatherData> getCurrentWeather(@Query("q") String city,
                                        @Query("mode") String mode,
                                        @Query("appid") String apikey,
                                        @Query("units") String unit);
}
