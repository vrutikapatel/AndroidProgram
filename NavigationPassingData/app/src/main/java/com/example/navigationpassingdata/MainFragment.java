package com.example.navigationpassingdata;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MainFragment extends Fragment {

    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view,savedInstanceState);

        final NavController navController= Navigation.findNavController(view);

        Button button=view.findViewById(R.id.btn);
        button.setOnClickListener((v) ->{

//            MainFragmentDirections.ActionMainFragmentToSecondFragment action=MainFragmentDirections.actionMainFragmentToSecondFragment();
//            action.setMessage("This is some message");
//            navController.navigate(action);

            User user=new User(20,"vrutika patel");
            MainFragmentDirections.ActionMainFragmentToSecondFragment action=MainFragmentDirections.actionMainFragmentToSecondFragment(user);
            action.setMessage("This is the message string argument...");
            navController.navigate(action);

        });
    }
}