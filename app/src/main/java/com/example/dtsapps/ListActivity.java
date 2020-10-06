package com.example.dtsapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {
    private ListView list;
    private String[] namaNegara = new String[]{
            "Indonesia", "Malaysia", "Singapura", "Thailand", "Timor Leste", "Philipina", "China", "Jepang", "Korea", "Myanmar", "Amerika"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        getSupportActionBar().setTitle("Listview Sederhana");

        list = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(ListActivity.this, android.R.layout.simple_list_item_1, android.R.id.text1, namaNegara);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListActivity.this, "Nama Negara: " +namaNegara[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
