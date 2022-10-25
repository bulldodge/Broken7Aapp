package com.example.secretmessageappna;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class WelcomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_welcome, container, false);
        Button btnStart = view.findViewById(R.id.btn_start);
        btnStart.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                System.out.println("Howdy from Welcome Frag");
                Navigation.findNavController(view).navigate(R.id.action_welcomeFragment_to_messageFragment);
            }

        });

        // Inflate the layout for this fragment
         return view;
    }
}