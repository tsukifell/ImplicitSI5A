package com.si51.implicitsi5a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //declaring the variables
    EditText etUrl, etLokasi, etTeks;
    Button btnBukaWebsite, btnBukaLokasi, btnBagikanTeks;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //connecting the variables with its respective view_id
        etUrl = findViewById(R.id.et_url);
        etLokasi = findViewById(R.id.et_lokasi);
        etTeks = findViewById(R.id.et_teks);
        btnBukaWebsite = findViewById(R.id.btn_buka_website);
        btnBukaLokasi = findViewById(R.id.btn_buka_lokasi);
        btnBagikanTeks = findViewById(R.id.btn_bagikan_teks);

        //creating the listener
        btnBukaWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String link = etUrl.getText().toString();
                Uri linkPage = Uri.parse(link);
                Intent intentWebsite = new Intent(Intent.ACTION_VIEW, linkPage);

                try {
                    startActivity(intentWebsite);
                }catch (Exception e){
                    etUrl.setError("URL tidak ditemukan!");
                }

            }
        });

        btnBukaLokasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lokasi = etLokasi.getText().toString();
            }
        });

        btnBagikanTeks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String teks = etTeks.getText().toString();
            }
        });

    }
}