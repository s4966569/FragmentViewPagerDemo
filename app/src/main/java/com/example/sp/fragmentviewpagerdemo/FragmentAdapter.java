package com.example.sp.fragmentviewpagerdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sp on 17-3-17.
 */

public class FragmentAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragments = new ArrayList<>();

    public FragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getItemPosition(Object object) {
        return super.getItemPosition(object);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    public void setData(List<Fragment> fragments){
        if(fragments != null){
            fragments.clear();
            fragments.addAll(fragments);
            notifyDataSetChanged();
        }
    }

    public void addData(Fragment fragment){
        if(fragment != null){
            fragments.add(fragment);
            notifyDataSetChanged();
        }
    }

    public void addData(List<Fragment> fragments){
        if(fragments != null){
            this.fragments.addAll(fragments);
            notifyDataSetChanged();
        }
    }

    public void remove(int index){
        if(index < fragments.size()){
            fragments.remove(index);
            notifyDataSetChanged();
        }
    }
    public void clearData(){
        this.fragments.clear();
        notifyDataSetChanged();
    }

    public List<Fragment> getData(){
        return this.fragments;
    }
}
