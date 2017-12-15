package com.example.arturmusayelyan.fragmentexamples1;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    DemoFragment demoFragment;
    private FragmentManager fragmentManager;

    private ArrayList<String> namesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        namesList = new ArrayList<>();
        namesList.add("Aram");
        namesList.add("Karen");
        namesList.add("Vahag");
        namesList.add("Serjo");
        namesList.add("Artur");
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.add_fragment_btn:
                fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                demoFragment = DemoFragment.newInstance(namesList);
                fragmentTransaction.add(R.id.demo_fragment_layout, demoFragment);
                fragmentTransaction.addToBackStack("stack");
                fragmentTransaction.commit();
                break;
            case R.id.remove_fragment_btn:
                if (fragmentManager != null) {
                    Log.d("Art", "worked");
                    FragmentTransaction fragmentTransaction1 = fragmentManager.beginTransaction();
                    fragmentTransaction1.remove(demoFragment);
                    fragmentTransaction1.commit();
                    fragmentManager.popBackStack();
                }
                break;
        }
    }
}
