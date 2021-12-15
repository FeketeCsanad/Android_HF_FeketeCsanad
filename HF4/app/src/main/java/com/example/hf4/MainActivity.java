package com.example.hf4;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {

    ListView simpleList;
    String countryList[] = {"USD", "Yuan", "CAD", "Portugle", "HUF", "NewZealand"};
    int flags[] = {R.drawable.usaa, R.drawable.china, R.drawable.cad, R.drawable.cat, R.drawable.huff, R.drawable.disznyo};
    double[] textview15 = {4.410, 3.975, 6.120, 2.960, 3.095, 4.230};
    double[] textview16 = {4.550, 4.145, 6.355, 3.060, 3.265, 4.330};
    TextView textView17 = findViewById(R.id.textView17);
    TextView textView18 = findViewById(R.id.textView18);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), countryList, flags, textview15, textview16);

        setContentView(R.layout.activity_main);
        ListView list = findViewById(R.id.simpleListView);
        list.setAdapter(customAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                textView17.setVisibility(View.VISIBLE);
                textView18.setVisibility(View.VISIBLE);
            }
        });

    }

}
