
package id.geekgarden.retrofitlogin_dev.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TripadvisorAvgRating {

    @SerializedName("avg_rating")
    @Expose
    private String avgRating;
    @SerializedName("image_url")
    @Expose
    private String imageUrl;
    @SerializedName("review_count")
    @Expose
    private String reviewCount;
    @SerializedName("url")
    @Expose
    private String url;

    public String getAvgRating() {
        return avgRating;
    }

    public void setAvgRating(String avgRating) {
        this.avgRating = avgRating;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(String reviewCount) {
        this.reviewCount = reviewCount;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
