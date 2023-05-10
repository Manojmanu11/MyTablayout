package com.example.mytablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class MainActivity<context> extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    Button button1;//,button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tabLayout=findViewById(R.id.tablayout);
        viewPager=findViewById(R.id.viewpager);




        tabLayout.setupWithViewPager(viewPager);
        Adapter adapter=new Adapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        adapter.addFragment(new ChatsFragment(),"chats");
        adapter.addFragment(new StatusFragment2(),"status");
        adapter.addFragment(new CallsFragment(),"calls");
        viewPager.setAdapter(adapter);
//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                createalertDialog();
//                showToast(MainActivity.this,"this is button1 alert");
//            }
//        });

/*
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createalertDialog();
                showToast(MainActivity.this,"this is button2 alert");
            }
        });
*/
/*
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createalertDialog();
                showToast(MainActivity.this,"this is button3 alert");
            }
        });
*/
/*
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createalertDialog();
                showToast(MainActivity.this,"this is button4 alert");
            }
        });
*/
    }





}