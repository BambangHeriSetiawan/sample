package id.geekgarden.retrofitlogin.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by GeekGarden on 18/07/2017.
 */

public class TokenRespons {
  public TokenRespons(){}
  @SerializedName("diagnostic")
  @Expose
  private Diagnostic diagnostic;
  @SerializedName("output_type")
  @Expose
  private String outputType;
  @SerializedName("login_status")
  @Expose
  private String loginStatus;
  @SerializedName("token")
  @Expose
  private String token;

  public TokenRespons(Diagnostic diagnostic, String outputType, String loginStatus,
      String token) {
    this.diagnostic = diagnostic;
    this.outputType = outputType;
    this.loginStatus = loginStatus;
    this.token = token;
  }

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
