package com.example.arturmusayelyan.fragmentexamples1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by artur.musayelyan on 18/12/2017.
 */

public class LandscapeModeFragment extends Fragment {
    public LandscapeModeFragment() {

    }

    public static LandscapeModeFragment newInstance() {
         Bundle args = new Bundle();
         LandscapeModeFragment fragment = new LandscapeModeFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_mode_landscape, container, false);
    }
}
