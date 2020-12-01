package com.example.leafdetect1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mealydew extends AppCompatActivity implements View.OnClickListener {

    Button btnBuyFert, btnGoBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mealydew);
        btnBuyFert = (Button)findViewById(R.id.buyfertilizersTextView);
        btnGoBack = (Button)findViewById(R.id.checkAnother);

        btnBuyFert.setOnClickListener(this);
        btnGoBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.equals(btnGoBack)) {
            Intent it = new Intent(Mealydew.this,Detection.class);
            startActivity(it);
        } else if(v.equals(btnBuyFert)) {
            Intent it = new Intent(Mealydew.this,BuyFertilizers.class);
            startActivity(it);
        }


    }
}
