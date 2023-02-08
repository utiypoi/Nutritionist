package com.example.nutritionist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class ReadyMadeRations extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ready_made_rations);
    }

    public void returnMainActivity(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);

    }

    public void openRationDecline(View view) {
        Intent intent = new Intent(this,DeclineRationActivity.class);
        startActivity(intent);
    }
}