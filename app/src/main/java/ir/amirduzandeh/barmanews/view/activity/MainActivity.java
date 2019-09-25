package ir.amirduzandeh.barmanews.view.activity;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import ir.amirduzandeh.barmanews.DataGenerator;
import ir.amirduzandeh.barmanews.NewsAgencyAdapter;
import ir.amirduzandeh.barmanews.R;

public class MainActivity extends AppCompatActivity {

    private NewsAgencyAdapter NewsAgencyAdapter;
    public static String PACKAGE_NAME;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PACKAGE_NAME = getApplicationContext().getPackageName();
        setupViews();
    }
    private void setupViews(){
        setupRecyclerView();
        setupToolbar();
        setupNavigationView();
    }

    private void setupNavigationView() {
        NavigationView Navigation_View = (NavigationView) findViewById(R.id.Main_Activity_NavigationView);
        Navigation_View.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch ( item.getItemId() ){
                    case R.id.Home_Item :
                        startActivity(new Intent(MainActivity.this,MainActivity.class));
                        break;
                    case R.id.Rate_Item:
                        Intent intent = new Intent(Intent.ACTION_EDIT);
                        intent.setData(Uri.parse("bazaar://details?id="+PACKAGE_NAME));
                        intent.setPackage("com.farsitel.bazaar");
                        startActivity(intent);
                        break;
                    case R.id.About_Item:
                        String Developer_URL = "http://amirduzandeh.ir/";
                        Intent Go_To_Developer = new Intent(MainActivity.this,WebViewActivity.class);
                        Go_To_Developer.putExtra("NEWS_URL",Developer_URL);
                        startActivity( Go_To_Developer );
                        break;
                }
                return true;
            }
        });
    }

    private void setupRecyclerView(){
        RecyclerView recycler_view = (RecyclerView) findViewById(R.id.activity_main_recycler);
        recycler_view.setLayoutManager(new GridLayoutManager(this,3));
        NewsAgencyAdapter = new NewsAgencyAdapter(this);
        recycler_view.setAdapter(NewsAgencyAdapter);
        NewsAgencyAdapter.setNEWS_Agencies(DataGenerator.getNewsAgency(this));
    }

    private void setupToolbar(){
        DrawerLayout Drawer_Layout = (DrawerLayout) findViewById(R.id.Main_Activity_Drawer);
        Toolbar toolbar = (Toolbar) findViewById(R.id.Main_Activity_Toolbar);
        toolbar.setTitleTextColor(ContextCompat.getColor(this,R.color.White_Color));
        setSupportActionBar(toolbar);

        ActionBar Action_Bar = getSupportActionBar();
        Action_Bar.setDisplayHomeAsUpEnabled(true);
        Action_Bar.setHomeButtonEnabled(true);

//      Add Animation To Humberger Icon
        ActionBarDrawerToggle Drawer_Toggle = new ActionBarDrawerToggle(this,Drawer_Layout,toolbar,0,0);
        Drawer_Layout.addDrawerListener(Drawer_Toggle);
        Drawer_Toggle.syncState();
    }
}
