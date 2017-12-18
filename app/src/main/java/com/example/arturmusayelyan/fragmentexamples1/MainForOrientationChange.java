package com.example.arturmusayelyan.fragmentexamples1;

import android.content.res.Configuration;
import android.os.Bundle;
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
        Configuration configuration = getResources().getConfiguration();

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if (configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            fragmentTransaction.replace(android.R.id.content, LandscapeModeFragment.newInstance());
        } else {
            fragmentTransaction.replace(android.R.id.content, PortraiteModeFragment.newInstance());
        }
        fragmentTransaction.commit();
    }
}
