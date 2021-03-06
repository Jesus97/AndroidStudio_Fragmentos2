package com.iesvirgendelcarmen.dam.fragment02;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;


public class Fragment02 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment02);

        final Fragmento1 fragmento1 = new Fragmento1();
        final Fragmento2 fragmento2 = new Fragmento2();

        FragmentManager FM = getSupportFragmentManager();
        FragmentTransaction FT = FM.beginTransaction();
        WindowManager WinMa = getWindowManager();
        Display Disp = WinMa.getDefaultDisplay();
        if (Disp.getRotation() == Surface.ROTATION_90){
            FT.replace(R.id.contenedor, fragmento1).commit();
        }else{
            FT.replace(R.id.contenedor, fragmento2).commit();
        }
    }
}
