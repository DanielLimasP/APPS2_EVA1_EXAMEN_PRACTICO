package com.example.eva1_examen_rotacion2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearLand;

    MainActivity ma;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onMessageFromFragToMain(int code){

        linearLand = findViewById(R.id.LinearLay);

        if(linearLand != null){
            switch(code){
                case 1000:
                    replaceFragImage(R.id.frame1);
                    replaceFragTitle(R.id.frame2);
                    replaceFragText(R.id.frame3);
                    break;
                case 2000:
                    replaceFragImage2(R.id.frame1);
                    replaceFragTitle2(R.id.frame2);
                    replaceFragText2(R.id.frame3);
                    break;
                case 3000:
                    replaceFragImage3(R.id.frame1);
                    replaceFragTitle3(R.id.frame2);
                    replaceFragText3(R.id.frame3);
                    break;
            }
        }else{
            switch(code){
                case 1000:
                    replaceFragImage(R.id.linear11);
                    replaceFragTitle(R.id.linear22);
                    replaceFragText(R.id.linear33);
                    break;
                case 2000:
                    replaceFragImage2(R.id.linear11);
                    replaceFragTitle2(R.id.linear22);
                    replaceFragText2(R.id.linear33);
                    break;
                case 3000:
                    replaceFragImage3(R.id.linear11);
                    replaceFragTitle3(R.id.linear22);
                    replaceFragText3(R.id.linear33);
                    break;
            }
        }
    }

    // Metodos para reemplazar layouts

    // Shuttle
    private void replaceFragImage(int layout){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        Image_fragment imgFrag = new Image_fragment();
        ft.replace(layout, imgFrag);
        ft.commit();
    }
    private void replaceFragTitle(int layout){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        Title_fragment titleFrag = new Title_fragment();
        ft.replace(layout, titleFrag);
        ft.commit();
    }
    private void replaceFragText(int layout){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        Text_fragment textFrag = new Text_fragment();
        ft.replace(layout, textFrag);
        ft.commit();
    }

    // Space
    private void replaceFragImage2(int layout){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        Image_fragment_2 imgFrag = new Image_fragment_2();
        ft.replace(layout, imgFrag);
        ft.commit();
    }
    private void replaceFragTitle2(int layout){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        Title_fragment_2 titleFrag = new Title_fragment_2();
        ft.replace(layout, titleFrag);
        ft.commit();
    }
    private void replaceFragText2(int layout){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        Text_fragment_2 textFrag = new Text_fragment_2();
        ft.replace(layout, textFrag);
        ft.commit();
    }

    // Falcon
    private void replaceFragImage3(int layout){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        Image_fragment_3 imgFrag = new Image_fragment_3();
        ft.replace(layout, imgFrag);
        ft.commit();
    }
    private void replaceFragTitle3(int layout){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        Title_fragment_3 titleFrag = new Title_fragment_3();
        ft.replace(layout, titleFrag);
        ft.commit();
    }
    private void replaceFragText3(int layout){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        Text_fragment_3 textFrag = new Text_fragment_3();
        ft.replace(layout, textFrag);
        ft.commit();
    }





}
