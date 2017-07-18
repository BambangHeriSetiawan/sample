
package id.geekgarden.retrofitlogin.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pagination {

    @SerializedName("total_found")
    @Expose
    private Integer totalFound;
    @SerializedName("current_page")
    @Expose
    private Integer currentPage;
    @SerializedName("offset")
    @Expose
    private String offset;
    @SerializedName("lastPage")
    @Expose
    private Integer lastPage;

    public Integer getTotalFound() {
        return totalFound;
    }

    public void setTotalFound(Integer totalFound) {
        this.totalFound = totalFound;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public Integer getLastPage() {
        return lastPage;
    }

    public void setLastPage(Integer lastPage) {
        this.lastPage = lastPage;
    }

}
