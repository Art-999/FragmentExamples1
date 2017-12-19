package com.example.arturmusayelyan.fragmentexamples1;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by artur.musayelyan on 18/12/2017.
 */

public class MainForOrientationChange extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_orientation_for_main);
        Configuration configuration = getResources().getConfiguration();

//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if (configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
//            fragmentTransaction.replace(android.R.id.content, LandscapeModeFragment.newInstance());
           // fragmentTransaction.replace(R.id.main_liner_layout,LandscapeModeFragment.newInstance());
            replaceFragment(LandscapeModeFragment.newInstance());

        } else {
            replaceFragment(PortraiteModeFragment.newInstance());
//            fragmentTransaction.replace(android.R.id.content, );
            //fragmentTransaction.replace(R.id.main_liner_layout,PortraiteModeFragment.newInstance());
        }
//        fragmentTransaction.commit();

    }


    public void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container, fragment, "HELLO");
        fragmentTransaction.commit();
    }
}
