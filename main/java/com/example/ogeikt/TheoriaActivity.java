package com.example.ogeikt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TheoriaActivity extends AppCompatActivity implements View.OnClickListener {
    Button button;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theoria);
        button = findViewById(R.id.button100);
        button = findViewById(R.id.button101);
        button = findViewById(R.id.button109);
        button = findViewById(R.id.button102);
        button = findViewById(R.id.button103);
        button = findViewById(R.id.button104);
        button = findViewById(R.id.button105);
        button = findViewById(R.id.button106);
        button = findViewById(R.id.button107);
        button = findViewById(R.id.button108);
    }
    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.button100:
                Intent intent = new Intent(this, Lesson1.class);
                startActivity(intent);
                break;
            default:
                break;
        }
        switch (view.getId()) {
            case R.id.button101:
                Intent intent = new Intent(this, Lesson2.class);
                startActivity(intent);
                break;
            default:
                break;
        }
        switch (view.getId()) {
            case R.id.button102:
                Intent intent = new Intent(this, Lesson3.class);
                startActivity(intent);
                break;
            default:
                break;
        }
        switch (view.getId()) {
            case R.id.button103:
                Intent intent = new Intent(this, Lesson4.class);
                startActivity(intent);
                break;
            default:
                break;
        }
        switch (view.getId()) {
            case R.id.button104:
                Intent intent = new Intent(this, Lesson5.class);
                startActivity(intent);
                break;
            default:
                break;
        }
        switch (view.getId()) {
            case R.id.button105:
                Intent intent = new Intent(this, Lesson6.class);
                startActivity(intent);
                break;
            default:
                break;
        }
        switch (view.getId()) {
            case R.id.button106:
                Intent intent = new Intent(this, Lesson7.class);
                startActivity(intent);
                break;
            default:
                break;
        }
        switch (view.getId()) {
            case R.id.button107:
                Intent intent = new Intent(this, Lesson8.class);
                startActivity(intent);
                break;
            default:
                break;
        }
        switch (view.getId()) {
            case R.id.button108:
                Intent intent = new Intent(this, Lesson9.class);
                startActivity(intent);
                break;
            default:
                break;
        }
        switch (view.getId()) {
            case R.id.button109:
                Intent intent = new Intent(this, Lesson10.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}