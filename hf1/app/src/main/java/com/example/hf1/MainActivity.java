package com.example.hf1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.IdentityHashMap;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText sz1=findViewById(R.id.editTextNumber);
        EditText sz2=findViewById(R.id.editTextNumber2);
        TextView sz3=findViewById(R.id.textView);

        Button b1=findViewById(R.id.button);
        Button b2=findViewById(R.id.button2);
        Button b3=findViewById(R.id.button3);
        Button b4=findViewById(R.id.button4);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(sz1.equals("") || sz2.equals("")){
                    Toast.makeText(MainActivity.this,"toltsd ki ",Toast.LENGTH_SHORT).show();
                }
                else {
                    int szam1 = Integer.parseInt(sz1.getText().toString());
                    int szam2 = Integer.parseInt(sz2.getText().toString());

                    int eredmeny = szam1 + szam2;
                    sz3.setText(String.valueOf(eredmeny));
                }
            }


        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(sz1.equals("") || sz2.equals("")){
                    Toast.makeText(MainActivity.this,"toltsd ki ",Toast.LENGTH_SHORT).show();
                }
                else {
                    int szam1 = Integer.parseInt(sz1.getText().toString());
                    int szam2 = Integer.parseInt(sz2.getText().toString());

                    int eredmeny = szam1 - szam2;
                    sz3.setText(String.valueOf(eredmeny));
                }
            }


        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(sz1.equals("") || sz2.equals("")){
                    Toast.makeText(MainActivity.this,"toltsd ki ",Toast.LENGTH_SHORT).show();
                }
                else {
                    int szam1 = Integer.parseInt(sz1.getText().toString());
                    int szam2 = Integer.parseInt(sz2.getText().toString());

                    double eredmeny = szam1 / szam2;
                    sz3.setText(String.valueOf(eredmeny));
                }
            }


        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sz1.equals("") || sz2.equals("")){
                    Toast.makeText(MainActivity.this,"toltsd ki ",Toast.LENGTH_SHORT).show();
                }
                else {
                    int szam1 = Integer.parseInt(sz1.getText().toString());
                    int szam2 = Integer.parseInt(sz2.getText().toString());

                    int eredmeny = szam1 * szam2;
                    sz3.setText(String.valueOf(eredmeny));
                }
            }


        });
    }

}