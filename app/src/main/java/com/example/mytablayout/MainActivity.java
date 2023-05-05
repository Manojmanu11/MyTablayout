package com.example.mytablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;

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
    }
}