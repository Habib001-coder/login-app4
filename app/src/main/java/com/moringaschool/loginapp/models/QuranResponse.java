
package com.moringaschool.loginapp.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class QuranResponse {

    @SerializedName("chapters")
    @Expose
    private List<Chapters> chapters = null;

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
    public QuranResponse(List<Chapters> chapters) {
        super();
        this.chapters = chapters;
    }

    public List<Chapters> getChapters() {
        return chapters;
    }

    public void setChapters(List<Chapters> chapters) {
        this.chapters = chapters;
    }

}
