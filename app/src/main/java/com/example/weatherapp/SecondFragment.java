package com.example.weatherapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {
    TextView nameCity1;
    TextView nameCity2;
    TextView nameCity3;
    TextView nameCity4;
    TextView nameCity5;
    TextView temp1;
    TextView temp2;
    TextView temp3;
    TextView temp4;
    TextView temp5;

    public static SecondFragment createSF(){
        SecondFragment SF = new SecondFragment();
        return SF;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        nameCity1 = getActivity().findViewById(R.id.button1);
        nameCity2 = getActivity().findViewById(R.id.button2);
        nameCity3 = getActivity().findViewById(R.id.button3);
        nameCity4 = getActivity().findViewById(R.id.button4);
        nameCity5 = getActivity().findViewById(R.id.button5);
        temp1 = getActivity().findViewById(R.id.text1);
        temp2 = getActivity().findViewById(R.id.text2);
        temp3 = getActivity().findViewById(R.id.text3);
        temp4 = getActivity().findViewById(R.id.text4);
        temp5 = getActivity().findViewById(R.id.text5);


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

//        public void returnCity(View view) {
//        Intent myReturnCity = new Intent();
//        myReturnCity.putExtra("TEXT", nameCity1.getText().toString());
//        myReturnCity.putExtra("TEMP", temp1.getText().toString());
//        setResult(RESULT_OK, myReturnCity);
//        finish();
//    }
}
