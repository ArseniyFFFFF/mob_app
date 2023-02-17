package com.example.ogeikt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Otveti_2 extends AppCompatActivity implements View.OnClickListener {

    int a=0;
    int b;
    int c=0;
    int d=0;
    int e=0;
    int g=0;
    int j=0;
    int i=0;
    int f=0;
    int s=0;
    int x=0;
    Button btn_1;

    TextView tv_1;
    TextView tv_2;
    TextView tv_3;
    TextView tv_4;
    TextView tv_5;
    TextView tv_6;
    TextView tv_7;
    TextView tv_8;
    TextView tv_9;
    TextView tv_10;
    TextView tv_11;
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
        setContentView(R.layout.activity_otveti2);
        Bundle arguments = getIntent().getExtras();
        btn_1 = findViewById(R.id.button5);
        btn_1.setOnClickListener(this);
        tv_1 = findViewById(R.id.textView72);
        tv_2 = findViewById(R.id.textView73);
        tv_3 = findViewById(R.id.textView74);
        tv_4 = findViewById(R.id.textView75);
        tv_5 = findViewById(R.id.textView76);
        tv_6 = findViewById(R.id.textView77);
        tv_7 = findViewById(R.id.textView78);
        tv_8 = findViewById(R.id.textView79);
        tv_9 = findViewById(R.id.textView80);
        tv_10 = findViewById(R.id.textView81);
        tv_11 = findViewById(R.id.textView43);
        et_1 = (EditText) findViewById(R.id.et_11);
        et_2 = findViewById(R.id.editTextTextMultiLine21);
        et_3 = findViewById(R.id.editTextTextMultiLine31);
        et_4 = findViewById(R.id.editTextTextMultiLine41);
        et_5 = findViewById(R.id.editTextTextMultiLine51);
        et_6 = findViewById(R.id.editTextTextMultiLine61);
        et_7 = findViewById(R.id.editTextTextMultiLine71);
        et_8 = findViewById(R.id.editTextTextMultiLine81);
        et_9 = findViewById(R.id.editTextTextMultiLine91);
        et_10 = findViewById(R.id.editTextTextMultiLine111);




        String edt_1 = arguments.get("edt_1").toString();
        String edt_2 = arguments.get("edt_2").toString();
        String edt_3 = arguments.get("edt_3").toString();
        String edt_4 = arguments.get("edt_4").toString();
        String edt_5 = arguments.get("edt_5").toString();
        String edt_6 = arguments.get("edt_6").toString();
        String edt_7 = arguments.get("edt_7").toString();
        String edt_8 = arguments.get("edt_8").toString();
        String edt_9 = arguments.get("edt_9").toString();
        String edt_10 = arguments.get("edt_10").toString();

        if (edt_1.equals("кардиолог")){
            tv_1.setText("кардиолог");
            b = a++;
            b = a++;
        }else{
            tv_1.setText(edt_1);
        }
        if (edt_2.equals("вода")){
            tv_2.setText("вода");
            b = a++;
        }else{
            tv_2.setText(edt_2);
        }
        if (edt_3.equals("21")){
            tv_3.setText("21");
            b = a++;
        }else{
            tv_3.setText(edt_3);
        }
        if (edt_4.equals("6")){
            tv_4.setText("6");
            b = a++;
        }else{
            tv_4.setText(edt_4);
        }
        if (edt_5.equals("21111")){
            tv_5.setText("21111");
            b = a++;
        }else{
            tv_5.setText(edt_5);
        }
        if (edt_6.equals("4")){
            tv_6.setText("4");
            b = a++;
        }else{
            tv_6.setText(edt_6);
        }
        if (edt_7.equals("евдагжб")){
            tv_7.setText("евдагжб");
            b = a++;
        }else{
            tv_7.setText(edt_7);
        }
        if (edt_8.equals("8")){
            tv_8.setText("8");
            b = a++;
        }else{
            tv_8.setText(edt_8);
        }
        if (edt_9.equals("26")){
            tv_9.setText("26");
            b = a++;
        }else{
            tv_9.setText(edt_9);
        }
        if (edt_10.equals("63")){
            tv_10.setText("63");
            b = a++;
        }else{
            tv_10.setText(edt_10);
        }
        tv_11.setText("Колличество баллов:"+ " "+b);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button5:
                Intent intent = new Intent(this, VariantiActivity.class);
                startActivity(intent);
                break;
            default:
                break;

        }
    }
}