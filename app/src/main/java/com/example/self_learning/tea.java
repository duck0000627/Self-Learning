package com.example.self_learning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tea extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tea);

        Button btn_home = (Button) findViewById(R.id.btn_tea_home);

        btn_home.setOnClickListener(btn_homeListener);
    }

    private View.OnClickListener btn_homeListener = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            finish();
        }
    };
}