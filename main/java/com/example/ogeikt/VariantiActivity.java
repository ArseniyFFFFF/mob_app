package com.example.ogeikt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VariantiActivity extends AppCompatActivity implements View.OnClickListener {

    Button button9;
    Button button10;
    Button button7;
    Button button8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_varianti);

        button9 = findViewById(R.id.button26);
        button7 = findViewById(R.id.button27);
        button8 = findViewById(R.id.button28);
        button10 = findViewById(R.id.button29);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.button27:
                Intent intent = new Intent(this, Variant1.class);
                startActivity(intent);
                break;
            default:
                break;
        }
        switch (view.getId()) {
            case R.id.button28:
                Intent intent = new Intent(this, Variant_2.class);
                startActivity(intent);
                break;
            default:
                break;
        }
        switch (view.getId()) {
            case R.id.button29:
                Intent intent = new Intent(this, Variant_2.class);
                startActivity(intent);
                break;
            default:
                break;
        }
        switch (view.getId()) {
            case R.id.button26:
                Intent intent = new Intent(this, TheoriaActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}