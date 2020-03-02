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
public class TrapezoidFragment extends Fragment {
    TextView txtResult;
    EditText edtBase1;
    EditText edtBase2;
    EditText edtAltura;

    public TrapezoidFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_trapezoid, container, false);

        txtResult = (TextView) v.findViewById(R.id.txtResultTrapezoid);
        edtBase1 = (EditText) v.findViewById(R.id.edtBase1Trapezoid);
        edtBase2 = (EditText) v.findViewById(R.id.edtBase2Trapezoid);
        edtAltura = (EditText) v.findViewById(R.id.edtAlturaTrapezoid);
        Button boton = (Button) v.findViewById(R.id.btnCalcularTrapezoid);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double result = ((parseDouble(edtBase1.getText().toString()) + parseDouble(edtBase2.getText().toString())) / 2) * parseDouble(edtAltura.getText().toString());
                txtResult.setText(" " + (result) + " unidades cuadradas");
            }
        });
        return v;
    }

}
