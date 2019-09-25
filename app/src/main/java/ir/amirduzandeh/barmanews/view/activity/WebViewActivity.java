package ir.amirduzandeh.barmanews.view.activity;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import ir.amirduzandeh.barmanews.R;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        String News_Url = getIntent().getExtras().getString("NEWS_URL");
        final WebView Web_View = (WebView) findViewById(R.id.Web_View);
        Web_View.setWebViewClient(new WebViewClient());
        Web_View.getSettings().setJavaScriptEnabled(true);
        Web_View.getSettings().setLoadWithOverviewMode(true);
        Web_View.getSettings().setUseWideViewPort(true);
        Web_View.getSettings().setBuiltInZoomControls(true);

//        Add Go Back In WebView Feather
        Web_View.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if(keyEvent.getAction() == KeyEvent.ACTION_DOWN){
                    switch (i){
                        case KeyEvent.KEYCODE_BACK:
                            if (Web_View.canGoBack()){
                                Web_View.goBack();
                            }else {
                                finish();
                            }
                            return true;
                    }
                }
                return WebViewActivity.super.onKeyDown(i,keyEvent);
            }
        });
        Web_View.loadUrl(News_Url);

        setupToolbar();
    }

    private void setupToolbar(){
        Toolbar toolbar = (Toolbar) findViewById(R.id.WebView_Activity_Toolbar);
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
