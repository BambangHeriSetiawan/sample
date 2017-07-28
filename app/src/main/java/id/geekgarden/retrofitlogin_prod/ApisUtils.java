package id.geekgarden.retrofitlogin_prod;

/**
 * Created by GeekGarden on 18/07/2017.
 */

public class ApisUtils {

  public static ApisTokenInterface getApisServices (){
    return ApisClient.getClient(Const.API_BASE_URL).create(ApisTokenInterface.class);
  }

}
