package com.example.discard;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import androidx.core.app.ActivityCompat;
//import kotlinx.android.synthetic.main.activity_firstpage.*;
import android.os.Bundle;

public class Welcoming_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcoming);

        button1.setOnClickListeener
        {
            startActivity(Intent(this, lobbyActivity::class.java));
            singleUser=true;
        }
        button2.setOnClickListeener
        {
            startActivity(Intent(this, lobbyActivity::class.java));
            singleUser=true;
        }
    }
}