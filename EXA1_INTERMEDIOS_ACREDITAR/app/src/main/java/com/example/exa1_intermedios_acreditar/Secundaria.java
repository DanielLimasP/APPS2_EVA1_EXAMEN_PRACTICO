package com.example.exa1_intermedios_acreditar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Secundaria extends AppCompatActivity {
    TextView txtVw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
        txtVw = (TextView) findViewById(R.id.txtVw);
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            txtVw.setText(bundle.getString("FormulaNombre"));
        }
    }
}
