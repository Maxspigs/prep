package com.cafe.max.exam_final;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class MystereAdapter extends FragmentPagerAdapter {
    List<Fragment> fragments;
    List<String> titres;


    public MystereAdapter(FragmentManager fm, List<Fragment> fragments, List<String> titres){
        super(fm);
        this.fragments = fragments;
        this.titres = titres;
    }


    @Override
    public Fragment getItem(int i) {
        return fragments.get(i);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) { return titres.get(position);}

}
