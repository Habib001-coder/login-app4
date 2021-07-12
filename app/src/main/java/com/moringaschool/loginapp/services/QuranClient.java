package com.moringaschool.loginapp.services;

import com.moringaschool.loginapp.Constants;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class QuranClient {
    public static Retrofit retrofit = null;

    public static QuranApi getClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(Constants.Quran_Com_Api_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


        }
 return retrofit.create(QuranApi.class);
    }



}

