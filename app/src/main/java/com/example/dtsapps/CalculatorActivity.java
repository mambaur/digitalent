package com.example.dtsapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static java.lang.Integer.parseInt;

public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener {
    EditText tAngkaPertama, tAngkaKedua;
    Button btnPlus, btnMin, btnKali, btnBagi, btnClear;
    TextView txtHasilCal;
    double angkaPertama, angkaKedua, hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        getSupportActionBar().setTitle("Aplikasi Kalkulator");

        txtHasilCal = (TextView) findViewById(R.id.txtHasilCalculator);
        tAngkaPertama = (EditText) findViewById(R.id.tAngkaPertama);
        tAngkaKedua = (EditText) findViewById(R.id.tAngkaKedua);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMin = (Button) findViewById(R.id.btnMin);
        btnKali = (Button) findViewById(R.id.btnKali);
        btnBagi = (Button) findViewById(R.id.btnBagi);
        btnClear = (Button) findViewById(R.id.btnClear);

        btnPlus.setOnClickListener(this);
        btnMin.setOnClickListener(this);
        btnKali.setOnClickListener(this);
        btnBagi.setOnClickListener(this);
        btnClear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (!(tAngkaPertama.getText().length() > 0 && tAngkaKedua.getText().length() > 0)){
            Toast.makeText(this, "Input angka pertama & angka kedua tidak boleh kosong", Toast.LENGTH_SHORT).show();
        }else {
            angkaPertama = Double.parseDouble(tAngkaPertama.getText().toString());
            angkaKedua = Double.parseDouble(tAngkaKedua.getText().toString());

            switch (v.getId()) {
                case R.id.btnPlus:
                    hasil = angkaPertama + angkaKedua;
                    txtHasilCal.setText(String.valueOf(hasil));
                    break;
                case R.id.btnMin:
                    hasil = angkaPertama - angkaKedua;
                    txtHasilCal.setText(String.valueOf(hasil));
                    break;
                case R.id.btnKali:
                    hasil = angkaPertama * angkaKedua;
                    txtHasilCal.setText(String.valueOf(hasil));
                    break;
                case R.id.btnBagi:
                    hasil = angkaPertama / angkaKedua;
                    txtHasilCal.setText(String.valueOf(hasil));
                    break;
                case R.id.btnClear:
                    tAngkaPertama.setText("");
                    tAngkaKedua.setText("");
                    hasil = 0;
                    txtHasilCal.setText(String.valueOf(hasil));
                    break;
                default:
                    break;
            }
        }
    }
}
