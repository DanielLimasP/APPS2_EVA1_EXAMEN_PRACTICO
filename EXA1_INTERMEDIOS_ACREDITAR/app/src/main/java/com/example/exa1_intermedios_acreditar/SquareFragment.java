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
public class SquareFragment extends Fragment {
    TextView txtResult;
    EditText edtSquareSide;

    public SquareFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_square, container, false);
        txtResult = (TextView) v.findViewById(R.id.txtResultSquare);
        edtSquareSide = (EditText) v.findViewById(R.id.edtSquareSide);
        Button boton = (Button) v.findViewById(R.id.btnCalcularSquare);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(" " + (Math.pow(parseDouble(edtSquareSide.getText().toString()), 2)) + " unidades cuadradas");
            }
        });
        return v;
    }

}
