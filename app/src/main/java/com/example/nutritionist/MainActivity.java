package com.example.nutritionist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openPersonalAccount(View view) {
        Intent intent = new Intent(this,PersonalAccount.class);
        startActivity(intent);
    }

    public void openReadyMadeRations(View view) {
        Intent intent = new Intent(this,ReadyMadeRations.class);
        startActivity(intent);
    }

    public void openActivityDiary(View view) {
        Intent intent = new Intent(this,ActivityDiary.class);
        startActivity(intent);
    }
}