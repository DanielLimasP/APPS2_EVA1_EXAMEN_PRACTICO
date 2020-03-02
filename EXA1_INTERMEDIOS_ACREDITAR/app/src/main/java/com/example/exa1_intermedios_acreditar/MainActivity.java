package com.example.exa1_intermedios_acreditar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Procedimiento estándar para colocar un fragmento en android
        //startActivity(intento);
        AnotherFrag frag = new AnotherFrag();
        cambiarFragmento(frag);
        //ft2.setCustomAnimations(R.anim.anim_enter, R.anim.anim_exit, R.anim.anim_enter, R.anim.anim_exit);

    }

    public void cambiarFragmento(Fragment f){
        FragmentTransaction fr = getSupportFragmentManager().beginTransaction();
        fr.setCustomAnimations(R.anim.anim_enter, R.anim.anim_exit, R.anim.anim_enter, R.anim.anim_exit);
        fr.replace(R.id.container, f).addToBackStack(null).commit();
    }
}