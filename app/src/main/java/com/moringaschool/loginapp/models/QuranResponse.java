package com.moringaschool.loginapp.models;


import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class QuranResponse {

    @SerializedName("chapters")
    @Expose
    private List<Chapter> chapters = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public QuranResponse() {
    }

    /**
     *
     * @param chapters
     */
    public QuranResponse(List<Chapter> chapters) {
        super();
        this.chapters = chapters;
    }

    public List<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(List<Chapter> chapters) {
        this.chapters = chapters;
    }

}

