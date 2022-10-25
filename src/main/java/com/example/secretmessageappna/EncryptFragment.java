package com.example.secretmessageappna;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class EncryptFragment extends Fragment {


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_encrypt, container, false);

        System.out.println("AHHHHHHHHHHHHH ENCRYPT");

        String message = EncryptFragmentArgs.fromBundle(requireArguments()).getMessage();
        String reversed = "";
        for (int i = message.length() - 1; i >= 0; i--)
            reversed += message.charAt(i);
        TextView tvEncMessage = view.findViewById(R.id.tv_encrypted_message);
        tvEncMessage.setText(reversed);


        return view;
    }
}