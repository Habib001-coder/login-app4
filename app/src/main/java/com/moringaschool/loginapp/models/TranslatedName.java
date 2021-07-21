package com.moringaschool.loginapp.models;



import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TranslatedName {

    @SerializedName("language_name")
    @Expose
    private String languageName;
    @SerializedName("name")
    @Expose
    private String name;

    /**
     * No args constructor for use in serialization
     *
     */
    public TranslatedName() {
    }

    /**
     *
     * @param name
     * @param languageName
     */
    public TranslatedName(String languageName, String name) {
        super();
        this.languageName = languageName;
        this.name = name;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
