package com.example.weatherapp;


import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import static android.app.Activity.RESULT_OK;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {
    boolean isExistCities;
    TextView mainCity;
    TextView mainTemp;
    ImageView mainImage;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }


    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        isExistCities = getResources().getConfiguration().orientation ==
                Configuration.ORIENTATION_LANDSCAPE;

        if(isExistCities){
            SecondFragment SF;
            SF = SecondFragment.createSF();
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            ft.replace(R.id.for_second_fragment, SF);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.commit();
        }
        if(!isExistCities) {
            mainCity = getActivity().findViewById(R.id.mainCity);
            mainTemp = getActivity().findViewById(R.id.mainTemp);
            mainImage = getActivity().findViewById(R.id.mainImage);
            mainCity.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent myIntent = new Intent(getActivity(), SecondActivity.class);
                    startActivityForResult(myIntent, 2);
                }
            });

            mainTemp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent myIntent = new Intent(getActivity(), SecondActivity.class);
                    startActivityForResult(myIntent, 2);
                }
            });

            mainImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent myIntent = new Intent(getActivity(), SecondActivity.class);
                    startActivityForResult(myIntent, 2);
                }
            });
        }
        //else {
//            Intent myIntent = new Intent();
//            myIntent.setClass(getActivity(), SecondActivity.class);
//            startActivity(myIntent);
      //  }

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(requestCode != 2){
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        if(resultCode == RESULT_OK){
            mainCity.setText(data.getStringExtra("TEXT"));
            mainTemp.setText(data.getStringExtra("TEMP"));
        }
    }
}


