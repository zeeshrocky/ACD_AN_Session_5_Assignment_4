package com.example.zeeshan.welcome_username;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView tvwelcomeuser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tvwelcomeuser= (TextView) findViewById(R.id.tv_welcomeuser);
        Bundle userdata = getIntent().getExtras();
        if (userdata==null){
            return;
        }
        else {
            String usermessage = userdata.getString("usermessage");
            tvwelcomeuser.setText("WELCOME "+usermessage);
            tvwelcomeuser.setVisibility(View.VISIBLE);

        }


    }
}