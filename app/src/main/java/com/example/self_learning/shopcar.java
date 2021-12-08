package com.example.self_learning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class shopcar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopcar);

        Button btn_home = (Button) findViewById(R.id.btn_shopcar_home);

        btn_home.setOnClickListener(btn_homeListener);
    }

    private View.OnClickListener btn_homeListener = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setClass(shopcar.this,MainActivity.class);
            startActivity(intent);
        }
    };
}