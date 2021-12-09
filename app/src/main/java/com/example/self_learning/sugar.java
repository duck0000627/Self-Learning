package com.example.self_learning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class sugar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sugar);

        Button btn_normlS = (Button) findViewById(R.id.btn_normlS);
        Button btn_halfs = (Button) findViewById(R.id.btn_halfS);
        Button btn_lessS = (Button) findViewById(R.id.btn_lessS);
        Button btn_noS = (Button) findViewById(R.id.btn_noS);
        TextView lb_testjuice = (TextView) findViewById(R.id.lb_testjuice);

        btn_normlS.setOnClickListener(btn_normlSListener);
        btn_halfs.setOnClickListener(btn_halfsListener);
        btn_lessS.setOnClickListener(btn_lessSListener);
        btn_noS.setOnClickListener(btn_noSListener);

        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();
        String juice = bundle.getString("Juice");
        lb_testjuice.setText(juice);
    }

    private View.OnClickListener btn_normlSListener = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setClass(sugar.this,ice.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener btn_halfsListener = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setClass(sugar.this,ice.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener btn_lessSListener = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setClass(sugar.this,ice.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener btn_noSListener = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setClass(sugar.this,ice.class);
            startActivity(intent);
        }
    };
}