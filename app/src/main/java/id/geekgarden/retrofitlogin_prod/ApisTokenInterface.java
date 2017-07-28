package id.geekgarden.retrofitlogin_prod;

import id.geekgarden.retrofitlogin_prod.model.ResponHotel;
import id.geekgarden.retrofitlogin_prod.model.TokenRespons;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by GeekGarden on 18/07/2017.
 */

public interface ApisTokenInterface {
  @GET(Const.PARAMENTER_TOKEN)
  Call<TokenRespons> getToken(@Query("method")String method,@Query("secretkey")String key,@Query("output") String output );
  @GET(Const.PARAMENTER_SEARCH_HOTEL)
  Call<ResponHotel> getHotel(
      @Query("q")String q,
      @Query("startdate")String startdate,
      @Query("enddate")String enddate,
      @Query("night") Integer night,
      @Query("room")Integer room,
      @Query("adult") Integer adult,
      @Query("child")Integer child,
      @Query("token")String token,
      @Query("output") String output
  );
}
