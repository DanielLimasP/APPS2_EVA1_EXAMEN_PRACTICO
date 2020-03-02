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
public class RectangleFragment extends Fragment {
    EditText edtBase;
    EditText edtAltura;
    TextView txtResult;

    public RectangleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_rectangle, container, false);
        txtResult = (TextView) v.findViewById(R.id.txtResultRectangulo);
        edtBase = (EditText) v.findViewById(R.id.edtRectangleBase);
        edtAltura = (EditText) v.findViewById(R.id.edtRectangleAltura);
        Button boton = (Button) v.findViewById(R.id.btnCalcularRectangulo);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double result = parseDouble(edtAltura.getText().toString()) * parseDouble(edtBase.getText().toString());
                txtResult.setText(" " + (result) + " unidades cuadradas");
            }
        });
        return v;
    }

}
