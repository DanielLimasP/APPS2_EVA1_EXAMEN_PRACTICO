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
public class PyramidFragment extends Fragment {
    //FORMULA: AREA DE LA BASE * ALTURA / 3
    TextView txtResult;
    EditText edtLado;
    EditText edtAlturaBase;
    EditText edtAltura;

    public PyramidFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //ENLAZAMOS ELEMENTOS VISUALES CON EL CODIGO
        View v = inflater.inflate(R.layout.fragment_pyramid, container, false);
        txtResult = (TextView) v.findViewById(R.id.txtResultPyramid);
        edtLado = (EditText) v.findViewById(R.id.edtPyramidLado);
        edtAlturaBase = (EditText) v.findViewById(R.id.edtPyramidAlturaBase);
        edtAltura = (EditText) v.findViewById(R.id.edtPyramidAltura);
        Button boton = (Button) v.findViewById(R.id.btnCalcularPyramid);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double result = (((parseDouble(edtLado.getText().toString())*parseDouble(edtAlturaBase.getText().toString()))/2)
                        *parseDouble(edtAltura.getText().toString()))/3;
                txtResult.setText(result.toString() + " unidades cúbicas");
            }
        });
        return v;
    }

}
