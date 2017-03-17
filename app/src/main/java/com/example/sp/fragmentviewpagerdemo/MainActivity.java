package com.example.sp.fragmentviewpagerdemo;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button btn_remove;
    private ViewPager mViewPager;
    private FragmentAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_remove = (Button) findViewById(R.id.btn_remove);
        mViewPager = (ViewPager) findViewById(R.id.viewPager);
        adapter = new FragmentAdapter(getSupportFragmentManager());
        initData();
        mViewPager.setAdapter(adapter);
    }

    private void initData(){
        List<Fragment> fragments = new ArrayList<>();
        FragmentA fragmentA = new FragmentA();
        FragmentB fragmentB = new FragmentB();
        FragmentC fragmentC = new FragmentC();
        FragmentD fragmentD = new FragmentD();
        FragmentE fragmentE = new FragmentE();
        FragmentF fragmentF = new FragmentF();

        fragments.add(fragmentA);
        fragments.add(fragmentB);
        fragments.add(fragmentC);
        fragments.add(fragmentD);
        fragments.add(fragmentE);
        fragments.add(fragmentF);

        adapter.addData(fragments);
    }
}
