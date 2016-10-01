package com.ryan.project0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        initEvents();
    }

    private void initViews() {
        button1 = (Button) findViewById(R.id.btn1);
        button2 = (Button) findViewById(R.id.btn2);
        button3 = (Button) findViewById(R.id.btn3);
        button4 = (Button) findViewById(R.id.btn4);
        button5 = (Button) findViewById(R.id.btn5);
        button6 = (Button) findViewById(R.id.btn6);
    }

    private void initEvents() {
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                Toast.makeText(MainActivity.this,"This button can show popular movies!",Toast.LENGTH_SHORT).show();
            case R.id.btn2:
                Toast.makeText(MainActivity.this,"This button will show your STOCK HAWK!",Toast.LENGTH_SHORT).show();
            case R.id.btn3:
                Toast.makeText(MainActivity.this,"Build it bigger!",Toast.LENGTH_SHORT).show();
            case R.id.btn4:
                Toast.makeText(MainActivity.this,"Show you a material app!",Toast.LENGTH_SHORT).show();
            case R.id.btn5:
                Toast.makeText(MainActivity.this,"Make your app ubiquitous!",Toast.LENGTH_SHORT).show();
            case R.id.btn6:
                Toast.makeText(MainActivity.this,"This button will launch my capstone app!",Toast.LENGTH_SHORT).show();
        }
    }
}
