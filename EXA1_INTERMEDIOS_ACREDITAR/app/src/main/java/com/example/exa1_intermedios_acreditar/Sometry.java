package com.example.exa1_intermedios_acreditar;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Sometry extends Fragment {

    public Sometry() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sometry, container, false);

        String[] datosFormulas = {"Burro"};

        // Inflate the layout for this fragment
        Toast.makeText(getContext(), "holo", Toast.LENGTH_SHORT).show();
        return inflater.inflate(R.layout.fragment_sometry, container, false);
    }

}