package com.takatutustudio.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editTextLayar;
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    Button buttonTambah, buttonKurang, buttonBagi, buttonKali;
    Button buttonClear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
