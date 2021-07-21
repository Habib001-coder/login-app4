package com.moringaschool.loginapp.models;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class QuranResponse {

    @SerializedName("chapter")
    @Expose
    private Chapter chapter;

    /**
     * No args constructor for use in serialization
     *
     */
    public QuranResponse() {
    }

    /**
     *
     * @param chapter
     */
    public QuranResponse(Chapter chapter) {
        super();
        this.chapter = chapter;
    }

    public Chapter getChapter() {
        return chapter;
    }

    public void setChapter(Chapter chapter) {
        this.chapter = chapter;
    }

}
