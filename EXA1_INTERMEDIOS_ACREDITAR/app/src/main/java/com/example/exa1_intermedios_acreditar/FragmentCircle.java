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
import static java.lang.Float.parseFloat;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentCircle extends Fragment {
    TextView txtResult;
    EditText edtRadio;

    public FragmentCircle() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragment_circle, container, false);
        txtResult = (TextView) v.findViewById(R.id.txtResult);
        edtRadio = (EditText) v.findViewById(R.id.edtRadio);
        Button boton = (Button) v.findViewById(R.id.btnCalcular);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Llegamos al onclick");
                txtResult.setText(" " + (Math.pow(parseDouble(edtRadio.getText().toString()), 2) * Math.PI) + " unidades cuadradas");
            }
        });
        return v;
    }

}
