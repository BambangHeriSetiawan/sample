
package id.geekgarden.retrofitlogin_prod.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Diagnostic {

    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("elapsetime")
    @Expose
    private String elapsetime;
    @SerializedName("memoryusage")
    @Expose
    private String memoryusage;
    @SerializedName("unix_timestamp")
    @Expose
    private Integer unixTimestamp;
    @SerializedName("confirm")
    @Expose
    private String confirm;
    @SerializedName("lang")
    @Expose
    private String lang;
    @SerializedName("currency")
    @Expose
    private String currency;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getElapsetime() {
        return elapsetime;
    }

    public void setElapsetime(String elapsetime) {
        this.elapsetime = elapsetime;
    }

    public String getMemoryusage() {
        return memoryusage;
    }

    public void setMemoryusage(String memoryusage) {
        this.memoryusage = memoryusage;
    }

    public Integer getUnixTimestamp() {
        return unixTimestamp;
    }

    public void setUnixTimestamp(Integer unixTimestamp) {
        this.unixTimestamp = unixTimestamp;
    }

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

}
