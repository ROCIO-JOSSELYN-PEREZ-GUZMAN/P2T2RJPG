package com.example.p2t2rjpg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button);
        b1.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent inte=new Intent(this,frm2Activity.class);
        startActivity(inte);
        this.finish();
    }
    public void bMostrar(View view) {
        Intent inte=new Intent(this,frm3Activity.class);
        startActivity(inte);
        this.finish();
    }
}
