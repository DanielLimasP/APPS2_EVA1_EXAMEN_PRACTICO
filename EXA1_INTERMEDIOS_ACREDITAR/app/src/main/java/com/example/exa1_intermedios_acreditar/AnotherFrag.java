package com.example.exa1_intermedios_acreditar;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class AnotherFrag extends Fragment {

TextView txtVw;
    public AnotherFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_another, container, false);
        final String[] datosFormulas = {"Circulo", "Cuadrado", "Triangulo", "Piramide",
                "Rectangulo", "Cilindro", "Trapecio", "Pentagono", "Cono", "Cubo"};
        ListView listaFormulas = (ListView) view.findViewById(R.id.lstVwFormulas);

        ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, datosFormulas);
        listaFormulas.setAdapter(listAdapter);
        listaFormulas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                System.out.println("" + datosFormulas[position]);
                switch(position){
                    case 0:
                        ((MainActivity)getContext()).getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.anim_enter, R.anim.anim_exit, R.anim.anim_enter, R.anim.anim_exit).
                                replace(R.id.container, new FragmentCircle()).addToBackStack(null).commit();
                        break;
                    case 1:
                        ((MainActivity)getContext()).getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.anim_enter, R.anim.anim_exit, R.anim.anim_enter, R.anim.anim_exit).
                                replace(R.id.container, new SquareFragment()).addToBackStack(null).commit();
                        break;
                    case 2:
                        ((MainActivity)getContext()).getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.anim_enter, R.anim.anim_exit, R.anim.anim_enter, R.anim.anim_exit).
                                replace(R.id.container, new TriangleFragment()).addToBackStack(null).commit();
                        break;
                    case 3:
                        ((MainActivity)getContext()).getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.anim_enter, R.anim.anim_exit, R.anim.anim_enter, R.anim.anim_exit).
                                replace(R.id.container, new PyramidFragment()).addToBackStack(null).commit();
                        break;
                    case 4:
                        ((MainActivity)getContext()).getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.anim_enter, R.anim.anim_exit, R.anim.anim_enter, R.anim.anim_exit).
                                replace(R.id.container, new RectangleFragment()).addToBackStack(null).commit();
                        break;
                    case 5:
                        ((MainActivity)getContext()).getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.anim_enter, R.anim.anim_exit, R.anim.anim_enter, R.anim.anim_exit).
                                replace(R.id.container, new CylinderFragment()).addToBackStack(null).commit();
                        break;
                    case 6:
                        ((MainActivity)getContext()).getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.anim_enter, R.anim.anim_exit, R.anim.anim_enter, R.anim.anim_exit).
                                replace(R.id.container, new TrapezoidFragment()).addToBackStack(null).commit();
                        break;
                    case 7:
                        ((MainActivity)getContext()).getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.anim_enter, R.anim.anim_exit, R.anim.anim_enter, R.anim.anim_exit).
                                replace(R.id.container, new PentagonFragment()).addToBackStack(null).commit();
                    default:

                }
                //((MainActivity)getContext()).getSupportFragmentManager().beginTransaction().replace(R.id.container, new Sometry()).addToBackStack(null).commit();
            }
        });
        // Inflate the layout for this fragment
        return view;
    }

}
