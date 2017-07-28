
package id.geekgarden.retrofitlogin_dev.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SearchQueries {

    @SerializedName("q")
    @Expose
    private String q;
    @SerializedName("uid")
    @Expose
    private String uid;
    @SerializedName("startdate")
    @Expose
    private String startdate;
    @SerializedName("enddate")
    @Expose
    private String enddate;
    @SerializedName("night")
    @Expose
    private String night;
    @SerializedName("room")
    @Expose
    private Integer room;
    @SerializedName("adult")
    @Expose
    private String adult;
    @SerializedName("child")
    @Expose
    private Integer child;
    @SerializedName("sort")
    @Expose
    private Boolean sort;
    @SerializedName("minstar")
    @Expose
    private Integer minstar;
    @SerializedName("maxstar")
    @Expose
    private Integer maxstar;
    @SerializedName("minprice")
    @Expose
    private String minprice;
    @SerializedName("maxprice")
    @Expose
    private String maxprice;
    @SerializedName("distance")
    @Expose
    private Integer distance;

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public String getNight() {
        return night;
    }

    public void setNight(String night) {
        this.night = night;
    }

    public Integer getRoom() {
        return room;
    }

    public void setRoom(Integer room) {
        this.room = room;
    }

    public String getAdult() {
        return adult;
    }

    public void setAdult(String adult) {
        this.adult = adult;
    }

    public Integer getChild() {
        return child;
    }

    public void setChild(Integer child) {
        this.child = child;
    }

    public Boolean getSort() {
        return sort;
    }

    public void setSort(Boolean sort) {
        this.sort = sort;
    }

    public Integer getMinstar() {
        return minstar;
    }

    public void setMinstar(Integer minstar) {
        this.minstar = minstar;
    }

    public Integer getMaxstar() {
        return maxstar;
    }

    public void setMaxstar(Integer maxstar) {
        this.maxstar = maxstar;
    }

    public String getMinprice() {
        return minprice;
    }

    public void setMinprice(String minprice) {
        this.minprice = minprice;
    }

    public String getMaxprice() {
        return maxprice;
    }

    public void setMaxprice(String maxprice) {
        this.maxprice = maxprice;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

}
