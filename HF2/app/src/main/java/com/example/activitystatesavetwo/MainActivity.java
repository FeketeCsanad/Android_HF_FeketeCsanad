package com.example.activitystatesavetwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    CheckBox checkBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.edit);
        checkBox = findViewById(R.id.checkBox);
        if (savedInstanceState != null) {
            editText.setText(savedInstanceState.getString("editText"));
            checkBox.setChecked((savedInstanceState.getBoolean("checkBox")));
        }
    }
}