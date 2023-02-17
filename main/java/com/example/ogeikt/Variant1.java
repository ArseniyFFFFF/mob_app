package com.example.ogeikt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Variant1 extends AppCompatActivity implements View.OnClickListener {

    Button btn;
    EditText et_1;
    EditText et_2;
    EditText et_3;
    EditText et_4;
    EditText et_5;
    EditText et_6;
    EditText et_7;
    EditText et_8;
    EditText et_9;
    EditText et_10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_variant1);

        btn=findViewById(R.id.button2);
        btn.setOnClickListener(this);
        et_1 = (EditText) findViewById(R.id.et_1);
        et_2 = findViewById(R.id.editTextTextMultiLine2);
        et_3 = findViewById(R.id.editTextTextMultiLine3);
        et_4 = findViewById(R.id.editTextTextMultiLine4);
        et_5 = findViewById(R.id.editTextTextMultiLine5);
        et_6 = findViewById(R.id.editTextTextMultiLine6);
        et_7 = findViewById(R.id.editTextTextMultiLine7);
        et_8 = findViewById(R.id.editTextTextMultiLine8);
        et_9 = findViewById(R.id.editTextTextMultiLine9);
        et_10 = findViewById(R.id.editTextTextMultiLine11);

    }

    @Override
    public void onClick(View view) {
        String edt_1 = et_1.getText().toString();
        String edt_2 = et_2.getText().toString();
        String edt_3 = et_3.getText().toString();
        String edt_4 = et_4.getText().toString();
        String edt_5 = et_5.getText().toString();
        String edt_6 = et_6.getText().toString();
        String edt_7 = et_7.getText().toString();
        String edt_8 = et_8.getText().toString();
        String edt_9 = et_9.getText().toString();
        String edt_10 = et_10.getText().toString();
        switch (view.getId()) {
            case R.id.button2:
                Intent intent = new Intent(this, TabloAtveti.class);
                intent.putExtra("edt_1", edt_1);
                intent.putExtra("edt_2",edt_2);
                intent.putExtra("edt_3",edt_3);
                intent.putExtra("edt_4",edt_4);
                intent.putExtra("edt_5",edt_5);
                intent.putExtra("edt_6",edt_6);
                intent.putExtra("edt_7",edt_7);
                intent.putExtra("edt_8",edt_8);
                intent.putExtra("edt_9",edt_9);
                intent.putExtra("edt_10",edt_10);

                startActivity(intent);
                break;
            default:
                break;

    }
}
}