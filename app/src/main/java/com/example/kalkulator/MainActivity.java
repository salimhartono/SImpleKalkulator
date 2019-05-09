package com.example.kalkulator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvHasil;
    EditText etPertama, etKedua;
    Button btKali, btBagi, btTambah, btKurang, btClear, btAbout;
    int angkaPertama, angkaKedua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvHasil = findViewById(R.id.tvHasil);
        etPertama = findViewById(R.id.etPertama);
        etKedua = findViewById(R.id.etKedua);

        //button
        btKali = findViewById(R.id.btKali);
        btBagi = findViewById(R.id.btBagi);
        btTambah = findViewById(R.id.btBTambah);
        btKurang = findViewById(R.id.btKurang);
        btClear = findViewById(R.id.btCLear);
        btAbout = findViewById(R.id.btAbout);

        btKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angkaPertama = Integer.parseInt(etPertama.getText().toString());
                angkaKedua = Integer.parseInt(etKedua.getText().toString());
                int hasil = angkaPertama * angkaKedua;
                tvHasil.setText(String.valueOf(hasil));
            }
        });

        btBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angkaPertama = Integer.parseInt(etPertama.getText().toString());
                angkaKedua = Integer.parseInt(etKedua.getText().toString());
                int hasil = angkaPertama / angkaKedua;
                tvHasil.setText(String.valueOf(hasil));
            }
        });

        btTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angkaPertama = Integer.parseInt(etPertama.getText().toString());
                angkaKedua = Integer.parseInt(etKedua.getText().toString());
                int hasil = angkaPertama + angkaKedua;
                tvHasil.setText(String.valueOf(hasil));
            }
        });

        btKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angkaPertama = Integer.parseInt(etPertama.getText().toString());
                angkaKedua = Integer.parseInt(etKedua.getText().toString());
                int hasil = angkaPertama - angkaKedua;
                tvHasil.setText(String.valueOf(hasil));
            }
        });

        btClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvHasil.setText("0");
                etPertama.setText("");
                etKedua.setText("");
            }
        });

        btAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, About.class));
            }
        });


    }
}
