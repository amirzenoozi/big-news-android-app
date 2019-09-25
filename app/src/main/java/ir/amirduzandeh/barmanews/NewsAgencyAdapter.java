package ir.amirduzandeh.barmanews;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import ir.amirduzandeh.barmanews.datamodel.NewsAgency;

/**
 * Created by Dozandeee on 28/03/17.
 */

public class NewsAgencyAdapter extends RecyclerView.Adapter<NewsAgencyAdapter.NewsAgencyViewHolder> {

    private Context context;
    private List<NewsAgency> NEWS_Agencies = new ArrayList<>();
    private Typeface Roboto;
    public NewsAgencyAdapter(Context context){
        this.context = context;
        Roboto = Typeface.createFromAsset(context.getAssets(),"fonts/roboto.ttf");
    }
    public void setNEWS_Agencies(List<NewsAgency> NEWS_Agencies){
        this.NEWS_Agencies = NEWS_Agencies;
        notifyDataSetChanged();
    }

    @Override
    public NewsAgencyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new NewsAgencyViewHolder(LayoutInflater.from(context).inflate(R.layout.layout_agencies,parent,false),Roboto);
    }

    @Override
    public void onBindViewHolder(NewsAgencyViewHolder holder, int position) {
        holder.bindNewsAgency(NEWS_Agencies.get(position));
    }

    @Override
    public int getItemCount() {
        return NEWS_Agencies.size();
    }

    public static class NewsAgencyViewHolder extends RecyclerView.ViewHolder {
        private ImageView Agency_Logo;
        public NewsAgencyViewHolder(View itemView,Typeface Roboto){
            super(itemView);
            Agency_Logo = (ImageView) itemView.findViewById(R.id.Agency_Item_Logo);
        }
        public void bindNewsAgency(final NewsAgency NEWS_Agency){
            Picasso.with(itemView.getContext()).load(NEWS_Agency.getAgency_Logo()).placeholder(R.drawable.agency_placeholder).into(Agency_Logo);
            itemView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    Intent Next = new Intent(itemView.getContext(),NEWS_Agency.getDestiniation_Activity());
                    String Agency_Source = NEWS_Agency.getAgency_Source();
                    Next.putExtra("Source", Agency_Source );
                    itemView.getContext().startActivity( Next );
                }
            });
        }
    }
}
