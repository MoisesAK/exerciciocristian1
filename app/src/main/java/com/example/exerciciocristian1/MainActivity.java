package com.example.exerciciocristian1;


import android.support.v4.widget.CompoundButtonCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    Button btnBranco;
    Button btnVerde;
    Button btnAzul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAzul = findViewById(R.id.btnAzul);
        btnBranco = findViewById(R.id.btnBranco);
        btnVerde = findViewById(R.id.btnVerde);

        btnAzul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
               setContentView(R.layout.fragment_tela_azul);
            }
        });

        btnBranco.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                setContentView(R.layout.fragment_tela_branca);

            }
        });

        btnVerde.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                setContentView(R.layout.fragment_tela_verde);
            }
        });

    }






}
