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
public class TriangleFragment extends Fragment {
    TextView txtResult;
    EditText edtBase;
    EditText edtAltura;

    public TriangleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_triangle, container, false);
        txtResult = (TextView) v.findViewById(R.id.txtResultTriangle);
        edtBase = (EditText) v.findViewById(R.id.edtTriangleBase);
        edtAltura = (EditText) v.findViewById(R.id.edtTriangleAltura);
        Button boton = (Button) v.findViewById(R.id.btnCalcularTriangle);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double result = (parseDouble(edtBase.getText().toString())*parseDouble(edtAltura.getText().toString()))/2;
                txtResult.setText(result.toString());
            }
        });
        return v;
    }

}
