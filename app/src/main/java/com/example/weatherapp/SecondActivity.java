package com.example.weatherapp;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
//        TextView nameCity1;
//        TextView nameCity2;
//        TextView nameCity3;
//        TextView nameCity4;
//        TextView nameCity5;
//        TextView temp1;
//        TextView temp2;
//        TextView temp3;
//        TextView temp4;
//        TextView temp5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_second);
//        nameCity1 = findViewById(R.id.button1);
//        nameCity2 = findViewById(R.id.button2);
//        nameCity3 = findViewById(R.id.button3);
//        nameCity4 = findViewById(R.id.button4);
//        nameCity5 = findViewById(R.id.button5);
//        temp1 = findViewById(R.id.text1);
//        temp2 = findViewById(R.id.text2);
//        temp3 = findViewById(R.id.text3);
//        temp4 = findViewById(R.id.text4);
//        temp5 = findViewById(R.id.text5);

        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            // Если устройство перевернули в альбомную ориентацию, то надо эту activity закрыть
            finish();
            return ;
        }
    }

//    public void returnCity(View view) {
//        Intent myReturnCity = new Intent();
//        myReturnCity.putExtra("TEXT", nameCity1.getText().toString());
//        myReturnCity.putExtra("TEMP", temp1.getText().toString());
//        setResult(RESULT_OK, myReturnCity);
//        finish();
//    }
//    public void returnCity2(View view) {
//        Intent myReturnCity = new Intent();
//        myReturnCity.putExtra("TEXT", nameCity2.getText().toString());
//        myReturnCity.putExtra("TEMP", temp2.getText().toString());
//        setResult(RESULT_OK, myReturnCity);
//        finish();
//    }
//    public void returnCity3(View view) {
//        Intent myReturnCity = new Intent();
//        myReturnCity.putExtra("TEXT", nameCity3.getText().toString());
//        myReturnCity.putExtra("TEMP", temp3.getText().toString());
//        setResult(RESULT_OK, myReturnCity);
//        finish();
//    }
//    public void returnCity4(View view) {
//        Intent myReturnCity = new Intent();
//        myReturnCity.putExtra("TEXT", nameCity4.getText().toString());
//        myReturnCity.putExtra("TEMP", temp4.getText().toString());
//        setResult(RESULT_OK, myReturnCity);
//        finish();
//    }
//    public void returnCity5(View view) {
//        Intent myReturnCity = new Intent();
//        myReturnCity.putExtra("TEXT", nameCity5.getText().toString());
//        myReturnCity.putExtra("TEMP", temp5.getText().toString());
//        setResult(RESULT_OK, myReturnCity);
//        finish();
//    }
}
