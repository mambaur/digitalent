package com.example.dtsapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    List<String> list;
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.dts);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        button1 = (Button) findViewById(R.id.btn0);
        button2 = (Button) findViewById(R.id.btn1);
        button3 = (Button) findViewById(R.id.btn2);
        button4 = (Button) findViewById(R.id.btn3);
        button5 = (Button) findViewById(R.id.btn4);
        button6 = (Button) findViewById(R.id.btn5);
        button7 = (Button) findViewById(R.id.btn6);
        button8 = (Button) findViewById(R.id.btn7);
        button9 = (Button) findViewById(R.id.btn8);

        list = Arrays.asList("A", "B", "C", "D", "E","F","G","H", "");
        shuffle();
        refresh();

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId() == R.id.menuUlang){
            shuffle();
            refresh();
        }else if(item.getItemId() == R.id.menuKeluar){
            finish();
        }
        return true;
    }

    void shuffle(){
        Collections.shuffle(list);
    }

    void refresh(){
        button1.setText(list.get(0));
        button2.setText(list.get(1));
        button3.setText(list.get(2));
        button4.setText(list.get(3));
        button5.setText(list.get(4));
        button6.setText(list.get(5));
        button7.setText(list.get(6));
        button8.setText(list.get(7));
        button9.setText(list.get(8));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn0:
                if(list.get(1) == ""){
                    list.set(1,list.get(0));
                    list.set(0,"");
                    refresh();
                    cek();
                }else if(list.get(3) == ""){
                    list.set(3,list.get(0));
                    list.set(0,"");
                    refresh();
                    cek();
                }
                break;
            case R.id.btn1:
                if(list.get(0) == ""){
                    list.set(0,list.get(1));
                    list.set(1,"");
                    refresh();
                    cek();
                }else if(list.get(2) == ""){
                    list.set(2,list.get(1));
                    list.set(1,"");
                    refresh();
                    cek();
                }else if(list.get(4) == ""){
                    list.set(4,list.get(1));
                    list.set(1,"");
                    refresh();
                    cek();
                }
                break;
            case R.id.btn2:
                if(list.get(1) == ""){
                    list.set(1,list.get(2));
                    list.set(2,"");
                    refresh();
                    cek();
                }else if(list.get(5) == ""){
                    list.set(5,list.get(2));
                    list.set(2,"");
                    refresh();
                    cek();
                }
                break;
            case R.id.btn3:
                if(list.get(0) == ""){
                    list.set(0,list.get(3));
                    list.set(3,"");
                    refresh();
                    cek();
                }else if(list.get(4) == ""){
                    list.set(4,list.get(3));
                    list.set(3,"");
                    refresh();
                    cek();
                }else if(list.get(6) == ""){
                    list.set(6,list.get(3));
                    list.set(3,"");
                    refresh();
                    cek();
                }
                break;
            case R.id.btn4:
                if(list.get(1) == ""){
                    list.set(1,list.get(4));
                    list.set(4,"");
                    refresh();
                    cek();
                }else if(list.get(3) == ""){
                    list.set(3,list.get(4));
                    list.set(4,"");
                    refresh();
                    cek();
                }else if(list.get(5) == ""){
                    list.set(5,list.get(4));
                    list.set(4,"");
                    refresh();
                    cek();
                }else if(list.get(7) == ""){
                    list.set(7,list.get(4));
                    list.set(4,"");
                    refresh();
                    cek();
                }
                break;
            case R.id.btn5:
                if(list.get(2) == ""){
                    list.set(2,list.get(5));
                    list.set(5,"");
                    refresh();
                    cek();
                }else if(list.get(4) == ""){
                    list.set(4,list.get(5));
                    list.set(5,"");
                    refresh();
                    cek();
                }else if(list.get(8) == ""){
                    list.set(8,list.get(5));
                    list.set(5,"");
                    refresh();
                    cek();
                }
                break;
            case R.id.btn6:
                if(list.get(3) == ""){
                    list.set(3,list.get(6));
                    list.set(6,"");
                    refresh();
                    cek();
                }else if(list.get(7) == ""){
                    list.set(7,list.get(6));
                    list.set(6,"");
                    refresh();
                    cek();
                }
                break;
            case R.id.btn7:
                if(list.get(4) == ""){
                    list.set(4,list.get(7));
                    list.set(7,"");
                    refresh();
                    cek();
                }else if(list.get(6) == ""){
                    list.set(6,list.get(7));
                    list.set(7,"");
                    refresh();
                    cek();
                }else if(list.get(8) == ""){
                    list.set(8,list.get(7));
                    list.set(7,"");
                    refresh();
                    cek();
                }
                break;
            case R.id.btn8:
                if(list.get(7) == ""){
                    list.set(7,list.get(8));
                    list.set(8,"");
                    refresh();
                    cek();
                }else if(list.get(5) == ""){
                    list.set(5,list.get(8));
                    list.set(8,"");
                    refresh();
                    cek();
                }
                break;
            default:
                break;
        }
    }

    void cek(){
        if (list.get(0) == "A" && list.get(1) == "B" && list.get(2) == "C" && list.get(3) == "D" && list.get(4) == "E" && list.get(5) == "F" && list.get(6) == "G" && list.get(7) == "H"){
            Toast.makeText(this, "Congratulations, You Win!!", Toast.LENGTH_SHORT).show();
        }
    }
}
