package com.example.mytablayout;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;


public class StatusFragment2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_status2, container, false);


        Button button1 = view.findViewById(R.id.button1);
        Button button2 = view.findViewById(R.id.button1);
        Button button3 = view.findViewById(R.id.button1);
        Button button4= view.findViewById(R.id.button1);




        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                createAlet(getContext(),"Alert one");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                createAlet(getContext(),"Alert two");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                createAlet(getContext(),"Alert three");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                createAlet(getContext(),"Alert four");
            }
        });
        return view;
    }
    private void createAlet(Context mainActivity, String hi) {
        View alertCustomDialog = LayoutInflater.from(mainActivity).inflate(R.layout.custom_dialog,null);
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(mainActivity);
        alertDialog.setView(alertCustomDialog);
        alertDialog.setMessage(hi);
        ImageButton cancelButton =(ImageButton) alertCustomDialog.findViewById(R.id.cancelId);
        Button btnokId=(Button) alertCustomDialog.findViewById(R.id.btnokId);
        final AlertDialog dialog=alertDialog.create();
        dialog.show();

        btnokId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.cancel();
                Toast.makeText(getContext(),"Alert closed",Toast.LENGTH_SHORT).show();
            }
        });


/*
        findViewById(R.id.btnshowId).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });
*/


        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.cancel();

            }
        });

    }
}