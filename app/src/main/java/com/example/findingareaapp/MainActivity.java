package com.example.findingareaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnafr,btncric;
    EditText etr;
    TextView tvans;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnafr=findViewById(R.id.btnafr);
        btncric=findViewById(R.id.btncric);
        etr=findViewById(R.id.etr);
        tvans=findViewById(R.id.tvans);

    }

    public void cir(View a) {
        Double n1, res;
        n1 = Double.parseDouble(etr.getText().toString());
        res=2*3.14*n1;
        tvans.setText("Answer=" + String.valueOf(res));
    }

    public void area(View a) {
        Double n1, res;
        n1 = Double.parseDouble(etr.getText().toString());
        res=3.14*n1*n1;
        tvans.setText("Answer=" + String.valueOf(res));
    }


}