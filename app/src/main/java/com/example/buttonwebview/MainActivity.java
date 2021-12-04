package com.example.buttonwebview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    public void howitwork(View view) {
        Intent in=new Intent(MainActivity.this, HowItWork.class);
        startActivity(in);


    }

    public void contactus(View view) {
        Intent in=new Intent(MainActivity.this, Contact.class);
        startActivity(in);
    }

    public void faq(View view) {

        Intent in=new Intent(MainActivity.this, Faq.class);
        startActivity(in);
    }
}
