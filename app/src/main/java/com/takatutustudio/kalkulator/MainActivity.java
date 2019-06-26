package com.takatutustudio.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.ref.SoftReference;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editTextLayar;
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    Button buttonTambah, buttonKurang, buttonBagi, buttonKali;
    Button buttonClear, buttonSamaDengan;

    public static double nilaiSekarang    = 0;
    public static String operasiSekarang  = "";
    public static double hasil            = 0.0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    void init() {

        editTextLayar    = (EditText) findViewById(R.id.editTextLayar);

        button0          = (Button) findViewById(R.id.button0);
        button1          = (Button) findViewById(R.id.button1);
        button2          = (Button) findViewById(R.id.button2);
        button3          = (Button) findViewById(R.id.button3);
        button4          = (Button) findViewById(R.id.button4);
        button5          = (Button) findViewById(R.id.button5);
        button6          = (Button) findViewById(R.id.button6);
        button7          = (Button) findViewById(R.id.button7);
        button8          = (Button) findViewById(R.id.button8);
        button9          = (Button) findViewById(R.id.button9);

        buttonTambah     = (Button) findViewById(R.id.buttonTambah);
        buttonKurang     = (Button) findViewById(R.id.buttonKurang);
        buttonBagi       = (Button) findViewById(R.id.buttonBagi);
        buttonKali       = (Button) findViewById(R.id.buttonKali);

        buttonClear      = (Button) findViewById(R.id.buttonClear);
        buttonSamaDengan = (Button) findViewById(R.id.buttonSamaDengan);


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
        buttonSamaDengan.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button0:
                editTextLayar.setText(editTextLayar.getText().toString().trim()+"0");
                break;

            case R.id.button1:
                editTextLayar.setText(editTextLayar.getText().toString().trim()+"1");
                break;

            case R.id.button2:
                editTextLayar.setText(editTextLayar.getText().toString().trim()+"2");
                break;

            case R.id.button3:
                editTextLayar.setText(editTextLayar.getText().toString().trim()+"3");
                break;

            case R.id.button4:
                editTextLayar.setText(editTextLayar.getText().toString().trim()+"4");
                break;

            case R.id.button5:
                editTextLayar.setText(editTextLayar.getText().toString().trim()+"5");
                break;

            case R.id.button6:
                editTextLayar.setText(editTextLayar.getText().toString().trim()+"6");
                break;

            case R.id.button7:
                editTextLayar.setText(editTextLayar.getText().toString().trim()+"7");
                break;

            case R.id.button8:
                editTextLayar.setText(editTextLayar.getText().toString().trim()+"8");
                break;

            case R.id.button9:
                editTextLayar.setText(editTextLayar.getText().toString().trim()+"9");
                break;

                /*----------------------------------*/

            case R.id.buttonTambah:

                if (editTextLayar.getText().toString().trim().equals("")) {
                    Toast.makeText(MainActivity.this, "Angka Harus di isi", Toast.LENGTH_SHORT).show();
                    return;
                }

                operasiSekarang = "tambah";
                nilaiSekarang = Double.parseDouble(editTextLayar.getText().toString());
                editTextLayar.setText("");
                break;

            case R.id.buttonKurang:

                if (editTextLayar.getText().toString().trim().equals("")) {
                    Toast.makeText(MainActivity.this, "Angka Harus di isi", Toast.LENGTH_SHORT).show();
                    return;
                }

                operasiSekarang = "kurang";
                nilaiSekarang = Double.parseDouble(editTextLayar.getText().toString());
                editTextLayar.setText("");
                break;

            case R.id.buttonBagi:

                if (editTextLayar.getText().toString().trim().equals("")) {
                    Toast.makeText(MainActivity.this, "Angka Harus di isi", Toast.LENGTH_SHORT).show();
                    return;
                }

                operasiSekarang = "bagi";
                nilaiSekarang = Double.parseDouble(editTextLayar.getText().toString());
                editTextLayar.setText("");
                break;

            case R.id.buttonKali:

                if (editTextLayar.getText().toString().trim().equals("")) {
                    Toast.makeText(MainActivity.this, "Angka Harus di isi", Toast.LENGTH_SHORT).show();
                    return;
                }

                operasiSekarang = "kali";
                nilaiSekarang = Double.parseDouble(editTextLayar.getText().toString());
                editTextLayar.setText("");
                break;

                /*----------------------------------*/

            case R.id.buttonClear:
                nilaiSekarang = 0;
                editTextLayar.setText("");
                break;
                /*-----------------------------------*/

            case R.id.buttonSamaDengan:

                if (operasiSekarang.equals("tambah")) {
                    hasil = nilaiSekarang+Double.parseDouble(editTextLayar.getText().toString().trim());
                }
                if (operasiSekarang.equals("kurang")) {
                    hasil = nilaiSekarang-Double.parseDouble(editTextLayar.getText().toString().trim());
                }
                if (operasiSekarang.equals("bagi")) {
                    hasil = nilaiSekarang/Double.parseDouble(editTextLayar.getText().toString().trim());
                }
                if (operasiSekarang.equals("kali")) {
                    hasil = nilaiSekarang*Double.parseDouble(editTextLayar.getText().toString().trim());
                }

                /*hasil = 2.1*/
                /*nilaiTemp = 2*/
                int nilaiTemp = (int) hasil;

                //2.1 == 2? tidak sama
                if (nilaiTemp == hasil) {
                    editTextLayar.setText(String.valueOf((int)hasil));
                } else {
                    editTextLayar.setText(String.valueOf(hasil));
                }



                break;


        }
    }
}
