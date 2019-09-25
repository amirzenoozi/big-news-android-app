package ir.amirduzandeh.barmanews.view.activity;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ProgressBar;

import java.util.List;

import ir.amirduzandeh.barmanews.ApiService;
import ir.amirduzandeh.barmanews.NewsAdapter;
import ir.amirduzandeh.barmanews.R;
import ir.amirduzandeh.barmanews.datamodel.LatestNews;

public class NewsActivity extends AppCompatActivity implements ApiService.OnLatestNewsRecived {

    private static final String TAG = "NewsActivity";;
    private ApiService apiService;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        String Agency_Source = getIntent().getExtras().getString("Source");
        final ProgressBar Loading_ProgressBar = (ProgressBar) findViewById(R.id.News_Loading_ProgressBar);
        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.LatestNews_RecyclerView);
        recyclerView.setVisibility(View.INVISIBLE);
        apiService = new ApiService(this);
        apiService.getLatestNews(new ApiService.OnLatestNewsRecived() {
            @Override
            public void onRecived(List<LatestNews> LatestNEWS) {
                Loading_ProgressBar.setVisibility(View.INVISIBLE);
                recyclerView.setVisibility(View.VISIBLE);
                NewsAdapter newsAdapter = new NewsAdapter(NewsActivity.this,LatestNEWS);
                recyclerView.setLayoutManager(new LinearLayoutManager(NewsActivity.this,LinearLayoutManager.VERTICAL,false));
                recyclerView.setAdapter(newsAdapter);
            }
        },Agency_Source);
        setupToolbar();
    }

    @Override
    public void onRecived(List<LatestNews> LatestNEWS) {

    }

    private void setupToolbar(){
        Toolbar toolbar = (Toolbar) findViewById(R.id.News_Activity_Toolbar);
        toolbar.setTitleTextColor(ContextCompat.getColor(this,R.color.White_Color));
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
