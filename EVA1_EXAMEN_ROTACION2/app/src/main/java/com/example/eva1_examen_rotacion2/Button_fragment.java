package com.example.eva1_examen_rotacion2;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class Button_fragment extends Fragment {

    MainActivity main;
    int TAB1 = 1000, TAB2 = 2000, TAB3 = 3000;

    public Button_fragment() {
        // Required empty public constructor
    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        LinearLayout ll = (LinearLayout)inflater.inflate(R.layout.fragment_button_fragment, container, false);
        Button btn1 = ll.findViewById(R.id.btn1);
        Button btn2 = ll.findViewById(R.id.btn2);
        Button btn3 = ll.findViewById(R.id.btn3);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                main.onMessageFromFragToMain(TAB1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                main.onMessageFromFragToMain(TAB2);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                main.onMessageFromFragToMain(TAB3);
            }
        });
        return ll;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        main = (MainActivity)getActivity();
    }

}
