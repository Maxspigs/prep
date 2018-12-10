package com.cafe.max.exam_final;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class PersonnagesAdapter extends FragmentPagerAdapter {
    List<PersonnageFragment> fragments;


    public PersonnagesAdapter(FragmentManager fm, List<PersonnageFragment> fragments){
        super(fm);
        this.fragments = fragments;
    }


    @Override
    public Fragment getItem(int i) {
        return fragments.get(i);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }


}
