package id.geekgarden.retrofitlogin.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import id.geekgarden.retrofitlogin.R;

/**
 * Created by GeekGarden on 18/07/2017.
 */

public class HotelsViewholder extends RecyclerView.ViewHolder {
  public TextView tvNameHotel;
  public ImageView imgHotle;
  public HotelsViewholder(View itemView) {
    super(itemView);
    tvNameHotel = itemView.findViewById(R.id.tvNamaHotel);
    imgHotle = itemView.findViewById(R.id.imgHotel);

  }
}
