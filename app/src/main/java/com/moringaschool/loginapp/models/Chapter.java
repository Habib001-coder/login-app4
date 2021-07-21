package com.moringaschool.loginapp.models;



import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Chapter {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("revelation_place")
    @Expose
    private String revelationPlace;
    @SerializedName("revelation_order")
    @Expose
    private Integer revelationOrder;
    @SerializedName("bismillah_pre")
    @Expose
    private Boolean bismillahPre;
    @SerializedName("name_simple")
    @Expose
    private String nameSimple;
    @SerializedName("name_complex")
    @Expose
    private String nameComplex;
    @SerializedName("name_arabic")
    @Expose
    private String nameArabic;
    @SerializedName("verses_count")
    @Expose
    private Integer versesCount;
    @SerializedName("pages")
    @Expose
    private List<Integer> pages = null;
    @SerializedName("translated_name")
    @Expose
    private TranslatedName translatedName;

    /**
     * No args constructor for use in serialization
     *
     */
    public Chapter() {
    }

    /**
     *
     * @param nameSimple
     * @param pages
     * @param revelationOrder
     * @param nameArabic
     * @param nameComplex
     * @param bismillahPre
     * @param versesCount
     * @param id
     * @param revelationPlace
     * @param translatedName
     */
    public Chapter(Integer id, String revelationPlace, Integer revelationOrder, Boolean bismillahPre, String nameSimple, String nameComplex, String nameArabic, Integer versesCount, List<Integer> pages, TranslatedName translatedName) {
        super();
        this.id = id;
        this.revelationPlace = revelationPlace;
        this.revelationOrder = revelationOrder;
        this.bismillahPre = bismillahPre;
        this.nameSimple = nameSimple;
        this.nameComplex = nameComplex;
        this.nameArabic = nameArabic;
        this.versesCount = versesCount;
        this.pages = pages;
        this.translatedName = translatedName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRevelationPlace() {
        return revelationPlace;
    }

    public void setRevelationPlace(String revelationPlace) {
        this.revelationPlace = revelationPlace;
    }

    public Integer getRevelationOrder() {
        return revelationOrder;
    }

    public void setRevelationOrder(Integer revelationOrder) {
        this.revelationOrder = revelationOrder;
    }

    public Boolean getBismillahPre() {
        return bismillahPre;
    }

    public void setBismillahPre(Boolean bismillahPre) {
        this.bismillahPre = bismillahPre;
    }

    public String getNameSimple() {
        return nameSimple;
    }

    public void setNameSimple(String nameSimple) {
        this.nameSimple = nameSimple;
    }

    public String getNameComplex() {
        return nameComplex;
    }

    public void setNameComplex(String nameComplex) {
        this.nameComplex = nameComplex;
    }

    public String getNameArabic() {
        return nameArabic;
    }

    public void setNameArabic(String nameArabic) {
        this.nameArabic = nameArabic;
    }

    public Integer getVersesCount() {
        return versesCount;
    }

    public void setVersesCount(Integer versesCount) {
        this.versesCount = versesCount;
    }

    public List<Integer> getPages() {
        return pages;
    }

    public void setPages(List<Integer> pages) {
        this.pages = pages;
    }

    public TranslatedName getTranslatedName() {
        return translatedName;
    }

    public void setTranslatedName(TranslatedName translatedName) {
        this.translatedName = translatedName;
    }

}