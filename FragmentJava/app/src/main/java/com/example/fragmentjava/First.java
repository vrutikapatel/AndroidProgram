package com.example.fragmentjava;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class First extends Fragment {


    public First() {
        // Required empty public constructor
        super(R.layout.fragment_first);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_first, container, false);
        Button button=v.findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addSecondFragment();
            }
        });
        return v;
    }
    private void addSecondFragment()
    {
        Second second=new  Second();
        FragmentManager manager=getActivity().getSupportFragmentManager();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.addToBackStack("second");
        transaction.replace(R.id.Linear_layout,second,"second");
        transaction.commit();
    }
}