package com.example.dtsapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ShowNameActivity extends AppCompatActivity implements View.OnClickListener {
    EditText name;
    TextView txtHasil;
    Button btnTampil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil_nama);
        getSupportActionBar().setTitle("Aplikasi Tampil Nama");

        name = (EditText) findViewById(R.id.txtName);
        btnTampil = (Button) findViewById(R.id.btnTampil);
        txtHasil = (TextView) findViewById(R.id.txtHasil);

        btnTampil.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnTampil:
                txtHasil.setText(name.getText().toString());
                break;
            default:
                break;
        }
    }
}
