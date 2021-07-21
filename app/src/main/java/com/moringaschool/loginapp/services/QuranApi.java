package com.moringaschool.loginapp.services;

import com.moringaschool.loginapp.models.QuranResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface QuranApi {
    @GET("chapters/1")
    Call<QuranResponse> getChapter(
            @Query("language") String myLanguage

    );
}