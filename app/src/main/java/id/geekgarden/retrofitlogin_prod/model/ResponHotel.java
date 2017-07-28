
package id.geekgarden.retrofitlogin_prod.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponHotel {

    @SerializedName("diagnostic")
    @Expose
    private Diagnostic diagnostic;
    @SerializedName("output_type")
    @Expose
    private String outputType;
    @SerializedName("search_queries")
    @Expose
    private SearchQueries searchQueries;
    @SerializedName("results")
    @Expose
    private Results results;
    @SerializedName("pagination")
    @Expose
    private Pagination pagination;
    @SerializedName("login_status")
    @Expose
    private String loginStatus;
    @SerializedName("token")
    @Expose
    private String token;

    public Diagnostic getDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(Diagnostic diagnostic) {
        this.diagnostic = diagnostic;
    }

    public String getOutputType() {
        return outputType;
    }

    public void setOutputType(String outputType) {
        this.outputType = outputType;
    }

    public SearchQueries getSearchQueries() {
        return searchQueries;
    }

    public void setSearchQueries(SearchQueries searchQueries) {
        this.searchQueries = searchQueries;
    }

    public Results getResults() {
        return results;
    }

    public void setResults(Results results) {
        this.results = results;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public String getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(String loginStatus) {
        this.loginStatus = loginStatus;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

}
