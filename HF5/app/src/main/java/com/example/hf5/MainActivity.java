package com.example.hf5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.SparseBooleanArray;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView list_view;
    List<String> list =new ArrayList<>();
    String[] lista={"Piros","Zold","Sarga",};
    /*
    SpannableString lista={"Piros","Zold","Sarga",};
    */
    String text="Piros,Zold";
    SpannableString ss =new SpannableString(text);
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list_view=findViewById(R.id.list_item);
        TextView t1=findViewById(R.id.piros);
        TextView t2=findViewById(R.id.sarga);
        TextView t3=findViewById(R.id.zold);
        addContactsList();

        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,list);
        list_view.setAdapter(adapter);
        registerForContextMenu(list_view);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.context,menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        AdapterView.AdapterContextMenuInfo i = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        switch (item.getItemId()){
            case R.id.piros:
                TextView t1=findViewById(R.id.piros);

                t1.setTextColor(Color.parseColor("#FFFFFF"));
                t1.setTextColor(Color.RED);

                ss = SpannableString.valueOf(list.get(i.position));
                ss.setSpan(new ForegroundColorSpan(Color.RED), 0, ss.length(), 0);

            case R.id.zold:
                TextView t2=findViewById(R.id.piros);

                t2.setTextColor(0xFF00FF00); //this is green color
                t2.setTextColor(Color.GREEN);

                ss = SpannableString.valueOf(list.get(i.position));
                ss.setSpan(new ForegroundColorSpan(Color.RED), 0, ss.length(), 0);

            case R.id.sarga:

                TextView t3=findViewById(R.id.piros);

                t3.setTextColor(Color.YELLOW);

                ss = SpannableString.valueOf(list.get(i.position));
                ss.setSpan(new ForegroundColorSpan(Color.RED), 0, ss.length(), 0);

            default:
                return  super.onContextItemSelected(item);
        }
    }

    private void addContactsList() {
        for(String name: lista){
            list.add(name);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        MenuItem item = menu.findItem(R.id.delet);
            item.setVisible(false);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // TODO Auto-generated method stub

        switch (item.getItemId()) {
            case R.id.rendez:
                list = new ArrayList<String>(list.asList(lista));
                Collections.sort(list);
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i));
                }
                adapter = new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1, list);
                list_view.setAdapter(adapter);
                adapter.notifyDataSetChanged();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}




