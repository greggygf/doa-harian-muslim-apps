package com.bluohazard.aplikasidoaharianmuslim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void clickKritikSaran(View view) {
        Intent i = new Intent(MainMenuActivity.this, KritikSaranActivity.class);
        startActivity(i);
    }

    public void clickDzikirPagi(View view) {
        Intent i = new Intent(MainMenuActivity.this, DzikirPagiActivity.class);
        startActivity(i);
    }

    public void clickDzikirSore(View view) {
        Intent i = new Intent(MainMenuActivity.this, DzikirSoreActivity.class);
        startActivity(i);
    }
}
