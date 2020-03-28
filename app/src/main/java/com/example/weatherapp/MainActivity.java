package com.example.weatherapp;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //TextView mainCity;
    //TextView mainTemp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //mainCity = findViewById(R.id.mainCity);
        //mainTemp = findViewById(R.id.mainTemp);
    }

//    public void otherCity(View view) {
//        Intent myIntent = new Intent(getApplicationContext(), SecondActivity.class);
//        startActivityForResult(myIntent, 2);
//    }

       @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(requestCode != 2){
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        if(resultCode == RESULT_OK){
            //mainCity.setText(data.getStringExtra("TEXT"));
            //mainTemp.setText(data.getStringExtra("TEMP"));
        }
    }
//    TextView mainCity;
//    TextView mainTemp;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        mainCity = findViewById(R.id.mainCity);
//        mainTemp = findViewById(R.id.mainTemp);
//    }
//
//    public void otherCity(View view) {
//        Intent myIntent = new Intent(getApplicationContext(), SecondActivity.class);
//        startActivityForResult(myIntent, 2);
//    }
//
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        if(requestCode != 2){
//            super.onActivityResult(requestCode, resultCode, data);
//            return;
//        }
//        if(resultCode == RESULT_OK){
//            mainCity.setText(data.getStringExtra("TEXT"));
//            mainTemp.setText(data.getStringExtra("TEMP"));
//        }
//    }
}
