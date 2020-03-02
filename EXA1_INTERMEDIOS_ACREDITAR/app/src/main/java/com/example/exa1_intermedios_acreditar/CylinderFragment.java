package com.example.exa1_intermedios_acreditar;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import static java.lang.Double.parseDouble;


/**
 * A simple {@link Fragment} subclass.
 */
public class CylinderFragment extends Fragment {
    EditText edtRadio;
    EditText edtAltura;
    TextView txtResult;
    public CylinderFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_cylinder, container, false);

        txtResult = (TextView) v.findViewById(R.id.txtCylinderResult);
        edtRadio = (EditText) v.findViewById(R.id.edtCylinderRadio);
        edtAltura = (EditText) v.findViewById(R.id.edtCylinderAltura);
        Button boton = (Button) v.findViewById(R.id.btnCylinderCalcular);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double result = (Math.pow(parseDouble(edtRadio.getText().toString()), 2) * Math.PI) * parseDouble(edtAltura.getText().toString());
                txtResult.setText(" " + (result.toString()) + " unidades cúbicas");
            }
        });
        return v;
    }

}
