package com.example.self_learning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice);

        Button btn_normlI = (Button) findViewById(R.id.btn_normlI);
        Button btn_lessI = (Button) findViewById(R.id.btn_lissI);
        Button btn_noI = (Button) findViewById(R.id.btn_noI);

        btn_normlI.setOnClickListener(btn_normlIListener);
        btn_lessI.setOnClickListener(btn_lessIListener);
        btn_noI.setOnClickListener(btn_noIListener);
    }

    private View.OnClickListener btn_normlIListener = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setClass(ice.this,shopcar.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener btn_lessIListener = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setClass(ice.this,shopcar.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener btn_noIListener = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setClass(ice.this,shopcar.class);
            startActivity(intent);
        }
    };
}