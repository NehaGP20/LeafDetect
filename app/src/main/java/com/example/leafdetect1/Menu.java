package com.example.leafdetect1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity implements View.OnClickListener{

    Button btnDesc, btnBioFea, btnSeed, btnCucm, btnDisease, btnPest, btnFertilizer, btnChem, btnDetec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnDesc = (Button)findViewById(R.id.btn_desc);
        btnBioFea = (Button)findViewById(R.id.btn_biofea);
        btnSeed = (Button)findViewById(R.id.btn_seeds);
        btnCucm = (Button)findViewById(R.id.btn_cucm);
        btnDisease = (Button)findViewById(R.id.btn_disease);
        btnPest = (Button)findViewById(R.id.btn_pest);
        btnFertilizer = (Button)findViewById(R.id.btn_fert);
        btnChem = (Button)findViewById(R.id.btn_chem);
        btnDetec = (Button)findViewById(R.id.btn_detec);

        btnDesc.setOnClickListener(this);
        btnBioFea.setOnClickListener(this);
        btnSeed.setOnClickListener(this);
        btnCucm.setOnClickListener(this);
        btnDisease.setOnClickListener(this);
        btnPest.setOnClickListener(this);
        btnFertilizer.setOnClickListener(this);
        btnChem.setOnClickListener(this);
        btnDetec.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.equals(btnDesc)) {
            Intent it = new Intent(Menu.this,Description.class);
            startActivity(it);
        }

        else if(v.equals(btnBioFea)) {
            Intent it = new Intent(Menu.this,BiologicalFeatures.class);
            startActivity(it);
        }

        else if(v.equals(btnSeed)) {
            Intent it = new Intent(Menu.this,Seeds.class);
            startActivity(it);
        }

        else if(v.equals(btnCucm)) {
            Intent it = new Intent(Menu.this,GrowingCucumber.class);
            startActivity(it);
        }

        else if(v.equals(btnDisease)) {
            Intent it = new Intent(Menu.this,Diseases.class);
            startActivity(it);
        }

        else if(v.equals(btnPest)) {
            Intent it = new Intent(Menu.this,Pests.class);
            startActivity(it);
        }

        else
        if(v.equals(btnFertilizer)) {
            Intent it = new Intent(Menu.this,Fertilizers.class);
            startActivity(it);
        }

        else if(v.equals(btnChem)) {
            Intent it = new Intent(Menu.this,UsingChemicals.class);
            startActivity(it);
        }

        else if(v.equals(btnDetec)) {
            Intent it = new Intent(Menu.this,Detection.class);
            startActivity(it);
        }


    }
}
