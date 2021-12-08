package com.example.self_learning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Juice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juice);

        Button btn_home = (Button) findViewById(R.id.btn_juice_home);
        Button btn_appleJ = (Button) findViewById(R.id.btn_AppleJ);
        Button btn_guavaJ = (Button) findViewById(R.id.btn_GuavaJ);
        Button btn_watermelonJ = (Button) findViewById(R.id.btn_WatermelonJ);

        btn_home.setOnClickListener(btn_homeListener);
        btn_appleJ.setOnClickListener(btn_appleJListener);
        btn_guavaJ.setOnClickListener(btn_guavaJListener);
        btn_watermelonJ.setOnClickListener(btn_watermelonJListener);
    }

    private View.OnClickListener btn_homeListener = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            finish();
        }
    };
    private View.OnClickListener btn_appleJListener = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setClass(Juice.this,sugar.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener btn_guavaJListener = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setClass(Juice.this,sugar.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener btn_watermelonJListener = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setClass(Juice.this,sugar.class);
            startActivity(intent);
        }
    };
}