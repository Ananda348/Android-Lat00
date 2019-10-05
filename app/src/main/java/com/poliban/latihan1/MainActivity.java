package com.poliban.latihan1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //konten view dihubungkan dengan koding
        //java kita
        setContentView(R.layout.activity_main);

        //Menghubungan view dengan object button
        //dalam source code kita
        Button btFirst = findViewById(R.id.btFirst);
        Button btSecond = findViewById(R.id.btSecond);
        Button btThird = findViewById(R.id.btThird);
        Button btFourd = findViewById(R.id.btFourd);

        //Interface onClickListener merupakan interface yang ada dikelaas view
        //hanya berisi satu method onClick(View view)

        //berikut kode memasng event listener onclick pada event object button
        btFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hai Anda Telah Menekan Tombol First", Toast.LENGTH_SHORT).show();
            }
        });

        btSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hai Anda Telah Menekan Tombol Second", Toast.LENGTH_SHORT).show();
            }
        });

        btThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hai Anda Telah Menekan Tombol Third", Toast.LENGTH_SHORT).show();
            }
        });

        btFourd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hai Anda Telah Menekan tombol Fourd", Toast.LENGTH_SHORT).show();
            }
        });



    }
}
