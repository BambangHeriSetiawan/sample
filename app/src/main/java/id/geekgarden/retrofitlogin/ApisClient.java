package id.geekgarden.retrofitlogin;

import static id.geekgarden.retrofitlogin.BuildConfig.DEBUG;
import static java.util.concurrent.TimeUnit.MINUTES;
import static java.util.concurrent.TimeUnit.SECONDS;
import static okhttp3.logging.HttpLoggingInterceptor.Level.BODY;
import static retrofit2.converter.gson.GsonConverterFactory.create;

import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.Retrofit.Builder;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * Created by GeekGarden on 18/07/2017.
 */

public class ApisClient {
  private static Retrofit retrofit = null;
  public static Retrofit getClient(String baseUrl){
    HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
    loggingInterceptor.setLevel(BODY);
    OkHttpClient okHttpClient = new OkHttpClient.Builder()
        .retryOnConnectionFailure(true)
        .readTimeout(5, MINUTES)
        .connectTimeout(5, MINUTES)
        .addInterceptor(loggingInterceptor)
        .build();
    if (retrofit == null){
      retrofit = new Builder()
          .baseUrl(baseUrl)
          .addConverterFactory(create())
          .client(okHttpClient)
          .build();
    }
    return retrofit;
  }
}
