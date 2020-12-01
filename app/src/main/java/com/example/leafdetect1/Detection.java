package com.example.leafdetect1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;

public class Detection extends AppCompatActivity implements View.OnClickListener{

    private static final String TAG = MainActivity.class.getSimpleName();

    private int PICK_IMAGE_REQUEST = 1;
    Button btnConfirm, defect1, defect2, defect3, defect4, btnConnect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detection);

        Button selectImage = findViewById(R.id.uploadImage);

        defect1 = (Button) findViewById(R.id.defect1);
        defect2 = (Button) findViewById(R.id.defect2);
        defect3 = (Button) findViewById(R.id.defect3);
        defect4 = (Button) findViewById(R.id.defect4);
        btnConnect = (Button)findViewById(R.id.connect);
        btnConfirm = (Button)findViewById(R.id.btn_healthy);

        btnConfirm.setOnClickListener(this);
        defect1.setOnClickListener(this);
        defect2.setOnClickListener(this);
        defect3.setOnClickListener(this);
        defect4.setOnClickListener(this);
        btnConnect.setOnClickListener(this);

        selectImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chooseImage();
            }
        });
    }

    public void chooseImage() {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(intent, "Select Picture"), PICK_IMAGE_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data != null && data.getData() != null) {

            Uri uri = data.getData();

            try {
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), uri);
                // Log.d(TAG, String.valueOf(bitmap));

                ImageView imageView = findViewById(R.id.imageView2);
                imageView.setImageBitmap(bitmap);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void onClick(View v) {
        if(v.equals(btnConfirm)) {

            Intent it = new Intent(Detection.this,Healthy.class);
            startActivity(it);
        } else if(v.equals(defect1)) {

            Intent it = new Intent(Detection.this,Mealydew.class);
            startActivity(it);
        } else if(v.equals(defect2)) {

            Intent it = new Intent(Detection.this,DownyMildew.class);
            startActivity(it);
        } else if(v.equals(defect3)) {

            Intent it = new Intent(Detection.this,Anthracnose.class);
            startActivity(it);
        } else if(v.equals(defect4)) {

            Intent it = new Intent(Detection.this,Cladosporiosis.class);
            startActivity(it);
        } else if(v.equals(btnConnect)) {

            Toast.makeText(this, "Connecting to Server!!", Toast.LENGTH_SHORT).show();
        }
    }

}