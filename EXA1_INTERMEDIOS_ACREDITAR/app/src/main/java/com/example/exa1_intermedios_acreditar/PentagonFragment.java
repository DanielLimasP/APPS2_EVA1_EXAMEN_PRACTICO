package com.example.exa1_intermedios_acreditar;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Double.parseDouble;


/**
 * A simple {@link Fragment} subclass.
 */
public class PentagonFragment extends Fragment {
EditText edtLado;
EditText edtApotema;
TextView txtResult;

    public PentagonFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_pentagon, container, false);

        txtResult = (TextView) v.findViewById(R.id.txtResultPentagon);
        edtLado = (EditText) v.findViewById(R.id.edtLadoPentagon);
        edtApotema = (EditText) v.findViewById(R.id.edtApotemaPentagon);
        Button boton = (Button) v.findViewById(R.id.btnPentagon);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double result = ((parseDouble(edtLado.getText().toString()) * parseDouble(edtApotema.getText().toString())) / 2);
                txtResult.setText(" " + (result) + " unidades cuadradas");
            }
        });
        return v;
    }

}