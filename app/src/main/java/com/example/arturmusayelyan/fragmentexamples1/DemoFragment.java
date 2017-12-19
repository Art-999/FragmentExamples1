package com.example.arturmusayelyan.fragmentexamples1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by artur.musayelyan on 15/12/2017.
 */

public class DemoFragment extends Fragment {
    private ListView listView;

    public DemoFragment() {

    }

    public static DemoFragment newInstance(ArrayList<String> namesList) {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("list", namesList);
        DemoFragment fragment = new DemoFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.demo_fragment, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        listView = view.findViewById(R.id.list_for_demo_fragment);
        List<String> dataList = getArguments().getStringArrayList("list");
        listView.setAdapter(new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, dataList));
    }


    public void dfAClick(View view) {
        //do something
    }
}
