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

public class PortraiteModeFragment extends Fragment {
    public PortraiteModeFragment() {

    }

    public static PortraiteModeFragment newInstance() {
        Bundle args = new Bundle();
        PortraiteModeFragment fragment = new PortraiteModeFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_mode_potraite, container, false);
    }
}
