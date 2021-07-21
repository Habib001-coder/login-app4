package com.moringaschool.loginapp.services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.moringaschool.loginapp.Constants;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class QuranClient {
    public static Retrofit retrofit = null;
    private static Gson gson = new GsonBuilder()
            .setLenient()
            .create();

//   pr Gson gson = new GsonBuilder()
//            .setLenient()
//            .create();
    public static QuranApi getClient() {

        if (retrofit == null) {

            retrofit = new Retrofit.Builder()
                    .baseUrl(Constants.Quran_Com_Api_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();


        }
 return (QuranApi) retrofit.create(QuranApi.class);
    }
}

