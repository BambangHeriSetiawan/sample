package id.geekgarden.retrofitlogin.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import id.geekgarden.retrofitlogin.R;
import id.geekgarden.retrofitlogin.model.Result;
import java.util.List;

/**
 * Created by GeekGarden on 18/07/2017.
 */

public class HotelsAdapter extends RecyclerView.Adapter<HotelsAdapter.ViewHolder> {
  private List<Result> mHotel;
  private Context mContext;

  public HotelsAdapter(List<Result> mHotel, Context mContext) {
    this.mHotel = mHotel;
    this.mContext = mContext;
  }



  @Override
  public HotelsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    Context context = parent.getContext();
    LayoutInflater inflater = LayoutInflater.from(context);
    View view = inflater.inflate(R.layout.rcv_hotel,parent,false);
    ViewHolder viewHolder = new ViewHolder(view);
    return viewHolder;
  }

  @Override
  public void onBindViewHolder(HotelsAdapter.ViewHolder holder, int position) {
    Result result = mHotel.get(position);
    TextView tvNameHolet = holder.tvNameHotel;
    ImageView imgHotel = holder.imgHotle;
    tvNameHolet.setText(result.getName());
    if (result.getPhotoPrimary()!=null){
      Glide.with(mContext).load(result.getPhotoPrimary()).into(imgHotel);
    }

  }

  @Override
  public int getItemCount() {
    return mHotel.size();
  }

  public class ViewHolder extends RecyclerView.ViewHolder {
    public TextView tvNameHotel;
    public ImageView imgHotle;
    public ViewHolder(View itemView) {
      super(itemView);
      tvNameHotel = itemView.findViewById(R.id.tvNamaHotel);
      imgHotle = itemView.findViewById(R.id.imgHotel);
    }
  }
}
