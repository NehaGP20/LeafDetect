package com.example.leafdetect1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BuyFertilizers extends AppCompatActivity{

    Button btnAdd1, btnAdd2, btnAdd3, btnAdd4, btnAdd5, btnAdd6, btnAdd7, btnAdd8;

    String choices = "",date = "";
    Double price = 0.00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_fertilizers);

        btnAdd1 = (Button)findViewById(R.id.btn_add1);
        btnAdd2 = (Button)findViewById(R.id.btn_add2);
        btnAdd3 = (Button)findViewById(R.id.btn_add3);
        btnAdd4 = (Button)findViewById(R.id.btn_add4);
        btnAdd5 = (Button)findViewById(R.id.btn_add5);
        btnAdd6 = (Button)findViewById(R.id.btn_add6);
        btnAdd7 = (Button)findViewById(R.id.btn_add7);
        btnAdd8 = (Button)findViewById(R.id.btn_add8);
    }

    public void add_to_list(View v) {
        if (v == findViewById(R.id.btn_add1)) {
            choices = choices + " Topsin" + "\n";
            price = price + 800;
        } else if (v == findViewById(R.id.btn_add2)) {
            choices = choices + " Copper Oxychloride Solution" + "\n";
            price = price + 730;
        } else if (v == findViewById(R.id.btn_add3)) {
            choices = choices + " Polycarbacin" + "\n";
            price = price + 390;
        } else if (v == findViewById(R.id.btn_add4)) {
            choices = choices + " Bordeaux Liquids" + "\n";
            price = price + 1875;
        } else if (v == findViewById(R.id.btn_add5)) {
            choices = choices + " Ordan Drug" + "\n";
            price = price + 1450;
        } else if (v == findViewById(R.id.btn_add6)) {
            choices = choices + " Ridomil Drug" + "\n";
            price = price + 1780;
        } else if (v == findViewById(R.id.btn_add7)) {
            choices = choices + " Copper Sulphate" + "\n";
            price = price + 220;
        } else if (v == findViewById(R.id.btn_add8)) {
            choices = choices + " Fundazol Fungicida" + "\n";
            price = price + 910;
        }

    }

    public void placeOrder(View v) {
        Intent it = new Intent(this,OrderDetails.class);
        Bundle bundle = new Bundle();
        bundle.putString("choices",choices);
        bundle.putDouble("price",price);
        it.putExtras(bundle);
        startActivity(it);
    }

}
