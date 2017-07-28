package id.geekgarden.retrofitlogin_dev;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import id.geekgarden.retrofitlogin_dev.model.Diagnostic;
import id.geekgarden.retrofitlogin_dev.model.ResponHotel;
import id.geekgarden.retrofitlogin_dev.model.Result;
import id.geekgarden.retrofitlogin_dev.model.TokenRespons;
import java.util.ArrayList;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
  private ApisTokenInterface apisTokenInterfaceService;
  @BindView(R.id.tvToken)TextView tvToken;
  private RecyclerView rcvHolet;
  private RecyclerView.LayoutManager llm;
  private RecyclerView.ItemDecoration itemDecoration;
  private ArrayList<Result> rHotel;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);
    apisTokenInterfaceService = ApisUtils.getApisServices();
    rHotel = new ArrayList<>();

    rcvHolet = (RecyclerView) findViewById(R.id.rcvHotel);

    llm = new LinearLayoutManager(this);
    itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
    rcvHolet.setHasFixedSize(true);
    rcvHolet.setLayoutManager(llm);
    rcvHolet.addItemDecoration(itemDecoration);
    //rcvHolet.setAdapter(hotelAdapter);

    apisTokenInterfaceService
        .getToken(Const.API_BASE_URL_PARAMENTER_METHOD_GET_TOKEN,Const.API_SCREAT_KEY,Const.API_BASE_URL_OUTPUT).enqueue(new Callback<TokenRespons>() {
      @Override
      public void onResponse(Call<TokenRespons> call, Response<TokenRespons> response) {
        TokenRespons data = response.body();
        tvToken.setText(data.getToken());
        populatedataHotel(data);
      }

      @Override
      public void onFailure(Call<TokenRespons> call, Throwable t) {
        Log.e("TAG", "onFailure" +t.getMessage() );
      }
    });
  }

  private void populatedataHotel(TokenRespons data) {
    String Q,token,output,starDate,endDate,sDate,eDate;;
    Integer night = null,room=null,adult=null,child=null;

    Q= "jakarta";
    token = data.getToken();
    output = Const.API_BASE_URL_OUTPUT;
    sDate = "2017-08-12";
    eDate = "2017-08-12";
    room = 1;
    night = 1;
    adult = 1;
    child = 2;
    apisTokenInterfaceService.getHotel(Q,sDate,eDate,room,night,adult,child,token,output).enqueue(
        new Callback<ResponHotel>() {
          @Override
          public void onResponse(Call<ResponHotel> call, Response<ResponHotel> response) {
            ResponHotel responHotel = response.body();
            Diagnostic diagnostic = responHotel.getDiagnostic();
            int rSize = responHotel.getResults().getResult().size();
            for (int a = 0;a<rSize;a++){
              Result result = responHotel.getResults().getResult().get(a);
              Log.e("MainActivity", "onResponse : " + result.getName());
              Log.e("MainActivity", "onResponse : " + result.getAddress());
              Log.e("MainActivity", "onResponse : " + result.getPrice());
              Log.e("MainActivity", "onResponse : " + result.getTotalPrice());

            }


          }

          @Override
          public void onFailure(Call<ResponHotel> call, Throwable t) {

          }
        });
  }
}
