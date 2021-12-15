package com.example.hf7;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView courseRV;

    // Arraylist for storing data
    private ArrayList<Recycle> courseModelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        courseRV = findViewById(R.id.idRVCourse);

        // here we have created new array list and added data to it.
        courseModelArrayList = new ArrayList<>();
        courseModelArrayList.add(new Recycle("disznyo", 4, R.drawable.disznyo));
        courseModelArrayList.add(new Recycle("cat", 3, R.drawable.cat));
        courseModelArrayList.add(new Recycle("horse", 4, R.drawable.horse));
        courseModelArrayList.add(new Recycle("octopus", 4, R.drawable.octopus));
        courseModelArrayList.add(new Recycle("octopus", 4, R.drawable.octopus2));
        courseModelArrayList.add(new Recycle("octopus", 4, R.drawable.octopus3));
        courseModelArrayList.add(new Recycle("rabbit", 4, R.drawable.rabbit));

        // we are initializing our adapter class and passing our arraylist to it.
        Recycle courseAdapter = new Recycle(this, courseModelArrayList);

        // below line is for setting a layout manager for our recycler view.
        // here we are creating vertical list so we will provide orientation as vertical
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        // in below two lines we are setting layoutmanager and adapter to our recycler view.
        courseRV.setLayoutManager(linearLayoutManager);
        courseRV.setAdapter(courseAdapter);
    }
}