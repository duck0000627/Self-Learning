package com.example.self_learning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_juice = (Button) findViewById(R.id.btn_juice);
        Button btn_tea = (Button) findViewById(R.id.btn_tea);
        Button btn_coffee = (Button) findViewById(R.id.btn_coffee);
        Button btn_total = (Button) findViewById(R.id.btn_total);

        btn_juice.setOnClickListener(btn_juiceListener);
        btn_tea.setOnClickListener(btn_teaListener);
        btn_coffee.setOnClickListener(btn_coffeeListener);
        btn_total.setOnClickListener(btn_totalListener);
    }

    private View.OnClickListener btn_juiceListener = new View.OnClickListener(){
        public void onClick(View v){
            Intent intent = new Intent();
            intent.setClass(MainActivity.this,Juice.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener btn_teaListener = new View.OnClickListener(){
        public void onClick(View v){
            Intent intent = new Intent();
            intent.setClass(MainActivity.this,tea.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener btn_coffeeListener = new View.OnClickListener(){
        public void onClick(View v){
            Intent intent = new Intent();
            intent.setClass(MainActivity.this,coffee.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener btn_totalListener = new View.OnClickListener(){
        public void onClick(View v){
            Intent intent = new Intent();
            intent.setClass(MainActivity.this,shopcar.class);
            startActivity(intent);
        }
    };
}