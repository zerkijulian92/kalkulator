package com.takatutustudio.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editTextLayar;
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    Button buttonTambah, buttonKurang, buttonBagi, buttonKali;
    Button buttonClear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    void init() {

        editTextLayar = (EditText) findViewById(R.id.editTextLayar);

        button0       = (Button) findViewById(R.id.button0);
        button1       = (Button) findViewById(R.id.button1);
        button2       = (Button) findViewById(R.id.button2);
        button3       = (Button) findViewById(R.id.button3);
        button4       = (Button) findViewById(R.id.button4);
        button5       = (Button) findViewById(R.id.button5);
        button6       = (Button) findViewById(R.id.button6);
        button7       = (Button) findViewById(R.id.button7);
        button8       = (Button) findViewById(R.id.button8);
        button9       = (Button) findViewById(R.id.button9);

        buttonTambah  = (Button) findViewById(R.id.buttonTambah);
        buttonKurang  = (Button) findViewById(R.id.buttonKurang);
        buttonBagi    = (Button) findViewById(R.id.buttonBagi);
        buttonKali    = (Button) findViewById(R.id.buttonKali);

        buttonClear   = (Button) findViewById(R.id.buttonClear);


        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);

        buttonTambah.setOnClickListener(this);
        buttonKurang.setOnClickListener(this);
        buttonBagi.setOnClickListener(this);
        buttonKali.setOnClickListener(this);

        buttonClear.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button0:
                editTextLayar.setText("0");
            break;
            case R.id.button1:
                editTextLayar.setText("1");
        }
    }
}
