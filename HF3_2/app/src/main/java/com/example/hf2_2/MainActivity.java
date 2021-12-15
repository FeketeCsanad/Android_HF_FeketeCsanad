package com.example.hf2_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Product> products = new ArrayList<>();
    TextView lista = findViewById(R.id.lista);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Product> pro = new ArrayList<>();
        setContentView(R.layout.activity_main);

        EditText id =findViewById(R.id.id);
        EditText name =findViewById(R.id.Name);
        EditText price =findViewById(R.id.Price);


        Button b1 =findViewById(R.id.button8);
        Button b2 =findViewById(R.id.button9);
        Button b3 =findViewById(R.id.button10);

        b1.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {

                                      int productCodeInteger = Integer.parseInt(id.getText().toString());
                                      String productNameString = name.getText().toString();
                                      double productPriceDouble = Double.parseDouble(price.getText().toString());

                                      products.add(new Product(productCodeInteger, productNameString, productPriceDouble));
                                      Toast.makeText(MainActivity.this,
                                              "Hozza adtad!", Toast.LENGTH_SHORT).show();
                                  }});

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id.getText().clear();
                name.getText().clear();
                price.getText().clear();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lista.setText("");
                for (Product product : products) {
                    lista.append(product.toString() + "\n");
                }
            }
        });



    }
}