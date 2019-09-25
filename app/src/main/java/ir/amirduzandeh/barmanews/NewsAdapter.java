package ir.amirduzandeh.barmanews;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import ir.amirduzandeh.barmanews.datamodel.LatestNews;
import ir.amirduzandeh.barmanews.view.activity.NewsActivity;
import ir.amirduzandeh.barmanews.view.activity.WebViewActivity;


/**
 * Created by Dozandeee on 27/03/17.
 */

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {

    private static final String TAG = "NewsAdapter";
    private Context context;
    private List<LatestNews> latestNEWS;

    public NewsAdapter(Context context, List<LatestNews> LatestNEWS){

        this.context = context;
        latestNEWS = LatestNEWS;
    }

    @Override
    public NewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View View = LayoutInflater.from(context).inflate(R.layout.layout_news,parent,false);
        return new NewsViewHolder(View);
    }

    @Override
    public void onBindViewHolder(NewsViewHolder holder, int position) {
        LatestNews LatestNews = latestNEWS.get(position);
        Picasso.with(context).load(LatestNews.getNewsImageURL()).placeholder(R.drawable.news_placeholder).into(holder.NewsImage);
        holder.TitleNews.setText(LatestNews.getNewsTitle());
        holder.DesNews.setText(LatestNews.getDescription());
        holder.BindNews(latestNEWS.get(position));
    }

    @Override
    public int getItemCount() {
        return latestNEWS.size();
    }

    public class NewsViewHolder extends RecyclerView.ViewHolder{

        private ImageView NewsImage;
        private TextView TitleNews;
        private TextView DesNews;
        private ImageButton Share_Button;

        public NewsViewHolder(View itemView) {
            super(itemView);
            NewsImage = (ImageView) itemView.findViewById(R.id.NEWS_Item_Image);
            TitleNews = (TextView) itemView.findViewById(R.id.NEWS_Item_Title);
            DesNews = (TextView) itemView.findViewById(R.id.NEWS_Item_Des);
            Share_Button = (ImageButton) itemView.findViewById(R.id.Share_Button);
        }
        public void BindNews( final LatestNews NEWS ){
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.i(TAG, "onClick: " + NEWS.getNewsURL());
                    String NEWS_Url = NEWS.getNewsURL();
                    Intent intent = new Intent( itemView.getContext() , WebViewActivity.class);
                    intent.putExtra("NEWS_URL",NEWS_Url);
                    itemView.getContext().startActivity(intent);
                }
            });

            Share_Button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent Share_intent = new Intent(Intent.ACTION_SEND);
                    Share_intent.setType("text/plain");
                    Share_intent.putExtra(Intent.EXTRA_TEXT , NEWS.getNewsURL());
                    itemView.getContext().startActivity(Intent.createChooser(Share_intent,"Share With Friends !"));
                }
            });
        }
    }
}
