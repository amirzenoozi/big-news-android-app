package ir.amirduzandeh.barmanews.view.activity;

import android.content.Intent;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import ir.amirduzandeh.barmanews.R;

public class FeedBackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_back);
        setupToolbar();
        SendMail();
    }
    private void setupToolbar(){
        Toolbar toolbar = (Toolbar) findViewById(R.id.Feed_Back_Activity_Toolbar);
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

    private void SendMail(){
        Button Send_Button = (Button) findViewById(R.id.Send_FeedBack);
        final TextInputEditText FeedBack_Subject = (TextInputEditText) findViewById(R.id.Feed_Back_Subject);
        final TextInputEditText FeedBack_Body = (TextInputEditText) findViewById(R.id.Feed_Back_Body);

        Send_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Subject = FeedBack_Subject.getText().toString();
                String Body = FeedBack_Body.getText().toString();
                String Receiver = "amirzenoozi72@gmail.com";

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("message/rfc822");
                intent.putExtra(Intent.EXTRA_EMAIL, Receiver);
                intent.putExtra(Intent.EXTRA_SUBJECT, Subject);
                intent.putExtra(Intent.EXTRA_TEXT, Body);
                try{
                    startActivity( Intent.createChooser(intent,"Send Email...") );
                }catch (android.content.ActivityNotFoundException ex){
                    CoordinatorLayout Coordinator_Layout = (CoordinatorLayout) findViewById(R.id.activity_feed_back);
                    Snackbar.make( Coordinator_Layout,"There are no E-mail Clients Installed",Snackbar.LENGTH_LONG ).show();
                }
            }
        });

    }
}
