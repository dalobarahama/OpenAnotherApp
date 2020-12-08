package com.example.openanotherapp;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button openFacebook = findViewById(R.id.btn_open_facebook);
        Button openInstagram = findViewById(R.id.btn_open_instagram);

        openInstagram.setOnClickListener(v -> {
            Uri uri = Uri.parse("https://www.instagram.com/michaellrenaldi/");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            intent.setPackage("com.instagram.android");
            try {
                startActivity(intent);
            } catch (ActivityNotFoundException e) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/michaellrenaldi/")));
            }
        });

        openFacebook.setOnClickListener(v -> {
            Uri uri = Uri.parse("https://www.facebook.com/dalo.barahama/");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            intent.setPackage("com.facebook.katana");
            try {
                startActivity(intent);
            } catch (ActivityNotFoundException e) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/dalo.barahama/")));
            }
        });

    }
}