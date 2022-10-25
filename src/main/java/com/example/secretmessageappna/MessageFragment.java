package com.example.secretmessageappna;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class MessageFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_message, container, false);
        Button btnNext = view.findViewById(R.id.btn_next);
        TextView messageView = view.findViewById(R.id.etv_message);
        System.out.println("Howdy created message layout");

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Happy Happy Joy Joy");
            }
        });


        /*btnNext.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                System.out.println("Howdyyyyyyyyyyyyyyyyy");
                String msg = messageView.getText().toString();
                MessageFragmentDirections.ActionMessageFragmentToEncryptFragment action =
                        MessageFragmentDirections.actionMessageFragmentToEncryptFragment(msg);
                Navigation.findNavController(view).navigate(action);
            }

        });*/

                // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_message, container, false);
    }
}